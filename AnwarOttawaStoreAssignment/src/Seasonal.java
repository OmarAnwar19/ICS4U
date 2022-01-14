/**
 * Description: child class of the department super class, for the Seasonal
 * department, inherits the same instance variables and methods from the parent
 * or super class, and then add the specific instance variables and methods
 * which are needed for the seasonal class
 *
 * @author (Omar Anwar)
 * @version (11/18/2021)
 */

//the Seasonal class extends the Department class, which means that it inherits methods and variables from it
public class Seasonal extends Department {

	// declaring the instance variables specific to the Houseware class, a String
	// for the season of the seasonal department item, and
	// a boolean for whether or not the item should be wrapped,
	private String strSeason;
	private boolean bolWrapping;

	// first constructor for the Seasonal department, takes in the variables for the
	// super class, which are product name,
	// product price, and product quantity, aswell as a string for which season the
	// seasonal department item is for, and the boolean for
	// whether or not the item should be wrapped
	public Seasonal(String pnm, int qty, float prc, String ssn, boolean bol) {

		// assigning the variables for product name, quantity, and price, to the
		// variables in the department super class
		super(pnm, qty, prc);

		// assigning the rest of the variables to the instance variables specific to the
		// Seasonal class
		this.strSeason = ssn;
		this.bolWrapping = bol;

	}

	// overloaded constructor which does not take in quantity, this will be useful
	// for the 4 products which exist by default in each department
	public Seasonal(String pnm, float prc, String ssn, boolean bol) {

		// assigning the variables for product name, and price, (BUT NOT QUANTITY) to
		// the variables in the department super class
		super(pnm, prc);

		// assigning the rest of the variables to the instance variables specific to the
		// Seasonal class
		this.strSeason = ssn;
		this.bolWrapping = bol;

	}

	// default constructor, incase the user does not enter any values
	public Seasonal() {

		// passing default values to the super class
		super("Product Name", 0, 0.0f);

		// since there are no user inputs taken in, initialize the rest of instance
		// variables to a preset value
		this.strSeason = "Season";
		this.bolWrapping = false;

	}

	// getter method for the room for season of the seasonal department item,
	// returns the value as a string
	public String getSeason() {

		// return the season of the seasonal department item as a string
		return (this.strSeason);

	}

	// getter method for the boolean of whether or not this item should be wrapped,
	// returns the value as a boolean
	public boolean getWrapping() {

		// return whether or not the item should be wrapped as a boolean
		return (this.bolWrapping);

	}

	// setter method for the season of the seasonal department item, takes in a user
	// input, and assigns it as the room
	public void setSeason(String ssn) {

		// assign the string that the user entered to the season of the seasonal
		// department item instance
		// variable
		this.strSeason = ssn;

	}

	// setter method for the boolean for whether the seasonal department item should
	// be wrapepd, takes in a user input, and assigns it as the boolean
	public void setWrapping(boolean bol) {

		// assign the boolean that the user entered to the bolWrapping instance variable
		this.bolWrapping = bol;

	}

	// toString method, this allows us to print the instance variables without us
	// getting a line of jumbled code
	public String toString() {

		// return all of the instance variables, both those in the super class, aswell
		// as the instance variables specific to the grocery class
		return ("\nProduct Name: " + this.getProductName() + "\nQuantity: " + this.getQuantity() + "\nPrice: "
				+ ("$" + this.getPrice() + " x " + this.getQuantity()) + "\nProduct Season : " + this.strSeason
				+ "\nWrapping included? : " + this.bolWrapping);

	}

}
