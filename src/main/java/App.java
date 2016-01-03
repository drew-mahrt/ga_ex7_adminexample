import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
		//Ask the user for the answer
		System.out.println("did you register an account? (yes/no)");
        final String registered = scanner.nextLine();
        final boolean userDidRegisterAccount = registered.matches("[y|Y](es)?$");
        //Ask the user for the answer
		System.out.println("did you cancel your account? (yes/no)");
        final String cancelled = scanner.nextLine();
        final boolean userDidCancelAccount = cancelled.matches("[y|Y](es)?$");
		//Ask the user for the answer
		System.out.println("are you an admin? (yes/no)");
        final String isAdmin =  scanner.nextLine();
        final boolean userIsAdmin = isAdmin.matches("[y|Y](es)?$");
		//Ask the user for the answer
		System.out.println("are you signed in? (yes/no)");
        final String signedIn = scanner.nextLine();
        final boolean userIsSignedIn = signedIn.matches("[y|Y](es)?$");


		if (!userDidRegisterAccount || userDidCancelAccount) //Check if registered is "no" or canceled is "yes"
		{
			System.out.println("go away");
		}
		else if (userIsSignedIn && userIsAdmin) //Check if signedIn is "yes" and admin is "yes"
		{
			System.out.println("you can see and change all the pages");
		}
		else if (userIsSignedIn && !userIsAdmin) //Check if signedIn is "yes" and admin is "no"
		{
			System.out.println("you can see all the pages");
		}
		else if (!userIsSignedIn) //Check if signedIn is "no"
		{
			System.out.println("you can't see any of the pages, please sign in");
		}
		else
		{
			System.out.println("sorry!!!");
		}
	}
}


