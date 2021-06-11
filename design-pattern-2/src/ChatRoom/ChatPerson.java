package ChatRoom;

public class ChatPerson {

	public static void main(String[] args) 
	{
		ChatMediator chatMediator = new ChatMediatorMp ();
		User beid = new UserMp (chatMediator, "Beid");
		User ivan = new UserMp (chatMediator, "Ivan");
		User todor = new UserMp (chatMediator, "Todor");
		
		chatMediator.addUser(beid);
		chatMediator.addUser(ivan);
		chatMediator.addUser(todor);
		
		beid.send(" Hi guys, How you feeling?");
	}

}
