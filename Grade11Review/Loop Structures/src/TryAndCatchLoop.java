public class TryAndCatchLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring a boolean for the looped try and catch statement in order to check if user input is valid
		boolean bolTryCatch = true;
		
		//first part of do while loop
		do {
			
			//first part of try and catch statement, this is the code that will be actually attempted
			try {
				
				//***
				//WRITE MAIN PROGRAM CODE HERE
				//***
				
				//since the input was valid, break the loop
				break;
				
			//second part of try and catch statement to deal with any errors that might occur, using an error message, and commands
			} catch (Exception ex) {

				//***
				//WRITE ERROR CODE HERE
				//***
				
				//make the boolean for invalid input = true, and re-loop the code
				bolTryCatch = true;
				
			}
		
		//do all of the above code while the boolean for valid input = true
		} while(bolTryCatch);
		
	}

}
