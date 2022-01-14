
/**
 * Description:

Create an arraylist of all of your top 6 grade 12 grades
Add all 6 grades to the arraylist
Output the arraylist
Reset the value of one of the elements (your grade improved)
Now output a sorted lists of elements

 *
 * @author (Omar Anwar)
 * @version (11/4/2021) 
 */

import java.util.*;

public class Average {

	private static void getLongest(HashMap<String, Integer> hashGrades) {
		
		String longest = "";

		for (String key : hashGrades.keySet()) {
	      
	    	if (key.length() > longest.length()) {
	    		
			      longest = (key + "-----");
	    		
	    	}
	    	  
	      }
	    
	    for (int i = 0; i < longest.length(); i++) {
			
			System.out.print("-");
			
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intTotal = 0, intAverage = 0, intHashSize = 0;
		
		boolean bolTryCatch = false;

		LinkedHashMap<String, Integer> hashGrades = new LinkedHashMap<String, Integer>();
		
		for (int i = 0; i < 6; i++) {

			String tempStr;
			int tempInt = 0;
			
			System.out.print("\nPlease enter course " + (i+1) + " name: ");
			
			tempStr = new Scanner(System.in).nextLine();
			
			do {

				try {

					System.out.print("Please enter '" + tempStr.toUpperCase() + "' average: (%)");
					
					tempInt = new Scanner(System.in).nextInt();

					intTotal += tempInt;
					
					bolTryCatch = false;
					
				} catch (Exception ex) {

					System.out.println("\nPLEASE ENTER A VALID INPUT\n");
					
					bolTryCatch = true;
					
				}

			} while (bolTryCatch);

			hashGrades.put(("\n| Course: " + tempStr + "\tGrade: %"), tempInt);
			
		}

		intAverage = intTotal / hashGrades.size();

		getLongest(hashGrades);
		
		hashGrades.forEach((k, v) -> System.out.print(k + v));
		
		System.out.println("\n| Average: " + "\t\t " + intAverage);
		
		getLongest(hashGrades);

	}

}
