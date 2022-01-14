import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FootballRoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bolTryCatch = false;
		String strUserInput = null;
		int i = 0;
		
		ArrayList<String> playersList = new ArrayList<String>();
		ArrayList<String> rosterList = new ArrayList<String>();
		
		Collections.addAll(playersList, "CAM NEWTON", "TRAVIS KELCE", "ALVIN KAMARA", "PATRICK MAHOMES", "MIKE HILTON"
				,"JOE BURROW", "TYLER BOYD", "AARON DONALD", "JAMAR CHASE", "BEN ROETHELISBERGER");
		
		do {
		
			i++;
			
		do {
			
			try {
				
				System.out.println("\nWhich player would you like to add to your team?:");
				
				for (String e: playersList) {
					
					System.out.println("- " + e);
					
				}
				
				System.out.print("\n>>> ");
				strUserInput = new Scanner(System.in).nextLine();
								
				if (playersList.contains(strUserInput.toUpperCase())) {
					
					System.out.println("\n" + strUserInput.toUpperCase() + " succsesfully added to your roster.");
					
					rosterList.add(strUserInput.toUpperCase());
					
					playersList.remove(strUserInput.toUpperCase());
					
					bolTryCatch = false;
					
				} else {
					
					System.out.println("\nError. That player does not exist, or has already been selected.");
					
					bolTryCatch = true;
					
				}
				
			} catch (Exception ex) {
				
				System.out.println("\nError. Please enter a valid player.");
				
				bolTryCatch = true;
				
				ex.printStackTrace();
				
			}
			
		} while (bolTryCatch);
		
		} while (i < 5);
		
		try {
			// declare an object of type file and initilze the file - naming it
			File myFile = new File("roster.txt");

			// declaring a new file writer object
			FileWriter myWriter = new FileWriter("roster.txt");

			// if the creation of the file returns true, then, file was created
			if (myFile.createNewFile()) {

				// output message file was created
				System.out.println("\nRoster File '" + myFile.getName() + "' created succesfully.");

				// if file already existed, will return false
			} else {

				// output a message that the file already exists
				// System.out.println("File '" + myFile.getName() + "' already exists.");

			}

			myWriter.write("ROSTER: ");
			
			// writing to the file
			for (String e: rosterList) {
				
				myWriter.write("\n- " +  e);
				
			}

			// making sure to close the file, to avoid any errors
			myWriter.close();

			// outputting a message that the file has been written to succesfully
			System.out.println("\nRoster edited succsesfully.");

			// catches any errors if a runtime is thrown
		} catch (IOException ex) {

			//printing an error message
			System.out.println("Error. IOException.");

			/*
			 * Below is a method of the Java's throwable class which prints the throwable
			 * along with the other details like the line number and the class name where
			 * the exception was thrown
			 */
			ex.printStackTrace();

		}
		
	}

}
