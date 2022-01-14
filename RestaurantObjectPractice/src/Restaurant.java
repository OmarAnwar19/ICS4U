/**
 * Description:
 * 
 * The Restaurant Class
 * 
 * Define a class called Restaurant.java which maintains instance variables
 * representing a restaurant’s name (a string), phoneNumber (a string), rating
 * (an integer representing from 0 to 5 stars), averageMealCost (a float) and
 * whether or not they are openPast11pm (a boolean).
 * 
 * Create a default constructor and one that takes necessary parameters. Save
 * and compile the file.
 *
 * @author (Omar Anwar)
 * @version (10/19/2021)
 */

public class Restaurant {

	// declaring instance variables
	String strRestaurantName, strPhoneNumber;
	int intRating;
	float fltAverageCost;
	boolean bolOpenPast11pm;

	// constructor to assign user input to parameters
	Restaurant(String rnm, String num, int rtg, float act, boolean opn) {

		// assigning the user input to the variables
		this.strRestaurantName = rnm;
		this.strPhoneNumber = num;
		this.intRating = rtg;
		this.fltAverageCost = act;
		this.bolOpenPast11pm = opn;

	}

	// default constructor in case they don't want to enter info
	Restaurant() {

		// assigning default values to the variables
		this.strRestaurantName = "Restaurant";
		this.strPhoneNumber = "1234567890";
		this.intRating = 3;
		this.fltAverageCost = 2.5f;
		this.bolOpenPast11pm = false;

	}

	// add a toString method to output instance variables
	public String toString() {

		// declare a variable for the rating in stars, and call the method for assigning
		// it
		String strStars = getRating(this.intRating);

		// returning the info
		return ("\nInfo for " + this.strRestaurantName + ": " + "\nPhone number: " + this.strPhoneNumber + "\nRating: "
				+ strStars + "\nAverage Meal Cost: $" + this.fltAverageCost + "\nOpen Past 11pm?: "
				+ this.bolOpenPast11pm);

	}

	// method to change number rating to stars
	public static String getRating(int intRating) {

		// declaring variable for rating in stars
		String strRatingStars = null;

		// check what the rating is, and assign stars accordingly
		if (intRating <= 0) {

			strRatingStars = "";

		} else if (intRating == 1) {

			strRatingStars = "*";

		} else if (intRating == 2) {

			strRatingStars = "**";

		} else if (intRating == 3) {

			strRatingStars = "***";

		} else if (intRating == 4) {

			strRatingStars = "****";

		} else if (intRating >= 5) {

			strRatingStars = "*****";

		}

		// return the rating
		return (strRatingStars);

	}

}
