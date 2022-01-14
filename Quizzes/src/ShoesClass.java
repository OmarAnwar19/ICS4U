/**
 * Description: PROGRAM DESCRIPTION HERE
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class ShoesClass {

	private String shoeColour, shoeType;

	public ShoesClass(String scl, String sty) {

		this.shoeColour = scl;
		this.shoeType = sty;

	}

	public String getShoeType() {

		return (this.shoeType);

	}

	public void setShoeColour(String colour) {

		this.shoeColour = colour;

	}

	public String toString() {

		return ("Shoe Type: " + this.shoeType + "\nShoe Colour: " + this.shoeColour);

	}

}
