import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class CarInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bolTryCatch = false;

		byte bytQtty = 0;

		ArrayList<Car> inventoryList = new ArrayList<Car>();
		
		do {

			try {

				System.out.print("How many cars would you like to add?: ");

				bytQtty = new Scanner(System.in).nextByte();

				bolTryCatch = false;

			} catch (Exception ex) {

				System.out.println("\nPLEASE ENTER A VALID INPUt\n");

				bolTryCatch = true;

			}

		} while (bolTryCatch);

		for (int i = 0; i < bytQtty; i++) {

			String tempString1, tempString2, tempString3;
			float tempFloat = 0;

			System.out.print("\nPlease enter car make " + (i + 1) + ": ");

			tempString1 = new Scanner(System.in).nextLine();

			System.out.print("Please enter car brand " + (i + 1) + ": ");

			tempString2 = new Scanner(System.in).nextLine();

			System.out.print("Please enter car colour " + (i + 1) + ": ");

			tempString3 = new Scanner(System.in).nextLine();

			do {

				try {

					System.out.print("Please enter car cost " + (i + 1) + ": ");

					tempFloat = new Scanner(System.in).nextFloat();

					bolTryCatch = false;

				} catch (Exception ex) {

					System.out.println("\nPLEASE ENTER A VALID INPUT\n");

					bolTryCatch = true;

				}

			} while (bolTryCatch);

			inventoryList.add(new Car(tempString1, tempString2, tempString3, tempFloat));
			
		}

		for (Car e: inventoryList) {
			
			System.out.println(e);
			
		}
		
	}

}
