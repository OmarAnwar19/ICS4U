
/**
 * Description: This program is meant to serve as a computer system, which will allow the Ottawa Department Store
 * cashiers to be able to manage their database of groceries. The program allows the cashier to enter items, and then 
 * adds them to an array list for a specific department of the store. The cashier can also update (i.e use getters and setters)
 * on the items in the database, aswell as create a receipt, with specific quantities of items from each department,
 * and then print out the reciept in a friendly format. The main test class also has 4 related classes, one super class,
 * "Department", and then 3 child classes, for the specific departments.

 *
 * @author (Omar Anwar)
 * @version (11/18/2021) 
 */

//importing all of java utils, this is beacause we are going to user scanner, arraylist, and collections,
//so it is more efficient to import all, than to write 3 different lines of code to import
import java.util.*;

public class AnwarOttawaStoreAssignment {

	// declaring global variables for the counters for total items, and department
	// specific items
	public static int intTotalItems = 0;
	public static int intGroceryItems = 0;
	public static int intHousewareItems = 0;
	public static int intSeasonalItems = 0;

	// method to initialize the first 4 items in each array list, takes in an array
	// list, and adds 4 items to it
	private static void initArrayList(ArrayList<Grocery> deptGrocery, ArrayList<Houseware> deptHouseware,
			ArrayList<Seasonal> deptSeasonal) {

		// adding 4 items to the grocery department array list, since they are default,
		// this means that they do not have a quantity, so we import them using the
		// overloaded constructor without quantity
		deptGrocery.add(new Grocery("Bannanas", 1.25f, true, false));
		deptGrocery.add(new Grocery("Eggs", 0.5f, true, false));
		deptGrocery.add(new Grocery("Lays Chips", 2.25f, false, true));
		deptGrocery.add(new Grocery("Box of Cookies", 5.98f, false, true));

		// adding 4 items to the grocery department array list, since they are default,
		// this means that they do not have a quantity, so we import them using the
		// overloaded constructor without quantity
		deptHouseware.add(new Houseware("Dishes", 12.5f, "Kitchen", false));
		deptHouseware.add(new Houseware("Vaccum", 55.99f, "Living", true));
		deptHouseware.add(new Houseware("Bed", 2000.0f, "Bedroom", false));
		deptHouseware.add(new Houseware("Carpet", 25.99f, "Living", true));

		// adding 4 items to the grocery department array list, since they are default,
		// this means that they do not have a quantity, so we import them using the
		// overloaded constructor without quantity
		deptSeasonal.add(new Seasonal("Sleds", 10.5f, "Winter", false));
		deptSeasonal.add(new Seasonal("Tree", 129.99f, "Christmas", false));
		deptSeasonal.add(new Seasonal("Easter Egg", 2.5f, "Easter", true));
		deptSeasonal.add(new Seasonal("PS5", 599.99f, "Birthday", true));

	}

	// method to add items to the database, will redirct to another method, so takes
	// the department arraylists as parameters
	private static void addToDatabase(ArrayList<Grocery> deptGrocery, ArrayList<Houseware> deptHouseware,
			ArrayList<Seasonal> deptSeasonal) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		boolean bolTC = true;

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhich department would you like to add items to? \nPlease select a menu option: "
							+ "\n1.) Grocery" + "\n2.) Houseware" + "\n3.) Seasonal" + "\n4.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, call the method to add items to the grocery department
				if (intUserInput == 1) {

					// call the method to add the Grocery department
					addToGrocery(deptGrocery);

					// if the user enters 2, call the method to add items to the houseware
					// department
				} else if (intUserInput == 2) {

					// call the method to add the houseware department
					addToHouseware(deptHouseware);

					// if the user enters 3, call the method to add items to the seasonal department
				} else if (intUserInput == 3) {

					// call the method to add the seasonal department
					addToSeasonal(deptSeasonal);

					// if the user enters 4 for their input
				} else if (intUserInput == 4) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident
					bolTC = false;

