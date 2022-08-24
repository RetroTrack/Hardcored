package net.retrotrack.hardcored.networking.packets;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class ReviveC2SPacket {
    public static void receive(MinecraftServer minecraftServer, ServerPlayerEntity serverPlayerEntity,
                               ServerPlayNetworkHandler handler, PacketByteBuf packetByteBuf, PacketSender packetSender) {
        String playername = packetByteBuf.readString();

    }
}
