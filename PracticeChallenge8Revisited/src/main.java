
/**
 * Description: 
Create a ArrayList (in the test class) called classList that adds a student to the classList whenever a new Student is created.

Output the classList, and ask the user if the information is correct.  If not, allow them to edit when needs to be changed
 *
 * @author (Omar Anwar)
 * @version (11/17/2021) 
 */

import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strName = null;
		byte bytGrade = 0;
		int count = 6;
		
		ArrayList<Student> studentList = new ArrayList<Student>();

		// try and catch to get exception
		try {

			// declare an object of type file, and initialize connect to a specific file
			File myFile = new File("students.txt");

			// create the scanner to scan the text file
			Scanner myReader = new Scanner(myFile);
			
			while (myReader.nextLine() != null) {

				count++;
				
			}
			
			System.out.println(count);
			
		    for (int i = 0; i < 6; i++) {
		    	
		    	// grabbing the first line from the file
				strName = myReader.nextLine();

				// parsing the next line to an integer
				bytGrade = myReader.nextByte();

				// use the constructor to populate the instance variables of the BankAccount
				// class
				Student student = new Student(strName, bytGrade);

				studentList.add(student);
				
				System.out.println(student);
		    
		    }
		    
			// closing the file to avoid any errors
			//myReader.close();
			
			// catch an exception if the file does not exist
		} catch (FileNotFoundException ex) {

			// printing an error message
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
