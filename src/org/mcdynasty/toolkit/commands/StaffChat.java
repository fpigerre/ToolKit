package org.mcdynasty.toolkit.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissions;

public class StaffChat {

	ChatColor AQUA = ChatColor.AQUA;
	ChatColor RED = ChatColor.RED;

	@Command(aliases = { "staffchat", "sc", "chat" }, usage = "/staffchat <message>", desc = "Broadcasts a message to all online staff.")
	@CommandPermissions({ "toolkit.staffchat" })
	public void staffchat(final CommandContext args, CommandSender sender)
			throws CommandException {
		if (args.argsLength() == 0) {
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