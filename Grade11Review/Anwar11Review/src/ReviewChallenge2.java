
/**
 * Write a program in main that takes a byte - age and outputs a message according to the following:
0-5 -> "Your ride is free!"
6-12 -> "Your fare is: $" 2.50 (Child fare)
13-18 -> "Your fare is: $" 4.50 (Youth fare)
19-64 -> "Your fare is: $" 6.50 (Adult fare)
65 and up -> "Your fare is: $" 4.50 (Senior fare)
 * @Omar Anwar
 * @9/22/21
 */

//importing the scanner for user input
import java.util.Scanner;

public class ReviewChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring constants for the fares
        final float INFANT_RATE = 0.0f;//FREE
        final float CHILD_RATE = 2.50f;
        final float YOUTH_RATE = 4.50f;
        final float ADULT_RATE = 6.50f;
        final float SENIOR_RATE = 4.50f;

		//declaring a variable for the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring a variable for user input
		byte bytAge = 0;
		
		//first part of try and catch statement
		try {
			
		//asking user for their age
		System.out.print("Please enter your age: ");
		
		//storing the input into a scanner variable
		bytAge = scanner1.nextByte();
		
		//second part of the try and catch statement, dealing with the error
		} catch (Exception ex) {
			
			//asking user to enter a valid age
			System.out.println("Please enter a valid age.");
			
		}
		//assigning the correct fare to the user, and outputting it to the console. All depending on the age of the user.
		if (bytAge >= 0 && bytAge <= 6) {
	
			System.out.println("\nYour fare is: $FREE");
			
		} else if (bytAge > 6 && bytAge <= 12) {
	
			System.out.println("\nYour fare is: $" + CHILD_RATE);
			
		} else if (bytAge > 12 && bytAge <= 18) {
	
			System.out.println("\nYour fare is: $" + YOUTH_RATE);
			
		} else if (bytAge > 18 && bytAge <= 64) {
	
			System.out.println("\nYour fare is: $" + ADULT_RATE);
			
		} else if (bytAge > 64) {
	
			System.out.println("\nYour fare is: $" + SENIOR_RATE);
			
		} else {
			
			System.out.println("\nPlease enter a valid age.");
			
		}
	}

}
