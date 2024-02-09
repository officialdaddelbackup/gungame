package net.daddel.gungame.util.manager;

import net.daddel.gungame.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class LocationsManager {
    private static FileConfiguration locConfig = Main.locationData.getConfig();
    public static void setSpawn(Player p){
        locConfig.set("spawn.world", p.getWorld().getName());
        locConfig.set("spawn.x", p.getLocation().getX());
        locConfig.set("spawn.y", p.getLocation().getY());
        locConfig.set("spawn.z", p.getLocation().getZ());
        locConfig.set("spawn.yaw", p.getLocation().getYaw());
        locConfig.set("spawn.pitch", p.getLocation().getPitch());
        Main.locationData.saveConfig();
    }
    public static Location getSpawn(){
        World world = Bukkit.getWorld(locConfig.getString("spawn.world"));
        double x = locConfig.getDouble("spawn.x");
        double y = locConfig.getDouble("spawn.y");
        double z = locConfig.getDouble("spawn.z");
        float yaw = (float) locConfig.getDouble("spawn.yaw");
        float pitch = (float) locConfig.getDouble("spawn.pitch");
        return new Location(world, x, y, z, yaw, pitch);
    }
}
