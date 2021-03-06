/**
 * Description: This program calculates your scholarship eligibility based on multiple factors, \n"
				+ "including: top 6 marks, volunteer hours. 
 *
 * @author (Omar Anwar)
 * @version (9/23/21) 
 */

//importing scanner for user input
import java.util.Scanner;

//main class
public class MethodPractice {

	public static int getAverage() {

		// declaring variables for user grades, their total grade, and average
		byte bytUserGrade;
		int intGradeTotal = 0, intAverage;

		// declaring a boolean for the looped try and catch statement in order to check
		// if user input is valid
		boolean bolTryCatch = true;

		// looping through to ask user their grades
		for (int i = 0; i <= 5; i++) {
			// first part of do while loop
			do {

				// first part of try and catch statement, this is the code that will be actually
				// attempted
				try {

					// asking user for their grade
					System.out.print("\nPlease enter grade " + (i + 1) + " : ");

					// storing the value to the byte
					bytUserGrade = new Scanner(System.in).nextByte();

					// adding that grade to the total grade
					intGradeTotal += bytUserGrade;

					// since the input was valid, break the loop
					break;

					// second part of try and catch statement to deal with any errors that might
					// occur, using an error message, and commands
				} catch (Exception ex) {

					// outputting error message to the user
					System.out.println("\nPlease enter a valid grade.");

					// make the boolean for invalid input = true, and re-loop the code
					bolTryCatch = true;

				}

				// do all of the above code while the boolean for valid input = true
			} while (bolTryCatch);

		}

		// calculating the average
		intAverage = (intGradeTotal / 6);

		// returning the average
		return (intAverage);

	}

	// method for checking user scholarship eligibility
	public static void checkScholarship(int intAverage, int intVolHours) {

		// checking first criteria
		if (intAverage >= 90 && intVolHours >= 100) {

			// displaying message to the user
			System.out.println("\n------------------------------------");
			System.out.println("Top 6 Average: " + intAverage);
			System.out.println("Volunteer Hours: " + intVolHours);
			System.out.println("You are eligible for a scholarship.");

			// checking second criteria
		} else if (intAverage >= 80 && intVolHours >= 200) {

			// display message to the user
			System.out.println("\n------------------------------------");
			System.out.println("Top 6 Average: " + intAverage);
			System.out.println("Volunteer Hours: " + intVolHours);
			System.out.println("You are eligible for a scholarship.");

			// if neither are valid, tell the user they are not eligible for a scholarship
		} else {

			// display message to the user
			System.out.println("\n------------------------------------");
			System.out.println("Top 6 Average: " + intAverage);
			System.out.println("Volunteer Hours: " + intVolHours);
			System.out.println("You are not eligible for a scholarship.");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring variable for the volunteer hours and user average
		int intVolHours = 0, intAverage;

		// explaining the program to the user
		System.out.println("This program calculates your scholarship elligebility based on multiple factors, \n"
				+ "including: top 6 marks, volunteer hours.");

		// declaring a boolean for the looped try and catch statement in order to check
		// if user input is valid
		boolean bolTryCatch = true;

		// first part of do while loop
		do {

			// first part of try and catch statement, this is the code that will be actually
			// attempted
			try {

				// asking user for their volunteer hours
				System.out.print("\nPlease enter your volunteer hours: ");

				// storing the volunteer hours to a variable
				intVolHours = new Scanner(System.in).nextInt();

				// since the input was valid, break the loop
				break;

				// second part of try and catch statement to deal with any errors that might
				// occur, using an error message, and commands
			} catch (Exception ex) {

				System.out.println("\nPlease enter a valid number of hours.");

				// make the boolean for invalid input = true, and re-loop the code
				bolTryCatch = true;

			}

			// do all of the above code while the boolean for valid input = true
		} while (bolTryCatch);

		// calling the method to get the user average
		intAverage = getAverage();

		// calling the method to check the average
		checkScholarship(intAverage, intVolHours);

	}

}
