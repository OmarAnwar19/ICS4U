/**
 * Description:
 * 
 * The Restaurant
 * 
 * Copy your code from Part I Restaurant Class and name it Resaurant2.java
 * 
 * Add an instance variable named address to your restaurant2 (use your *Address
 * class). Adjust your constructors accordingly. Write a method named stars that
 * takes the rating and changes it into a string of stars according to the
 * rating (e.g. if bob’s has a rating of 2 then stars would return **) Write a
 * toString method for your restaurant. It should output your restaurant in the
 * following format:
 * 
 * Bob’s Mexican Adventure ** 123 Hill St. Ottawa, ON Canada H0H 0H0
 * 
 *
 * @author (Omar Anwar)
 * @version (10/19/2021)
 */

public class Address {

	// declaring variables for
	String strAddress, strCity, strProvince, strCountry, strPostalCode;

	// constructor to get user input and put it into variables
	Address(String add, String cty, String prv, String ctr, String pcd) {

		// assigning user input to the variables
		this.strAddress = add;
		this.strCity = cty;
		this.strProvince = prv;
		this.strCountry = ctr;
		this.strPostalCode = pcd;

	}

	// constructor for default values
	Address() {

		// assigning default values to the variables
		this.strAddress = "123 Main Street";
		this.strCity = "City";
		this.strProvince = "Province/State";
		this.strCountry = "Country";
		this.strPostalCode = "ABC 123";

	}

	// add a toString method to output instance variables
	public String toString() {

		// returning the info
		return ("\n" +this.strAddress + "\n" + this.strCity + ", "
				+ this.strProvince + " " + this.strCountry + "\n" + this.strPostalCode);

	}

}
