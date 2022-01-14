import java.util.ArrayList;
import java.util.Arrays;

/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class ProgramTestClass {

	//overloaded method - what it they have no siblings
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare a variable of type person class, and initialize variable by using the constructor
		Person PersonA = new Person("Aubrey (Drake)", "Grahm", (byte) 33, (byte) 2);

		//person without siblings
		Person PersonB = new Person("Christopher Edwin (Frank)", "Breaux (Ocean)", (byte) 31);
		
		//default people
		Person PersonDefault = new Person();
		
		//Array list of default people
		ArrayList<Person> lstPeople = new ArrayList<Person>();

		//populating the array list
		for (int i = 0; i < 30; i++) {
			
			//add default people
			lstPeople.add(PersonDefault);
			
		}
		
		//outputting the people
		System.out.println(PersonA + "\n");
		System.out.println(PersonB + "\n");
		System.out.println(PersonDefault + "\n");
		
		//comparing the people (First value is the one we compare to, second one is the one we check)
		System.out.println(/*check if this object instance*/PersonA.equals(/*equals this object instance*/PersonB));//we have person a, and send in person b to compare it
		
		
	}

}
