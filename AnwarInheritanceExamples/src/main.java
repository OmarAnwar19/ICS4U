/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class main {

	public static void main (String[] args) {
		
		AnawrRestaurantBill rb = new AnawrRestaurantBill(12);
		FastFood rb2 = new FastFood (12);
		AnawrRestaurantBill rb3 = new FastFood(12);
		
		System.out.println("Normal: " + rb.calcTotal());
		System.out.println("Normal 2: " + rb3.calcTotal());
		System.out.println("Fast Food: " + rb2.calcTotal());

		
	}
	
}
