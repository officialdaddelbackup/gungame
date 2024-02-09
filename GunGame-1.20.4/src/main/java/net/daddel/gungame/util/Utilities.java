package net.daddel.gungame.util;

import net.daddel.gungame.Main;
import net.daddel.gungame.util.manager.StringManager;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Utilities {
    private static StringManager stringManager = new StringManager();
    public static String version = "v" + stringManager.getVersion() + "-mc" + stringManager.getAPIVersion();
    public static String prefix = "§6GunGame §8| §7";
    public static void noperm(Player p){
        p.sendMessage(prefix + "§4You don't have permissions to execute this command!");
    }
    public static void consoleError(CommandSender sender){
        sender.sendMessage("The Console can't execute this command!");
    }
    public static String perms = "gungame.";
    public static String x = perms + "*";
}
