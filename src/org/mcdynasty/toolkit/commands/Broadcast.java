package org.mcdynasty.toolkit.commands;

import org.bukkit.command.*;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

import org.mcdynasty.toolkit.ToolKit;

public class Broadcast implements CommandExecutor {

	@SuppressWarnings("unused")
	private ToolKit plugin;
	 
	public Broadcast(ToolKit plugin) {
		this.plugin = plugin;
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("broadcast")) {
		if (sender.hasPermission("toolkit.broadcast")) {
			if (args.length < 0) {
		           sender.sendMessage("Not enough arguments!");
			} else {
				Bukkit.broadcastMessage("["+ ChatColor.GOLD + "BROADCAST" + ChatColor.WHITE + "] " + args[0]);
			}
		}
		}
		return false;
	}
}