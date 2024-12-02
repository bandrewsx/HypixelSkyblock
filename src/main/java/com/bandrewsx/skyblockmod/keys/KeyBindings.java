package com.bandrewsx.skyblockmod.keys;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static KeyBinding locateFairySoulKey;

    public static void registerKeyBindings() {
        locateFairySoulKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.skyblockmod.locateFairySoul",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_F,
                "category.skyblockmod"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (locateFairySoulKey.wasPressed()) {
                System.out.println("Fairy Soul Locator activated!");
                // Add functionality here for finding fairy souls.
            }
        });
    }
}
