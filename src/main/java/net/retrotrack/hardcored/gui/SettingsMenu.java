package net.retrotrack.hardcored.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import static net.retrotrack.hardcored.gui.MenuItems.*;


public class SettingsMenu extends LightweightGuiDescription {
    public WGridPanel root = new WGridPanel();
    public SettingsMenu() {

        setRootPanel(root);
        root.setSize(410, 320);
        root.setInsets(Insets.ROOT_PANEL);


        WLabel label = new WLabel(Text.literal("Revival"), 0xFFC11D00);
        root.add(label, 10, 0, 10, 20);


        LoadButtons();


        root.validate(this);
    }

    public void LoadButtons() {
        WButton button1 = new WButton(new ItemIcon(player1), Text.literal(" Revive " + Text.translatable("players.hardcored.player1").getString()));
        button1.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player1").getString().equals("???")){button1.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button1, 1, 3, 9, 20);

        WButton button2 = new WButton(new ItemIcon(player2), Text.literal(" Revive " + Text.translatable("players.hardcored.player2").getString()));
        button2.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player2").getString().equals("???")){button2.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button2, 1, 5, 9, 20);

        WButton button3 = new WButton(new ItemIcon(player3), Text.literal(" Revive " + Text.translatable("players.hardcored.player3").getString()));
        button3.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player3").getString().equals("???")){button3.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button3, 1, 7, 9, 20);

        WButton button4 = new WButton(new ItemIcon(player4), Text.literal(" Revive " + Text.translatable("players.hardcored.player4").getString()));
        button4.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player4").getString().equals("???")){button4.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button4, 1, 9, 9, 20);

        WButton button5 = new WButton(new ItemIcon(player5), Text.literal(" Revive " + Text.translatable("players.hardcored.player5").getString()));
        button5.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player5").getString().equals("???")){button5.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button5, 1, 11, 9, 20);

        WButton button6 = new WButton(new ItemIcon(player6), Text.literal(" Revive " + Text.translatable("players.hardcored.player6").getString()));
        button6.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player6").getString().equals("???")){button6.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button6, 1, 13, 9, 20);



        WButton button7 = new WButton(new ItemIcon(player7), Text.literal(" Revive " + Text.translatable("players.hardcored.player7").getString()));
        button7.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player7").getString().equals("???")){button7.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button7, 12, 3, 9, 20);

        WButton button8 = new WButton(new ItemIcon(player8), Text.literal(" Revive " + Text.translatable("players.hardcored.player8").getString()));
        button8.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player8").getString().equals("???")){button8.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button8, 12, 5, 9, 20);

        WButton button9 = new WButton(new ItemIcon(player9), Text.literal(" Revive " + Text.translatable("players.hardcored.player9").getString()));
        button9.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player9").getString().equals("???")){button9.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button9, 12, 7, 9, 20);

        WButton button10 = new WButton(new ItemIcon(player10), Text.literal(" Revive " + Text.translatable("players.hardcored.player10").getString()));
        button10.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player10").getString().equals("???")){button10.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button10, 12, 9, 9, 20);

        WButton button11 = new WButton(new ItemIcon(player11), Text.literal(" Revive " + Text.translatable("players.hardcored.player11").getString()));
        button11.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player11").getString().equals("???")){button11.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button11, 12, 11, 9, 20);

        WButton button12 = new WButton(new ItemIcon(player12), Text.literal(" Revive " + Text.translatable("players.hardcored.player12").getString()));
        button12.setAlignment(HorizontalAlignment.LEFT);
        if (Text.translatable("players.hardcored.player12").getString().equals("???")){button12.setLabel(Text.translatable("players.hardcored.notset"));}
        root.add(button12, 12, 13, 9, 20);
    }
}
