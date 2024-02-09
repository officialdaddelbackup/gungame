package net.daddel.gungame.util.manager;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class BlockManager {
    private static HashMap<Player, String> buildmode = new HashMap<>();
    private static HashMap<Material, String> water = new HashMap<>();
    public static boolean isInBuildMode(Player p){
        return buildmode.containsKey(p);
    }
    public static void addBuildMode(Player p){
        buildmode.put(p, "buildmode");
    }
    public static void removeBuildMode(Player p){
        buildmode.remove(p, "buildmode");
    }
    public static boolean isWaterEnabled(Material material){
        return water.containsKey(material);
    }
    public static void enableWater(Material material){
        water.put(material, "water");
    }
    public static void disableWater(Material material){
        water.remove(material, "water");
    }
}
