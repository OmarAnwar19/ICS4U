/**
 * Description: Write a method that returns the last element in the array.
 * Write a method that returns the length of an array.
 *
 * @author (Omar Anwar)
 * @version (10/4/2021) 
 */

//importing java utils to be able to use array tools, and scanner
import java.util.*;

public class ReviewChallenge6 {

	//method to get the last element of the array
	public static void lastArray(int[] intArray, byte bytArrayLength) {
		
		//printing the index, and element at last position in the array
		System.out.println("\nThe last element of the array is: Index: " + bytArrayLength + 
						"\n                                  Value: " + intArray[bytArrayLength - 1]);
		
	}
	
	//method to get the length of the array
	public static void lengthArray(int[] intArray) {
		
		//print to the user the length of the array, use array.length for the actual value
		System.out.println("\nThe array is " + (intArray.length) + " elements long.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring a vriable for the array length
		byte bytArrayLength;

		// declaring a variable for user option
		byte bytChoice;

		// declaring a boolean to do the loop
		boolean bolCheck = true;

		// asking user for array length
		System.out.print("How long should array be?: ");

		// storing the user input to a variable to make array same length
		bytArrayLength = new Scanner(System.in).nextByte();

		// declaring an array using the length we got from the user
		int[] intArray = new int[bytArrayLength];

		// populating the array by looping though it, and making each value a random
		// number between 1-100
		for (int i = 0; i < intArray.length; i++) {

			// storing a random number to each value in the array
			intArray[i] = ((int) (Math.random() * (100 - 1))) + 1;

		}

		//printing the menu options
		System.out.println("\nChoose an option: ");
		System.out.println("1.) Last element of array");
		System.out.println("2.) Array length\n");

		//do the following...
		do {

			//storing the user input to a variable
			bytChoice = new Scanner(System.in).nextByte();

			//if the user enters option 1
			if (bytChoice == 1) {

				//call the method for the array last index
				lastArray(intArray, bytArrayLength);

			//otheriwse, if the user enters option 2
			} else if (bytChoice == 2) {

				//call the method for the array length
				lengthArray(intArray);

			//if a user enters neither 1 or 2, output an error message
			} else {

				//ask a user for a correct input
				System.out.println("Please choose a valid menu option.");

			}

		//while an incorrect option is entered
		} while (bolCheck);

	}

}
