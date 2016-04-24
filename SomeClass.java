public class SomeClass
{
	public void thoughtForTheDay()
	{
		System.out.println("I couldnt repair brakes");
	}

	public void upcomingEvents()
	{
		System.out.println("upcoming events");
		System.out.println("party at janeds");
	}
	
	public static void main(String[] args)
	{
		SomeClass sc = new SomeClass();
		sc.fnOne();
		sc.upcomingEvents();
	}
}
