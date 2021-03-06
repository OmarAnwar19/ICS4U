/**
 * Description: child class of the department super class, for the Grocery
 * department, inherits the same instance variables and methods from the parent
 * or super class, and then add the specific instance variables and methods
 * which are needed for the grocery class
 *
 * @author (Omar Anwar)
 * @version (11/18/2021)
 */

//the Grocery class extends the Department class, which means that it inherits methods and variables from it
public class Grocery extends Department {

	// declaring instance variables specific to the grocery class as booleans for
	// whether the grocery is a produce or is a processed food,
	private boolean bolProduce;
	private boolean bolProcessed;

	// first constructor for the Grocery department, takes in the variables for the
	// super class, which are product name,
	// product price, and product quantity, aswell as a boolean for produce, and a
	// boolean for proccessed
	public Grocery(String pnm, int qty, float prc, boolean prd, boolean pcs) {

		// assigning the variables for product name, quantity, and price, to the
		// variables in the department super class
		super(pnm, qty, prc);

		// assigning the rest of the variables to the instance variables specific to the
		// grocery class
		this.bolProduce = prd;
		this.bolProcessed = pcs;

	}

	// overloaded constructor which does not take in quantity, this will be useful
	// for the 4 products which exist
	// by default in each department
	public Grocery(String pnm, float prc, boolean prd, boolean pcs) {

		// assigning the variables for product name, and price, (BUT NOT QUANTITY) to
		// the variables in the department super class
		super(pnm, prc);

		// assigning the rest of the variables to the instance variables specific to the
		// grocery class
		this.bolProduce = prd;
		this.bolProcessed = pcs;

	}

	// default constructor, incase the user does not enter any values
	public Grocery() {

		// passing default values to the super class
		super("Product Name", 0, 0.0f);

		// since there are no user inputs taken in, initialize the rest of instance
		// variables to a preset value
		this.bolProduce = false;
		this.bolProcessed = false;

	}

	// getter method for boolean of whether or not the grocery is produce, returns
	// the value as a boolean
	public boolean getProduce() {

		// return whether or not the grocery is produce as a boolean
		return (this.bolProduce);

	}

	// getter method for boolean of whether or not the grocery is processed, returns
	// the value as a boolean
	public boolean getProcessed() {

		// return whether or not the grocery is processed as a boolean
		return (this.bolProcessed);

	}

	// setter method for room of the produce boolean, takes in a user input, and
	// assigns it to the boolean
	public void setProduce(boolean bol) {

		// assign the user input to the value of true or false of the produce boolean
		this.bolProduce = bol;

	}

	// setter method for room of the processed boolean, takes in a user input, and
	// assigns it to the boolean
	public void setProcessed(boolean bol) {

		// assign the user input to the value of true or false of the processed boolean
		this.bolProcessed = bol;

	}

	// toString method, this allows us to print the instance variables without us
	// getting a line of jumbled code
	public String toString() {

		// return all of the instance variables, both those in the super class, aswell
		// as the instance variables specific to the grocery class
		return ("\nProduct Name: " + this.getProductName() + "\nQuantity: " + this.getQuantity() + "\nPrice: "
				+ ("$" + this.getPrice() + " x " + this.getQuantity()) + "\nProduct is Produce? : " + this.bolProduce
				+ "\nProduct is Proccessed? : " + this.bolProcessed);

	}

}
