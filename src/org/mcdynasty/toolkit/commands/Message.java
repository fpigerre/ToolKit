package org.mcdynasty.toolkit.commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

import com.sk89q.minecraft.util.commands.*;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandException;

public class Message {

	ChatColor AQUA = ChatColor.AQUA;
	ChatColor GOLD = ChatColor.GOLD;
	ChatColor RESET = ChatColor.RESET;
	
	/*@Command(aliases = { "msg" }, usage = "/msg <player> <message>", desc = "Sends a message to another player.")
	@CommandPermissions({ "toolkit.msg" })
	public void message(final CommandContext args, CommandSender sender)
			throws CommandException {
		if (args.argsLength() < 2) {
			sender.sendMessage(AQUA + "Correct usage: /msg <player> <message>");

		} else {
			final String senderName = sender.getName();
			final String targetName = args[1];
			final String frommessage = GOLD + "[From " + senderName + "]" + RESET + args[2];
			final String tomessage = GOLD + "[To " + targetName + "]" + RESET + args[2];

			for (final Player p : Bukkit.getOnlinePlayers()) {
				{
					if (p.getName.equalsIgnoreCase(targetName)) {
						continue;
					}
					p.sendMessage(frommessage);
					sender.sendMessage(tomessage);
				}
			}
		}
	}*/
}