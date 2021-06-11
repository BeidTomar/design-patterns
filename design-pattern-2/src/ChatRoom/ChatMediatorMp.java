package ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorMp implements ChatMediator 
{
	private  List<User> users;
	
	
	public ChatMediatorMp() 
	{
		this.users = new ArrayList<User>() ;
		
		
	}
	
	public void sendMessage(String message, User user)
	{
		for(User u: this.users)
		{
			if ( u != user)
			{
				u.receive(message);
			}
		}
	}
	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}
	

}
