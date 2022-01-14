/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

public class challengeonemain {

	private static boolean dangerousDescent(int[] elevationArray) {
		
		boolean bolDanger = false;
		
		double dblElevation = 0;
		
		for (int i=0; i < elevationArray.length; i++) {
												
			dblElevation = (((double)((elevationArray[elevationArray.length - (i+1)]) - (elevationArray.length - (i+2))) / 1000) / -1);
											
			if (dblElevation < -0.05) {
				
				bolDanger = true;
				
			}
			
		}
		
		return(bolDanger);
		
	}
	
	private static int longestUphill(int[] elevationArray) {
		
		int intLongest = 0;
		
		for (int i = 0; i < elevationArray.length; i++) {
			
			int intCurrent = 0;
			
			if (i != 5) {
				
				intCurrent = (elevationArray[i] - elevationArray[i+1]);

			} 
			
			if (intCurrent > intLongest) {
				
				intLongest = intCurrent;
				
			}
			
		}
		
		return(intLongest);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] elevationArray = {100, 50, 20, 30, 50, 40};
				
		System.out.println("Dangerous descent?: " + dangerousDescent(elevationArray));
		
		System.out.println("Longest uphill section: " + longestUphill(elevationArray) + "meters");
		
	}

}
