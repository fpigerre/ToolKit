package org.mcdynasty.toolkit.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.*;

public class StaffChat {

	ChatColor AQUA = ChatColor.AQUA;
	ChatColor RED = ChatColor.RED;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("staffchat")) {
			if (sender.hasPermission("toolkit.staffchat")) {
			if (args.length == 0) {
				sender.sendMessage(AQUA + "Please specify a message to broadcast!");
				sender.sendMessage(AQUA + "Correct usage: /staffchat <message>");

			} else {
				final String scmessage = (RED + "[StaffChat]: " + ChatColor.RESET
						+ sender.getName() + " " + args);
				for (final Player p : Bukkit.getOnlinePlayers()) {
					{
						if (p.hasPermission("toolkit.staffchat.receive")) {
							continue;
						}
						p.sendMessage(scmessage);
					}
				}
			}
			}
		}
		return false;
	}
}