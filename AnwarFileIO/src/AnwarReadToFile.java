//import the java file class
import java.io.File;

//import file reader
import java.io.FileReader;

//import the IOException class
import java.io.IOException;

//import FileNotFoundException
import java.io.FileNotFoundException;

//import scanner so we can read from the text file
import java.util.Scanner;

public class AnwarReadToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare a variable to store the data coming in from the file
		String strData;
				
		//try and catch to get exception
		try {
			
			//declare an object of type file, and initialize connect to a specific file
			File myFile = new File("Junya - Kanye (Ye) West.txt");
			
			//create the scanner to scan the text file
			Scanner myReader = new Scanner(myFile);
			
			//loop the length of the file, while the reader has a next line
			while (myReader.hasNextLine()) {
				
				//storing the data of the line to the string
				strData = myReader.nextLine();
				
				//output variable each time to show the text
				System.out.println(strData);
				
			}
			
			//closing the file to avoid any errors
			myReader.close();
			
			//catch an exception if the file does not exist
		} catch (FileNotFoundException ex) {
			
			//printing an error message
			System.out.println("Error. File not found.");

			/*
			 * Below is a method of the Java's throwable class which prints the throwable
			 * along with the other details like the line number and the class name where
			 * the exception was thrown
			 */
			ex.printStackTrace();
			
		}
		
	}

}
