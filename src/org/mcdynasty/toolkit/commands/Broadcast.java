package org.mcdynasty.toolkit.commands;

import org.bukkit.command.*;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

public class Broadcast {

	ChatColor AQUA = ChatColor.AQUA;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("broadcast")) {
			if (args.length == 0) {
				sender.sendMessage(AQUA + "Please specify a message to broadcast!");
				sender.sendMessage(AQUA + "Correct usage: /broadcast <message>");

			} else {
				Bukkit.broadcastMessage("[" + ChatColor.GOLD + "BROADCAST"
						+ ChatColor.WHITE + "] " + args);
			}
		}
		return false;
	}
}