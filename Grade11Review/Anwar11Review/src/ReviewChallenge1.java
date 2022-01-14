/**
 * Description: Write a code in main that takes a float - price and a String - day 
 * and returns the price depending upon the following: when day is Tuesday the price is discounted by 30% other wise it says the same
 *
 * @Omar Anwar
 * @9/22/21
 */

import java.util.Scanner;

public class ReviewChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring a float value for the user price input, and the total cost
	    float fltPrice = 0, fltTotalCost;
	    
	    //declaring string for the day that the user will enter
	    String strDay = null;
	    
	    //declaring a variable for the scanner
	    Scanner scanner1 = new Scanner(System.in);
	    
	    //first part of try and catch statement
	    try {
	    	
	    //asking user for day input
	    System.out.print("What day is it?: ");
	    
	    //storing the user input to the string
	    strDay = (scanner1.nextLine()).toLowerCase();
	    
	    //asking user for price input
	    System.out.print("\nPlease enter a price: ");
	    
	    //storing the user price to the float for the price
	    fltPrice = scanner1.nextFloat();
	    
	    //second part of try and catch statement
	    } catch (Exception ex) {
	    	
	    	//displaying an error message
	    	System.out.println("\nInvalid input.");
	    	
	    }
	    
	    //checking what day of the week it is
	    if (strDay.equals("tuesday")) {
	    	
	    	//if Tuesday, multiply the price by 70%
	        fltTotalCost = (float)(fltPrice * 0.7);
	        
	        //print to the user the price
	        System.out.println("\nTotal cost: $" + fltTotalCost);
	    	
	    } else {
	    	
	    	//otherwise, keep the price the same
	    	fltTotalCost = fltPrice;
	    	
	    	//print to the user the price
	        System.out.println("\nTotal cost: $" + fltTotalCost);
	    	
	    }
		
	}

}
