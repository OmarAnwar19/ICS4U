/**
 * Description: This program will prompt user for their age, and number of tickets, 
 * and then return a total price based on age group and quantity.
 *
 * @Omar Anwar
 * @9/21/21
 */

//importing joptionpane for user input
import javax.swing.JOptionPane;

public class AnwarMain {
	public static void main(String[] args) {

		// declaring constant prices for the different tickets
		final float STUDENT_RATE = 12.50f;
		final float GENERAL_RATE = 16.50f;
		final float SENIOR_RATE = 14.50f;

		// declaring integer variables for age and number of tickets
		byte bytAge = 0, bytTickets = 0;

		// declaring boolean to make sure the correct input is entered
		boolean bolInput = true;

		// declaring float for the price
		float fltCost = 0;

		// declaring string variables for input of age and number of tickets
		String strAge, strTickets;

		// looping the following code until a valid input is entered
		do {

			// try and catch block to see if there are any errors
			try {
				
				// storing the input of a message box into the string declared before
				bytAge = Byte.parseByte(JOptionPane.showInputDialog(null, "Please enter your age: ", "CineflexMovies",
						JOptionPane.QUESTION_MESSAGE));
				bytTickets = Byte.parseByte(JOptionPane.showInputDialog(null, "Please enter number of tickets: ",
						"CineflexMovies", JOptionPane.QUESTION_MESSAGE));

			// catching any errors
			} catch (Exception ex) {

				// display an error message to the user and re-loop from the do while statement
				JOptionPane.showMessageDialog(null, "Invalid input", "CineflexMovies", JOptionPane.ERROR_MESSAGE);
				
				//resetting the values inside the variables
				bytAge = 0;
				bytTickets = 0;

			}

			// check if both of the inputs are greater than 0
			if (bytAge > 0 && bytTickets > 0) {

				// make the boolean = false if the input is valid
				bolInput = false;

			} else if (bytAge == 0 || bytTickets == 0) {

				//displaying message to the user that the program is exiting
	            JOptionPane.showMessageDialog(null, "Exiting Program", "CineflexMovies", JOptionPane.WARNING_MESSAGE);
	                        
	            //exiting the program
	            System.exit(0);

			} else {

				// display an error message to the user and re-loop from the do while statement
				JOptionPane.showMessageDialog(null, "Invalid input", "CineflexMovies", JOptionPane.ERROR_MESSAGE);

				//resetting the values inside the variables
				bytAge = 0;
				bytTickets = 0;
				
				// otherwise, keep looping
				bolInput = true;

			}

		// do this as long as there is not a valid input
		} while (bolInput == true);

		// multiply the two values that we took in, in order to find the total cost.
		if (bytAge < 18) { // check age, if they are student age, do the following:

			// find cost by multiplying the number of tickets by the appropriate cost.
			fltCost = (STUDENT_RATE * bytTickets);

		} else if (bytAge > 18 && bytAge < 65) {// check age, if they are general age, do the following:

			// find cost by multiplying the number of tickets by the appropriate cost.
			fltCost = (GENERAL_RATE * bytTickets);

		} else if (bytAge > 65) {// check age, if they are senior age, do the following:

			// find cost by multiplying the number of tickets by the appropriate cost.
			fltCost = (SENIOR_RATE * bytTickets);

		}

		// displaying the total cost to the user
		JOptionPane.showMessageDialog(null, "Total cost: $" + fltCost, "CineflexMovies", JOptionPane.PLAIN_MESSAGE);

	}

}
