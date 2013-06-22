package org.mcdynasty.toolkit.commands;

import org.bukkit.command.*;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.mcdynasty.toolkit.ToolKit;

import com.sk89q.minecraft.util.commands.*;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandException;

public class Broadcast {

	ChatColor AQUA = ChatColor.AQUA;
	
	ToolKit plugin;

	public Broadcast(ToolKit pl) {
		plugin = pl;
	}

	@Command(aliases = { "broadcast" }, usage = "/broadcast <message>", desc = "Broadcasts a command to the entire server.")
	@CommandPermissions({ "toolkit.broadcast" })
	public void broadcast(final CommandContext args, CommandSender sender)
			throws CommandException {
		if (args.argsLength() == 0) {
			sender.sendMessage(AQUA + "Please specify a message to broadcast!");
			sender.sendMessage(AQUA + "Correct usage: /broadcast <message>");

		} else {
			Bukkit.broadcastMessage("[" + ChatColor.GOLD + "BROADCAST"
					+ ChatColor.WHITE + "] " + args);
		}
	}
}