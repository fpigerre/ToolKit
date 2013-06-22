package org.mcdynasty.toolkit.commands;

import org.bukkit.command.*;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

import com.sk89q.minecraft.util.commands.*;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandException;

public class Help {

	ChatColor AQUA = ChatColor.AQUA;

	@Command(aliases = { "help" }, usage = "/help <plugin>", desc = "Displays Help.")
	@CommandPermissions({ "toolkit.help" })
	public void broadcast(final CommandContext args, CommandSender sender)
			throws CommandException {
		
			Bukkit.broadcastMessage("[" + ChatColor.GOLD + "BROADCAST"
					+ ChatColor.WHITE + "] " + args);
	}
}