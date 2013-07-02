package org.mcdynasty.toolkit;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Some of this code is sourced from:
 * 
 * OresomeAdmin | OresomeCraft administration plugin
 * 
 * @author Zach De Koning (Zachoz)
 */

public class ToolKit extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Minecraft");

	public void onDisable() {

		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " is now disabled");
	}

	public void onEnable() {

		saveDefaultConfig();
		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion()
				+ " is now enabled");
		getServer().getPluginManager().registerEvents(new GlobalListener(this),
				this);

		server_name = getConfig().getString("server_name");
	}
	}
