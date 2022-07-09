package me.mbg206.bettergamemode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GamemodeEvent implements Listener {
    PluginManager manager;
    public GamemodeEvent(PluginManager p) {
        manager = p;
    }

    @EventHandler //(priority = EventPriority.HIGHEST)
    public void onCommandPreprocess(PlayerCommandPreprocessEvent event) {
        String[] args = event.getMessage().split(" ");
        if (!args[0].equalsIgnoreCase("/gamemode")) return;

        if (args[1].equals("s") || args[1].equals("0")) args[1] = "survival";
        else if (args[1].equals("c") || args[1].equals("1")) args[1] = "creative";
        else if (args[1].equals("a") || args[1].equals("2")) args[1] = "adventure";
        else if (args[1].equals("3")) args[1] = "spectator";

        event.setMessage(String.join(" ", args));
    }
}
