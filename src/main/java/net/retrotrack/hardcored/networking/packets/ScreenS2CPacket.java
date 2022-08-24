package net.retrotrack.hardcored.networking.packets;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.retrotrack.hardcored.gui.ExampleScreen;
import net.retrotrack.hardcored.gui.SettingsMenu;

public class ScreenS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler clientPlayNetworkHandler,
                               PacketByteBuf packetByteBuf, PacketSender packetSender) {

        client.getInstance().send(() -> MinecraftClient.getInstance().setScreen(new ExampleScreen(new SettingsMenu())));
    }
}
