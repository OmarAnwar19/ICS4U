
/**
 * Description: 

Create an object called Animals.

This object should have private instance variables to hold important information like type, age, weight, etc. Have at least 5 instance variables.

Then create an array of a specific amount of animals. Prompt the user as to how many they want to enter, and all information for each animal.

Then using get methods output each instance variable for all instance of the animal class in the array.

 *
 * @author (Omar Anwar)
 * @version (11/2/2021) 
 */

public class Animals {

	String strSpecies;
	private String strGenus;
	private boolean bolExtinct;
	short shrAge;
	float fltWeight;

	Animals() {
		
		this.strSpecies = "Null";
		this.strSpecies = "Null";
		this.bolExtinct = false;
		this.shrAge = 0;
		this.fltWeight = 0;
		
	}
	
	public String getSpecies() {

		return (this.strSpecies);

	}
	
	public String getGenus() {

		return (this.strGenus);

	}

	public boolean getExtinct() {

		return (this.bolExtinct);

	}

	public short getAge() {

		return (this.shrAge);

	}
	
	public float getWeight() {
		
		return(this.fltWeight);
		
	}

	public void setSpecies(String species) {

		this.strSpecies = species;

	}
	
	public void setGenus(String genus) {

		this.strGenus = genus;

	}

	public void setExtinct(boolean extinct) {

		this.bolExtinct = extinct;

	}
	
	public void setAge(short age) {

		this.shrAge = age;

	}
	
	public void setWeight(float weight) {
		
		this.fltWeight = weight;
		
	}
	
	public String toString() {
		
		String temp;
		
		if (this.bolExtinct == true) {
			
			temp = "EXTINCT";
			
		} else {
			
			temp = "NOT EXTINCT";
			
		}
		
		return(
				
				"\n\n--------------------------------\nANIMAL DATABASE\n--------------------------------\n"
				+ "Species: " + this.strSpecies + 
				"\nGenus: " + this.strGenus + 
				"\nAge: " + this.shrAge + 
				"\nWeight: " + this.fltWeight + 
				"\nExtinct?: " + temp
			
				);
		
	}
	
}
