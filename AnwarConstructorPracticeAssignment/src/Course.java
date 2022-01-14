/**
 * Description: Course object
 *
 * @author (Omar Anwar)
 * @version (10/18/2021)
 */

//importing scanner
import java.util.Arrays;
import java.util.Scanner;

public class Course {

	// declaring variables for parameters
	String strCourseCode;
	String[] strStudentsArray = new String[3];
	int bytRoomNum;

	// constructor to assign the parameters to the person
	Course(String cc, int rn, String[] arr) {

		// assigning the parameters to the user input
		this.strCourseCode = cc;
		this.bytRoomNum = rn;
		this.strStudentsArray = arr;

	}

	// default constuctor, for if the user messes something up
	Course() {

		// assigning the default parameters to the user input
		this.strCourseCode = "ABC123";
		this.bytRoomNum = 00;

		for (int i = 0; i < 3; i++) {

			this.strStudentsArray[i] = "Student";

		}

	}

	// add a toString method to output instance variables
	public String toString() {

		return ("Course Code: " + this.strCourseCode + "\nRoom Number: " + this.bytRoomNum + "\nStudents: " + Arrays.toString(this.strStudentsArray));
		
	}

}
