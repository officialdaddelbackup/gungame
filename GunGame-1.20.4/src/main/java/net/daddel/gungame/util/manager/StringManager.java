package net.daddel.gungame.util.manager;

import net.daddel.gungame.Main;

public class StringManager {
    public String getVersion(){
        return Main.getPlugin().getDescription().getVersion();
    }
    public String getAPIVersion(){
        return Main.getPlugin().getDescription().getAPIVersion();
    }
}