					// otherwise, if the user enters a number not on the menu
				} else {

					// ask them to enter a valid menu option
					System.out.println("\nPleas enter a valid menu option.\n");

					// set the boolean for looping = true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// do all of the above code as long as the boolean for incorrect value
		} while (bolTC == true);

	}

	// method to add items specifically to the grocery arraylist
	private static void addToGrocery(ArrayList<Grocery> deptGrocery) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// declaring variables for all of the instance variables we need
		String strProductName = null;
		float fltPrice = 0.0f;
		boolean bolProduce = false;
		boolean bolProcessed = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to enter an item to the database, and store their
				// response to the variable for user input
				System.out.print("\nWould you like to add an item to the Grocery database? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// keep asking the user to enter a product name until they enter one that isnt a
						// duplicate
						do {

							// ask the user to enter the product name
							System.out.print("\nPlease enter product name: ");
							strProductName = new Scanner(System.in).nextLine();// store their input to a variable

							// loop through the grocery array list, to make sure the user does not add a
							// duplicate item
							for (Grocery e : deptGrocery) {

								// if the input is present in the array list, tell them to enter another input,
								// and loop
								if (e.getProductName().equalsIgnoreCase(strProductName)) {

									// output a message that the item already exists
									System.out.println("\nError. Item already exists in database.\n");

									// make the boolean for looping true, so we loop through the list again
									bolTC = true;

									// exit the loop, so the user has to enter the product name again
									break;

									// if no duplicates are found, go on as usual
								} else {

									// make the boolean for looping false, to make sure we stop looping
									bolTC = false;

								}

							}

							// do this while the user input is a duplicate
						} while (bolTC);

						// check if all of the user input is correct and loop while it is not
						do {
							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the product price
								System.out.print("\nPlease enter product price: $");
								fltPrice = new Scanner(System.in).nextFloat();// store the value to appropriate variable

								// check if the price they entered is equal to, or less than zero, if so, loop,
								// and tell them to enter a positive price
								if (fltPrice <= 0) {

									// ask the user to enter a valid price
									System.out.println("\nPlease enter a valid price.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid price, make sure we dont loop
								} else {

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid price.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// check if all of the user input is correct and loop while it is not
						do {

							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the boolean for produce
								System.out.print("\nIs the product produce? (true/false): ");
								bolProduce = new Scanner(System.in).nextBoolean();// store the input to a variable

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid boolean option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// check if all of the user input is correct and loop while it is not
						do {

							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the boolean for processed
								System.out.print("\nIs the product processed? (true/false): ");
								bolProcessed = new Scanner(System.in).nextBoolean();// store the input to a variable

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid boolean option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// once we have valid inputs, make a new obect, and add it to the arraylist for
						// grocery
						deptGrocery.add(new Grocery(strProductName, fltPrice, bolProduce, bolProcessed));

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

					// if the user enters no, make the boolean for looping = false, and return to
					// main menu
				} else if (strUserInput.equalsIgnoreCase("no")) {

					// make the boolean for looping = false, to make sure we dont loop again
					bolTC = false;

					// if the user enters anything other than yes or no, loop the question, and tell
					// them to enter a valid input
				} else {

					// ask the user to enter yes or no
					System.out.println("\nPlease enter yes or no.");

					// make the boolean for looping true, so we ask them for input again
					bolTC = true;

				}

				// this loop is to make sure that the user enters "yes" or "no" to adding items
				// to the databse
			} while (bolTC);

			// loop as long as the user enters "yes" to add items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	// method to add items specifically to the houseware grocery arraylist
	private static void addToHouseware(ArrayList<Houseware> deptHouseware) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// declaring variables for all of the instance variables we need
		String strProductName = null, strRoomInHouse = null;
		float fltPrice = 0.0f;
		boolean bolGift = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to enter an item to the database, and store their
				// response to the variable for user input
				System.out.print("\nWould you like to add an item to the Houseware database? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// keep asking the user to enter a product name until they enter one that isnt a
						// duplicate
						do {

							// ask the user to enter the product name
							System.out.print("\nPlease enter product name: ");
							strProductName = new Scanner(System.in).nextLine();// store their input to a variable

							// loop through the houseware array list, to make sure the user does not add a
							// duplicate item
							for (Houseware e : deptHouseware) {

								// if the input is present in the array list, tell them to enter another input,
								// and loop
								if (e.getProductName().equalsIgnoreCase(strProductName)) {

									// output a message that the item already exists
									System.out.println("\nError. Item already exists in database.\n");

									// make the boolean for looping true, so we loop through the list again
									bolTC = true;

									// exit the loop, so the user has to enter the product name again
									break;

									// if no duplicates are found, go on as usual
								} else {

									// make the boolean for looping false, to make sure we stop looping
									bolTC = false;

								}

							}

							// do this while the user input is a duplicate
						} while (bolTC);

						// check if all of the user input is correct and loop while it is not
						do {
							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the product price
								System.out.print("\nPlease enter product price: $");
								fltPrice = new Scanner(System.in).nextFloat();// store the value to appropriate variable

								// check if the price they entered is equal to, or less than zero, if so, loop,
								// and tell them to enter a positive price
								if (fltPrice <= 0) {

									// ask the user to enter a valid price
									System.out.println("\nPlease enter a valid price.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid price, make sure we dont loop
								} else {

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid price.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// ask the user to enter which room the product is desgined for
						System.out.print("\nPlease enter which room in a house the product is made for: ");
						strRoomInHouse = new Scanner(System.in).nextLine();// store their input to a variable

						// check if all of the user input is correct and loop while it is not
						do {

							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the boolean for whether or not the item is a gift
								System.out.print("\nIs the product a gift? (true/false): ");
								bolGift = new Scanner(System.in).nextBoolean();// store the input to a variable

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid boolean option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// once we have valid inputs, make a new obect, and add it to the arraylist for
						// houseware
						deptHouseware.add(new Houseware(strProductName, fltPrice, strRoomInHouse, bolGift));

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

					// if the user enters no, make the boolean for looping = false, and return to
					// main menu
				} else if (strUserInput.equalsIgnoreCase("no")) {

					// make the boolean for looping = false, to make sure we dont loop again
					bolTC = false;

					// if the user enters anything other than yes or no, loop the question, and tell
					// them to enter a valid input
				} else {

					// ask the user to enter yes or no
					System.out.println("\nPlease enter yes or no.");

					// make the boolean for looping true, so we ask them for input again
					bolTC = true;

				}

				// this loop is to make sure that the user enters "yes" or "no" to adding items
				// to the databse
			} while (bolTC);

			// loop as long as the user enters "yes" to add items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	// method to add items specifically to the seasonal grocery arraylist
	private static void addToSeasonal(ArrayList<Seasonal> deptSeasonal) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// declaring variables for all of the instance variables we need
		String strProductName = null, strSeason = null;
		float fltPrice = 0.0f;
		boolean bolWrapping = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to enter an item to the database, and store their
				// response to the variable for user input
				System.out.print("\nWould you like to add an item to the Seasonal database? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// keep asking the user to enter a product name until they enter one that isnt a
						// duplicate
						do {

							// ask the user to enter the product name
							System.out.print("\nPlease enter product name: ");
							strProductName = new Scanner(System.in).nextLine();// store their input to a variable

							// loop through the seasonal array list, to make sure the user does not add a
							// duplicate item
							for (Seasonal e : deptSeasonal) {

								// if the input is present in the array list, tell them to enter another input,
								// and loop
								if (e.getProductName().equalsIgnoreCase(strProductName)) {

									// output a message that the item already exists
									System.out.println("\nError. Item already exists in database.\n");

									// make the boolean for looping true, so we loop through the list again
									bolTC = true;

									// exit the loop, so the user has to enter the product name again
									break;

									// if no duplicates are found, go on as usual
								} else {

									// make the boolean for looping false, to make sure we stop looping
									bolTC = false;

								}

							}

							// do this while the user input is a duplicate
						} while (bolTC);
						// check if all of the user input is correct and loop while it is not
						do {
							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the product price
								System.out.print("\nPlease enter product price: $");
								fltPrice = new Scanner(System.in).nextFloat();// store the value to appropriate variable

								// check if the price they entered is equal to, or less than zero, if so, loop,
								// and tell them to enter a positive price
								if (fltPrice <= 0) {

									// ask the user to enter a valid price
									System.out.println("\nPlease enter a valid price.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid price, make sure we dont loop
								} else {

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid price.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// ask the user to enter which season the product is designed for
						System.out.print("\nPlease enter which season the product is made for: ");
						strSeason = new Scanner(System.in).nextLine();// store their input to a variable

						// check if all of the user input is correct and loop while it is not
						do {

							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the boolean for whether or not the item should be
								// wrapped
								System.out.print("\nShould the product be wrapped? (true/false): ");
								bolWrapping = new Scanner(System.in).nextBoolean();// store the input to a variable

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid boolean option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// once we have valid inputs, make a new obect, and add it to the arraylist for
						// Seasonal
						deptSeasonal.add(new Seasonal(strProductName, fltPrice, strSeason, bolWrapping));

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

					// if the user enters no, make the boolean for looping = false, and return to
					// main menu
				} else if (strUserInput.equalsIgnoreCase("no")) {

					// make the boolean for looping = false, to make sure we dont loop again
					bolTC = false;

					// if the user enters anything other than yes or no, loop the question, and tell
					// them to enter a valid input
				} else {

					// ask the user to enter yes or no
					System.out.println("\nPlease enter yes or no.");

					// make the boolean for looping true, so we ask them for input again
					bolTC = true;

				}

				// this loop is to make sure that the user enters "yes" or "no" to adding items
				// to the databse
			} while (bolTC);

			// loop as long as the user enters "yes" to add items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	// method to update items in the database, will redirct to another method, so
	// takes the department arraylists as parameters
	private static void updateDatabase(ArrayList<Grocery> deptGrocery, ArrayList<Houseware> deptHouseware,
			ArrayList<Seasonal> deptSeasonal) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		boolean bolTC = true;

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhich department would you like to update? \nPlease select a menu option: "
							+ "\n1.) Grocery" + "\n2.) Houseware" + "\n3.) Seasonal" + "\n4.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, call the method to update the grocery department
				if (intUserInput == 1) {

					// call the method to update the Grocery department
					updateGrocery(deptGrocery);

					// if the user enters 2, call the method to update the houseware department
				} else if (intUserInput == 2) {

					// call the method to update the houseware department
					updateHouseware(deptHouseware);

					// if the user enters 3, call the method to update the seasonal department
				} else if (intUserInput == 3) {

					// call the method to update the seasonal department
					updateSeasonal(deptSeasonal);

					// if the user enters 4 for their input
				} else if (intUserInput == 4) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident
					bolTC = false;

					// otherwise, if the user enters a number not on the menu
				} else {

					// ask them to enter a valid menu option
					System.out.println("\nPleas enter a valid menu option.\n");

					// set the boolean for looping = true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// do all of the above code as long as the boolean for incorrect value
		} while (bolTC == true);

	}

	// method to update items specifically in the grocery arraylist
	private static void updateGrocery(ArrayList<Grocery> deptGrocery) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		float fltUserInput = 0;
		String strUserInput = null;
		boolean bolUserInput = false;
		boolean bolTC = false;

		// this do while loop is meant to check which item in the arraylist they want to
		// edit
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat item would you like to update? \nPlease select a menu option: \n");

			// loop through the array list, and the items to the menu so the user can select
			// them
			for (int i = 0; i < deptGrocery.size(); i++) {

				// output the number, aswell as the product name of each arraylist item
				System.out.println((i + 1) + ".) " + deptGrocery.get(i).getProductName());

			}

			// try to store their input, and check for any errors along the way
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intArrayIndex = (new Scanner(System.in).nextInt() - 1);

				// if the user does not enter a negative number, or a number that is not in the
				// array list, stop looping and move onto the next step
				if (intArrayIndex >= 0 && !(intArrayIndex >= deptGrocery.size())) {

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if they enter something that does not pass both the criteria, ask them to
					// enter another input
				} else {

					// ask the user to enter a correct value
					System.out.println("\nPleas enter a valid menu option.\n");

					// make the boolean for looping true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// loop through all of this while there are errors
		} while (bolTC);

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat would you like to update? \nPlease select a menu option: "
							+ "\n1.) Product Name" + "\n2.) Product Price" + "\n3.) Product Is Produce"
							+ "\n4.) Product Is Processed" + "\n5.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, ask for new product name, and update the existing value
				if (intUserInput == 1) {

					// ask the user to enter the product name, and show them the current one
					System.out.println("\nCurrent product name: " + deptGrocery.get(intArrayIndex).getProductName());
					System.out.print("\nPlease enter new product name: ");
					strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

					// set the product name to the new product name
					deptGrocery.get(intArrayIndex).setProductName(strUserInput);

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if the user enters 2, ask for new product price, and update the existing
					// value
				} else if (intUserInput == 2) {

					// check if all of the user input is correct and loop while it is not
					do {
						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the product name, and show them the current one
							System.out
									.println("\nCurrent product price: $" + deptGrocery.get(intArrayIndex).getPrice());
							System.out.print("\nPlease enter new product price: $");
							fltUserInput = new Scanner(System.in).nextFloat();// store the value to appropriate variable

							// check if the price they entered is equal to, or less than zero, if so, loop,
							// and tell them to enter a positive price
							if (fltUserInput <= 0) {

								// ask the user to enter a valid price
								System.out.println("\nPlease enter a valid price.");

								// make the boolean for looping true, to ask for input again
								bolTC = true;

								// otherwise, if they enter a valid price, make sure we dont loop
							} else {

								// set the product price to the new product price
								deptGrocery.get(intArrayIndex).setPrice(fltUserInput);

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

							}

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid price.");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of this while the boolean loops
					} while (bolTC);

					// if the user enters 3, ask for a boolean for whether or not the item is
					// produce, and update the existing value
				} else if (intUserInput == 3) {

					// check if all of the user input is correct and loop while it is not
					do {

						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the new boolean for produce, and show them the current
							// one
							System.out.println("\nCurrent: " + deptGrocery.get(intArrayIndex).getProduce());
							System.out.print("\nIs the product produce? (true/false): ");
							bolUserInput = new Scanner(System.in).nextBoolean();// store the input to a variable

							// make the boolean for looping false, to make sure we dont loop again
							bolTC = false;

							// set the product produce boolean to the new true or false value
							deptGrocery.get(intArrayIndex).setProduce(bolUserInput);

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid boolean option.\n");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

					// if the user enters 4, ask for a boolean for whether or not the item is
					// processed, and update the existing value
				} else if (intUserInput == 4) {

					// check if all of the user input is correct and loop while it is not
					do {

						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the new boolean for processed, and show them the
							// current one
							System.out.println("\nCurrent: " + deptGrocery.get(intArrayIndex).getProcessed());
							System.out.print("\nIs the product processed? (true/false): ");
							bolUserInput = new Scanner(System.in).nextBoolean();// store the input to a variable

							// make the boolean for looping false, to make sure we dont loop again
							bolTC = false;

							// set the product produce boolean to the new true or false value
							deptGrocery.get(intArrayIndex).setProcessed(bolUserInput);

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid boolean option.\n");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

				} else if (intUserInput == 5) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident
					bolTC = false;

					// otherwise, if the user enters a number not on the menu
				} else {

					// ask them to enter a valid menu option
					System.out.println("\nPleas enter a valid menu option.\n");

					// set the boolean for looping = true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// do all of the above code as long as the boolean for incorrect value
		} while (bolTC);

	}

	// method to update items specifically in the houseware arraylist
	private static void updateHouseware(ArrayList<Houseware> deptHouseware) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		float fltUserInput = 0;
		String strUserInput = null;
		boolean bolUserInput = false;
		boolean bolTC = false;

		// this do while loop is meant to check which item in the arraylist they want to
		// edit
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat item would you like to update? \nPlease select a menu option: \n");

			// loop through the array list, and the items to the menu so the user can select
			// them
			for (int i = 0; i < deptHouseware.size(); i++) {

				// output the number, aswell as the product name of each arraylist item
				System.out.println((i + 1) + ".) " + deptHouseware.get(i).getProductName());

			}

			// try to store their input, and check for any errors along the way
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intArrayIndex = (new Scanner(System.in).nextInt() - 1);

				// if the user does not enter a negative number, or a number that is not in the
				// array list, stop looping and move onto the next step
				if (intArrayIndex >= 0 && !(intArrayIndex >= deptHouseware.size())) {

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if they enter something that does not pass both the criteria, ask them to
					// enter another input
				} else {

					// ask the user to enter a correct value
					System.out.println("\nPleas enter a valid menu option.\n");

					// make the boolean for looping true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// loop through all of this while there are errors
		} while (bolTC);

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat would you like to update? \nPlease select a menu option: "
							+ "\n1.) Product Name" + "\n2.) Product Price" + "\n3.) Product Room In House"
							+ "\n4.) Product Is Gift" + "\n5.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, ask for new product name, and update the existing value
				if (intUserInput == 1) {

					// ask the user to enter the product name, and show them the current one
					System.out.println("\nCurrent product name: " + deptHouseware.get(intArrayIndex).getProductName());
					System.out.print("\nPlease enter new product name: ");
					strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

					// set the product name to the new product name
					deptHouseware.get(intArrayIndex).setProductName(strUserInput);

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if the user enters 2, ask for new product price, and update the existing
					// value
				} else if (intUserInput == 2) {

					// check if all of the user input is correct and loop while it is not
					do {
						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the product name, and show them the current one
							System.out.println(
									"\nCurrent product price: $" + deptHouseware.get(intArrayIndex).getPrice());
							System.out.print("\nPlease enter new product price: $");
							fltUserInput = new Scanner(System.in).nextFloat();// store the value to appropriate variable

							// check if the price they entered is equal to, or less than zero, if so, loop,
							// and tell them to enter a positive price
							if (fltUserInput <= 0) {

								// ask the user to enter a valid price
								System.out.println("\nPlease enter a valid price.");

								// make the boolean for looping true, to ask for input again
								bolTC = true;

								// otherwise, if they enter a valid price, make sure we dont loop
							} else {

								// set the product price to the new product price
								deptHouseware.get(intArrayIndex).setPrice(fltUserInput);

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

							}

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid price.");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of this while the boolean loops
					} while (bolTC);

					// if the user enters 3, ask for the new string for which room the product is
					// made for,
					// and update the existing value
				} else if (intUserInput == 3) {

					// ask the user to enter the product room in house, and show them the current
					// one
					System.out
							.println("\nCurrent product room in house: " + deptHouseware.get(intArrayIndex).getRoom());
					System.out.print("\nPlease enter new product room in house: ");
					strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

					// set the product name to the new room for the product
					deptHouseware.get(intArrayIndex).setRoom(strUserInput);

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if the user enters 4, ask for a boolean for whether or not the item is
					// a gift, and update the existing value
				} else if (intUserInput == 4) {

					// check if all of the user input is correct and loop while it is not
					do {

						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the boolean for gift, and show them the current one
							System.out.println("\nCurrent: " + deptHouseware.get(intArrayIndex).getGift());
							System.out.print("\nIs the product a gift? (true/false): ");
							bolUserInput = new Scanner(System.in).nextBoolean();// store the input to a variable

							// make the boolean for looping false, to make sure we dont loop again
							bolTC = false;

							// set the product gift boolean to the new true or false value
							deptHouseware.get(intArrayIndex).setGift(bolUserInput);

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid boolean option.\n");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

				} else if (intUserInput == 5) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident
					bolTC = false;

					// otherwise, if the user enters a number not on the menu
				} else {

					// ask them to enter a valid menu option
					System.out.println("\nPleas enter a valid menu option.\n");

					// set the boolean for looping = true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// do all of the above code as long as the boolean for incorrect value
		} while (bolTC);

	}

	// method to update items specifically in the seasonal arraylist
	private static void updateSeasonal(ArrayList<Seasonal> deptSeasonal) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		float fltUserInput = 0;
		String strUserInput = null;
		boolean bolUserInput = false;
		boolean bolTC = false;

		// this do while loop is meant to check which item in the arraylist they want to
		// edit
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat item would you like to update? \nPlease select a menu option: \n");

			// loop through the array list, and the items to the menu so the user can select
			// them
			for (int i = 0; i < deptSeasonal.size(); i++) {

				// output the number, aswell as the product name of each arraylist item
				System.out.println((i + 1) + ".) " + deptSeasonal.get(i).getProductName());

			}

			// try to store their input, and check for any errors along the way
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intArrayIndex = (new Scanner(System.in).nextInt() - 1);

				// if the user does not enter a negative number, or a number that is not in the
				// array list, stop looping and move onto the next step
				if (intArrayIndex >= 0 && !(intArrayIndex >= deptSeasonal.size())) {

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if they enter something that does not pass both the criteria, ask them to
					// enter another input
				} else {

					// ask the user to enter a correct value
					System.out.println("\nPleas enter a valid menu option.\n");

					// make the boolean for looping true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// loop through all of this while there are errors
		} while (bolTC);

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat would you like to update? \nPlease select a menu option: "
							+ "\n1.) Product Name" + "\n2.) Product Price" + "\n3.) Product Season"
							+ "\n4.) Product Should be Wrapped" + "\n5.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, ask for new product name, and update the existing value
				if (intUserInput == 1) {

					// ask the user to enter the product name, and show them the current one
					System.out.println("\nCurrent product name: " + deptSeasonal.get(intArrayIndex).getProductName());
					System.out.print("\nPlease enter new product name: ");
					strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

					// set the product name to the new product name
					deptSeasonal.get(intArrayIndex).setProductName(strUserInput);

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if the user enters 2, ask for new product price, and update the existing
					// value
				} else if (intUserInput == 2) {

					// check if all of the user input is correct and loop while it is not
					do {
						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the product name, and show them the current one
							System.out
									.println("\nCurrent product price: $" + deptSeasonal.get(intArrayIndex).getPrice());
							System.out.print("\nPlease enter new product price: $");
							fltUserInput = new Scanner(System.in).nextFloat();// store the value to appropriate
																				// variablee

							// check if the price they entered is equal to, or less than zero, if so, loop,
							// and tell them to enter a positive price
							if (fltUserInput <= 0) {

								// ask the user to enter a valid price
								System.out.println("\nPlease enter a valid price.");

								// make the boolean for looping true, to ask for input again
								bolTC = true;

								// otherwise, if they enter a valid price, make sure we dont loop
							} else {

								// set the product price to the new product price
								deptSeasonal.get(intArrayIndex).setPrice(fltUserInput);

								// make the boolean for looping false, to make sure we dont loop again
								bolTC = false;

							}

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid price.");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of this while the boolean loops
					} while (bolTC);

					// if the user enters 3, ask for the new string for which seasona the product is
					// made for,
					// and update the existing value
				} else if (intUserInput == 3) {

					// ask the user to enter the product season, and show them the current one
					System.out.println("\nCurrent product season: " + deptSeasonal.get(intArrayIndex).getSeason());
					System.out.print("\nPlease enter new product season: ");
					strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

					// set the product name to the new room for the product
					deptSeasonal.get(intArrayIndex).setSeason(strUserInput);

					// make the boolean for looping false to make sure we dont loop again
					bolTC = false;

					// if the user enters 4, ask for a boolean for whether or not the item
					// should be wrapped, and update the existing value
				} else if (intUserInput == 4) {

					// check if all of the user input is correct and loop while it is not
					do {

						// try all of the following code, and check for any errors
						try {

							// ask the user to enter the boolean for wrapping, and show them the current one
							System.out.println("\nCurrent: " + deptSeasonal.get(intArrayIndex).getWrapping());
							System.out.print("\nShould the product be wrapped? (true/false): ");
							bolUserInput = new Scanner(System.in).nextBoolean();// store the input to a variable

							// make the boolean for looping false, to make sure we dont loop again
							bolTC = false;

							// set the product wrapping boolean to the new true or false value
							deptSeasonal.get(intArrayIndex).setWrapping(bolUserInput);

							// if you find any errors, make the boolean to loop true, and tell the user to
							// enter another value
						} catch (Exception ex) {

							// ask the user to enter a correct value
							System.out.println("\nPleas enter a valid boolean option.\n");

							// make the boolean for looping true
							bolTC = true;

						}

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

				} else if (intUserInput == 5) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident
					bolTC = false;

					// otherwise, if the user enters a number not on the menu
				} else {

					// ask them to enter a valid menu option
					System.out.println("\nPleas enter a valid menu option.\n");

					// set the boolean for looping = true
					bolTC = true;

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

				// make the boolean for looping true
				bolTC = true;

			}

			// do all of the above code as long as the boolean for incorrect value
		} while (bolTC);

	}

	// method to create the customer order, will redirct to another method, so takes
	// the department arraylists as parameters, aswell as the arraylist for
	// customer orders
	private static void createOrder(ArrayList<Grocery> deptGrocery, ArrayList<Houseware> deptHouseware,
			ArrayList<Seasonal> deptSeasonal, ArrayList<Object> customerOrder) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strCustomerName = null;
		boolean bolTC = true;

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhich department would you like to add items from? \nPlease select a menu option: "
							+ "\n1.) Grocery" + "\n2.) Houseware" + "\n3.) Seasonal" + "\n4.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, call the method to update the grocery department
				if (intUserInput == 1) {

					// call the method to update the Grocery department
					createGrocery(deptGrocery, customerOrder);

					// if the user enters 2, call the method to update the houseware department
				} else if (intUserInput == 2) {

					// call the method to update the houseware department
					createHouseware(deptHouseware, customerOrder);

					// if the user enters 3, call the method to create an order using the seasonal
					// department
				} else if (intUserInput == 3) {

					// call the method to update the seasonal department
					createSeasonal(deptSeasonal, customerOrder);

					// if the user enters 4 for their input
				} else if (intUserInput == 4) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident
					bolTC = false;

					// otherwise, if the user enters a number not on the menu
				} else {

					// ask them to enter a valid menu option
					System.out.println("\nPleas enter a valid menu option.\n");

				}

				// if you find any errors, make the boolean to loop true, and tell the user to
				// enter another value
			} catch (Exception ex) {

				// ask the user to enter a correct value
				System.out.println("\nPleas enter a valid menu option.\n");

			}

			// do all of the above code as long as the boolean for incorrect value
		} while (bolTC == true);

	}

	// method to add items to the order specifically from the grocery arraylist
	public static void createGrocery(ArrayList<Grocery> deptGrocery, ArrayList<Object> customerOrder) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following code while the user keeps adding items, and editing
		// their order
		do {

			// do all of the following while the user keeps asking to enter items
			do {

				// do all of the following while there are no errors
				do {

					// ask the user if they want to add an item from the database to the arraylist
					// for the customer order, and store their response to the variable for user
					// input
					System.out.print("\nWould you like to add an item from the Grocery department? (yes/no): ");
					strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

					// if the user enters yes, then go along as usual
					if (strUserInput.equalsIgnoreCase("yes")) {

						// this do while loop is meant to check which item in the arraylist they want to
						// edit
						do {

							// output the menu options
							System.out.print(
									"\n--------------------------------------\nWhat item would you like to add to order? \nPlease select a menu option: \n");

							// loop through the array list, and the items to the menu so the user can select
							// them
							for (int i = 0; i < deptGrocery.size(); i++) {

								// output the number, aswell as the product name of each arraylist item
								System.out.println((i + 1) + ".) " + deptGrocery.get(i).getProductName());

							}

							// try to store their input, and check for any errors along the way
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intArrayIndex = (new Scanner(System.in).nextInt()-1);

								// if the user does not enter a negative number, or a number that is not in the
								// array list, stop looping and move onto the next step
								if (intArrayIndex >= 0 && !(intArrayIndex >= deptGrocery.size())) {

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if they enter something that does not pass both the criteria, ask them to
									// enter another input
								} else {

									// ask the user to enter a correct value
									System.out.println("\nPleas enter a valid menu option.\n");

									// make the boolean for looping true
									bolTC = true;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid menu option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// loop through all of this while there are errors
						} while (bolTC);

						// do while with a try and catch, to check for any invalid inputs
						do {

							// try all of the following code, and check for any errors
							try {

								// ask user how many of the item they would like to add
								System.out.print("\nHow many would you like to add?: ");
								intUserInput = new Scanner(System.in).nextInt();

								if (intUserInput <= 0) {

									// ask the user to enter a valid price
									System.out.println("\nPlease enter a valid amount.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid price, make sure we dont loop
								} else {

									// updating the quantity to the number the user selected
									deptGrocery.get(intArrayIndex).setQuantity(intUserInput);

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid amount.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// add the object we just made to the customer order arraylist
							customerOrder.add(deptGrocery.get(intArrayIndex));

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

					}

					// if the user enters no, make the boolean for looping = false, and return to
					// main menu
					else if (strUserInput.equalsIgnoreCase("no")) {

						// make the boolean for looping = false, to make sure we dont loop again
						bolTC = false;

						// if the user enters anything other than yes or no, loop the question, and tell
						// them to enter a valid input
					} else {

						// ask the user to enter yes or no
						System.out.println("\nPlease enter yes or no.");

						// make the boolean for looping true, so we ask them for input again
						bolTC = true;

					}

					// this loop is to make sure that the user enters "yes" or "no" to adding items
					// to the databse
				} while (bolTC);

				// loop as long as the user enters "yes" to add items
			} while (strUserInput.equalsIgnoreCase("yes"));

			do {

				// do all of the following while the user says the order is not correcy
				do {

					// ask the user if the order is correct
					System.out.println("\nIs this order correct? (yes/no)");
					// loop through the array list, and the items to the menu so the user can
					// select them
					for (int i = 0; i < deptGrocery.size(); i++) {

						// if the quantity > 0, print the item

						if (deptGrocery.get(i).getQuantity() > 0) {

							// output the number, aswell as the product name and quantity of each arraylist
							// item
							System.out.println((i) + ".) " + deptGrocery.get(i).getQuantity() + " x "
									+ deptGrocery.get(i).getProductName());

						}

					}

					// this line only serves to make the program look better
					System.out.print("\n>>> ");

					// assign the variable for user input to whatever they enter next
					strUserInput = new Scanner(System.in).nextLine();

					// if the user enters yes, exit the loop
					if (strUserInput.equalsIgnoreCase("yes")) {

						// make the boolean for looping = false, to make sure we dont loop again
						bolTC = false;

						// if the user enters no, let them edit the quantities of their order
					} else if (strUserInput.equalsIgnoreCase("no")) {

						// do all of the following while there are no errors
						do {

							// ask the user to select which item they would like to edit
							System.out.print(
									"\nWhat item would you like to edit? \nPlease select an option from above: \n");

							// try to store their input, and check for any errors along the way
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intArrayIndex = (new Scanner(System.in).nextInt());

								// if the user does not enter a negative number, or a number that is not in the
								// array list, stop looping and move onto the next step
								if (intArrayIndex >= 0 && !(intArrayIndex >= deptGrocery.size())
										&& (deptGrocery.get(intArrayIndex).getQuantity() != 0)) {

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if they enter something that does not pass both the criteria, ask them to
									// enter another input
								} else {

									// ask the user to enter a correct value
									System.out.println("\nPleas enter a valid menu option.\n");

									// make the boolean for looping true
									bolTC = true;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid menu option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

						} while (bolTC);

						// do while with a try and catch, to check for any invalid inputs
						do {

							// try all of the following code, and check for any errors
							try {

								// ask user how many of the item they would like to add
								System.out.print("\nPlease enter new quantity: ");
								intUserInput = new Scanner(System.in).nextInt();

								// if the user enters a number equal to or less than 0, this is impossible, so
								// ask them to
								// enter another one
								if (intUserInput <= 0) {

									// ask the user to enter a valid amount
									System.out.println("\nPlease enter a valid amount.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, change the values
								} else {

									// updating the quantity to the number the user selected
									deptGrocery.get(intArrayIndex).setQuantity(intUserInput);

									// make the boolean for looping false so we dont ask for amount again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid amount.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// making boolean for looping true, so we loop until they say yes to the order
							// being correct
							// bolTC = true;

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// if the user enters anything other than yes or no, loop the question, and tell
						// them to enter a valid input
					} else {

						// ask the user to enter yes or no
						System.out.println("\nPlease enter yes or no.");

						// make the boolean for looping true, so we ask them for input again
						bolTC = true;

					}

					// do all of this while the user enters wrong values
				} while (bolTC);

				// second part of do while loop, loop all of the code while the input is wrong
			} while (strUserInput.equalsIgnoreCase("no"));

			// second part of do while loop, loop all of the code while the input is wrong
		} while (bolTC);

		// looping through the arraylist for, and adding all of the quantities to the
		// counters for total and department specific items
		for (Grocery e : deptGrocery) {

			// increment the counters for total items, and items from seasonal department
			intTotalItems += e.getQuantity();
			intGroceryItems += e.getQuantity();

		}

	}

	// method to add items to the order specifically from the houseware arraylist
	public static void createHouseware(ArrayList<Houseware> deptHouseware, ArrayList<Object> customerOrder) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following code while the user keeps adding items, and editing
		// their order
		do {

			// do all of the following while the user keeps asking to enter items
			do {

				// do all of the following while there are no errors
				do {

					// ask the user if they want to add an item from the database to the arraylist
					// for the customer order, and store their response to the variable for user
					// input
					System.out.print("\nWould you like to add an item from the Houseware department? (yes/no): ");
					strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

					// if the user enters yes, then go along as usual
					if (strUserInput.equalsIgnoreCase("yes")) {

						// this do while loop is meant to check which item in the arraylist they want to
						// edit
						do {

							// output the menu options
							System.out.print(
									"\n--------------------------------------\nWhat item would you like to add to order? \nPlease select a menu option: \n");

							// loop through the array list, and the items to the menu so the user can select
							// them
							for (int i = 0; i < deptHouseware.size(); i++) {

								// output the number, aswell as the product name of each arraylist item
								System.out.println((i + 1) + ".) " + deptHouseware.get(i).getProductName());

							}

							// try to store their input, and check for any errors along the way
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intArrayIndex = (new Scanner(System.in).nextInt()-1);

								// if the user does not enter a negative number, or a number that is not in the
								// array list, stop looping and move onto the next step
								if (intArrayIndex >= 0 && !(intArrayIndex >= deptHouseware.size())) {

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if they enter something that does not pass both the criteria, ask them to
									// enter another input
								} else {

									// ask the user to enter a correct value
									System.out.println("\nPleas enter a valid menu option.\n");

									// make the boolean for looping true
									bolTC = true;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid menu option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// loop through all of this while there are errors
						} while (bolTC);

						// do while with a try and catch, to check for any invalid inputs
						do {

							// try all of the following code, and check for any errors
							try {

								// ask user how many of the item they would like to add
								System.out.print("\nHow many would you like to add?: ");
								intUserInput = new Scanner(System.in).nextInt();

								if (intUserInput <= 0) {

									// ask the user to enter a valid price
									System.out.println("\nPlease enter a valid amount.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid price, make sure we dont loop
								} else {

									// updating the quantity to the number the user selected
									deptHouseware.get(intArrayIndex).setQuantity(intUserInput);

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid amount.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// add the object we just made to the customer order arraylist
							customerOrder.add(deptHouseware.get(intArrayIndex));

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

					}

					// if the user enters no, make the boolean for looping = false, and return to
					// main menu
					else if (strUserInput.equalsIgnoreCase("no")) {

						// make the boolean for looping = false, to make sure we dont loop again
						bolTC = false;

						// if the user enters anything other than yes or no, loop the question, and tell
						// them to enter a valid input
					} else {

						// ask the user to enter yes or no
						System.out.println("\nPlease enter yes or no.");

						// make the boolean for looping true, so we ask them for input again
						bolTC = true;

					}

					// this loop is to make sure that the user enters "yes" or "no" to adding items
					// to the databse
				} while (bolTC);

				// loop as long as the user enters "yes" to add items
			} while (strUserInput.equalsIgnoreCase("yes"));

			do {

				// do all of the following while the user says the order is not correcy
				do {

					// ask the user if the order is correct
					System.out.println("\nIs this order correct? (yes/no)");
					// loop through the array list, and the items to the menu so the user can
					// select them
					for (int i = 0; i < deptHouseware.size(); i++) {

						// if the quantity > 0, print the item

						if (deptHouseware.get(i).getQuantity() > 0) {

							// output the number, aswell as the product name and quantity of each arraylist
							// item
							System.out.println((i) + ".) " + deptHouseware.get(i).getQuantity() + " x "
									+ deptHouseware.get(i).getProductName());

						}

					}

					// this line only serves to make the program look better
					System.out.print("\n>>> ");

					// assign the variable for user input to whatever they enter next
					strUserInput = new Scanner(System.in).nextLine();

					// if the user enters yes, exit the loop
					if (strUserInput.equalsIgnoreCase("yes")) {

						// make the boolean for looping = false, to make sure we dont loop again
						bolTC = false;

						// if the user enters no, let them edit the quantities of their order
					} else if (strUserInput.equalsIgnoreCase("no")) {

						// do all of the following while there are no errors
						do {

							// ask the user to select which item they would like to edit
							System.out.print(
									"\nWhat item would you like to edit? \nPlease select an option from above: \n");

							// try to store their input, and check for any errors along the way
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intArrayIndex = (new Scanner(System.in).nextInt());

								// if the user does not enter a negative number, or a number that is not in the
								// array list, stop looping and move onto the next step
								if (intArrayIndex >= 0 && !(intArrayIndex >= deptHouseware.size())
										&& (deptHouseware.get(intArrayIndex).getQuantity() != 0)) {

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if they enter something that does not pass both the criteria, ask them to
									// enter another input
								} else {

									// ask the user to enter a correct value
									System.out.println("\nPleas enter a valid menu option.\n");

									// make the boolean for looping true
									bolTC = true;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid menu option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

						} while (bolTC);

						// do while with a try and catch, to check for any invalid inputs
						do {

							// try all of the following code, and check for any errors
							try {

								// ask user how many of the item they would like to add
								System.out.print("\nPlease enter new quantity: ");
								intUserInput = new Scanner(System.in).nextInt();

								// if the user enters a number equal to or less than 0, this is impossible, so
								// ask them to
								// enter another one
								if (intUserInput <= 0) {

									// ask the user to enter a valid amount
									System.out.println("\nPlease enter a valid amount.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, change the values
								} else {

									// updating the quantity to the number the user selected
									deptHouseware.get(intArrayIndex).setQuantity(intUserInput);

									// make the boolean for looping false so we dont ask for amount again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid amount.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// making boolean for looping true, so we loop until they say yes to the order
							// being correct
							// bolTC = true;

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// if the user enters anything other than yes or no, loop the question, and tell
						// them to enter a valid input
					} else {

						// ask the user to enter yes or no
						System.out.println("\nPlease enter yes or no.");

						// make the boolean for looping true, so we ask them for input again
						bolTC = true;

					}

					// do all of this while the user enters wrong values
				} while (bolTC);

				// second part of do while loop, loop all of the code while the input is wrong
			} while (strUserInput.equalsIgnoreCase("no"));

			// second part of do while loop, loop all of the code while the input is wrong
		} while (bolTC);

		// looping through the arraylist for, and adding all of the quantities to the
		// counters for total and department specific items
		for (Houseware e : deptHouseware) {

			// increment the counters for total items, and items from seasonal department
			intTotalItems += e.getQuantity();
			intHousewareItems += e.getQuantity();

		}

	}

	// method to add items to the order specifically from the seasonal arraylist
	public static void createSeasonal(ArrayList<Seasonal> deptSeasonal, ArrayList<Object> customerOrder) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following code while the user keeps adding items, and editing
		// their order
		do {

			// do all of the following while the user keeps asking to enter items
			do {

				// do all of the following while there are no errors
				do {

					// ask the user if they want to add an item from the database to the arraylist
					// for the customer order, and store their response to the variable for user
					// input
					System.out.print("\nWould you like to add an item from the Seasonal department? (yes/no): ");
					strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

					// if the user enters yes, then go along as usual
					if (strUserInput.equalsIgnoreCase("yes")) {

						// this do while loop is meant to check which item in the arraylist they want to
						// edit
						do {

							// output the menu options
							System.out.print(
									"\n--------------------------------------\nWhat item would you like to add to order? \nPlease select a menu option: \n");

							// loop through the array list, and the items to the menu so the user can select
							// them
							for (int i = 0; i < deptSeasonal.size(); i++) {

								// output the number, aswell as the product name of each arraylist item
								System.out.println((i + 1) + ".) " + deptSeasonal.get(i).getProductName());

							}

							// try to store their input, and check for any errors along the way
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intArrayIndex = (new Scanner(System.in).nextInt() - 1);

								// if the user does not enter a negative number, or a number that is not in the
								// array list, stop looping and move onto the next step
								if (intArrayIndex >= 0 && !(intArrayIndex >= deptSeasonal.size())) {

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if they enter something that does not pass both the criteria, ask them to
									// enter another input
								} else {

									// ask the user to enter a correct value
									System.out.println("\nPleas enter a valid menu option.\n");

									// make the boolean for looping true
									bolTC = true;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid menu option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// loop through all of this while there are errors
						} while (bolTC);

						// do while with a try and catch, to check for any invalid inputs
						do {

							// try all of the following code, and check for any errors
							try {

								// ask user how many of the item they would like to add
								System.out.print("\nHow many would you like to add?: ");
								intUserInput = new Scanner(System.in).nextInt();

								if (intUserInput <= 0) {

									// ask the user to enter a valid price
									System.out.println("\nPlease enter a valid amount.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid price, make sure we dont loop
								} else {

									// updating the quantity to the number the user selected
									deptSeasonal.get(intArrayIndex).setQuantity(intUserInput);

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid amount.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// add the object we just made to the customer order arraylist
							customerOrder.add(deptSeasonal.get(intArrayIndex));

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

					}

					// if the user enters no, make the boolean for looping = false, and return to
					// main menu
					else if (strUserInput.equalsIgnoreCase("no")) {

						// make the boolean for looping = false, to make sure we dont loop again
						bolTC = false;

						// if the user enters anything other than yes or no, loop the question, and tell
						// them to enter a valid input
					} else {

						// ask the user to enter yes or no
						System.out.println("\nPlease enter yes or no.");

						// make the boolean for looping true, so we ask them for input again
						bolTC = true;

					}

					// this loop is to make sure that the user enters "yes" or "no" to adding items
					// to the databse
				} while (bolTC);

				// loop as long as the user enters "yes" to add items
			} while (strUserInput.equalsIgnoreCase("yes"));

			do {

				// do all of the following while the user says the order is not correcy
				do {

					// ask the user if the order is correct
					System.out.println("\nIs this order correct? (yes/no)");
					// loop through the array list, and the items to the menu so the user can
					// select them
					for (int i = 0; i < deptSeasonal.size(); i++) {

						// if the quantity > 0, print the item

						if (deptSeasonal.get(i).getQuantity() > 0) {

							// output the number, aswell as the product name and quantity of each arraylist
							// item
							System.out.println((i) + ".) " + deptSeasonal.get(i).getQuantity() + " x "
									+ deptSeasonal.get(i).getProductName());

						}

					}

					// this line only serves to make the program look better
					System.out.print("\n>>> ");

					// assign the variable for user input to whatever they enter next
					strUserInput = new Scanner(System.in).nextLine();

					// if the user enters yes, exit the loop
					if (strUserInput.equalsIgnoreCase("yes")) {

						// make the boolean for looping = false, to make sure we dont loop again
						bolTC = false;

						// if the user enters no, let them edit the quantities of their order
					} else if (strUserInput.equalsIgnoreCase("no")) {

						// do all of the following while there are no errors
						do {

							// ask the user to select which item they would like to edit
							System.out.print(
									"\nWhat item would you like to edit? \nPlease select an option from above: \n");

							// try to store their input, and check for any errors along the way
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intArrayIndex = (new Scanner(System.in).nextInt());

								// if the user does not enter a negative number, or a number that is not in the
								// array list, stop looping and move onto the next step
								if (intArrayIndex >= 0 && !(intArrayIndex >= deptSeasonal.size())
										&& (deptSeasonal.get(intArrayIndex).getQuantity() != 0)) {

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if they enter something that does not pass both the criteria, ask them to
									// enter another input
								} else {

									// ask the user to enter a correct value
									System.out.println("\nPleas enter a valid menu option.\n");

									// make the boolean for looping true
									bolTC = true;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid menu option.\n");

								// make the boolean for looping true
								bolTC = true;

							}

						} while (bolTC);

						// do while with a try and catch, to check for any invalid inputs
						do {

							// try all of the following code, and check for any errors
							try {

								// ask user how many of the item they would like to add
								System.out.print("\nPlease enter new quantity: ");
								intUserInput = new Scanner(System.in).nextInt();

								// if the user enters a number equal to or less than 0, this is impossible, so
								// ask them to
								// enter another one
								if (intUserInput <= 0) {

									// ask the user to enter a valid amount
									System.out.println("\nPlease enter a valid amount.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, change the values
								} else {

									// updating the quantity to the number the user selected
									deptSeasonal.get(intArrayIndex).setQuantity(intUserInput);

									// make the boolean for looping false so we dont ask for amount again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid amount.\n");

								// make the boolean for looping true
								bolTC = true;

							}

							// making boolean for looping true, so we loop until they say yes to the order
							// being correct
							// bolTC = true;

							// do all of the above code as long as the boolean for incorrect value
						} while (bolTC);

						// if the user enters anything other than yes or no, loop the question, and tell
						// them to enter a valid input
					} else {

						// ask the user to enter yes or no
						System.out.println("\nPlease enter yes or no.");

						// make the boolean for looping true, so we ask them for input again
						bolTC = true;

					}

					// do all of this while the user enters wrong values
				} while (bolTC);

				// second part of do while loop, loop all of the code while the input is wrong
			} while (strUserInput.equalsIgnoreCase("no"));

			// second part of do while loop, loop all of the code while the input is wrong
		} while (bolTC);

		// looping through the arraylist for, and adding all of the quantities to the
		// counters for total and department specific items
		for (Seasonal e : deptSeasonal) {
			
			// increment the counters for total items, and items from seasonal department
			intTotalItems += e.getQuantity();
			intSeasonalItems += e.getQuantity();
		
		}

	}

	// method to print the order which has been created
	public static void printOrder(ArrayList<Object> customerOrder, ArrayList<Grocery> deptGrocery,
			ArrayList<Houseware> deptHouseware, ArrayList<Seasonal> deptSeasonal) {

		// declaring variable for customer name
		String strCustomerName = null;

		// asking the user for a customer name, so we can have a personalized order for
		// the customer
		System.out.print("\nPlease enter customer name : ");
		strCustomerName = new Scanner(System.in).nextLine();// storing the user input to the customer name variable

		// declaring a variable for the total cost
		float fltTotalCost = 0;

		// printing out the the counters from each department
		System.out.println("\n--------------------------------------\n" + strCustomerName.toUpperCase() + "'s Receipt: "
				+ "\n--------------------------------------" + "\nTotal items: " + intTotalItems + "\nGrocery items: "
				+ intGroceryItems + "\nHouseware items: " + intHousewareItems + "\nSeasonal items: " + intSeasonalItems
				+ "\n--------------------------------------");

		// outputting the indivisual items
		for (Object e : customerOrder) {

			// printing each item in the customer's order
			System.out.println(e);

		}

		// looping through the entire grocery arraylist to add the total price
		for (Grocery e : deptGrocery) {

			// add all of the costs to the total cost variable
			fltTotalCost += e.getSubTotal();

		}

		// looping through the entire houseware arraylist to add the total price
		for (Houseware e : deptHouseware) {

			// add all of the costs to the total cost variable
			fltTotalCost += e.getSubTotal();

		}

		// looping through the entire seasonal arraylist to add the total price
		for (Seasonal e : deptSeasonal) {

			// add all of the costs to the total cost variable
			fltTotalCost += e.getSubTotal();

		}

		// printing the subtotal, tax, and total cost
		System.out.println("\nSubtotal: $" + (fltTotalCost) + "\nTax: $" + ((float) (fltTotalCost * 0.13))
				+ "\nTotal cost: $" + ((float) (fltTotalCost * 1.13)) + "\n--------------------------------------\n");

	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for the customers, make a customer order, and then add it to the string
		// arraylist for customers, at the end
		// print the index of the customer to output the receipt

		// declaring variable for user menu choice, and booleans for looping and order
		// completion
		int intUserInput = 0;
		boolean bolTC = false;
		boolean bolOrderComplete = false;

		// variable for the customer name
		String strCustomerName = null;

		// creating new ArrayLists of Objects for all of the grocery, houseware, and
		// seasonal items we add
		ArrayList<Grocery> deptGrocery = new ArrayList<Grocery>();
		ArrayList<Houseware> deptHouseware = new ArrayList<Houseware>();
		ArrayList<Seasonal> deptSeasonal = new ArrayList<Seasonal>();

		// making an arraylist for the customers orders
		ArrayList<Object> customerOrder = new ArrayList<Object>();

		// calling the method to initialize the array lists, passing the different
		// array lists into it
		initArrayList(deptGrocery, deptHouseware, deptSeasonal);

		// do while loop, to allow the user to do as many inputs as they want, as long
		// as they do not enter 5, to exit the program
		do {

			// do while with a try and catch, to check for any invalid inputs
			do {

				// output the menu options
				System.out.print(
						"\n--------------------------------------\nWelcome to the Ottawa Department Store \nPlease select a menu option: "
								+ "\n1.) Add Items to Database" + "\n2.) Update Items in Database"
								+ "\n3.) Create Customer Order" + "\n4.) Output Customer Reciept"
								+ "\n5.) Exit Program \n");

				// try all of the following code, and check for any errors
				try {

					// this line only serves to make the program look better
					System.out.print("\n>>> ");

					// assign the variable for user input to whatever they enter next
					intUserInput = new Scanner(System.in).nextInt();

					// if the user enters 1, call the method to add items to the database
					if (intUserInput == 1) {

						// call the method to add items to the database
						addToDatabase(deptGrocery, deptHouseware, deptSeasonal);

						// if the user enters 2, call the method to update items in the database
					} else if (intUserInput == 2) {

						// call the method to update items in the database
						updateDatabase(deptGrocery, deptHouseware, deptSeasonal);

						// if the user enters 3, call the method to create the receipt (i.e choose the
						// quantities) from the database
					} else if (intUserInput == 3) {

						// call the method to create a customer order
						createOrder(deptGrocery, deptHouseware, deptSeasonal, customerOrder);

						// if the user enters 4, call the method to print out the receipt that has been
						// created
					} else if (intUserInput == 4) {

						// check if the user has added any items to the receipt, if not, don't allow
						// them
						// to output the receipt
						if (intTotalItems == 0) {

							// output a message to the user that they can not print the receipt yet
							System.out.println("\nError. Can not output customer reciept before it is made.\n");

							// otherwise, if the counter for items is not 0, this means they already added
							// an item, so let them print the receipt as usual
						} else {

							// call the method to print the customer order
							printOrder(customerOrder, deptGrocery, deptHouseware, deptSeasonal);

							// make the boolean for order done = true, to exit the program
							bolOrderComplete = true;

							// making the boolean for looping = false, to make sure we dont loop again
							bolTC = false;

						}

						// if the user enters 5 for their input
					} else if (intUserInput == 5) {

						// make the boolean for looping = false, to make sure that we do not run the
						// program again by accident
						bolTC = false;

						// otherwise, if the user enters a number not on the menu
					} else {

						// ask them to enter a valid menu option
						System.out.println("\nPleas enter a valid menu option.\n");

						// set the boolean for looping = true
						bolTC = true;

					}

					// if you find any errors, make the boolean to loop true, and tell the user to
					// enter another value
				} catch (Exception ex) {

					// ask the user to enter a correct value
					System.out.println("\nPlease enter a valid input.\n");

					// make the boolean for looping true
					bolTC = true;

				}

				// do all of the above code as long as the boolean for incorrect value
			} while (bolTC);

			// do all of the above until the user enters 5, or outputs a receipt, then
			// terminate the program
		} while (intUserInput != 5 && bolOrderComplete != true);

		// print out a message that the program is terminated
		System.out.println("\nThank you for using the Ottawa Department Store cashier system!\n");

	}

}
