/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class FastFood extends AnawrRestaurantBill{

	FastFood (float sub) {
		
		super(sub);
		
	}
	
	@Override
	public float calcTotal() {
		
		return((this.getSubTotal() * this.getTaxRate()) + this.getSubTotal());
		
	}
	
}
