public class SomeClass
{
	public void thoughtForTheDay()
	{
		System.out.println("on your hand you have different fingers");
	}

	public void upcomingEvents()
	{
		System.out.println("upcoming events");
		System.out.println("Dinner at Kayss");
	}
	
	public static void main(String[] args)
	{
		SomeClass sc = new SomeClass();
		sc.fnOne();
		sc.upcomingEvents();
	}
}
