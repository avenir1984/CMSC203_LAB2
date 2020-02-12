import java.util.Scanner;
public class NumericTypes {

	public static void main(String[] args) {
		//Create an object of Scanner class
	       Scanner scanner=new Scanner(System.in);
		//TASK #2 Create a Scanner object here 
				//identifier declarations
				final int NUMBER = 2; // number of scores
			final double score1 ; // first test score
				final double score2 ; // second test score
				final int BOILING_IN_F = 212; // boiling temperature
				double fToC; // temperature in Celsius
				double average; // arithmetic average
				String output; // line of output to print out
				
				 System.out.println("Enter SCORE1: ");
			     
				//read score1 from user and convert the string to integer
			       //using Integer.parseInt method
			      score1=Integer.parseInt( scanner.nextLine());
			      
			      System.out.println("Enter SCORE2: ");
			       //read score1 from user and convert the string to integer
			       //using Integer.parseInt method
			      score2= Integer.parseInt(scanner.nextLine());
				//Task #2 declare a variable to hold the user’s temperature
				//Task #2 prompt user to input score1
				//Task #2 read score1 
				//Task #2 prompt user to input score2
				//Task #2 read score2 
				// Find an arithmetic average
				average = score1 + score2 / NUMBER;
				output = score1 + " and " + score2 + " have an average of " + average;	
				System.out.println(output);
				
				
				// Convert Fahrenheit temperatures to Celsius
				fToC = 5/9.0 * (BOILING_IN_F - 32);
				output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
				System.out.println(output);
				
				//declare a celcius
			       double celcius;
			       System.out.println("Enter temperature in Celsius");
			       //read celcius and convert to double type
			       celcius=Double.parseDouble(scanner.nextLine());

			       //Convert celcius to the fahrenheit
			       double cToF=celcius *(9/5.0) + 32.0;

			       output = celcius + " in Celsius is " + cToF
			               + " in Fahrenheit";

			       //print celcius temperature to fahrenheit
			       System.out.println(output);

			   }   

		
				//Task #2 prompt user to input another temperature
				//Task #2 read the user’s temperature in Fahrenheit
				//Task #2 convert the user’s temperature to Celsius
				//Task #2 print the user’s temperature in Celsius
 // to show that the program is ended	
			
		
	{	

System.out.println("goodbye");
}


}




