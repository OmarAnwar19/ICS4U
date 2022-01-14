/**
 * Description: Write a method that returns the median value in the array.
If the length of the array is odd, the median is the value in the center of the array.
If the length of the array is even, the median is the average of the two numbers in the center.
You may assume the array passed into this method will never be empty.
 *
 * @author (Omar Anwar)
 * @version (10/4/2021) 
 */

//importing java utils to be able to use scanner, and sort arrays
import java.util.*;

public class ReviewChallenge7 {

	//method to get the median of the array
	public static void getArrayMedian(int intArray[], byte bytArrayLength) {
		
		//print the array to the terminal
		System.out.println("\nARRAY: " + Arrays.toString(intArray));
		
		//if the array length is odd
		if (bytArrayLength %2 == 0) {
			
			//declaring a variable for the middle of the array
			int intArrMidTotal, intArrMidAverage;
			
			//store the value of the total of the 2 middle values to the array.
			intArrMidTotal = intArray[(bytArrayLength / 2) + 1] + intArray[(bytArrayLength / 2) - 1];
			
			//divide this total by 2
			intArrMidAverage = intArrMidTotal / 2;
			
			//printing the middle of the array
			System.out.println("Array median: " + intArrMidAverage);
		
		//if the array length is even
		} else if (bytArrayLength %2 == 1) {
			
			//output the middle of the array, this is equal to the length of the array divided by 2
			System.out.println("Array median: " + (intArray[bytArrayLength / 2]));
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring a vriable for the array length
		byte bytArrayLength;

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

		//calling method to get median of the array
		getArrayMedian(intArray, bytArrayLength);
		
	}

}
