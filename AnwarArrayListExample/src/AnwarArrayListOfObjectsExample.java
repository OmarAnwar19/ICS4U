import java.util.*;

public class AnwarArrayListOfObjectsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFirstName = null, strLastName = null, strUserResponse = null;
		short shrHeightCM = 0;
		byte bytAge = 0;
		boolean bolTC = false;

		ArrayList<Person> listPerson = new ArrayList<Person>();
		
		do {

			do {
				
				System.out.print("\nWould you like to add person to your list? (yes / no): ");

				strUserResponse = new Scanner(System.in).nextLine().toLowerCase();
				
				if (strUserResponse.equalsIgnoreCase("yes")) {
					
					System.out.print("\nPlease enter first name: ");
					strFirstName = new Scanner(System.in).nextLine();
					
					System.out.print("Please enter last name: ");
					strLastName = new Scanner(System.in).nextLine();
					
					do {
						
						try {

							System.out.print("Please enter height (cm): ");
							shrHeightCM = new Scanner(System.in).nextShort();

							bolTC = false;
							
						} catch (Exception ex) {

							System.out.println("\nPLEASE ENTER A VALID INPUT\n");
							
							bolTC = true;

						}
											
					} while (bolTC);

					do {
						
						try {

							System.out.print("Please enter age (yrs): ");
							bytAge = new Scanner(System.in).nextByte();

							bolTC = false;
							
						} catch (Exception ex) {

							System.out.println("\nPLEASE ENTER A VALID INPUT\n");
							
							bolTC = true;

						}
						
					} while (bolTC);
					
					listPerson.add(new Person(strFirstName, strLastName, shrHeightCM, bytAge));

					
					
				} else if (strUserResponse.equalsIgnoreCase("no")) {
					
					System.out.println("\nEXITING PROGRAM\n");
					
				} else {
					
					System.out.println("\nPLEASE ENTER YES OR NO.");
					
					bolTC = true;
					
				}
				
			} while (bolTC);


		} while (strUserResponse.equalsIgnoreCase("yes"));

		System.out.println("-----------------------------------------");
		
		for (Person person: listPerson) {
			
			System.out.println(person);
			
		}
		
	}

}
