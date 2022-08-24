package net.retrotrack.hardcored;

import net.fabricmc.api.ClientModInitializer;
import net.retrotrack.hardcored.networking.ModMessages;

public class HardCoredClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModMessages.registerS2CPackets();
    }
}
