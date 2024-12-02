package com.bandrewsx.skyblockmod.events;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class EventHandler {

    public static void registerEvents() {
        ServerTickEvents.START_SERVER_TICK.register(server -> {
            // Code to run each server tick.
            System.out.println("Server tick event triggered.");
        });
    }
}
