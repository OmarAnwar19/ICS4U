/**
 * Description: 
Given a class named Animal with instance variables - genus, species and isExtinct (boolean).
-Write an equals method for the class
-Write a toString method for Animal and write the output you would get if you called it
 *
 * @author (Omar Anwar)
 * @version (10/18/2021) 
 */

//importing scanner for user input
import java.util.Scanner;

public class PC12TestClass {

	public static Animal getAnimal() {

		// declaring variables for user input
		String strGenus, strSpecies, strExtinct;
		boolean bolIsExtinct;

		// asking user to enter animal info
		System.out.println("\nENTER ANIMAL INFO.\n");

		// asking user to enter input, and then storing it to proper variable
		System.out.print("Please enter animal genus: ");
		strGenus = new Scanner(System.in).nextLine();

		// asking user to enter input, and then storing it to proper variable
		System.out.print("Please enter animal species: ");
		strSpecies = new Scanner(System.in).nextLine();

		// asking user to enter input, and then storing it to proper variable
		System.out.print("Is the animal extinct?: ");
		strExtinct = new Scanner(System.in).nextLine();
		
		//checking what user entered for extinct question, and assigning accordingly
		if (strExtinct.equals("yes") || strExtinct.equals("y") ) {
			
			//make the boolean true
			bolIsExtinct = true;
			
		//otherwise, if they enter no, or anything else, than the value is false
		} else {
			
			//make the boolean false
			bolIsExtinct = false;
			
		}
		
		//making a new animal object
		Animal animal = new Animal(strGenus, strSpecies, bolIsExtinct);
		
		//returning the animal object
		return(animal);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling method to make new animals
		Animal animal1 = getAnimal(), animal2 = getAnimal();
		
		//straight line for formatting
		System.out.println("--------------------------------");
		
		//outputting the animals
		System.out.println("\n" + animal1);
		System.out.println("\n" + animal2);
		
		//check if both animals are equal, if so, print this to the console
		if (animal1.equals(animal2) == true) {
			
			//output the results
			System.out.println("\nThe animals are the same.");
		
		//otherwise, if the 2 animals aren't the same, output this to the console
		} else {
			
			//output the results 
			System.out.println("\nThe animals are not the same");
			
		}
		
	}

}
