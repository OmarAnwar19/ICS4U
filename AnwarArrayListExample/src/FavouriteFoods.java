/**
 * Description: 
 * 
Create a arraylist of your favourite foods
Add at least 10 items to the arraylist
Then output the arraylist alphabetically 

 *
 * @author (Omar Anwar)
 * @version (11/4/2021) 
 */


import java.util.*;

public class FavouriteFoods {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listFoods = new ArrayList<String>();
		
		//declare and initzialize an array list of type float
		Collections.addAll(listFoods, "chocolate", "ice cream", "pasta", "pizza", "donughts", "hamborga", "sauce", "apples", "oranges", "dogs");
		
		Collections.sort(listFoods);
		
		for (String e: listFoods) {
			
			int temp = (listFoods.indexOf(e)) + 1;
			
			System.out.println("FOOD " + temp + " : " + e);
			
		}
		
	}

}
