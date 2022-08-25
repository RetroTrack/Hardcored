package net.retrotrack.hardcored.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.retrotrack.hardcored.HardCored;

public class ModItemGroup {
    public static final ItemGroup HARDCORED = FabricItemGroupBuilder.build(new Identifier(HardCored.MOD_ID, "hardcored"),
            () -> new ItemStack(ModItems.HARDCORE_HEART));
}
