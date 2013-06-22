package org.mcdynasty.toolkit.Utils;

import org.mcdynasty.toolkit.Utils.Reply;
import org.bukkit.command.CommandSender;

public final class Console implements Reply {
	private static Console instance = new Console();
	private CommandSender replyTo;
	public final static String NAME = "Console";

	@Override
	public void setReplyTo(final CommandSender user) {
		replyTo = user;
	}

	@Override
	public CommandSender getReplyTo() {
		return replyTo;
	}

	public static Console getConsoleReplyTo() {
		return instance;
	}
}
