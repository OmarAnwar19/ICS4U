/**
 * Description: 2d array practice
 *
 * @author (Omar Anwar)
 * @version (10/20/2021) 
 */

//importing java scanner to get user input
import java.util.Scanner;

public class Anwar2DArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring and initializng a new 2d array
		short[][] numMatrix = new short[3][4];

		// nested for loop to loop through each row and column
		for (int i = 0; i < numMatrix.length; i++) {

			// looping through the columns
			for (int j = 0; j < numMatrix[0].length; j++) {

				// asking for user input
				System.out.print("Please enter an assignment " + (j + 1) + " mark for course " + (i + 1) + ": ");

				// populating the array
				numMatrix[i][j] = new Scanner(System.in).nextShort();

			}

			//going to next line
			System.out.println("");

		}

		//looping 3 times to print header
		for (int i = 0; i < numMatrix[0].length; i++) {

			// printing headers
			System.out.print("\tAssignment " + (i + 1));

		}

		// nested for loop to loop through each row and column
		for (int i = 0; i < numMatrix.length; i++) {
			
			// printing course number
			System.out.print("\nCourse " + (i + 1) + ": ");

			// looping through the columns
			for (int j = 0; j < numMatrix[0].length; j++) {

				// outputting the array
				System.out.print("\t" + numMatrix[i][j] + "\t");

			}

			// going to next line
			System.out.println("");

		}

	}

}
