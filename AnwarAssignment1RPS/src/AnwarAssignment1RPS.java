/**
 * Description: This is a pretty simple program, rock paper scissors. The computer generates an option, either
 * rock, paper, or scissors. The user is then prompted to enter what they want, r, p, or s (they can also enter the full word).
 * This is then compared to the computer's choice, and if they win, loss, or draw, a relevant counter is incremented. Then, a menu
 * is shown to them, which allows them to either play again, show how many wins/losses/draws they have, or exit the game.
 * This is dealt with accordingly, by either looping the game again, showing the user's record, or exiting the game.  
 *
 * @author (Omar Anwar)
 * @version (10/04/2021) 
 */

//importing the scanner to get user input
import java.util.Scanner;
import java.util.ArrayList;
//importing the Arrays util to be able to use array tools
import java.util.Arrays;
//importing the JoOptionPane to be able to use the pop-up dialogs
import javax.swing.JOptionPane;

public class AnwarAssignment1RPS {

	/*
	 * declaring public counters for win, draw, and loss. The reason these counters
	 * are global, rather than declared in the methods is because this means that
	 * they do not get erased every time the user plays another round. If they were
	 * not global, it would default back to 0 each time.
	 */
	public static int intWinCounter = 0;
	public static int intDrawCounter = 0;
	public static int intLossCounter = 0;

	/*
	 * declaring a public counter for the amount of games played, this is for the
	 * exact same reason as the for the win, draw, and loss counters.
	 */
	public static int intGamesPCounter = 0;

	/*
	 * declaring a public array list for the user's record. This will contain an
	 * array list which says "GAME 1: Win, GAME 2: Loss, etc.." The reason it is
	 * global is the same as with the counters, otherwise, it would reset each time
	 * the user replayed the game.
	 */
	public static ArrayList<String> lstRecord = new ArrayList<String>();

	public static void dispInstruct() {

		// make a string of options for the next menu, this allows us to change the
		// options of the pop up in jOptionPane
		String[] strInstructionsMenu = new String[2];

		// to do this, we have to assign the values to what we want the menu options to
		// be
		// option 1 is to play again
		strInstructionsMenu[0] = new String("Play!");
		// option 2 is to show the record (wins/draws/losses)
		strInstructionsMenu[1] = new String("View Instructions.");

		// displaying message box for options
		int intMenuChoice = JOptionPane.showOptionDialog(null, "Welcome to the game Rock, Paper, Scissors!",
				"Rock, Paper, Scissors!", 0, JOptionPane.INFORMATION_MESSAGE, null, strInstructionsMenu, null);

		// if the user selects play, start the game
		if (intMenuChoice == 0) {

			/*
			 * since this area is left blank, and no code is entered, it is skipped over,
			 * and the loop which is included in the main method loops again, which
			 * effectively loops the game, and allows the user to play again
			 */

			// if the user selects the second option, to show the instructions, then display
			// the pop up with the instructions
		} else if (intMenuChoice == 1) {

			// displaying a message box, which explains the rules of the game to the user
			JOptionPane.showMessageDialog(null, "Welcome to the game Rock, Paper, Scissors!, these are the rules: \n\n"
					+ "Each player, in this case, the user (you), and the computer choose one of three options, \n"
					+ "Rock, Paper, or Scissors. The choices of the two players are compared, and depending on the \n"
					+ "the power of each, a player is the winner, loser, or a draw may occur.\n\nThese are the powers:"
					+ "\n-Rock wins against scissors.\n" + "-Scissors win against paper.\n"
					+ "-Paper wins against rock.\n\n" + "Have Fun!", "Rock, Paper, Scissors!",
					JOptionPane.INFORMATION_MESSAGE);

		}

	}

