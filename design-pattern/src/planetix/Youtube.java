package planetix;

public class Youtube {

	public static void main(String[] args) 
	{
		Channel planetix = new Channel();
		
		Subscriber s1 = new Subscriber("Beid");
		Subscriber s2 = new Subscriber("Todor");
		Subscriber s3 = new Subscriber("Ivan");
		Subscriber s4 = new Subscriber("Petko");
		
		planetix.subscribe(s1);
		planetix.subscribe(s2);
		planetix.subscribe(s3);
		planetix.subscribe(s4);
		
		s1.subscribeChannel(planetix);
		s2.subscribeChannel(planetix);
		s3.subscribeChannel(planetix);
		s4.subscribeChannel(planetix);
		
		planetix.upload("How to fix car");
		
	}

}
