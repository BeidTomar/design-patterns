package planetix;

public class Subscriber {
	
	private String name;
	private Channel channel = new Channel();
	
	public void update()
	{
		System.out.println("Hi " + name + " , Video added : " + channel.title);
	}
	 
	public void subscribeChannel(Channel ch)
	{
		channel = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}

}
