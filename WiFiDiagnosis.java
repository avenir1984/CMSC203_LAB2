import java.util.Scanner;

public class WiFiDiagnosis {
	
	public void resetWiFi() {
		
		String choice;
		/* create a Scanner object form keyboard choice
		 * 
		 */
		Scanner Keyboard = new Scanner(System.in);
		
		// prompt user to reboot computer
		
		System.out.println("First step: reboot your computer");
		System.out.print("Are you able to connect with the internet? (yes or no): ");
		choice  = Keyboard.nextLine();
		while(choice.equalsIgnoreCase("yes") && choice.equalsIgnoreCase("no"))
		{
			System.out.println("Please enter yes or no!\n");
			System.out.print("Are you able to connect with the internet? (yes or no): ");
			choice = Keyboard.nextLine();
			}
		
		if(choice.equalsIgnoreCase("yes")) {
			
			System.out.println("Rebooting your computer seemed to work");
			
		}
		
		else {
			System.out.println("Second step: reboot your router");
		}
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		choice =Keyboard.nextLine().trim();
		while(choice.equalsIgnoreCase("yes") && choice.equalsIgnoreCase("no"))
		{
		System.out.println("Please enter yes or no!\n");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		choice = Keyboard.nextLine();
		}
		if(choice.equalsIgnoreCase("yes"))
		{
		System.out.println("Rebooting your router seemed to work");
			   
		}
		
		else {
			
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
			System.out.print("Now are you able to connect with the internet? (yes or no): ");
			choice = Keyboard.nextLine().trim();
			while(choice.equalsIgnoreCase("yes") && choice.equalsIgnoreCase("no"))
			{
			System.out.println("Please enter yes or no!\n");
			System.out.print("Now are you able to connect with the internet? (yes or no): ");
			choice =Keyboard.nextLine().trim();
			}
			if(choice.equalsIgnoreCase("yes"))
			{
			System.out.println("Checking the router's cables seemed to work");
		}
			
			else {
				System.out.println("Fourth step: move your computer closer to your router");
				System.out.print("Now are you able to connect with the internet? (yes or no): ");
				choice = Keyboard.nextLine().trim();
				while(choice.equalsIgnoreCase("yes") && choice.equalsIgnoreCase("no"))
				{
				System.out.println("Please enter yes or no!\n");
				System.out.print("Now are you able to connect with the internet? (yes or no): ");
				choice = Keyboard.nextLine().trim();
				}
				if(choice.equalsIgnoreCase("yes"))
				{
				System.out.println("Moving your computer closer to the router seemed to work");
			}
				
			else {
				System.out.println("Fifth step: contact your ISP\n"
						+ "Make sure your ISP is hooked up to your router.");
			}
			}
		}
}
}