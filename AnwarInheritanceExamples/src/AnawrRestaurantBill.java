/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class AnawrRestaurantBill {

	// instance variable
	// assumed tax rate on food, assume tip rate is always 20 percent
	private final float TAX_RATE = 0.05f, TIP_RATE = 0.15f;

	// declare an instance variable to store the sub total
	private float fltSubTotal = 0.0f;

	AnawrRestaurantBill(float sub) {

		this.fltSubTotal = sub;

	}

	AnawrRestaurantBill() {

		this.fltSubTotal = 0.0f;

	}

	public float getTaxRate() {

		return this.TAX_RATE;

	}

	public float getTipRate() {

		return this.TIP_RATE;

	}

	public float getSubTotal() {

		return this.fltSubTotal;

	}
	
	public void setSubTotal(float sub) {
		
		this.fltSubTotal = sub;
		
	}
	
	public float calcTotal() {
		
		return((this.fltSubTotal * this.TAX_RATE) + (this.fltSubTotal * this.TIP_RATE) + this.fltSubTotal);
		
	}

}
