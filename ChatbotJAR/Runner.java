import java.util.Scanner;

/**
 * A simple class to run the Chat class.
 * @author 
 * @version Nov. 2019
 */
public class Runner
{

	/**
	 * Create a Chat, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Chat run = new Chat();
		
		System.out.println (run.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (run.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
