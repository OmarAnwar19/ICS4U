/**
 * Description: Intro to objects, test class
 *
 * @author (Omar Anwar)
 * @version (10/8/2021) 
 */

import java.util.*;

public class AnwarTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare and initialize an instance of the person class
		Person PersonA = new Person();
		
		//OR
		
		//declare variable to store instance of the person
		Person PersonB;
		
		//initialize the instance
		PersonB = new Person();
		
		//populating isntance variables, can only do this way because variables are public
		PersonA.strFirstName = "Omar";
		PersonA.strLastName = "Anwar";
		PersonA.bytAge = 16;
		PersonA.bolStudent = true;
		
		PersonA.address.strStreetName = "Main Street";
		PersonA.address.strCity = "Nepean";
		PersonA.address.strCountry = "Canada";
		PersonA.address.strPostalCode = "KBN 4XY";
		PersonA.address.strProvince = "Ontario";
		PersonA.address.intStreetNumber = 613;
		
		PersonB.strFirstName = "Noha";
		PersonB.strLastName = "Ghoneima";
		PersonB.bytAge = 40;
		PersonB.bolStudent = false;
		
		PersonA.address.strStreetName = "Main Street";
		PersonA.address.strCity = "Nepean";
		PersonA.address.strCountry = "Canada";
		PersonA.address.strPostalCode = "KBN 4XY";
		PersonA.address.strProvince = "Ontario";
		PersonA.address.intStreetNumber = 613;
		
		//output the info
		System.out.println("Last Name: " + PersonA.strLastName + 
				"\nFirst Name: " + PersonA.strFirstName + 
				"\nAge: " + PersonA.bytAge + 
				"\nStudent?: " + PersonA.bolStudent + 
				"\nAdress: " + PersonA.address.intStreetNumber + ", " + 
				PersonA.address.chrUnitLetter + ", " + PersonA.address.strStreetName + 
				"\n");
		
		System.out.println();
		
		System.out.println("Last Name: " + PersonB.strLastName + 
				"\nFirst Name: " + PersonB.strFirstName + 
				"\nAge: " + PersonB.bytAge + 
				"\nStudent?: " + PersonB.bolStudent);
		
	}

}
