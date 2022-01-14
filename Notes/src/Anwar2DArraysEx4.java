/**
 * Description: This program randomly generate a 2D Array, and then outputs it
 *
 * @author (Omar Anwar)
 * @version (10/7/2021)
 */

//importing scanner to get user input
import java.util.Scanner;

public class Anwar2DArraysEx4 {

	public static void printMatrix(byte[][] array) {

		// for loop
		for (int i = 0; i < array.length; i++) {

			//looping through the array
			for (int j = 0; j < array[0].length; j++) {

				// printing out the array, and a tab
				System.out.print(array[i][j] + "\t");

			}

			// drop the next row to a new line
			System.out.println();
		}

	}

	public static byte[][] populate(byte[][] grid) {

		// populate array with random numbers
		for (int i = 0; i < grid.length; i++) {

			// generate random number between 0-100, and populate the array
			for (int j = 0; j < grid[0].length; j++) {

				// storing a random number into each index
				grid[i][j] = (byte) ((Math.random() * (100)) + 1);

			}

		}

		// returning the array
		return (grid);

	}

	public static void getProduct(byte[][] grid, byte bytRow) {

		// declare variable to store the sum of the row
		short shrSum = 1;
		
		//loop through the array
		for (int i = 0; i < 6; i++) {
			
			//multiply shrSum, by the index, and then add it to the variable
			shrSum *= grid[bytRow - 1][i];
			
		}

		// outputting a message with the sum
		System.out.println("\nProduct of row " + bytRow + ": " + shrSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring and hard coding a 5x6 array
		byte[][] grid = new byte[5][6];

		// declare variable to allow the user to tell us what row to add
		// need to initialize because of try and catch block
		byte bytRow = 0;

		// declare boolean for try and catch
		boolean bolTryCatch = false;

		// calling method to populate the array
		grid = populate(grid);

		// calling method to print the array and pass the grid
		printMatrix(grid);

		// do while loop
		do {

			try {

				// prompt user to enter the row they wish to add
				System.out.print("\nWhich row would you like to multiply?: ");

				bytRow = (byte) (new Scanner(System.in).nextByte() - 1);

			} catch (Exception ex) {

				// output an error message
				System.out.println("\nPlease enter a valid input.\n");

			}

			// check that row exists in the 2D array
			if (bytRow > 5 || bytRow < 0) {

				// output an error message
				System.out.println("\nPlease enter a valid input");

				// set the boolean to be equal to false still
				bolTryCatch = false;

				// otherwise, if there is a valid input
			} else {

				// make the boolean = true, so it exits the loop
				bolTryCatch = true;

			}

			// do this while a valid input has not been entered
		} while (bolTryCatch == false);

		// calling method to get sum, and output it
		getProduct(grid, bytRow);

	}

}
