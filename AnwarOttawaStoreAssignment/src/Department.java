/**
 * Description: This is the super class for the rest of the departments, the
 * super class is the one which holds common variables and methods which are
 * shared by all departments, here, we hold the product name, product quantity,
 * product price, and the getters and setters for all of them. This is because
 * these attributes are shared by all members of the department store
 *
 * @author (Omar Anwar)
 * @version (11/18/2021)
 */

public class Department {

	// declaring instance variables, for the product name, product quantity, and
	// product price
	private String strProductName;
	private int intQuantity;
	private float fltPrice;
	private float fltSubPrice;

	// first constructor for the department, takes in product name, quantity, and
	// price
	public Department(String pnm, int qty, float prc) {

		// initializing the instance variables using the user inputs
		this.strProductName = pnm;
		this.intQuantity = qty;
		this.fltPrice = prc;

	}

	// overloaded constructor which does not take in quantity, this will be useful
	// for the 4 products which exist
	// by default in each department
	public Department(String pnm, float prc) {

		// initializing the instance variables using the user inputs
		this.strProductName = pnm;
		this.fltPrice = prc;

	}

	// default constructor, incase the user does not enter any values
	public Department() {

		// since there are no user inputs taken in, initialize the instance variables to
		// a preset value
		this.strProductName = "Product Name";
		this.intQuantity = 0;
		this.fltPrice = 0.0f;

	}

	// getter method for the product name, returns the product name as a string
	public String getProductName() {

		// return the product name as a string
		return (this.strProductName);

	}

	// getter method for the product quantity, returns the product quantity as a
	// integer
	public int getQuantity() {

		// return the product quantity as an integer
		return (this.intQuantity);

	}

	// getter method for the product price, returns the product price as a float
	public float getPrice() {

		// return the product price as a concatenated string with the price as a float,
		// and a dollar sign
		return (this.fltPrice);

	}

	// setter method for the product name, takes in a user input, and assigns it as
	// the product name
	public void setProductName(String pnm) {

		// assign the string that the user entered to the product name instance variable
		this.strProductName = pnm;

	}

	// setter method for the product quantity, takes in a user input, and assigns it
	// as the product quantity
	public void setQuantity(int qty) {

		// assign the integer that the user entered to the product quantity instance
		// variable
		this.intQuantity = qty;

	}

	// setter method for the product price, takes in a user input, and assigns it as
	// the product price
	public void setPrice(float prc) {

		// assign the float that the user entered to the product price instance variable
		this.fltPrice = prc;

	}

	// method for getting the sub total, which is the price x the quantity
	public float getSubTotal() {

		// doing the calcualation for the price
		fltSubPrice = (float) ((this.getPrice() * this.getQuantity()));

		// returtning the value
		return (fltSubPrice);

	}

}
