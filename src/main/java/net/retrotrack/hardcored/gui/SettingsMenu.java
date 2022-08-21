package net.retrotrack.hardcored.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.Icon;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import io.github.cottonmc.cotton.gui.widget.icon.TextureIcon;
import net.minecraft.block.SkullBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SkullItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class SettingsMenu extends LightweightGuiDescription {
    public SettingsMenu() {
        NbtCompound player1nbt = new NbtCompound();
        player1nbt.putString("SkullOwner", Text.translatable("players.hardcored.player1").getString());
        ItemStack player1 = new ItemStack(Items.PLAYER_HEAD);
        player1.setNbt(player1nbt);

        NbtCompound player2nbt = new NbtCompound();
        player2nbt.putString("SkullOwner", Text.translatable("players.hardcored.player2").getString());
        ItemStack player2 = new ItemStack(Items.PLAYER_HEAD);
        player2.setNbt(player2nbt);

        NbtCompound player3nbt = new NbtCompound();
        player3nbt.putString("SkullOwner", Text.translatable("players.hardcored.player3").toString());
        ItemStack player3 = new ItemStack(Items.PLAYER_HEAD);
        player3.setNbt(player3nbt);




        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(480, 270);
        root.setInsets(Insets.ROOT_PANEL);


        WButton button1 = new WButton(new ItemIcon(player1), Text.literal(" Revive " + Text.translatable("players.hardcored.player1").getString()));
        button1.setAlignment(HorizontalAlignment.LEFT);
        root.add(button1, 0, 6, 9, 5);
        WButton button2 = new WButton(new ItemIcon(player2), Text.literal(" Revive " + Text.translatable("players.hardcored.player2").getString()));
        button2.setAlignment(HorizontalAlignment.LEFT);
        root.add(button2, 0, 4, 9, 5);




        WLabel label = new WLabel(Text.literal("Settings"), 0xFFFFFF);
        root.add(label, 0, 0, 2, 1);

        root.validate(this);
    }
}
