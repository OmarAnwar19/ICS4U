
//import the java file class
import java.io.File;

//import file writer
import java.io.FileWriter;

//import the IOException class
import java.io.IOException;

public class AnwarWriteToFile {

	public static void main(String[] args) {

		try {
			// declare an object of type file and initilze the file - naming it
			File myFile = new File("file2.txt");

			// declaring a new file writer object
			FileWriter myWriter = new FileWriter("file2.txt");

			// if the creation of the file returns true, then, file was created
			if (myFile.createNewFile()) {

				// output message file was created
				System.out.println("\nFile '" + myFile.getName() + "' created succesfully.");

				// if file already existed, will return false
			} else {

				// output a message that the file already exists
				// System.out.println("File '" + myFile.getName() + "' already exists.");

			}

			// writing to the file
			myWriter.write("TEXT HERE");

			// making sure to close the file, to avoid any errors
			myWriter.close();

			// outputting a message that the file has been written to succesfully
			System.out.println("File written to succsesfully.");

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
