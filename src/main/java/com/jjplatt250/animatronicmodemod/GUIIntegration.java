package com.jjplatt250.animatronicmodemod;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public
class GUIIntegration extends Screen {
    protected GUIIntegration(Component title) {
        super(title);
    }

    @Override
    public void render(net.minecraft.client.gui.GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
    }
}
