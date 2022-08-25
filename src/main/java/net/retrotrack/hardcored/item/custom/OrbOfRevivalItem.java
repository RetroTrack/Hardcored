package net.retrotrack.hardcored.item.custom;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.retrotrack.hardcored.gui.MenuItems;
import net.retrotrack.hardcored.networking.ModMessages;

public class OrbOfRevivalItem extends Item {
    public OrbOfRevivalItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        MenuItems.SetMenuItems();
        if(world.isClient()) {
            //Send Packet From Client To Server
            ClientPlayNetworking.send(ModMessages.USEITEM_ID, PacketByteBufs.create());


            //Add A Cooldown
            user.getItemCooldownManager().set(this, 20);
        }
        return super.use(world, user, hand);
    }



}
