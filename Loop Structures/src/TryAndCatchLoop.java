public class TryAndCatchLoop {

	TryAndCatchLoop() {
		
	// declaring a boolean for the looped try and catch statement in order to check
	// if user input is valid
	// starting it as false instead of true means that it only starts looping once
	// we set the boolean = true
	boolean bolTryCatch = false;

		// first part of do while loop
		do {

			// first part of try and catch statement, this is the code that will be actually
			// attempted
			try {

				// ***
				// WRITE MAIN PROGRAM CODE HERE
				// ***

				// set the boolean = false, so doesn't loop
				bolTryCatch = false;

				// second part of try and catch statement to deal with any errors that might
				// occur, using an error message, and commands
			} catch (Exception ex) {

				// ***
				// WRITE ERROR CODE HERE
				// ***

				// set the boolean = true, so it keeps looping
				bolTryCatch = true;

			}

			// do all of the above code while the boolean for valid input = true
		} while (bolTryCatch);

	}

}
	