/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class SubClass extends SuperClass{

	private double dblAttribute;
	private char chrAttribute;
	
	SubClass(String str, int int1, boolean bol, double dbl, char chr) {
		
		super(str, int1, bol);
		
		this.dblAttribute = dbl;
		this.chrAttribute = chr;
		
	}
	
	
	SubClass() {
		
		super();

		this.dblAttribute = 0;
		this.chrAttribute = 'n';
		
	}
	
	@Override
	public boolean count5() {
		
		System.out.println(super.count5());
		
		int temp = 0;
		
		for (int i = 0; i < this.getString().length(); i++) { 
			
			temp += 1;
			
		}
		
		if (temp >= 5) {
			
			return(false);
			
		} else {
			
			return(true);
			
		}
		
	}
	
}
