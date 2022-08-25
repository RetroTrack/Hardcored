package net.retrotrack.hardcored;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;
import net.retrotrack.hardcored.item.ModItems;
import net.retrotrack.hardcored.gui.MenuItems;
import net.retrotrack.hardcored.networking.ModMessages;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardCored implements ModInitializer {
	public static final String MOD_ID = "hardcored";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	static public final MutableObject<MinecraftServer> serverReference = new MutableObject<>();

	@Override
	public void onInitialize() {
		ServerLifecycleEvents.SERVER_STARTED.register(minecraftServer -> serverReference.setValue(minecraftServer));
		ModItems.registerModItems();
		ModMessages.registerC2SPackets();
	}

}
