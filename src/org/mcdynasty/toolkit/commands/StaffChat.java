package org.mcdynasty.toolkit.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Server;

import org.mcdynasty.toolkit.ToolKit;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissions;

public class StaffChat {
	


    ChatColor GOLD = ChatColor.GOLD;
    ChatColor AQUA = ChatColor.AQUA;
    ChatColor RED = ChatColor.RED;
    ChatColor BLUE = ChatColor.BLUE;
    ChatColor GREEN = ChatColor.GREEN;
    ChatColor DAQUA = ChatColor.DARK_AQUA;
    
    @Command(aliases = {"staffchat", "sc", "chat"}, 
    	    usage = "/staffchat <message>",
    	    desc = "Broadcasts a message to all online staff.")
        @CommandPermissions({"toolkit.staffchat"})
        public void kick(final CommandContext args, CommandSender sender) throws CommandException {
    	if (args.argsLength() == 0) {
    	    sender.sendMessage(AQUA + "Please specify a message to broadcast!");
    	    sender.sendMessage(AQUA + "Correct usage: /staffchat <message>");
    	    
    	} else {
    		final String scmessage = (RED + "[StaffChat]: " + ChatColor.RESET + sender.getName() + " " + args);
    		for (Player player : server.getOnlinePlayers());
    		{
    			if (player.hasPermission("toolkit.staffchat.receive"));
    			{
    				continue;
    			}
    			player.sendMessage(scmessage);
    		}
    	}
    }
}
