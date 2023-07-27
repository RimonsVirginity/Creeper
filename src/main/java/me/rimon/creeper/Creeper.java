package me.rimon.creeper;

import org.bukkit.plugin.java.JavaPlugin;

public final class Creeper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new AroundYou(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
