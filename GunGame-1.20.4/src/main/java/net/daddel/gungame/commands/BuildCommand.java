package net.daddel.gungame.commands;

import net.daddel.gungame.util.manager.BlockManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static net.daddel.gungame.util.Utilities.*;

public class BuildCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(args.length == 0){
                if(p.hasPermission(perms + "build") || p.hasPermission(x)){
                    if(BlockManager.isInBuildMode(p)){
                        BlockManager.removeBuildMode(p);
                        p.getInventory().clear();
                        p.sendMessage(prefix + "§7You are no longer in edit mode!");
                    }else {
                        BlockManager.addBuildMode(p);
                        p.sendMessage(prefix + "§7You are now in edit mode!");
                    }
                }
            }
        }
        return false;
    }
}
