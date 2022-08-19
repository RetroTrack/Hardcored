package net.retrotrack.hardcored;

import net.fabricmc.api.ModInitializer;
import net.retrotrack.hardcored.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardCored implements ModInitializer {
	public static final String MOD_ID = "hardcored";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
