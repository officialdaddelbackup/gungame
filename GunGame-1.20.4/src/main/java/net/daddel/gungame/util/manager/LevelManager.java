package net.daddel.gungame.util.manager;

import net.daddel.gungame.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class LevelManager {
    private Map<Player, Integer> level = new HashMap<>();
    private Map<Player, Material> weaponMap = new HashMap<>();
    private final Material[] weapons = {
            Material.valueOf(Main.configData.getConfig().getString("weapons"))
    };
}
