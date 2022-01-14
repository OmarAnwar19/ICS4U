import java.util.Scanner;

/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

/**
 * @author omara
 *
 */
public class AnimalsTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bolTryCatch = false;

		short shrNumAnimals = 0;

		Animals[] lstAnimals;

		String tempSpecies = null, tempGenus = null;
		boolean tempExtinct = false;
		short tempAge = 0;
		float tempWeight = 0;

		// do while loop to make sure we get the correct input from the user
		do {

			// try to do all of the following code, and check if we get any errors
			try {

				// ask user how many students they wanna add, and make the array that long
				System.out.print("How many animals would you like to add?: ");

				// store the number that the user inputs into the variable that we declared
				// earlier
				shrNumAnimals = new Scanner(System.in).nextShort();

				// set the boolean = false, so doesn't loop
				bolTryCatch = false;

				// if the user enters incorrect data types, tell them to enter a new value
			} catch (Exception ex) {

				// tell the user that they entered an incorrect value, and loop the do while
				System.out.println("\nPLEASE ENTER A VALID INPUT\n");

				// set the boolean = true, so it keeps looping
				bolTryCatch = true;

			}

			// do all of this code while the user enters incorrect code
		} while (bolTryCatch);

		lstAnimals = new Animals[shrNumAnimals];

		for (int i = 0; i < lstAnimals.length; i++) {

			System.out.println("");

			do {

				try {

					lstAnimals[i] = new Animals();

					
					System.out.print("Please enter animal " + (i + 1) + " species: ");

					tempSpecies = new Scanner(System.in).nextLine();

					lstAnimals[i].setSpecies(tempSpecies);

					
					System.out.print("Please enter animal " + (i + 1) + " genus: ");

					tempGenus = new Scanner(System.in).nextLine();

					lstAnimals[i].setGenus(tempGenus);

					
					System.out.print("Is animal " + (i + 1) + " extinct? (true/false): ");

					tempExtinct = new Scanner(System.in).nextBoolean();

					lstAnimals[i].setExtinct(tempExtinct);

					
					System.out.print("Please enter animal " + (i + 1) + " age: ");

					tempAge = new Scanner(System.in).nextShort();

					lstAnimals[i].setAge(tempAge);

					
					System.out.print("Please enter animal " + (i + 1) + " weight: ");

					tempWeight = new Scanner(System.in).nextFloat();

					lstAnimals[i].setWeight(tempWeight);

					
					bolTryCatch = false;

				} catch (Exception ex) {

					// tell the user that they entered an incorrect value, and loop the do while
					System.out.println("\nPLEASE ENTER A VALID INPUT\n");

					// set the boolean = true, so it keeps looping
					bolTryCatch = true;

				}

			} while (bolTryCatch);

		}

		//System.out.println(lstAnimals[]);
		
		for (Animals j : lstAnimals) {

			System.out.println(j);

		}

	}

}
