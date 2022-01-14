
/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

import java.util.*;

public class AdAgencyArrayList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bolTryCatch = false;

		byte bytQtty = 0;

		List<String> companyName = new ArrayList();

		ArrayList<Integer> contractValue = new ArrayList<Integer>();

		do {

			try {

				System.out.print("How many company names would you like to add?: ");

				bytQtty = new Scanner(System.in).nextByte();
				
				bolTryCatch = false;

			} catch (Exception ex) {

				System.out.println("\nPLEASE ENTER A VALID INPUt\n");

				bolTryCatch = true;

			}

		} while (bolTryCatch);

		for (int i = 0; i < bytQtty; i++) {

			System.out.print("\nPlease enter company name " + (i+1) + ":");
			
			companyName.add(new Scanner(System.in).nextLine());
			
			do {
				
				try {
					
					System.out.print("Please enter contract value " + (i+1) + ": ");
					
					contractValue.add(new Scanner(System.in).nextInt());
					
					bolTryCatch = false;
					
				} catch (Exception ex) {

					System.out.println("\nPLEASE ENTER A VALID INPUT\n");

					bolTryCatch = true;

				}

			} while (bolTryCatch);

		}

		for (String e: companyName) {
			
			System.out.print("\nCompany " + (e+1) + " name: " + e);
			System.out.print("Contract Value: " + (e+1) + ":"  + e);
			
		}
		
	}

}
