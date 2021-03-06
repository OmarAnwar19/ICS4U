/**
 * Description: Write a method named multiples that takes an array of shorts - nums,
 *  and a short n and outputs all the multiples of n in nums
 *
 * @author (Omar Anwar)
 * @version (9/24/21) 
 */

//importing the scanner for user input, and arrays util to format arrays and output them
import java.util.Arrays;
import java.util.Scanner;

public class ReviewChallenge3 {

	public static short[] getArrayInput() {

		// asking user for input
		System.out.print("Please enter number of shorts: ");

		// declaring the array of shorts
		short[] shrNums = new short[new Scanner(System.in).nextShort()];
		
		//printing a blank line for formatting
		System.out.println("");
		
		//looping to populate the array
		for (int i = 0; i < shrNums.length; i++) {
			
			//asking user to input a short
			System.out.print("Please enter short " + (i + 1) + ": ");
			
			//storing the value to the i index of the array
			shrNums[i] = new Scanner(System.in).nextShort();
			
		}

		//returning the array
		return(shrNums);
		
	}

	public static void multiples(short[] shrNumsArray) {

		// declaring the variable for the short n
		short shrUserIn;
		
		//declaring a boolean to check if number is divisible by anything
		boolean bolDivi = true;
		
		// asking user for the short n
		System.out.print("\nPlease enter number to check multiples: ");

		// storing the short n into a variable
		shrUserIn = new Scanner(System.in).nextShort();

		//outputting the multiples
		System.out.println("\nMultiples of " + shrUserIn + ": ");
		
		//looping through the array of inputs to check for multiples
		for (int i = 0; i < shrNumsArray.length; i++) {
			
			//check if the number is divisible by the user input
			if (shrNumsArray[i] % shrUserIn == 0) {
				
				//Outputting the number 
				System.out.println("-> " + shrNumsArray[i]);
				
				//make the boolean for multiples = false
				bolDivi = false;
				
			} 
			
			//check if none of the numbers are divisible
			if (bolDivi == true && i == (shrNumsArray.length - 1)) {
				
				//if none of the numbers are divisible, display this to the console
				System.out.println("-> None");
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling the method to store the array to a new variable
		short shrNumsArray[] = getArrayInput();
				
		//calling the method to check multiples
		multiples(shrNumsArray);

	}

}
