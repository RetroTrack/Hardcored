package net.retrotrack.hardcored.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.retrotrack.hardcored.networking.ModMessages;

import static net.retrotrack.hardcored.gui.MenuItems.*;


public class SettingsMenu extends LightweightGuiDescription {
    public WGridPanel root = new WGridPanel();
    public SettingsMenu() {

        setRootPanel(root);
        root.setSize(410, 430);
        root.setInsets(Insets.ROOT_PANEL);


        //WLabel label = new WLabel(Text.literal("Revival"), 0xFFC11D00);
        //root.add(label, 10, 0, 10, 20);
        WSprite icon = new WSprite(new Identifier("hardcored:textures/gui/revival.png"));
        root.add(icon, 4, 0, 11, 2);


        LoadButtons();


        root.validate(this);



    }

    public void LoadButtons() {
        WButton button1 = new WButton(new ItemIcon(player1), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player1").getString()));
        button1.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player1").getString().equals("")){button1.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button1, 1, 3, 9, 20);


        WButton button2 = new WButton(new ItemIcon(player2), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player2").getString()));
        button2.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player2").getString().equals("")){button2.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button2, 1, 5, 9, 20);

        WButton button3 = new WButton(new ItemIcon(player3), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player3").getString()));
        button3.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player3").getString().equals("")){button3.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button3, 1, 7, 9, 20);

        WButton button4 = new WButton(new ItemIcon(player4), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player4").getString()));
        button4.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player4").getString().equals("")){button4.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button4, 1, 9, 9, 20);

        WButton button5 = new WButton(new ItemIcon(player5), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player5").getString()));
        button5.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player5").getString().equals("")){button5.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button5, 1, 11, 9, 20);

        WButton button6 = new WButton(new ItemIcon(player6), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player6").getString()));
        button6.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player6").getString().equals("")){button6.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button6, 1, 13, 9, 20);

        WButton button7 = new WButton(new ItemIcon(player7), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player7").getString()));
        button7.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player7").getString().equals("")){button7.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button7, 1, 15, 9, 20);

        WButton button8 = new WButton(new ItemIcon(player8), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player8").getString()));
        button8.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player8").getString().equals("")){button8.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button8, 1, 17, 9, 20);

        WButton button9 = new WButton(new ItemIcon(player9), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player9").getString()));
        button9.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player9").getString().equals("")){button9.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button9, 1, 19, 9, 20);

        WButton button10 = new WButton(new ItemIcon(player10), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player10").getString()));
        button10.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player10").getString().equals("")){button10.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button10, 1, 21, 9, 20);



        WButton button11 = new WButton(new ItemIcon(player11), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player11").getString()));
        button11.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player11").getString().equals("")){button11.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button11, 12, 3, 9, 20);

        WButton button12 = new WButton(new ItemIcon(player12), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player12").getString()));
        button12.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player12").getString().equals("")){button12.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button12, 12, 5, 9, 20);

        WButton button13 = new WButton(new ItemIcon(player13), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player13").getString()));
        button13.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player13").getString().equals("")){button13.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button13, 12, 7, 9, 20);

        WButton button14 = new WButton(new ItemIcon(player14), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player14").getString()));
        button14.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player14").getString().equals("")){button14.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button14, 12, 9, 9, 20);

        WButton button15 = new WButton(new ItemIcon(player15), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player15").getString()));
        button15.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player15").getString().equals("")){button15.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button15, 12, 11, 9, 20);

        WButton button16 = new WButton(new ItemIcon(player16), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player16").getString()));
        button16.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player16").getString().equals("")){button16.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button16, 12, 13, 9, 20);

        WButton button17 = new WButton(new ItemIcon(player17), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player17").getString()));
        button17.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player17").getString().equals("")){button17.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button17, 12, 15, 9, 20);

        WButton button18 = new WButton(new ItemIcon(player18), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player18").getString()));
        button18.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player18").getString().equals("")){button18.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button18, 12, 17, 9, 20);

        WButton button19 = new WButton(new ItemIcon(player19), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player19").getString()));
        button19.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player19").getString().equals("")){button19.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button19, 12, 19, 9, 20);

        WButton button20 = new WButton(new ItemIcon(player20), Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.player20").getString()));
        button20.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player20").getString().equals("")){button20.setLabel(Text.translatable("ui.hardcored.buttons.revive", Text.translatable("players.hardcored.notset")));}
        root.add(button20, 12, 21, 9, 20);



        button1.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player1").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player1").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_1, data);
        });
        button2.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player2").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player2").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_2, data);
        });
        button3.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player3").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player3").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_3, data);
        });
        button4.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player4").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player4").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_4, data);
        });
        button5.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player5").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player5").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_5, data);
        });
        button6.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player6").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player6").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_6, data);
        });
        button7.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player7").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player7").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_7, data);
        });
        button8.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player8").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player8").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_8, data);
        });
        button9.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player9").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player9").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_9, data);
        });
        button10.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player10").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player10").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_10, data);
        });

        button11.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player11").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player11").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_11, data);
        });
        button12.setOnClick(() -> {
                PacketByteBuf data = PacketByteBufs.create();
                if (Text.translatable("players.hardcored.player12").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
                else data.writeString(Text.translatable("players.hardcored.player12").getString());
                ClientPlayNetworking.send(ModMessages.PLAYER_12, data);
        });
        button13.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player13").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player13").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_13, data);
        });
        button14.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player15").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player15").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_14, data);
        });
        button15.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player15").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player15").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_15, data);
        });
        button16.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player16").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player16").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_16, data);
        });
        button17.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player17").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player17").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_17, data);
        });
        button18.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player18").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player18").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_18, data);
        });
        button19.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player19").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player19").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_19, data);
        });
        button20.setOnClick(() -> {
            PacketByteBuf data = PacketByteBufs.create();
            if (Text.translatable("players.hardcored.player20").getString().equals("")){data.writeString(Text.translatable("players.hardcored.notset").getString());}
            else data.writeString(Text.translatable("players.hardcored.player20").getString());
            ClientPlayNetworking.send(ModMessages.PLAYER_20, data);
        });


    }
}
