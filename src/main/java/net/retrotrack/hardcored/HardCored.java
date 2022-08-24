package net.retrotrack.hardcored;

import net.fabricmc.api.ModInitializer;
import net.retrotrack.hardcored.item.ModItems;
import net.retrotrack.hardcored.gui.MenuItems;
import net.retrotrack.hardcored.networking.ModMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardCored implements ModInitializer {
	public static final String MOD_ID = "hardcored";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModMessages.registerC2SPackets();
	}
}