	// method to get user input
	public static byte getUserInput() {

		// declaring a variable for the user input
		String strUserChoice = null;

		// declaring an integer for the user choice, this is because the string the user
		// enters will be converted
		// to a integer, so it can be easier to work with, and compare to the computer
		// choice
		byte bytUserChoice = 0;

		// declaring a boolean to loop the try and catch/ do while statement
		boolean bolTryCatch = true;

		// first part of do while loop
		do {

			// first part of try and catch statement, this is the code that will be actually
			// attempted
			try {

				// display a message to the user, on what the options are to enter
				strUserChoice = JOptionPane.showInputDialog(null,
						"Your move! Enter a choice, rock, paper, or scissors. "
								+ "\n(You can enter the full word, or the first letter (ex: 'rock' or 'r')",
						"Rock, Paper, Scissors!", JOptionPane.PLAIN_MESSAGE);

				// check what the user's input was, and assign it accordingly
				// if it was rock, make it 1
				if (strUserChoice.equalsIgnoreCase("rock") || strUserChoice.equalsIgnoreCase("r")) {

					// assign the integer for the user choice = 1
					bytUserChoice = 1;

					// since the input was valid, break the loop
					break;

					// if the user chose paper, make it 2
				} else if (strUserChoice.equalsIgnoreCase("paper") || strUserChoice.equalsIgnoreCase("p")) {

					// assign the integer for the user choice = 2
					bytUserChoice = 2;

					// since the input was valid, break the loop
					break;

					// if the user chose scissors, make i 3
				} else if (strUserChoice.equalsIgnoreCase("scissors") || strUserChoice.equalsIgnoreCase("s")) {

					// assign the integer for the user choice = 3
					bytUserChoice = 3;

					// since the input was valid, break the loop
					break;

					// otherwise, if they chose none of them, loop again
				} else {

					// output an error message to the user
					JOptionPane.showMessageDialog(null, "Please enter a valid input.", "Rock, Paper, Scissors!",
							JOptionPane.ERROR_MESSAGE);

					// make the boolean for invalid input = true, and re-loop the code
					bolTryCatch = true;

				}

				// second part of try and catch statement to deal with any errors that might
				// occur, using an error message, and commands
			} catch (Exception ex) {

				// if the user presses the x to leave, close the program
				if (strUserChoice == null) {

					// telling the user that the program is exiting
					JOptionPane.showMessageDialog(null, "Exiting program.", "Rock, Paper, Scissors!",
							JOptionPane.WARNING_MESSAGE);

					// exit the program
					System.exit(0);

				}

				// otherwise, just output an error message to the user
				JOptionPane.showMessageDialog(null, "Please enter a valid input.", "Rock, Paper, Scissors!",
						JOptionPane.ERROR_MESSAGE);

				// make the boolean for invalid input = true, and re-loop the code
				bolTryCatch = true;

			}

			// do all of the above code while the boolean for valid input = true
		} while (bolTryCatch);

		// return the user's choice
		return (bytUserChoice);

	}

