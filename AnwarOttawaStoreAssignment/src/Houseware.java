/**
 * Description: child class of the department super class, for the Houseware
 * department, inherits the same instance variables and methods from the parent
 * or super class, and then add the specific instance variables and methods
 * which are needed for the houseware class
 *
 * @author (Omar Anwar)
 * @version (11/18/2021)
 */

//the Houseware class extends the Department class, which means that it inherits methods and variables from it
public class Houseware extends Department {

	// declaring the instance variables specific to the Houseware class, a String
	// for which room the houseware is for, and
	// a boolean for whether or not it is a gift
	private String strRoomInHouse;
	private boolean bolGift;

	// first constructor for the Houseware department, takes in the variables for
	// the super class, which are product name, product price, and product quantity,
	// aswell as a string for which room the houseware is for, and the boolean for
	// whether or not it is a gift
	public Houseware(String pnm, int qty, float prc, String rih, boolean bol) {

		// assigning the variables for product name, quantity, and price, to the
		// variables in the department super class
		super(pnm, qty, prc);

		// assigning the rest of the variables to the instance variables specific to the
		// houseware class
		this.strRoomInHouse = rih;
		this.bolGift = bol;

	}

	// overloaded constructor which does not take in quantity, this will be useful
	// for the 4 products which exist by default in each department
	public Houseware(String pnm, float prc, String rih, boolean bol) {

		// assigning the variables for product name, and price, (BUT NOT QUANTITY) to
		// the variables in the department super class
		super(pnm, prc);

		// assigning the rest of the variables to the instance variables specific to the
		// houseware class
		this.strRoomInHouse = rih;
		this.bolGift = bol;

	}

	// default constructor, incase the user does not enter any values
	public Houseware() {

		// passing default values to the super class
		super("Product Name", 0, 0.0f);

		// since there are no user inputs taken in, initialize the rest of instance
		// variables to a preset value
		this.strRoomInHouse = "Room in House";
		this.bolGift = false;

	}

	// getter method for the room for the houseware, returns the value as a string
	public String getRoom() {

		// return the room for the houseware as a string
		return (this.strRoomInHouse);

	}

	// getter method for the boolean of whether or not this is a gift, returns the
	// value as a boolean
	public boolean getGift() {

		// return whether or not the houseware is a gift as a boolean
		return (this.bolGift);

	}

	// setter method for room of the houseware, takes in a user input, and assigns
	// it as the room
	public void setRoom(String rih) {

		// assign the string that the user entered to the room in house instance
		// variable
		this.strRoomInHouse = rih;

	}

	// setter method for the boolean for whether the houseware is a gift, takes in a
	// user input, and assigns it as the boolean
	public void setGift(boolean bol) {

		// assign the boolean that the user entered to the bolGift instance variable
		this.bolGift = bol;

	}

	// toString method, this allows us to print the instance variables without us
	// getting a line of jumbled code
	public String toString() {

		// return all of the instance variables, both those in the super class, aswell
		// as the instance variables specific to the grocery class
		return ("\nProduct Name: " + this.getProductName() + "\nQuantity: " + this.getQuantity() + "\nPrice: "
				+ ("$" + this.getPrice() + " x " + this.getQuantity()) + "\nProduct Room in House: "
				+ this.strRoomInHouse + "\nProduct is a Gift? : " + this.bolGift);

	}

}
