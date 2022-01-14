/**
 * Description: create a program which allows the user to catalog books which they own, and retrieve, or \
 * edit information about them
 *
 * @author (Omar Anwar)
 * @version (11/1/2021) 
 */

//importing scanner for user input
import java.util.ArrayList;
import java.util.Scanner;

public class booksTestClass {

	public static books createBook() {

		// making a new book without any info in it
		books newBook = new books();

		// boolean for do while loop
		boolean bolTryCatch = true;

		// creating an array for all the names of the different parameters in the books
		// class
		String[] params = { "Book Name", "Book Author", "Book Summary", "Book Release Year", "Book Price ($$.$$)" };

		// looping through the number of parameters
		for (int i = 0; i < 5; i++) {

			// asking the user to enter the value, from the array declared above
			System.out.print("Please enter " + params[i] + ": ");

			// do the folliwng code
			do {

				// first part of try and catch statement
				try {

					// checking what the current parameter is, and asking for input accordingly
					if (params[i].equals("Book Name")) {

						// declaring a temporary variable for the user input
						String temp = new Scanner(System.in).nextLine();

						// assigning the temporary variable to the book class instance
						newBook.setBookName(temp);

					} else if (params[i].equals("Book Author")) {

						// declaring a temporary variable for the user input
						String temp = new Scanner(System.in).nextLine();

						// assigning the temporary variable to the book class instance
						newBook.setBookAuthor(temp);

					} else if (params[i].equals("Book Summary")) {

						// declaring a temporary variable for the user input
						String temp = new Scanner(System.in).nextLine();

						// assigning the temporary variable to the book class instance
						newBook.setBookSummary(temp);

					} else if (params[i].equals("Book Release Year")) {

						// declaring a temporary variable for the user input
						int temp = new Scanner(System.in).nextInt();

						// assigning the temporary variable to the book class instance
						newBook.setBookYear(temp);

					} else if (params[i].equals("Book Price ($$.$$)")) {

						// declaring a temporary variable for the user input
						float temp = new Scanner(System.in).nextFloat();

						// assigning the temporary variable to the book class instance
						newBook.setBookPrice(temp);

					}

					break;

					// second part of try and catch statement to deal with any errors that might
					// occur, using an error message, and commands
				} catch (Exception ex) {

					System.out.print("\nPLEASE ENTER A VALID INPUT:");

					// make the boolean for invalid input = true, and re-loop the code
					bolTryCatch = true;

				}

				// do this while the input is invalid
			} while (bolTryCatch == true);

		}

		// returning the book
		return (newBook);

	}

	public static void checkBookInfo(books book1) {

		// declaring variables for the questions we ask user
		String strQ1;
		int intQ2;

		// boolean for the do while loop
		boolean bolTryCatch = true;

		// asking the user if the info is correct
		System.out.print("\nIs this information correct? (y/n): ");

		// storing user choice to a variable
		strQ1 = new Scanner(System.in).nextLine();

		do {

			// checking if the user input is correct or no according to them
			if (strQ1.equalsIgnoreCase("y")) {

				// if yes, just exit the loop
				break;

				// otherwise, if they write no
			} else if (strQ1.equalsIgnoreCase("n")) {

				// asking user what is wrong
				System.out.print("\nWhat is incorrect?: "
						+ "\n1.Book Name\n2.Book Author\n3.Book Summary\n4.Book Release Year\n5.Book Price\n>>>");

				// storing the user input to a variable
				intQ2 = new Scanner(System.in).nextInt();

				// if the user wanted to edit the n
				if (intQ2 == 1) {

					// asking the user to enter the new value
					System.out.println("\nPlese enter new value: ");

					// declaring a temp variable for the user input
					String temp = new Scanner(System.in).nextLine();

					// setting the new value
					book1.setBookName(temp);

					// exiting the loop
					break;

					// otherwise, if the user enters the other value
				} else if (intQ2 == 2) {

					// asking the user to enter the new value
					System.out.println("\nPlese enter new value: ");

					// declaring a temp variable for the user input
					String temp = new Scanner(System.in).nextLine();

					// setting the new value
					book1.setBookAuthor(temp);

					// exiting the loop
					break;

					// otherwise, if the user enters the other value
				} else if (intQ2 == 3) {

					// asking the user to enter the new value
					System.out.println("\nPlese enter new value: ");

					// declaring a temp variable for the user input
					String temp = new Scanner(System.in).nextLine();

					// setting the new value
					book1.setBookSummary(temp);

					// exiting the loop
					break;

					// otherwise, if the user enters the other value
				} else if (intQ2 == 4) {

					// asking the user to enter the new value
					System.out.println("\nPlese enter new value: ");

					// declaring a temp variable for the user input
					int temp = new Scanner(System.in).nextInt();

					// setting the new value
					book1.setBookYear(temp);

					// exiting the loop
					break;

					// otherwise, if the user enters the other value
				} else if (intQ2 == 5) {

					// asking the user to enter the new value
					System.out.println("\nPlese enter new value: ");

					// declaring a temp variable for the user input
					float temp = new Scanner(System.in).nextFloat();

					// setting the new value
					book1.setBookPrice(temp);

					// exiting the loop
					break;

				}

				// if they write anything else
			} else {

				System.out.println("\nPLEASE ENTER A VALID INPUT\n");

			}

			// do this while the user input is wrong
		} while (bolTryCatch);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean for do while loop
		boolean bolTryCatch = true;

		// declaring variable for the amount of books a user wants to add
		byte bytBooksNum = 0;

		// do all of the following code...
		do {

			// asking user how many books they want to add
			System.out.print("How many books would you like to add?: ");
			
			// try to store the value
			try {

				// storing the number the user chose to the variable
				bytBooksNum = new Scanner(System.in).nextByte();

				//exit the loop
				break;
				
				// catch any errors
			} catch (Exception ex) {

				// ask user to enter a valid input
				System.out.println("\nPLEASE ENTER A VALID INPUT\n");

			}

			// while the user has not entered a correct value
		} while (bolTryCatch == true);

		// **MAKE AN ARRAY OF BOOKS/OBJECTS***
		ArrayList<books> bookCase = new ArrayList<books>();
		
		// looping for the number of books they wanted to add
		for (int i = 0; i < bytBooksNum; i++) {

			//blank line for formatting
			System.out.println("\n--------------------------------\nBOOK " + (i+1) + "\n--------------------------------");
		
			// declaring a new book
			books book1 = createBook();
			
			// checking book info
			checkBookInfo(book1);

			//adding the book to the book
			bookCase.add(book1);

		}

		//outputting the book case
		System.out.println("\n--------------------------------\nBOOK CASE\n--------------------------------");
		
		//for loop to loop through and output each book in the array list
		for (int i = 0; i < bytBooksNum; i++) {
			
			//outputting this line for formatting
			System.out.println("\n--------------------------------\nBOOK " + (i+1) + "\n--------------------------------");
			
			//printing the books
			System.out.println(bookCase.get(i));
			
		}
		
	}

}
