/* Description: This program will loop thorugh four items and add a subtotal and then send the subtotal
 * into a method to calculate the tax on said subtotal.
 * 
 * @authour (Omar Anwar)
 * @version (9/23/21)
 */

//importing scanner for user input
import java.util.Scanner;

public class AnwarTaxMethodPractice {

	//method to calculate the tax applied onto the subtotal
	public static float getTax(float subTotal) {
		
		final float TAX_RATE = 1.13f;
		
		//declaring a variable for the taxed total
		float fltTotalWithTax = 0.0f;
		
		//multiplying the initial subTotal, by 13% tax, and storing it to the taxed total variable
		fltTotalWithTax = (float) (subTotal * TAX_RATE);
		
		//returning the subtotal after tax
		return(fltTotalWithTax);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring a float to store subtotal of items, and the taxed price
		float fltSubTotal = 0.0f, fltTotalWithTax = 0.0f;

		// declaring a scanner object cause its easier
		Scanner scanner1 = new Scanner(System.in);

		// declaring a boolean for the looped try and catch statement in order to check
		// if user input is valid
		boolean bolTryCatch = true;

		// looping to get the different user inputs
		for (int i = 0; i < 4; i++) {

			// first part of do while loop
			do {

				// try the following
				try {

					// prompting user for input
					System.out.print("\nPlease enter price of item " + (i + 1) + ": ($)");

					// adding the price to the subtotal
					fltSubTotal += new Scanner(System.in).nextFloat();
					
					// if all good, then exit
					break;

					// second part of try and catch to check if there are any errors
				} catch (Exception ex) {

					System.out.println("\nPlease enter a valid price.");

					//make the boolean for invalid input = true, and re-loop the code
					bolTryCatch = true;

				}
				
			// do all of the above code while the boolean for valid input = true
			} while (bolTryCatch);

		}

		//calling the method to calculate tax, and storing that to a variable
		fltTotalWithTax = getTax(fltSubTotal);
		
		//displaying the initial and new taxed total to the user.
		System.out.println("\n------------------------");
		System.out.println("Initial subtotal: $" + fltSubTotal);
		System.out.println("Taxed subtotal: $" + fltTotalWithTax);
		
	}

}
