/**
 * Description: This program outputs an array of 12 numbers
 *
 * @author (Omar Anwar)
 * @version (9/24/21)
 */

//importing java utils
import java.util.*;

public class ArraysReview1 {

	// method to get random number
	public static int getRandomInteger(int maximum, int minimum) {

		// randomize number between range of maximum and minimum
		return ((int) (Math.random() * (maximum - minimum))) + minimum;

	}

	//method to populate the arrays
	public static void popArray(int[] array1, int[] array2) {

		// looping through the array to populate it
		for (int i = 0; i < array1.length; i++) {

			// populating the array with random integers from the random integer method
			array1[i] = getRandomInteger(9999, -9999);

		}

		// looping through the array to populate it with the values from the first array
		for (int i = 0; i < array1.length; i++) {

			// populating the array with the same values from the first array
			array2[i] = array1[i];

		}

		// outputting the array 1 to the console
		System.out.println("Random Array 1: " + Arrays.toString(array1));

		// outputting the array 2 to the console
		System.out.println("Random Array 2: " + Arrays.toString(array2));

	}

	//method to check if the two arrays are equal
	public static void checkEqual(int[] array1, int[] array2) {

		//checking if the lengths of the arrays are equal
		if (array1.length != array2.length) {
			
			//if not, then output that the arrays aren't equal
			System.out.println("\nArrays are not equal.");
			
		} else {
			
			//if they are, then output that the arrays are equal
			System.out.println("\nArrays are equal.");
			
		}

		//looping through all of the indexes of the array to check if the values are the same
		for (int i = 0; i < array1.length; i++) {

			// As soon as you find a non-match return false
			if (array1[i] != array2[i]) {

				//if not, then output that the arrays aren't equal
				System.out.println("\nArrays are not equal.");
				
				//and then exit the loop
				break;

			} else {

				//if they are, then output that the arrays are equal
				System.out.println("\nArrays are equal.");

				//and then exit the loop
				break;
				
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring variable for array length
		byte bytArrayLength;
		
		//asking the user for the array length
		System.out.print("Enter array length: ");
		
		//storing the value of the array length to a variable
		bytArrayLength = new Scanner(System.in).nextByte();
		
		//printing a blank line for formatting
		System.out.println("");
		
		// declaring the first integer array
		int[] array1 = new int[bytArrayLength];

		// declaring the second integer array
		int[] array2 = new int[array1.length];
		
		//calling the method to populate the arrays, with the parameters being array 1 and array 2
		popArray(array1, array2);
		
		//calling the method to check if the arrays are equal, with the parameters being array 1 and array 2
		checkEqual(array1, array2);

	}

}
