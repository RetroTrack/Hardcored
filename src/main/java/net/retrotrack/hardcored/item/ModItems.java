package net.retrotrack.hardcored.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.retrotrack.hardcored.HardCored;
import net.retrotrack.hardcored.item.custom.OrbOfRevivalItem;

public class ModItems {

    //public static final Item ORB_OF_REVIVAL = registerItem("orb_of_revival",
    //        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item ORB_OF_REVIVAL = registerItem("orb_of_revival",
            new OrbOfRevivalItem(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HardCored.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HardCored.LOGGER.debug("Registering Mod Items for " + HardCored.MOD_ID);
    }
}
