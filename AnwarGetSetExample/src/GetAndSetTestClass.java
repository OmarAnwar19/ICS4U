/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (1/11/2021) 
 */

public class GetAndSetTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student firstStudent = new Student("john", (byte) 42);
		Student secondStudent = new Student();
		
		//setting the second student's info
		secondStudent.setStudentName("Omar Anwar");
		secondStudent.setStudentAge((byte) 16);		

		//outputting the second student's info
		System.out.println(firstStudent);
		System.out.println("Name: " + secondStudent.getStudentName() + "\nAge: " + secondStudent.getStudentAge());
		
	}

}
