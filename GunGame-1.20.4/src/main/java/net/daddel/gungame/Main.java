package net.daddel.gungame;

import net.daddel.gungame.file.locationData;
import net.daddel.gungame.file.configData;
import net.daddel.gungame.listener.ChatListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import static net.daddel.gungame.util.Utilities.version;

public final class Main extends JavaPlugin {
    public static Main plugin;
    public static configData configData;
    public static locationData locationData;

    @Override
    public void onEnable() {
        plugin = this;

        locationData = new locationData(this);
        configData = new configData(this);

        getLogger().info("GunGame " + version + " enabled");

        PluginManager plm = Bukkit.getPluginManager();
        plm.registerEvents(new ChatListener(), this);


    }

    @Override
    public void onDisable() {
        getLogger().info("GunGame " + version + " disabled");
    }

    public static Main getPlugin() {
        return plugin;
    }
}
