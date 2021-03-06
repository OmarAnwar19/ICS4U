/**
 * Description: Write a method ->groceryList that asks users for the groceries they need and saves them.
 * Reach ahead!!!!! When the user is finished they should enter ?done?.
 *
 * @author (Omar Anwar)
 * @version (D9/24/21) 
 */

//importing java utils
import java.util.*;

public class ReviewChallenge4 {

	// the method for getting the grocery list and saving it
	public static String[] groceryList() {

		// declaring the scanner for user input
		Scanner scanner1 = new Scanner(System.in);

		//declaring boolean for the loop
		boolean bolCheck = true;
		
		//declaring temporary counter
		int i = 0;
		
		//declaring an array to save items to
		String[] strGroceryList = new String[999];
		
		// outputting for formatting
		System.out.println("--------------------------------");
		System.out.println("Grocery List: ");
		System.out.println("--------------------------------");

		//do while loop to keep adding items till user is done
		do {

			// declaring a temporary variable for user input
			String strTempIn;
			
			//asking user for item on list
			System.out.print("Item " + (i + 1) + ": ");

			//getting user input
			strTempIn = scanner1.nextLine().toUpperCase();
			
			//checking if the user is done
			if (!strTempIn.equals("DONE")) {
				
				//if not, add the value to the array
				strGroceryList[i] = strTempIn;
				
				//keeping loop going
				bolCheck = true;
			
			//if they are
			} else {
				
				//output this line to indicate being done
				System.out.println("--------------------------------");
				
				//breaking loop
				break;
				
			}
			
			//incrementing the counter
			i++;

		} while (bolCheck);
		
		//return the array
		return (strGroceryList);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calling method for the grocery list
		String[] strGroceryList = groceryList();

		//outputting saved array
		System.out.println("\n" + Arrays.toString(strGroceryList));
		
	}

}
