
public class TShirt extends Clothing {

	private String strFabric;
	
	TShirt(String size, String colour, String fabric) {
		
		super(size, colour);
		
		this.strFabric = fabric;
		
	}
	
	TShirt() {
		
		super();
		
		this.strFabric = "Default Fabric";
		
	}
	
}
