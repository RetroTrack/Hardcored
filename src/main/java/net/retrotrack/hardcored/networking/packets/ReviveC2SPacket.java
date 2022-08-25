package net.retrotrack.hardcored.networking.packets;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.particle.TotemParticle;
import net.minecraft.client.sound.SoundSystem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import net.retrotrack.hardcored.HardCored;
import net.retrotrack.hardcored.item.ModItems;
import net.retrotrack.hardcored.networking.ModMessages;

import java.util.Arrays;
import java.util.UUID;

import static net.minecraft.util.dynamic.DynamicSerializableUuid.getOfflinePlayerUuid;

public class ReviveC2SPacket {
    public static void receive(MinecraftServer minecraftServer, ServerPlayerEntity serverPlayerEntity,
                               ServerPlayNetworkHandler handler, PacketByteBuf packetByteBuf, PacketSender packetSender) {
        String playername = packetByteBuf.readString();
        ServerPlayerEntity p = minecraftServer.getPlayerManager().getPlayer(playername);

        if (Arrays.asList(minecraftServer.getPlayerNames()).contains(playername)) {
            if(p != serverPlayerEntity) {
                if (p.isSpectator()) {
                    serverPlayerEntity.sendMessage(Text.literal("Revived " + playername + "!").setStyle(Style.EMPTY.withColor(Formatting.GREEN)));
                    p.teleport(serverPlayerEntity.getWorld(), serverPlayerEntity.getPos().x, serverPlayerEntity.getPos().y + 0.5, serverPlayerEntity.getPos().z, serverPlayerEntity.getYaw(), serverPlayerEntity.getPitch());
                    p.changeGameMode(GameMode.SURVIVAL);
                    PlayerInventory playerInventory = serverPlayerEntity.getInventory();
                    ServerWorld world = serverPlayerEntity.getWorld();
                    p.getAdvancementTracker().grantCriterion(p.server.getAdvancementLoader().get(
                            new Identifier(HardCored.MOD_ID, "hardcored/get_revived")), "revived");
                    serverPlayerEntity.getAdvancementTracker().grantCriterion(serverPlayerEntity.server.getAdvancementLoader().get(
                            new Identifier(HardCored.MOD_ID, "hardcored/helping_hand")), "revived");
                    if (world != null) {
                        world.spawnParticles(ParticleTypes.SONIC_BOOM, serverPlayerEntity.getPos().x, serverPlayerEntity.getPos().y + 0.5, serverPlayerEntity.getPos().z, 15, 1,1,1, 1);
                        serverPlayerEntity.getWorld().playSound(null, serverPlayerEntity.getBlockPos(), SoundEvents.BLOCK_RESPAWN_ANCHOR_DEPLETE, SoundCategory.PLAYERS, 1f, 1f);
                    }
                    if(!serverPlayerEntity.isCreative()) {
                        int slot = playerInventory.getSlotWithStack(new ItemStack(ModItems.ORB_OF_REVIVAL));
                        playerInventory.removeStack(slot, 1);
                    }
                    ServerPlayNetworking.send(serverPlayerEntity, ModMessages.CLOSE_SCREEN, PacketByteBufs.create());
                } else if (!p.isSpectator() && !p.isCreative()) {
                    serverPlayerEntity.sendMessage(Text.literal(playername + " isn't dead yet!").setStyle(Style.EMPTY.withColor(Formatting.RED)));
                }else if (p.isCreative()){
                    serverPlayerEntity.sendMessage(Text.literal(playername + " is in creative, and well, that's not dead!").setStyle(Style.EMPTY.withColor(Formatting.RED)));
                }
            }else{
                serverPlayerEntity.sendMessage(Text.literal("You can't revive yourself, and btw you aren't even dead!").setStyle(Style.EMPTY.withColor(Formatting.RED)));
            }
        } else {
            serverPlayerEntity.sendMessage(Text.literal(playername + " isn't online!").setStyle(Style.EMPTY.withColor(Formatting.RED)));
        }



    }
}
