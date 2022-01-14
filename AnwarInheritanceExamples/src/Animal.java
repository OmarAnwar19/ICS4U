/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class Animal {

	//declare instance variables
	private String strAnimalName, strLocation;
	private int intNumLegs;
	private int intMoveFactor;
	
	Animal (String nme, String loc, int lgs, int mvf) {
		
		this.strAnimalName = nme;
		this.strLocation = loc;
		this.intNumLegs = lgs;
		this.intMoveFactor = mvf;
		
	}
	
	Animal() {
		
		this.strAnimalName = null;
		this.strLocation = null;
		this.intNumLegs = 0;
		this.intMoveFactor = 0;
		
	}
	
}
