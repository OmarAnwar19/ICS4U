/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class Car {

	private String strCarMake, strCarBrand, strCarColour;
	private float fltCarCost;

	Car(String mke, String brd, String clr, float ccs) {

		this.strCarMake = mke;
		this.strCarBrand = brd;
		this.strCarColour = clr;
		this.fltCarCost = ccs;

	}

	Car() {

		this.strCarMake = "Make";
		this.strCarBrand = "Brand";
		this.strCarColour = "Colour";
		this.fltCarCost = 00.00f;

	}
	
	public String toString() {
		
		return("\n\nCAR: \nMake: " + this.strCarMake + "\nBrand: " + this.strCarBrand + "\nColour: " + this.strCarColour + "\nCost: " + this.fltCarCost);
		
	}
	
}
