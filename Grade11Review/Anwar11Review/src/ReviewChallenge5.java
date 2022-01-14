/**
 * Description: Write a method discountTues that takes a float - price and a String - day and returns the price depending upon
 *  the following: when day is Tuesday the price is discounted by 30% other wise it says the same
 *
 * @author (Omar Anwar)
 * @version (9/24/21) 
 */

//importing all java utils
import java.util.*;

public class ReviewChallenge5 {

	//method to check if a tuesday discount is apilicable
	public static void checkDiscount() {
		
		//declaring variable for the price
		float fltPrice = 0.0f;
		
		//declaring the discount rate
		final float fltDsct = 0.7f;
		
		//declaring variable for the day
		String strDay;
		
		//asking user to enter price
		System.out.print("Please enter price: ");
		
		//storing the value to a variable
		fltPrice = new Scanner(System.in).nextFloat();
		
		//asking user for the day
		System.out.print("Please enter the day: ");
		
		//storing the input to a variable
		strDay = new Scanner(System.in).nextLine();
	
		//checking if the day is tuesday, and applying discount subsequently
		if (strDay.equalsIgnoreCase("tuesday")) {
			
			//apply the discount and output to console
			System.out.println("\nTuesday discount applied. \nNew price: $" + (fltPrice * fltDsct));
		
		//if not tuesday, output same price
		} else {
			
			//output the old price, with a messag explaining why
			System.out.println("\nNo discount applied. \nNew Price: $" + fltPrice);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling method to check if a tuesday discount is valid
		checkDiscount();
		
	}

}
