/**
 * Description: Student object
 *
 * @author (Omar Anwar)
 * @version (10/18/2021)
 */

public class Student {

	// declaring variables for parameters
	String strFName, strLName;
	byte bytAge, bytGrade;
	float fltAverage;

	// constructor to assign the parameters to the person
	Student(String fn, String ln, byte age, byte grd, float avg) {

		// assigning the parameters to the user input
		this.strFName = fn;
		this.strLName = ln;
		this.bytAge = age;
		this.bytGrade = grd;
		this.fltAverage = avg;

	}

	// overloaded method incase they don't want to enter their average
	Student(String fn, String ln, byte age, byte grd) {

		// assigning the parameters to the user input
		this.strFName = fn;
		this.strLName = ln;
		this.bytAge = age;
		this.bytGrade = grd;

	}

	// default constuctor, for if the user messes something up
	Student() {

		this.strFName = "Student";
		this.strLName = "LastName";
		this.bytAge = 16;
		this.bytGrade = 12;
		this.fltAverage = 75.0f;

	}

	// add a toString method to output instance variables
	public String toString() {

		return (this.strFName + " " + this.strLName + "\nAge: " + this.bytAge + "\nGrade: " + this.bytGrade
				+ "\nAverage: " + this.fltAverage);

	}

}
