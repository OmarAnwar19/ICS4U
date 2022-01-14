public class Home {

	private byte bytNumRoom, bytNumBaths;
	private int intSquareFootage;
	
	Home(byte rmn, byte bnm, int sqf) {
		
		this.bytNumRoom = rmn;
		this.bytNumBaths = bnm;
		this.intSquareFootage = sqf;
				
	}
	
	public String toString() {
		
		return ("\nRooms: " + this.bytNumRoom +
				"\nBaths: " + this.bytNumBaths
				+ "\nSquare ft: " + this.intSquareFootage
				);
		
	}

}
