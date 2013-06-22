package org.mcdynasty.toolkit.commands;

import org.bukkit.command.*;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.World;

import com.sk89q.minecraft.util.commands.*;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandException;

public class Weather {

	ChatColor GOLD = ChatColor.GOLD;
	ChatColor AQUA = ChatColor.AQUA;
	ChatColor RED = ChatColor.RED;
	ChatColor BLUE = ChatColor.BLUE;
	ChatColor GREEN = ChatColor.GREEN;
	ChatColor DAQUA = ChatColor.DARK_AQUA;

	@Command(aliases = { "weather" }, usage = "/weather <clear,storm>", desc = "Changes the current worlds' weather.")
	@CommandPermissions({ "toolkit.weather" })
	public void weather(final CommandContext args, CommandSender sender)
			throws CommandException {
		if (args.argsLength() == 0) {
			sender.sendMessage(AQUA + "Please specify a weather type!");
			sender.sendMessage(AQUA + "Correct usage: /weather <clear,storm>");
/*
		} else {

			final boolean isStorm = args[0].equalsIgnoreCase("storm");
			final boolean isClear = args[0].equalsIgnoreCase("clear");
			final World world = user.getPlayer().getWorld();
			// TODO Find user/player fix/util

			if (args[0].equalsIgnoreCase("storm")) {
				world.setStorm(isStorm);
				sender.sendMessage(GREEN + "You set the weather to storm!");
			}
			if (args[0].equalsIgnoreCase("clear")) {
				world.setClear(isClear);
				sender.sendMessage(GREEN + "You set the weather to clear!");
			}
		}
	}*/
		}
	}
}