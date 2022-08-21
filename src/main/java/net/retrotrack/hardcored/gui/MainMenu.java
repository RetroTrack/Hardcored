package net.retrotrack.hardcored.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;


public class MainMenu extends LightweightGuiDescription {
    public MainMenu() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(480, 270);

        root.validate(this);
    }
}