	// this is the method where the game actually runs, it is called whenever the
	// game needs to run again
	public static void gameMethod() {

		// declaring variable for the user choice, and computer choice.
		byte bytUserChoice, bytCompChoice;

		// declaring a string to assign the user's number to a word, and the computer's
		// number to a word
		String strUserChoice = null, strCompChoice = null;

		// assigning the user input to a variable, by calling the method to get the
		// user's input
		bytUserChoice = getUserInput();

		// make the variable for the computer choice equal to a random number between
		// 1-3, this is
		// done by using math.random
		bytCompChoice = (byte) ((Math.random() * (3)) + 1);

		// assigning the user's number, to a word, this will be used for calling the win, draw, and loss methods
		// if the user chose rock, this means that the number = 1, which is rock
		if (bytUserChoice == 1) {

			// assign the value of the string = rock
			strUserChoice = "Rock";

			// if the user chose rock, this means that the number = 2, which is paper
		} else if (bytUserChoice == 2) {

			// assign the value of the string = paper
			strUserChoice = "Paper";

			// if the user chose rock, this means that the number = 2, which is scissors
		} else if (bytUserChoice == 3) {

			// assign the value of the string = scissors
			strUserChoice = "Scissors";

		}

		// assigning the computer's number, to a word, this will be used for calling the win, draw, and loss methods
		// if the computer chose 1 for the random number, this corresponds to rock
		if (bytCompChoice == 1) {

			// assign the value of the string = rock
			strCompChoice = "Rock";

			// if the computer chose 2 for the random number, this corresponds to paper
		} else if (bytCompChoice == 2) {

			// assign the value of the string = paper
			strCompChoice = "Paper";

			// if the computer chose 3 for the random number, this corresponds to scissors
		} else if (bytCompChoice == 3) {

			// assign the value of the string = scissors
			strCompChoice = "Scissors";

		}

		// comparing the user's choice, and the computer's choice, to see who won

		// draw conditions
		// if both the user and the computer chose rock, then it is a draw
		if (bytUserChoice == 1 && bytCompChoice == 1) {

			// calling the method to deal with a draw
			resultDraw(strUserChoice, strCompChoice);

			// if both the user and the computer chose paper, then it is a draw
		} else if (bytUserChoice == 2 && bytCompChoice == 2) {

			// calling the method to deal with a draw
			resultDraw(strUserChoice, strCompChoice);

			// if both the user and the computer chose scissors, then it is a draw
		} else if (bytUserChoice == 3 && bytCompChoice == 3) {

			// calling the method to deal with a draw
			resultDraw(strUserChoice, strCompChoice);

		}

		// all of the win conditions
		// if the user chooses rock, and the computer chooses scissors, then they win
		if (bytUserChoice == 1 && bytCompChoice == 3) {

			// calling the method to deal with a win
			resultWin(strUserChoice, strCompChoice);

			// if the user chooses paper, and the computer chooses rock, then they win
		} else if (bytUserChoice == 2 && bytCompChoice == 1) {

			// calling the method to deal with a win
			resultWin(strUserChoice, strCompChoice);
			// if the user chooses scissors, and the computer chooses paper, then they win
		} else if (bytUserChoice == 3 && bytCompChoice == 2) {

			// calling the method to deal with a win
			resultWin(strUserChoice, strCompChoice);

		}

		// loss conditions
		// if the user chooses rock, and the computer chooses paper, then the computer
		// wins
		if (bytUserChoice == 1 && bytCompChoice == 2) {

			// calling the method to deal with a loss
			resultLoss(strUserChoice, strCompChoice);

			// if the user chooses paper, and the computer chooses scissors, then the
			// computer wins
		} else if (bytUserChoice == 2 && bytCompChoice == 3) {

			// calling the method to deal with a loss
			resultLoss(strUserChoice, strCompChoice);
			
			// if the user chooses scissors, and the computer chooses rock, then the
			// computer wins
		} else if (bytUserChoice == 3 && bytCompChoice == 1) {

			// calling the method to deal with a loss
			resultLoss(strUserChoice, strCompChoice);

		}

	}

	//method for dealing with a draw between the user and the computer
	public static void resultDraw(String strUserChoice, String strCompChoice) {

		// start by incrementing the counter for draws
		intDrawCounter += 1;

		// add a draw to the record
		lstRecord.add("GAME " + intGamesPCounter + ": Draw");

		// display a message box to the user with this outcome
		JOptionPane.showMessageDialog(null,
				"USER CHOICE: " + strUserChoice + "\n" + "COMPUTER CHOICE: " + strCompChoice + "\n\n" + "IT'S A DRAW!",
				"Rock, Paper, Scissors!", JOptionPane.QUESTION_MESSAGE);

	}

