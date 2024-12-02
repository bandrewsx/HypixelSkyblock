package com.bandrewsx.skyblockmod;

import net.fabricmc.api.ModInitializer;

public class SkyblockMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register HUD, keybindings, and events
        KeyBindings.registerKeyBindings();
        System.out.println("Skyblock Mod Initialized");
    }
}
