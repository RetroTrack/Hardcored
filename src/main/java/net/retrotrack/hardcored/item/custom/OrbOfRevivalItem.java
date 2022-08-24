package net.retrotrack.hardcored.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.retrotrack.hardcored.gui.ExampleScreen;
import net.retrotrack.hardcored.gui.SettingsMenu;
import net.retrotrack.hardcored.gui.MenuItems;

public class OrbOfRevivalItem extends Item {
    public OrbOfRevivalItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        MenuItems.SetMenuItems();
        MinecraftClient.getInstance().send(() -> MinecraftClient.getInstance().setScreen(new ExampleScreen(new SettingsMenu())));
        return super.use(world, user, hand);
    }
}
