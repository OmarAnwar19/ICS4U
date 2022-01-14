/**
 * Description: Get and Set method student class
 *
 * @author (Omar Anwar)
 * @version (11/12/2021)
 */

public class NewStudent {

	// instance variables to store name and age
	private String strStudentName;
	private byte bytStudentAge;

	// static variable - class variable
	private static byte bytNumStudent;

	// constructor
	NewStudent(String n, byte a)
	    {
	        this.strStudentName = n;
	        this.bytStudentAge = a;
	        
	        //incrementing my static counter
	        bytNumStudent++;
	    }

	// default constructor
	NewStudent()
	    {
	        this.strStudentName = "unknown";
	        this.bytStudentAge = 0;
	        
	        //incrementing my static counter
	        bytNumStudent++;
	    }

	// Getter methods - they will return the instance value to where the method was
	// called
	public String getStudentName() {
		return this.strStudentName;
	}

	public byte getStudentAge() {
		return this.bytStudentAge;
	}

	public static byte getNumStudent() {
		return bytNumStudent;
	}

	// Setter methods - these methods let us update instance variables for an
	// existing object
	public void setStudentName(String NewName) {
		this.strStudentName = NewName; // data is updated by the parameter
	}

	public void setStudentAge(byte NewAge) {
		this.bytStudentAge = NewAge;
	}

	// toString method
	public String toString() {
		return "Student Name: " + this.strStudentName + "\nStudent Age: " + this.bytStudentAge;
	}

}
