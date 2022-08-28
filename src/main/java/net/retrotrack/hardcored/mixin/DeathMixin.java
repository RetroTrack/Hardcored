package net.retrotrack.hardcored.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.network.packet.s2c.play.SubtitleS2CPacket;
import net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket;
import net.minecraft.network.packet.s2c.play.TitleS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.retrotrack.hardcored.HardCored;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public abstract class DeathMixin {
    @Inject(at = @At("TAIL"), method = "onDeath")
    public void onDeath(DamageSource source, CallbackInfo ci){
        ServerPlayerEntity player = (ServerPlayerEntity)(Object)this;
        HardCored.serverReference.getValue().getCommandManager().execute(HardCored.serverReference.getValue().getCommandSource(), "team join DEAD " + player.getName().getString());
        player.networkHandler.sendPacket(new TitleS2CPacket(Text.translatable("title.hardcored.died").formatted(Formatting.RED)));
        player.networkHandler.sendPacket(new TitleFadeS2CPacket(40, 200 ,40));
        player.networkHandler.sendPacket(new SubtitleS2CPacket(Text.translatable("subtitle.hardcored.died").formatted(Formatting.RED)));
    }

}