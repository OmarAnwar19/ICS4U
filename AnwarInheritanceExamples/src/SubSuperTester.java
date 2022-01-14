/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class SubSuperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass super1 = new SuperClass("Junya", 10, true);
		SubClass sub1 = new SubClass("Junya", 200, false, 10.0, 'a');
		
		System.out.println(super1);
		System.out.println(sub1);
		
		System.out.println("\n" + super1.count5());
		System.out.println("\n" + sub1.count5());

		
	}

}
