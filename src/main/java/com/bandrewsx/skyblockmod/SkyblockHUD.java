package com.example.skyblockmod.hud;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

public class SkyblockHUD implements ClientModInitializer {

    public static void registerHUD() {
        HudRenderCallback.EVENT.register((matrixStack, tickDelta) -> renderHUD(matrixStack));
    }

    private static void renderHUD(MatrixStack matrixStack) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            int health = (int) client.player.getHealth();
            int mana = 100; // Placeholder for actual mana value.
            DrawableHelper.drawTextWithShadow(matrixStack, client.textRenderer,
                    "Health: " + health + " | Mana: " + mana, 10, 10, 0xFFFFFF);
        }
    }
}
