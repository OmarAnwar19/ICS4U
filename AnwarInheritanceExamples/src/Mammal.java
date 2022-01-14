/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class Mammal extends Animal{

	private boolean bolEatsMeat, bolHibernate;
	private String strLandOrWater;
	
	Mammal(String nme, String loc, int lgs, int mvf, boolean emt, boolean hib, String low) {
		
		super(nme, loc, lgs, mvf);
		
		this.bolEatsMeat = emt;
		this.bolHibernate = hib;
		this.strLandOrWater = low;
		
	}
	
	Mammal() {
		
		super(null, null, 0, 0);
		
		this.bolEatsMeat = false;
		this.bolHibernate = false;
		this.strLandOrWater = null;
		
	}
	
}
