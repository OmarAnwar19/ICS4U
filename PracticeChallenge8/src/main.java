
/**
 * Description: 
Create a ArrayList (in the test class) called classList that adds a student to the classList whenever a new Student is created.

Output the classList, and ask the user if the information is correct.  If not, allow them to edit when needs to be changed
 *
 * @author (Omar Anwar)
 * @version (11/17/2021) 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static ArrayList<Student> editInfo(ArrayList<Student> classList) {
		
		boolean bolTC = false;
		byte bytStudentSelect = 0, bytToEdit = 0, bytGrade = 0;
		String strStudentName = null, strUserResponse = null;

			do {

				System.out.print("\nWould you like to edit a student? (yes/no): ");
				strUserResponse = new Scanner(System.in).nextLine();
				
				if (strUserResponse.equalsIgnoreCase("yes")) {

					do {
						
						System.out.print("\nWhich student would you like to edit? (0-" + (classList.size() - 1) + "): ");

						bytStudentSelect = new Scanner(System.in).nextByte();

						if (bytStudentSelect <= classList.size() && bytStudentSelect >= 0) {
							
							do {
								
								System.out.println("\nWhat would you like to edit? \n(1. Student Name)\n(2. Student Grade)");
								System.out.print(">>");
								
								bytToEdit = new Scanner(System.in).nextByte();

								if (bytStudentSelect == 1) {
									
									System.out.println("\nPlease enter new student name: ");
									strStudentName = new Scanner(System.in).nextLine();
									
									classList.get(bytStudentSelect).setName(strStudentName);
									
								} else if (bytStudentSelect == 2) {
									
									do {

										try {

											System.out.print("\nPlease enter new student grade: ");
											bytGrade = new Scanner(System.in).nextByte();

											classList.get(bytStudentSelect).setGrade(bytGrade);
											
											bolTC = false;
											
										} catch (Exception ex) {

											System.out.println("\nPLEASE ENTER A VALID INPUT\n");

											bolTC = true;

										}

									} while (bolTC);
								
								} else {

									System.out.println("\nPLEASE ENTER A VALID STUDENT.\n");

									bolTC = true;

								}

							} while (bolTC);
							
						} else {

							System.out.println("\nPLEASE ENTER A VALID STUDENT.\n");

							bolTC = true;

						}

					} while (bolTC);
					
				} else if (strUserResponse.equalsIgnoreCase("no")) {

					System.out.println("\nEXITING PROGRAM\n");

				} else {

					System.out.println("\nPLEASE ENTER YES OR NO.");

					bolTC = true;

				}

			} while (bolTC);
		
		return(classList);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bolTC = false;
		String strUserResponse, strSName = null;
		byte bytGrade = 0;

		ArrayList<Student> classList = new ArrayList<Student>();

		do {

			do {

				System.out.print("\nWould you like to add a student to the class list? (yes/no): ");

				strUserResponse = new Scanner(System.in).nextLine().toLowerCase();

				if (strUserResponse.equalsIgnoreCase("yes")) {

					System.out.print("\nPlease enter student name: ");
					strSName = new Scanner(System.in).nextLine().toUpperCase();

					do {

						try {

							System.out.print("Please enter student grade: ");
							bytGrade = new Scanner(System.in).nextByte();

							bolTC = false;

						} catch (Exception ex) {

							System.out.println("\nPLEASE ENTER A VALID INPUT\n");

							bolTC = true;

						}

					} while (bolTC);

					// listPerson.add(new Person(strFirstName, strLastName, shrHeightCM, bytAge));

				} else if (strUserResponse.equalsIgnoreCase("no")) {

					System.out.println("\nEXITING PROGRAM\n");

				} else {

					System.out.println("\nPLEASE ENTER YES OR NO.");

					bolTC = true;

				}

			} while (bolTC);
			
			classList.add(new Student(strSName, bytGrade));

		} while (strUserResponse.equalsIgnoreCase("yes"));;
		
		System.out.println("\n----------------------------------------\n");
		
		do {
			
			for (Student e: classList) {

				System.out.println(e + "\n----------------------------------------\n");

			}

			System.out.print("\nIs this information correct?: ");

			strUserResponse = new Scanner(System.in).nextLine().toLowerCase();

			if (strUserResponse.equalsIgnoreCase("yes")) {
				
				bolTC = false;
				
			} else if (strUserResponse.equalsIgnoreCase("no")) {

				editInfo(classList);
				
			} else {

				System.out.println("\nPLEASE ENTER YES OR NO.\n");

				bolTC = true;

			}

		} while (bolTC);
		
	}

}
