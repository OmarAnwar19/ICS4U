
/**
 * Description: Assuming you have a class Animal that has instance variables: String species, boolean extinct. 
 * Assume another class WWF (World Wildlife Federation) that maintains an array - of Animal objects (Animal animals). 
 * Write a non-static method printExtinct( ) that outputs a list of all Animals that are extinct.
 *
 * @author (Omar Anwar)
 * @version (11/02/2021) 
 */

/**
 * @author omara
 *
 */
import java.util.ArrayList;

public class Animal {

	private static short shrValue;
	
	private String strSpecies;
	private boolean bolExtinct;

	Animal(String spc, boolean ext) {


		this.strSpecies = spc;
		this.bolExtinct = ext;

	}

	Animal() {

		this.strSpecies = "Species";
		this.bolExtinct = false;

	}

	public String getSpecies() {

		return (this.strSpecies);

	}

	public boolean getExtinct() {

		return (this.bolExtinct);

	}

	public void setSpecies(String species) {

		this.strSpecies = species;

	}

	public void setExtinct(boolean extinct) {

		this.bolExtinct = extinct;

	}

	public String toString() {

		return ("Animal Species: " + this.strSpecies + "\n" + "Extinct?: " + this.bolExtinct);

	}

	public void printExtinct(Animal[] lstAnimal) {

		System.out.println("");
		
		for (int i = 0; i < lstAnimal.length; i++) {
			
			if (lstAnimal[i].getExtinct() == true) {

				System.out.println("Animal '" + lstAnimal[i].getSpecies() + "': EXTINCT");

			} else {

				System.out.println("Animal '" + lstAnimal[i].getSpecies() + "': NOT EXTINCT");

			}

		}
		
	}

	}

