
/**
 * Description: This program acts as a digital media shelf for a user, it allows
 * them to manage all of the media items in their collection. The user can enter
 * 2 main types of media, movies, and songs. They can choose to add new songs,
 * and remove any songs which they have added, and do not want anymore. The user
 * can then output all of their songs and movies, using toString methods, in a
 * friendly format. I will also be personally implementing functionality to
 * allow the user to edit the songs and movies which they have already entered,
 * as-well as checking that they have entered all the correct info. Finally,
 * their media will all be outputted to a text file, for easier accessibility at
 * a later time.
 * 
 * @author (Omar Anwar)
 * @version (12/13/2021)
 */

//importing the utilities for the arraylist, scanner, and all of the utilities for file IO 
//would take too long, and since they are all under java.util, and java.io, we import *, 
//which imports all of the library. We also import the jOptionPane seperatley
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AnwarMediaShelf {

	// declaring global variables for the counters for total items, and song and
	// movie items
	public static int intTotalItems = 0;
	public static int intSongs = 0;
	public static int intMovies = 0;

	// method to add items to the MediaShelf, will redirct to another method, so
	// takes the media arraylists as parameters
	private static void insert(ArrayList<Song> songList, ArrayList<Movie> movieList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		boolean bolTC = true;

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat would you like to add? \nPlease select a menu option: "
							+ "\n1.) Add a Song" + "\n2.) Add a Movie" + "\n3.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, call the method to add a song
				if (intUserInput == 1) {

					// call the method to add a song
					addSong(songList);

					// if the user enters 2, call the method to add a movie
				} else if (intUserInput == 2) {

					// call the method to add a movie
					addMovie(movieList);

					// if the user enters 3 for their input
				} else if (intUserInput == 3) {

					// make the boolean for looping = false, to make sure that we do not run the
					// program again by accident, and return to main menu
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

	// method to add songs to the MediaShelf
	private static void addSong(ArrayList<Song> songList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// declaring variables for all of the instance variables we need
		String strTitle = null, strArtist = null, strGenre = null;
		int intLength = 0;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to enter a media item to the MediaShelf, and
				// store
				// their response to the variable for user input
				System.out.print("\nWould you like to add a song? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// keep asking the user to enter a song name until they enter one that isn't
						// a duplicate
						do {

							// ask the user to enter the song title
							System.out.print("\nPlease enter song title: ");
							strTitle = new Scanner(System.in).nextLine();// store their input to a variable

							// if the list is empty, do not check for duplicates
							if (songList.size() == 0) {

								// start by setting the boolean for looping = false, to clear any previous
								// errors
								bolTC = false;

								// otherwise, do check for duplicats
							} else {

								// loop through the song array list, to make sure the user does not add a
								// duplicate item
								for (Song e : songList) {

									// if the input is present in the array list, tell them to enter another input,
									// and loop
									if (e.getTitle().equalsIgnoreCase(strTitle)) {

										// output a message that the item already exists
										System.out.println("\nError. Song already exists in MediaShelf.\n");

										// make the boolean for looping true, so we loop through the list again
										bolTC = true;

										// exit the loop, so the user has to enter the song name again
										break;

										// if no duplicates are found, go on as usual
									} else {

										// make the boolean for looping false, to make sure we stop looping
										bolTC = false;

									}

								}

							}

							// do this while the user input is a duplicate
						} while (bolTC);

						// check if all of the user input is correct and loop while it is not
						do {
							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the song length in seconds
								System.out.print("\nPlease enter song length in seconds: ");
								intLength = new Scanner(System.in).nextInt();// store the value to appropriate variable

								// check if the length they entered is equal to, or less than zero, if so, loop,
								// and tell them to enter a positive length, or is bigger than 60 minutes
								if (intLength <= 0 || intLength > 3600) {

									// ask the user to enter a valid song length
									System.out.println("\nPlease enter a valid song length.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid length, make sure we dont loop
								} else {

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid song length.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// ask the user to enter the song artist
						System.out.print("\nPlease enter song artist name: ");
						strArtist = new Scanner(System.in).nextLine();// store their input to a variable

						// ask the user to enter the song genre
						System.out.print("\nPlease enter song genre: ");
						strGenre = new Scanner(System.in).nextLine();// store their input to a variable

						// once we have valid inputs, make a new obect, and add it to the arraylist for
						// songs
						songList.add(new Song(strTitle, intLength, strArtist, strGenre));

						// tell the user that the item has been added succesfully
						System.out.println("\nSong added to MediaShelf");

						// increment the counters for the total items, and songs
						intTotalItems += 1;
						intSongs += 1;

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
				// to the MediaShelf
			} while (bolTC);

			// loop as long as the user enters "yes" to add items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	// method to add movies to the MediaShelf
	private static void addMovie(ArrayList<Movie> movieList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// declaring variables for all of the instance variables we need
		String strTitle = null, strDirector = null, strRating = null;
		int intLength = 0;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to enter a media item to the MediaShelf, and
				// store
				// their response to the variable for user input
				System.out.print("\nWould you like to add a movie? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// keep asking the user to enter a movie name until they enter one that isn't
						// a duplicate
						do {

							// ask the user to enter the movie title
							System.out.print("\nPlease enter movie title: ");
							strTitle = new Scanner(System.in).nextLine();// store their input to a variable

							// if the list is empty, do not check for duplicates
							if (movieList.size() == 0) {

								// start by setting the boolean for looping = false, to clear any previous
								// errors
								bolTC = false;

								// otherwise, do check for duplicats
							} else {

								// loop through the song array list, to make sure the user does not add a
								// duplicate item
								for (Movie e : movieList) {

									// if the input is present in the array list, tell them to enter another input,
									// and loop
									if (e.getTitle().equalsIgnoreCase(strTitle)) {

										// output a message that the item already exists
										System.out.println("\nError. Movie already exists in MediaShelf.\n");

										// make the boolean for looping true, so we loop through the list again
										bolTC = true;

										// exit the loop, so the user has to enter the song name again
										break;

										// if no duplicates are found, go on as usual
									} else {

										// make the boolean for looping false, to make sure we stop looping
										bolTC = false;

									}

								}

							}

							// do this while the user input is a duplicate
						} while (bolTC);

						// check if all of the user input is correct and loop while it is not
						do {
							// try all of the following code, and check for any errors
							try {

								// ask the user to enter the movie length in seconds
								System.out.print("\nPlease enter movie length in seconds: ");
								intLength = new Scanner(System.in).nextInt();// store the value to appropriate variable

								// check if the length they entered is equal to, or less than zero, if so, loop,
								// and tell them to enter a positive length, or if movie length > 24hours
								if (intLength <= 0 || intLength > 86400) {

									// ask the user to enter a valid song length
									System.out.println("\nPlease enter a valid movie length.");

									// make the boolean for looping true, to ask for input again
									bolTC = true;

									// otherwise, if they enter a valid length, make sure we dont loop
								} else {

									// make the boolean for looping false, to make sure we dont loop again
									bolTC = false;

								}

								// if you find any errors, make the boolean to loop true, and tell the user to
								// enter another value
							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid movie length.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// ask the user to enter the movie director's name
						System.out.print("\nPlease enter movie director's name: ");
						strDirector = new Scanner(System.in).nextLine();// store their input to a variable

						// ask the user to enter the movie rating
						System.out.print("\nPlease enter movie rating: ");
						strRating = new Scanner(System.in).nextLine();// store their input to a variable

						// once we have valid inputs, make a new obect, and add it to the arraylist for
						// movies
						movieList.add(new Movie(strTitle, intLength, strDirector, strRating));

						// tell the user that the item has been added succesfully
						System.out.println("\nMovie added to MediaShelf");

						// increment the counters for the total items, and movies
						intTotalItems += 1;
						intMovies += 1;

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
				// to the MediaShelf
			} while (bolTC);

			// loop as long as the user enters "yes" to add items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	// method to add items to the MediaShelf, will redirct to another method, so
	// takes the media arraylists as parameters
	private static void remove(ArrayList<Song> songList, ArrayList<Movie> movieList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		boolean bolTC = true;

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat would you like to remove? \nPlease select a menu option: "
							+ "\n1.) Remove a Song" + "\n2.) Remove a Movie" + "\n3.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, call the method to remove items from the song arraylist
				if (intUserInput == 1) {

					// check if the user has added any items to the MediaShelf, if not, don't
					// allow
					// them to remove the items
					if (intSongs == 0) {

						// output a message to the user that they can not remove items in the media
						// shelf yet
						System.out.println("\nError. No songs in MediaShelf.\n");

						// otherwise, if the counter for songs is not 0, this means they already added
						// an item, so let them remove a song
					} else {

						// call the method to remove songs
						removeSong(songList);

					}

					// if the user enters 2, call the method to remove items from the movie
					// arraylist
				} else if (intUserInput == 2) {

					// check if the user has added any items to the MediaShelf, if not, don't
					// allow
					// them to remove the items
					if (intMovies == 0) {

						// output a message to the user that they can not remove items in the media
						// shelf yet
						System.out.println("\nError. No movies in MediaShelf.\n");

						// otherwise, if the counter for movies is not 0, this means they already added
						// an item, so let them remove a movie
					} else {

						// call the method to remove movies
						removeMovie(movieList);

					}

					// if the user enters 3 for their input
				} else if (intUserInput == 3) {

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

	// method to remove a song from the MediaShelf
	private static void removeSong(ArrayList<Song> songList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to remove a song from the MediaShelf, and store
				// their response to the variable for user input
				System.out.print("\nWould you like to remove a song? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// output the menu options
						System.out.print(
								"\n--------------------------------------\nWhich song would you like to remove? \nPlease select a menu option: \n");

						// loop through the array list, and the items to the menu so the user can select
						// them
						for (int i = 0; i < songList.size(); i++) {

							// output the number, aswell as the song title of each arraylist item
							System.out.println((i + 1) + ".) " + songList.get(i).getTitle());

						}

						// try to store their input, and check for any errors along the way
						try {

							// this line only serves to make the program look better
							System.out.print("\n>>> ");

							// assign the variable for user input to whatever they enter next
							intUserInput = (new Scanner(System.in).nextInt() - 1);

							// if the user does not enter a negative number, or a number that is not in the
							// array list, stop looping and move onto the next step
							if (intUserInput >= 0 && !(intUserInput >= songList.size())) {

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

						// remove the song that the user chose to remove from the song arraylist
						songList.remove(intUserInput);

						// tell the user that the song has been removed succesfully
						System.out.println("\nSong removed from MediaShelf.");

						// decrement the counters for total items, and songs
						intSongs -= 1;
						intTotalItems -= 1;

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

				// this loop is to make sure that the user enters "yes" or "no" to removing
				// items from the MediaShelf
			} while (bolTC);

			// loop as long as the user enters "yes" to remove items and the number of
			// songs is greater than 0
		} while (strUserInput.equalsIgnoreCase("yes") && intSongs > 0);

	}

	// method to remove a movie from the MediaShelf
	private static void removeMovie(ArrayList<Movie> movieList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to remove a movie from the MediaShelf, and store
				// their response to the variable for user input
				System.out.print("\nWould you like to remove a movie? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// output the menu options
						System.out.print(
								"\n--------------------------------------\nWhich movie would you like to remove? \nPlease select a menu option: \n");

						// loop through the array list, and the items to the menu so the user can select
						// them
						for (int i = 0; i < movieList.size(); i++) {

							// output the number, aswell as the movie title of each arraylist item
							System.out.println((i + 1) + ".) " + movieList.get(i).getTitle());

						}

						// try to store their input, and check for any errors along the way
						try {

							// this line only serves to make the program look better
							System.out.print("\n>>> ");

							// assign the variable for user input to whatever they enter next
							intUserInput = (new Scanner(System.in).nextInt() - 1);

							// if the user does not enter a negative number, or a number that is not in the
							// array list, stop looping and move onto the next step
							if (intUserInput >= 0 && !(intUserInput >= movieList.size())) {

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

						// remove the movie that the user chose to remove from the arraylist
						movieList.remove(intUserInput);

						// tell the user that the Movie has been removed succesfully
						System.out.println("\nMovie removed from MediaShelf.");

						// decrement the counters for total items, and movies
						intMovies -= 1;
						intTotalItems -= 1;

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

				// this loop is to make sure that the user enters "yes" or "no" to removing
				// items from the MediaShelf
			} while (bolTC);

			// loop as long as the user enters "yes" to remove items and the number of
			// movies is greater than 0
		} while (strUserInput.equalsIgnoreCase("yes") && intMovies > 0);

	}

	// method to update items in the MediaShelf, will redirct to another method,
	// so
	// takes the media arraylists as parameters
	private static void edit(ArrayList<Song> songList, ArrayList<Movie> movieList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0;
		boolean bolTC = true;

		// do while with a try and catch, to check for any invalid inputs
		do {

			// output the menu options
			System.out.print(
					"\n--------------------------------------\nWhat you would you like to edit? \nPlease select a menu option: "
							+ "\n1.) Edit a Song" + "\n2.) Edit a Movie" + "\n3.) Return to main menu \n");

			// try all of the following code, and check for any errors
			try {

				// this line only serves to make the program look better
				System.out.print("\n>>> ");

				// assign the variable for user input to whatever they enter next
				intUserInput = new Scanner(System.in).nextInt();

				// if the user enters 1, call the method to edit a song
				if (intUserInput == 1) {

					// check if the user has added any items to the MediaShelf, if not, don't
					// allow
					// them to edit the items
					if (intSongs == 0) {

						// output a message to the user that they can not edit items in the media
						// shelf yet
						System.out.println("\nError. No songs in MediaShelf.\n");

						// otherwise, if the counter for songs is not 0, this means they already added
						// an item, so let them edit a song
					} else {

						// call the method to edit an item in the song array list
						editSong(songList);

					}

					// if the user enters 2, call the method to edit a movie
				} else if (intUserInput == 2) {

					// check if the user has added any items to the MediaShelf, if not, don't
					// allow
					// them to edit the items
					if (intMovies == 0) {

						// output a message to the user that they can not edit items in the media
						// shelf yet
						System.out.println("\nError. No movies in MediaShelf.\n");

						// otherwise, if the counter for movies is not 0, this means they already added
						// an item, so let them edit a movie
					} else {

						// call the method to edit an item in the movie array list
						editMovie(movieList);

					}

					// if the user enters 3...
				} else if (intUserInput == 3) {

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

	// method to edit a song
	private static void editSong(ArrayList<Song> songList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to edit a song in the MediaShelf, and store
				// their response to the variable for user input
				System.out.print("\nWould you like to edit a song? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// output the menu options
						System.out.print(
								"\n--------------------------------------\nWhich song would you like to edit? \nPlease select a menu option: \n");

						// loop through the array list, and the items to the menu so the user can select
						// them
						for (int i = 0; i < songList.size(); i++) {

							// output the number, aswell as the song title of each arraylist item
							System.out.println((i + 1) + ".) " + songList.get(i).getTitle());

						}

						// try to store their input, and check for any errors along the way
						try {

							// this line only serves to make the program look better
							System.out.print("\n>>> ");

							// assign the variable for user input to whatever they enter next
							intArrayIndex = (new Scanner(System.in).nextInt() - 1);

							// if the user does not enter a negative number, or a number that is not in the
							// array list, stop looping and move onto the next step
							if (intArrayIndex >= 0 && !(intArrayIndex >= songList.size())) {

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

						// do while with a try and catch, to check for any invalid inputs
						do {

							// output the menu options
							System.out.print(
									"\n--------------------------------------\nWhat would you like to edit? \nPlease select a menu option: "
											+ "\n1.) Song Title" + "\n2.) Song Length" + "\n3.) Song Artist"
											+ "\n4.) Song Genre" + "\n5.) Return to main menu \n");

							// try all of the following code, and check for any errors
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intUserInput = new Scanner(System.in).nextInt();

								// if the user enters 1, ask for new song title, and update the existing value
								if (intUserInput == 1) {

									// ask the user to enter the song title, and show them the current one
									System.out
											.println("\nCurrent song title: " + songList.get(intArrayIndex).getTitle());

									System.out.print("\nPlease enter new song title: ");
									strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

									// set the song title to the new one the user just entered
									songList.get(intArrayIndex).setTitle(strUserInput);

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if the user enters 2, ask for new song length, and update the existing value
								} else if (intUserInput == 2) {

									// try all of the following code, and check for any errors
									try {

										// ask the user to enter the new song length, and show them the current one
										System.out.println(
												"\nCurrent song length: " + songList.get(intArrayIndex).getLength());

										// store the value to appropriate variable
										System.out.print("\nPlease enter new song length in seconds: ");
										intUserInput = new Scanner(System.in).nextInt();

										// check if the length they entered is equal to, or less than zero, if so, loop,
										// and tell them to enter a positive length, or if length is longer than 60mins
										if (intUserInput <= 0 || intUserInput > 3600) {

											// ask the user to enter a valid length
											System.out.println("\nPlease enter a valid song length.");

											// make the boolean for looping true, to ask for input again
											bolTC = true;

											// otherwise, if they enter a valid length, make sure we dont loop
										} else {

											// set the song length to the new value
											songList.get(intArrayIndex).setLength(intUserInput);

											// make the boolean for looping false, to make sure we dont loop again
											bolTC = false;

										}

										// if you find any errors, make the boolean to loop true, and tell the user to
										// enter another value
									} catch (Exception ex) {

										// ask the user to enter a correct value
										System.out.println("\nPleas enter a valid song length.");

										// make the boolean for looping true
										bolTC = true;

									}

									// if the user enters 3, ask for new song artist, and update the existing value
								} else if (intUserInput == 3) {

									// ask the user to enter the new song artist, and show them the current one
									System.out.println(
											"\nCurrent song artist: " + songList.get(intArrayIndex).getArtist());

									System.out.print("\nPlease enter new song artist: ");
									strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

									// set the song artist to the new one the user just entered
									songList.get(intArrayIndex).setArtist(strUserInput);

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if the user enters 4, ask for new song genre, and update the existing value
								} else if (intUserInput == 4) {

									// ask the user to enter the new song genre, and show them the current one
									System.out
											.println("\nCurrent song genre: " + songList.get(intArrayIndex).getGenre());

									System.out.print("\nPlease enter new song genre: ");
									strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

									// set the song artist to the new one the user just entered
									songList.get(intArrayIndex).setGenre(strUserInput);

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

								}

							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid length.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

					// tell the user the song was edited
					System.out.println("Song edited.");

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

				// this loop is to make sure that the user enters "yes" or "no" to editing
				// items from the MediaShelf
			} while (bolTC);

			// loop as long as the user enters "yes" to remove items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	// method to edit a movie
	private static void editMovie(ArrayList<Movie> movieList) {

		// declaring variables for user menu choice, and boolean for looping
		int intUserInput = 0, intArrayIndex = 0;
		String strUserInput = null;
		boolean bolTC = false;

		// do all of the following while the user keeps asking to enter items
		do {

			// do all of the following while there are no errors
			do {

				// ask the user if they want to edit a movie in the MediaShelf, and store
				// their response to the variable for user input
				System.out.print("\nWould you like to edit a movie? (yes/no): ");
				strUserInput = new Scanner(System.in).nextLine(); // store user input to appropriate variable

				// if the user enters yes, then go along as usual
				if (strUserInput.equalsIgnoreCase("yes")) {

					// do while with a try and catch, to check for any invalid inputs
					do {

						// output the menu options
						System.out.print(
								"\n--------------------------------------\nWhich movie would you like to edit? \nPlease select a menu option: \n");

						// loop through the array list, and the items to the menu so the user can select
						// them
						for (int i = 0; i < movieList.size(); i++) {

							// output the number, aswell as the movie title of each arraylist item
							System.out.println((i + 1) + ".) " + movieList.get(i).getTitle());

						}

						// try to store their input, and check for any errors along the way
						try {

							// this line only serves to make the program look better
							System.out.print("\n>>> ");

							// assign the variable for user input to whatever they enter next
							intArrayIndex = (new Scanner(System.in).nextInt() - 1);

							// if the user does not enter a negative number, or a number that is not in the
							// array list, stop looping and move onto the next step
							if (intArrayIndex >= 0 && !(intArrayIndex >= movieList.size())) {

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

						// do while with a try and catch, to check for any invalid inputs
						do {

							// output the menu options
							System.out.print(
									"\n--------------------------------------\nWhat would you like to edit? \nPlease select a menu option: "
											+ "\n1.) Movie Title" + "\n2.) Movie Length" + "\n3.) Movie Director"
											+ "\n4.) Movie Rating" + "\n5.) Return to main menu \n");

							// try all of the following code, and check for any errors
							try {

								// this line only serves to make the program look better
								System.out.print("\n>>> ");

								// assign the variable for user input to whatever they enter next
								intUserInput = new Scanner(System.in).nextInt();

								// if the user enters 1, ask for new movie title, and update the existing value
								if (intUserInput == 1) {

									// ask the user to enter the movie title, and show them the current one
									System.out.println(
											"\nCurrent movie title: " + movieList.get(intArrayIndex).getTitle());

									System.out.print("\nPlease enter new movie title: ");
									strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

									// set the movie title to the new one the user just entered
									movieList.get(intArrayIndex).setTitle(strUserInput);

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if the user enters 2, ask for new movie length, and update the existing value
								} else if (intUserInput == 2) {

									// try all of the following code, and check for any errors
									try {

										// ask the user to enter the new movie length, and show them the current one
										System.out.println(
												"\nCurrent movie length: " + movieList.get(intArrayIndex).getLength());

										// store the value to appropriate variable
										System.out.print("\nPlease enter new movie length in seconds: ");
										intUserInput = new Scanner(System.in).nextInt();

										// check if the length they entered is equal to, or less than zero, if so, loop,
										// and tell them to enter a positive length, or movie length > 24hours
										if (intUserInput <= 0 || intUserInput > 86400) {

											// ask the user to enter a valid length
											System.out.println("\nPlease enter a valid movie length.");

											// make the boolean for looping true, to ask for input again
											bolTC = true;

											// otherwise, if they enter a valid length, make sure we dont loop
										} else {

											// set the movie length to the new one
											movieList.get(intArrayIndex).setLength(intUserInput);

											// make the boolean for looping false, to make sure we dont loop again
											bolTC = false;

										}

										// if you find any errors, make the boolean to loop true, and tell the user to
										// enter another value
									} catch (Exception ex) {

										// ask the user to enter a correct value
										System.out.println("\nPleas enter a valid movie length.");

										// make the boolean for looping true
										bolTC = true;

									}

									// if the user enters 3, ask for new movie director, and update the existing
									// value
								} else if (intUserInput == 3) {

									// ask the user to enter the new movie director, and show them the current one
									System.out.println(
											"\nCurrent movie director: " + movieList.get(intArrayIndex).getDirector());

									System.out.print("\nPlease enter new movie director: ");
									strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

									// set the movie director to the new one the user just entered
									movieList.get(intArrayIndex).setDirector(strUserInput);

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

									// if the user enters 4, ask for new movie rating, and update the existing value
								} else if (intUserInput == 4) {

									// ask the user to enter the new movie rating, and show them the current one
									System.out.println(
											"\nCurrent movie rating: " + movieList.get(intArrayIndex).getRating());

									System.out.print("\nPlease enter new movie rating: ");
									strUserInput = new Scanner(System.in).nextLine();// store their input to a variable

									// set the movie rating to the new one the user just entered
									movieList.get(intArrayIndex).setRating(strUserInput);

									// make the boolean for looping false to make sure we dont loop again
									bolTC = false;

								}

							} catch (Exception ex) {

								// ask the user to enter a correct value
								System.out.println("\nPleas enter a valid input.");

								// make the boolean for looping true
								bolTC = true;

							}

							// do all of this while the boolean loops
						} while (bolTC);

						// do all of the above code as long as the boolean for incorrect value
					} while (bolTC);

					// tell the user the song was edited
					System.out.println("Movie edited.");

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

				// this loop is to make sure that the user enters "yes" or "no" to editing
				// items from the MediaShelf
			} while (bolTC);

			// loop as long as the user enters "yes" to remove items
		} while (strUserInput.equalsIgnoreCase("yes"));

	}

	private static void printMedia(ArrayList<Song> songList, ArrayList<Movie> movieList) {

		// try and catch statement for the file IO
		try {

			// declare an object of type file and initilze the file - naming it
			File myFile = new File("MediaShelf.txt");

			// declaring a new file writer object
			FileWriter myWriter = new FileWriter("MediaShelf.txt");

			// create the scanner to scan the text file
			Scanner myReader = new Scanner(myFile);

			// declaring a variable for the data we take in using the reader
			String strData = "";

			// ususally, you would output a message that the file was created, or already
			// exists, however,
			// the user does not need to know that, so we will omit the message, and rather
			// overwrite the file each time that the program is run

			// writing to the file
			// if the counter for songs > 0 (i.e the user has added a song), then print out
			// the songs in the media shelf to the text file
			if (intSongs > 0) {

				// write a straight line for formatting
				myWriter.write("\n--------------------------------\n");

				// print out a songs header, aswell as the number of songs
				myWriter.write("\nSongs (x" + intSongs + "): ");

				// for each loop to loop through the songs array list, and print each song using
				// the overriden toString method in the song class
				for (Song e : songList) {

					// printing the songs
					myWriter.write("\n" + e.toString());

				}

			}

			// if the counter for movies > 0 (i.e the user has added a song), then print out
			// the movies in the media shelf to the text file
			if (intMovies > 0) {

				// write a straight line between the 2 categories, for formatting
				myWriter.write("\n--------------------------------\n");

				// print out a Movies header, aswell as the number of movies
				myWriter.write("\nMovies (x" + intMovies + "): ");

				// for each loop to loop through the songs array list, and print each movie
				// using
				// the overriden toString method in the song class
				for (Movie e : movieList) {

					// printing the movies
					myWriter.write("\n" + e.toString());

				}

			}

			// print the total number of items
			myWriter.write("\n\nTotal items in MediaShelf: " + intTotalItems);

			// making sure to close the writer, to avoid any errors
			myWriter.close();

			// outputting a message that the file has been written to succesfully
			System.out.println(
					"\nMediaShelf sucessfully outputted to the file '" + myFile.getName() + "', and to JOptionPane.");

			// loop the length of the file, while the reader has a next line
			while (myReader.hasNextLine()) {

				// storing the data of the line to the string
				strData += myReader.nextLine() + "\n";

			}

			// output the data back to a JOptionPane
			JOptionPane.showMessageDialog(null, strData, "MediaShelf", JOptionPane.INFORMATION_MESSAGE);

			// closing the reader, to avoid any errors
			myReader.close();

			// catches any errors if a runtime is thrown
		} catch (IOException ex) {

			// printing an error message
			System.out.println("Error. IOException.");

			/*
			 * Below is a method of the Java's throwable class which prints the throwable
			 * along with the other details like the line number and the class name where
			 * the exception was thrown
			 */
			ex.printStackTrace();

		}

	}

	// main method, this is where the code starts, and the method which calls other
	// methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring variable for user menu choice, and booleans for looping and
		// completion, as-well as for an in-progress list
		int intUserInput = 0;
		boolean bolTC = false;
		boolean bolInProgress = false;

		// creating new ArrayLists of Objects for all of the different media items we
		// add
		ArrayList<Song> songList = new ArrayList<Song>();
		ArrayList<Movie> movieList = new ArrayList<Movie>();

		// do while loop, to allow the user to do as many inputs as they want, as long
		// as they do not enter 5, to exit the program
		do {

			// do while with a try and catch, to check for any invalid inputs
			do {

				// output the menu option
				System.out.print("\n--------------------------------------\nWelcome to the MediaShelf Utility "
						+ "\nPlease select a menu option: " + "\n1.) Add Item to MediaShelf"
						+ "\n2.) Remove Item from MediaShelf" + "\n3.) Edit Existing Item in MediaShelf"
						+ "\n4.) Output MediaShelf" + "\n5.) Exit Program \n");

				// try all of the following code, and check for any errors
				try {

					// this line only serves to make the program look better
					System.out.print("\n>>> ");

					// assign the variable for user input to whatever they enter next
					intUserInput = new Scanner(System.in).nextInt();

					// if the user enters 1, call the method to add media to the MediaShelf
					if (intUserInput == 1) {

						// call the method to add items to the MediaShelf
						insert(songList, movieList);

						// if the user enters 1, call the method to remove items from the MediaShelf
					} else if (intUserInput == 2) {

						// check if the user has added any items to the MediaShelf, if not, don't
						// allow
						// them to output the receipt
						if (intTotalItems == 0) {

							// output a message to the user that they can not remove items from the media
							// shelf yet
							System.out.println("\nError. Can not remove items from empty MediaShelf.\n");

							// otherwise, if the counter for items is not 0, this means they already added
							// an item, so let them remove items from the media list
						} else {

							// call the method to remove items from the MediaShelf
							remove(songList, movieList);

						}

						// if the user enters 3, call the method to update items in the MediaShelf
					} else if (intUserInput == 3) {

						// check if the user has added any items to the MediaShelf, if not, don't
						// allow
						// them to edit the items
						if (intTotalItems == 0) {

							// output a message to the user that they can not update items in the media
							// shelf yet
							System.out.println("\nError. Can not edit items in empty MediaShelf.\n");

							// otherwise, if the counter for items is not 0, this means they already added
							// an item, so let them edit items in the media list
						} else {

							// call the method to remove items from the MediaShelf
							edit(songList, movieList);

						}

						// if the user enters 4, call the method to output the media list, to the
						// console, and to the text file
					} else if (intUserInput == 4) {

						// check if the user has added any items to the MediaShelf, if not, don't
						// allow
						// them to output the media shelf yet
						if (intTotalItems == 0) {

							// output a message to the user that they can not output the media shelf yet
							System.out.println("\nError. Can not output empty MediaShelf.\n");

							// otherwise, if the counter for items is not 0, this means they already added
							// an item, so let them output the media list
						} else {

							// call the method to output the media list
							printMedia(songList, movieList);

							// make the boolean for in progress = true, to exit the program
							bolInProgress = true;

							// making the boolean for looping = false, to make sure we dont loop again
							bolTC = false;

						}

						// if the user enters 5 for their input
					} else if (intUserInput == 5) {

						// make the boolean for looping = false, to make sure that we do not run the
						// program again by accident, now we will exit the program
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

			// do all of the above until the user enters 5, or outputs the medialist, then
			// terminate the program
		} while (intUserInput != 5 && bolInProgress != true);

		// print out a message that the program is terminated
		System.out.println("\nThank you for using the MediaShelf Utility!\n");

	}

}
