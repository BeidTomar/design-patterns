package ChatRoom;

public class UserMp extends User
{
	public UserMp (ChatMediator chatMediator, String name) 
	{
		super(chatMediator, name);
	}
	
	public void send (String message)
	{
		System.out.println(this.name + ": Sending Message: " + message + "\n") ;
		chatMediator.sendMessage(message, this);
		
					
	}
	
	public void receive (String message)
	{
		System.out.println(this.name + ": Received Message:" + message);
	}
  
  
 
}
