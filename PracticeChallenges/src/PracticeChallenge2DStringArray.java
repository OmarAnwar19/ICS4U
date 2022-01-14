/**
 * Description: make a 2d array which takes an array of string of only one letter words
 *
 * @author (Omar Anwar)
 * @version (10/20/2021) 
 */

//importing java scanner to get user input
import java.util.Scanner;

public class PracticeChallenge2DStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring variables for array length
		byte bytRow, bytCol;
		
		//starting letter
		char chrLetter = 'a';
		
		//asking user to enter array length
		System.out.println("Please enter how long you would like the array to be (rows x columns): ");
		
		//storing user input to variables
		bytRow = new Scanner(System.in).nextByte();
		bytCol = new Scanner(System.in).nextByte();
		
		// declaring and initializng a new 2d array
		String[][] strMatrix = new String[bytRow][bytCol];

		//making an array so we can output the headers properly
		char[] chrFprint = new char[bytRow];
		
		// nested for loop to loop through each row and column
		for (int i = 0; i < strMatrix.length; i++) {

			//populating index i of the array with the current lette
			chrFprint[i] = chrLetter;
			
			// looping through the columns
			for (int j = 0; j < strMatrix[0].length; j++) {

				// asking for user input
				System.out.print("Please enter words that start with " + (chrLetter) + ": ");

				// populating the array
				strMatrix[i][j] = new Scanner(System.in).nextLine();

			}

			//going to next line
			System.out.println("");
			
			//incrementing letter
			chrLetter++;

		}

		//looping 3 times to print header
		for (int i = 0; i < strMatrix[0].length; i++) {

			// printing headers
			System.out.print("\t\tWord " + (i + 1));

		}

		// nested for loop to loop through each row and column
		for (int i = 0; i < strMatrix.length; i++) {
			
			// printing letter that we were writing
			System.out.print("\nLetter " + (chrFprint[i]/*Using the array that we made before, at index[i]*/) + ": ");

			// looping through the columns
			for (int j = 0; j < strMatrix[0].length; j++) {

				// outputting the array
				System.out.print("\t" + strMatrix[i][j] + "\t");

			}

			// going to next line
			System.out.println("");

		}

	}

}
