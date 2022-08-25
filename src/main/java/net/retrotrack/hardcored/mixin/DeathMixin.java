package net.retrotrack.hardcored.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.retrotrack.hardcored.HardCored;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(ServerPlayerEntity.class)
public abstract class DeathMixin {
    @Shadow public abstract Entity getCameraEntity();

    @Inject(at = @At("HEAD"), method = "onDeath")
    public void asdf(DamageSource source, CallbackInfo ci){
        String uuid = this.getCameraEntity().getUuidAsString();
        ServerPlayerEntity player = HardCored.serverReference.getValue().getPlayerManager().getPlayer(UUID.fromString(uuid));
        player.sendMessage(Text.literal("player died"));
    }

}