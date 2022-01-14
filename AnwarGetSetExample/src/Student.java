/**
 * Description: Get and Set method student class
 *
 * @author (Omar Anwar)
 * @version (11/12/2021) 
 */

public class Student {

	//declaring the variables
	private String strStudentName;
	private byte bytStudentAge;
	
	//constructor to assign user input to the variables
	Student(String nme, byte age) {
		
		//assigning values to the parameters
		this.strStudentName = nme;
		this.bytStudentAge = age;
		
	}

	//default constructor
	Student () {
		
		//asigning values to the parameters
		this.strStudentName = "Unknown";
		this.bytStudentAge = 0;
		
		
	}
	
	//VARIABLES ARE PRIVATE, GET AND SET METHODS ARE PUBLIC
	
	//getter methods
	//first getter method to return the student name string
	public String getStudentName () {
		
		//returing this the student name
		return(this.strStudentName);
		
	}
	
	//second getter method to return the student age byte
	public byte getStudentAge() {
		
		//returning the student age
		return(this.bytStudentAge);
		
	}
	
	//setter methods - these methods let us update instance variables for an existing object
	//first set method to set the student's name
	public void setStudentName(String name) {
		
		//setting the student name to the new value that the user has newly entered
		this.strStudentName = name;
		
	}
	
	public void setStudentAge(byte age) {
		
		this.bytStudentAge = age;
		
	}
	
	//toString class
	public String toString() {
		
		//returning the student info
		return("STUDENT INFO:" + "\nName: " + this.strStudentName + "\nAge: " + this.bytStudentAge);
		
	}
	
}
