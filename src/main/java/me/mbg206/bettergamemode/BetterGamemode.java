package me.mbg206.bettergamemode;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterGamemode extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GamemodeEvent(getServer().getPluginManager()), this);
    }
}
