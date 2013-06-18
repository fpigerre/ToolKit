package org.mcdynasty.toolkit;

import java.io.File;
import org.bukkit.plugin.java.JavaPlugin;

public class ToolKit extends JavaPlugin {

	@Override
    public void onEnable() {

        File config = new File(this.getDataFolder(), "config.yml");
        if (!config.exists()) {
            this.saveDefaultConfig();
            this.getConfig().options().copyHeader(true);
            System.out.println("[" + getDescription().getName() + "] No config.yml detected, config.yml created");
        }
        //Checks if config.yml exists and creates if false
        
        this.getLogger().info("[" + getDescription().getName() + "] " + getDescription().getName() + " " + getDescription().getVersion() + " is enabled!");
	} //Logs to console that plugin is enabled

	@Override
    public void onDisable() {
        this.getLogger().info("[" + getDescription().getName() + "] " + getDescription().getName() + " " + getDescription().getVersion() + " is disabled!");
    } //Logs to console that plugin is disabled
}