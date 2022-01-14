/**
 * Description: PROGRAM DESCRIION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class Person {
	
	//declare instance variables for person
	String strFirstName, strLastName;
	byte bytAge, bytSiblings;
	
	//declare our constructor to populate instance variables when object is created
	Person (String fn, String ln, byte age, byte sib) {
		
		//assign the parameters coming into the constructor to the instance variables
		this.strFirstName = fn;
		this.strLastName = ln;
		this.bytAge = age;
		this.bytSiblings = sib;
		
	}
	
	//overloaded method, what if they have no siblings
	Person (String fn, String ln, byte age) {
		
		//assign the parameters coming into the constructor into the instance values
		this.strFirstName = fn;
		this.strLastName = ln;
		this.bytAge = age;
		
	}
	
	//declare our default constructor to populate instance variables when object is created
	Person () {
			
			//assign default parameters coming into the constructor to the instance variables
			this.strFirstName = "John";
			this.strLastName = "Doe";
			this.bytAge = 42;
			this.bytSiblings = 0;
			
		}
	
	//add a toString method to output instance variables
	public String toString() {
		
		return (this.strFirstName + " " + this.strLastName +
				"\nAge: " + this.bytAge + "\nSiblings: " + 
				this.bytSiblings);
		
	}
	
	//equals method
	public boolean equals (Person person) {//parameter is going to be another object to compare
		
		if (this.strFirstName == person.strFirstName && 
				this.strLastName == person.strLastName &&
				this.bytAge == person.bytAge && 
				this.bytSiblings == person.bytSiblings) {
			
			return (true);
			
		} else {
			
			return (false);
			
		}
		
	}
	
}