	//method for dealing with a win between the user and the computer
	public static void resultWin(String strUserChoice, String strCompChoice) {

		// start by incrementing the counter for wins
		intWinCounter += 1;

		// add a win to the record
		lstRecord.add("GAME " + intGamesPCounter + ": Win");

		// display a message box to the user with this outcome
		JOptionPane.showMessageDialog(null,
				"USER CHOICE: " + strUserChoice + "\n" + "COMPUTER CHOICE: " + strCompChoice + "\n\n" + "YOU WIN!",
				"Rock, Paper, Scissors!", JOptionPane.QUESTION_MESSAGE);

	}

	//method for dealing with a loss between the user and the computer
	public static void resultLoss(String strUserChoice, String strCompChoice) {

		// start by incrementing the counter for losses
		intLossCounter += 1;

		// add a loss to the record
		lstRecord.add("GAME " + intGamesPCounter + ": Loss");

		// display a message box to the user with this outcome
		JOptionPane
				.showMessageDialog(null,
						"USER CHOICE: " + strUserChoice + "\n" + "COMPUTER CHOICE: " + strCompChoice + "\n\n"
								+ "YOU LOSE :( Better Luck Next Time!",
						"Rock, Paper, Scissors!", JOptionPane.QUESTION_MESSAGE);

	}

	// method to output the menu to the user, this allows them to play again, view
	// their record, or exit the game
	public static void menuOut() {

		// make a string of options for the next menu, this allows us to change the
		// options of the pop up in jOptionPane
		String[] strOptionsMenu = new String[3];

		// to do this, we have to assign the values to what we want the menu options to
		// be
		// option 1 is to play again
		strOptionsMenu[0] = new String("Play Again!");
		// option 2 is to show the record (wins/draws/losses)
		strOptionsMenu[1] = new String("Record");
		/// option 3 is to exit the game
		strOptionsMenu[2] = new String("Exit");

		// displaying message box for options
		int intMenuChoice = JOptionPane.showOptionDialog(null, "Choose an Option: ", "Rock, Paper, Scissors!", 0,
				JOptionPane.INFORMATION_MESSAGE, null, strOptionsMenu, null);

		// if the user selects play again, then restart the game
		if (intMenuChoice == 0) {

			/*
			 * since this area is left blank, and no code is entered, it is skipped over,
			 * and the loop which is included in the main method loops again, which
			 * effectively loops the game, and allows the user to play again
			 */

			// if the user selects the second option, to show the record, call the method to
			// display the record
		} else if (intMenuChoice == 1) {

			// call method to display record
			displayRecord();

			// otherwise (i.e if they choose option 3, or if they press the "x" button) do
			// the following:
		} else {

			// telling the user that the program is exiting
			JOptionPane.showMessageDialog(null, "Exiting program.", "Rock, Paper, Scissors!",
					JOptionPane.WARNING_MESSAGE);

			// exit the program, terminate using System.exit(0)
			System.exit(0);

		}

	}

	// method to display the record
	public static void displayRecord() {

		// output the wins, losses, and draws to a message box, aswell as the array with
		// the record
		// use the counters, and the arraylist for the values.
		JOptionPane
				.showMessageDialog(null,
						"WINS: " + intWinCounter + "\nDraws: " + intDrawCounter + "\nLosses: " + intLossCounter + "\n\n"
								+ (Arrays.toString(lstRecord.toArray())),
						"Rock, Paper, Scissors!", JOptionPane.PLAIN_MESSAGE);

	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring a boolean for the looped try and catch statement in order to check
		// if user input is valid
		boolean bolTryCatch = true;

		// declaring a variable for the user input
		String strUserChoice;

		/*
		 * declaring an integer for the user choice, this is because the string the user
		 * enters will be converted to a integer, so it can be easier to work with, and
		 * comare to the computer choice
		 */
		byte bytUserChoice;

		// calling the method to check if the user wants to check the instructions
		dispInstruct();

		// first part of do while loop
		do {

			// incrementing the games played counter
			intGamesPCounter += 1;

			// call the main method for the game
			gameMethod();

			// call the method to output the options menu
			menuOut();

			// do all of the above code while the boolean for valid input = true
		} while (bolTryCatch);

	}

}
