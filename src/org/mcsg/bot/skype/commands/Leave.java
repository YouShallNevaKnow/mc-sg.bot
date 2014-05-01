package org.mcsg.bot.skype.commands;

import org.mcsg.bot.skype.util.Permissions;

import com.skype.Chat;
import com.skype.User;

public class Leave implements SubCommand{

	@Override
	public void execute(Chat chat, User sender, String[] args) throws Exception {
		if(Permissions.hasPermission(sender, chat, "leave")){
			chat.send("/leave");
		}
		
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}