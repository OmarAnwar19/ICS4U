
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

import java.util.*;

public class WWF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] lstAnimal;

		byte bytNumAnimals;

		System.out.print("How many animals would you like to add?: ");

		bytNumAnimals = new Scanner(System.in).nextByte();

		lstAnimal = new Animal[bytNumAnimals];

		for (int j = 0; j < bytNumAnimals; j++) {

			String tempStr;
			boolean tempBol = false;
			
			System.out.print("\nPlease enter animal species: ");

			tempStr = new Scanner(System.in).nextLine();

			System.out.print("Is the animal extinct?: ");

			tempBol = new Scanner(System.in).nextBoolean();

			lstAnimal[j] = new Animal(tempStr, tempBol);
			
		}
		
		//printing if the animals are extinct
		lstAnimal[1].printExtinct(lstAnimal);

	}

}
