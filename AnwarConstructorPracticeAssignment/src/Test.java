/**
 * Description:

-Write a Student object using the parameters fName, lName, age add two of your own.
	-->Write appropriate constructors, including a default constructor
-Write a Course object using the parameters: roomNum, courseCode, studentsArray
	-->Write appropriate constructors, including a default constructor.
-Save both these objects in the same folder
-Write a test class (public static void main) to test your constructors and attributes - in main

 *
 * @author (Omar Anwar)
 * @version (10/18/2021) 
 */

//importing scanner for user input
import java.util.Scanner;

public class Test {

	public static Student getStudent() {

		// declaring variables
		String strFName, strLName;
		byte bytAge, bytGrade;
		float fltAverage;

		// telling them to enter student info
		System.out.println("\nENTER STUDENT INFO\n");

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter first name: ");
		strFName = new Scanner(System.in).nextLine();

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter last name: ");
		strLName = new Scanner(System.in).nextLine();

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter age: ");
		bytAge = new Scanner(System.in).nextByte();

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter grade: ");
		bytGrade = new Scanner(System.in).nextByte();

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter average: ");
		fltAverage = new Scanner(System.in).nextFloat();

		// taking all of those values, and making a new student
		Student student = new Student(strFName, strLName, bytAge, bytGrade, fltAverage);

		// returning the student
		return (student);
	}

	public static Course getCourse() {

		// declaring variables
		String strCourseCode;
		int bytRoomNumber;
		String[] strStudentsArray = new String[3];

		// telling them to enter course info
		System.out.println("\nENTER course INFO\n");

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter course code: ");
		strCourseCode = new Scanner(System.in).nextLine();

		// asking user for input, and then assigning it to a variable
		System.out.print("Please enter room number: ");
		bytRoomNumber = new Scanner(System.in).nextByte();

		// looping through array and assigning students
		for (int i = 0; i < 3; i++) {

			System.out.print("Please enter student " + i + " first and last name: ");
			strStudentsArray[i] = new Scanner(System.in).nextLine();

		}

		// taking all of those values, and making a new student
		Course course = new Course(strCourseCode, bytRoomNumber, strStudentsArray);

		// returning the student
		return (course);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calling method to get students, and storing them to value
		Student studentA = getStudent(), studentB = getStudent(), studentC = new Student();// last student is default,
																							// so is just calling
																							// default constructor;

		// calling method to get courses, and storing them to value
		Course courseA = getCourse(), courseB = getCourse(), courseC = new Course();

		//straight line for formatting
		System.out.println("--------------------------------");
		
		// outputting the students
		System.out.println("\n" + studentA);
		System.out.println("\n" + studentB);
		System.out.println("\n" + studentC);

		// outputting the courses
		System.out.println("\n" + courseA);
		System.out.println("\n" + courseB);
		System.out.println("\n" + courseC);

	}

}
