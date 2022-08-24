package net.retrotrack.hardcored.gui;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;

public class MenuItems {
    public static NbtCompound player1nbt = new NbtCompound();
    public static NbtCompound player2nbt = new NbtCompound();
    public static NbtCompound player3nbt = new NbtCompound();
    public static NbtCompound player4nbt = new NbtCompound();
    public static NbtCompound player5nbt = new NbtCompound();
    public static NbtCompound player6nbt = new NbtCompound();
    public static NbtCompound player7nbt = new NbtCompound();
    public static NbtCompound player8nbt = new NbtCompound();
    public static NbtCompound player9nbt = new NbtCompound();
    public static NbtCompound player10nbt = new NbtCompound();
    public static NbtCompound player11nbt = new NbtCompound();
    public static NbtCompound player12nbt = new NbtCompound();
    public static NbtCompound player13nbt = new NbtCompound();
    public static NbtCompound player14nbt = new NbtCompound();
    public static NbtCompound player15nbt = new NbtCompound();
    public static NbtCompound player16nbt = new NbtCompound();
    public static NbtCompound player17nbt = new NbtCompound();
    public static NbtCompound player18nbt = new NbtCompound();
    public static NbtCompound player19nbt = new NbtCompound();
    public static NbtCompound player20nbt = new NbtCompound();



    public static ItemStack player1 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player2 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player3 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player4 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player5 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player6 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player7 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player8 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player9 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player10 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player11 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player12 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player13 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player14 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player15 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player16 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player17 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player18 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player19 = new ItemStack(Items.PLAYER_HEAD);
    public static ItemStack  player20 = new ItemStack(Items.PLAYER_HEAD);


    public static void SetMenuItems() {
        player1nbt.putString("SkullOwner", Text.translatable("players.hardcored.player1").getString());
        player1.setNbt(player1nbt);

        player2nbt.putString("SkullOwner", Text.translatable("players.hardcored.player2").getString());
        player2.setNbt(player2nbt);

        player3nbt.putString("SkullOwner", Text.translatable("players.hardcored.player3").getString());
        player3.setNbt(player3nbt);

        player4nbt.putString("SkullOwner", Text.translatable("players.hardcored.player4").getString());
        player4.setNbt(player4nbt);

        player5nbt.putString("SkullOwner", Text.translatable("players.hardcored.player5").getString());
        player5.setNbt(player5nbt);

        player6nbt.putString("SkullOwner", Text.translatable("players.hardcored.player6").getString());
        player6.setNbt(player6nbt);

        player7nbt.putString("SkullOwner", Text.translatable("players.hardcored.player7").getString());
        player7.setNbt(player7nbt);

        player8nbt.putString("SkullOwner", Text.translatable("players.hardcored.player8").getString());
        player8.setNbt(player8nbt);

        player9nbt.putString("SkullOwner", Text.translatable("players.hardcored.player9").getString());
        player9.setNbt(player9nbt);

        player10nbt.putString("SkullOwner", Text.translatable("players.hardcored.player10").getString());
        player10.setNbt(player10nbt);

        player11nbt.putString("SkullOwner", Text.translatable("players.hardcored.player11").getString());
        player11.setNbt(player11nbt);

        player12nbt.putString("SkullOwner", Text.translatable("players.hardcored.player12").getString());
        player12.setNbt(player12nbt);
    }
}
