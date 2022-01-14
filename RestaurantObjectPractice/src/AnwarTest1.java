/**
 * Description:
 * 
 * The Restaurant Test Program Part I (Test Class - Public static void)
 * 
 * Use the code below (named with your fName) to test your new class.
 * 
 * However, the testing code is incomplete.
 * 
 * Please complete the testing code according to the directions given.
 * 
 * Make sure that your test code compiles runs and produces the correct output.
 * Hand this test code in with your assignment. Keep in mind- if working online
 * this will be class Main{
 *
 * 
 * @author (Omar Anwar)
 * @version (10/19/2021)
 */

public class AnwarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring variable for average of both restaurants
		float fltCombinedAvg;

		// declaring the restaurant objects
		Restaurant jimWaffle = new Restaurant("Jim's Waffle House", "1-(613)555-5555", 3, 7.82f, false);
		Restaurant bobBurrito = new Restaurant("Bob's Burritos", "1-(613)555-5556", 1, 5.63f, true);

		// declaring the addres objects
		Address jimAddy = new Address("123 Hill Street", "Ottawa", "Ontario", "Canada", "H0H 0H0");
		Address bobAddy = new Address("456 Skill Street", "Nanimo", "British Colombia", "Kanata", "0H0 H0H");

		// outputting info for jim's waffle house
		System.out.println("\nRESTAURANT INFO; \n" + jimWaffle.strRestaurantName + ": ");
		System.out.println(jimWaffle);// printing the object

		// printing the address
		System.out.println("\nADDRESS: ");
		System.out.println(jimAddy);

		// outputting the info for bob's burittos
		System.out.println("\nRESTAURANT INFO; \n" + bobBurrito.strRestaurantName + ": ");
		System.out.println(bobBurrito);// printing the object

		// printing the address
		System.out.println("\nADDRESS: ");
		System.out.println(bobAddy);

		// changing the code for bob's burritos
		bobBurrito.strRestaurantName = "Bob's Mexican Adventure";
		bobBurrito.intRating = 2;
		bobBurrito.fltAverageCost = 5.98f;

		// outputting the new info for bob's burittos
		System.out.println("\nNEW RESTAURANT INFO; \n" + bobBurrito.strRestaurantName + ": ");
		System.out.println(bobBurrito);// printing the object

		// Complete the line below so that it COMPUTES the combined average
		fltCombinedAvg = (float) ((jimWaffle.fltAverageCost + bobBurrito.fltAverageCost) / 2);

		// outputting average of both restaurants
		System.out.println("\nCOMBINED AVERAGE: $" + fltCombinedAvg);

		// output format message
		System.out.println("\nOPEN LATE?: ");

		// check if the restaurants are both open late
		if (jimWaffle.bolOpenPast11pm == true && bobBurrito.bolOpenPast11pm == true) {

			// if both the booleans for open late are true, then this is equal to true, and
			// output the following message
			System.out.println("Both Open Late");

			// otherwise, if both of them are not open late, output the following
		} else if (jimWaffle.bolOpenPast11pm == false && bobBurrito.bolOpenPast11pm == false) {

			// if both the booleans for open late are false, then output the following
			// message
			System.out.println("Both closed early.");

			// if not both are open or closed, then output a mixed message
		} else {

			// otherwise, if it is a combination, output the following
			System.out.println("Mixed");

		}

	}

}
