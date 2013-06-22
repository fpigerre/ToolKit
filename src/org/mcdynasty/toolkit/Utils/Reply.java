package org.mcdynasty.toolkit.Utils;

import org.bukkit.command.CommandSender;

public interface Reply {
	void setReplyTo(CommandSender user);

	CommandSender getReplyTo();
}
