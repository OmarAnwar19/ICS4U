/**
 * Description: animal object
 *
 * @author (Omar Anwar)
 * @version (10/18/2021)
 */

public class Animal {

	// declaring variables for parameters
	String strGenus, strSpecies;
	boolean bolIsExtinct;

	//declare our constructor to populate instance variables when object is created
	Animal(String gen, String spc, boolean esx) {

		// assigning the parameters to the user input
		this.strGenus = gen;
		this.strSpecies = spc;
		this.bolIsExtinct = esx;

	}

	//declare our default constructor to populate instance variables when object is created
	Animal() {
		
		// assigning the parameters to the user input
		this.strGenus = "Mammal";
		this.strSpecies = "Primate";
		this.bolIsExtinct = false;

	}

	// add a toString method to output instance variables
	public String toString() {

		//returning the animal information
		return ("Genus: " + this.strGenus + "\nSpecies: " + this.strSpecies + "\nIsExtinct: " + this.bolIsExtinct);

	}

	// equals method
	public boolean equals(Animal animal) {// parameter is going to be another object to compare

		//checking if all of the values are the same for both animal objects
		if (this.strGenus.equals(animal.strGenus) && this.strSpecies.equals(animal.strGenus)
				&& this.bolIsExtinct == animal.bolIsExtinct) {

			//if so, then return the value as true
			return (true);

		//otherwise, if one or all are false,
		} else {

			//return false value
			return (false);

		}

	}

}
