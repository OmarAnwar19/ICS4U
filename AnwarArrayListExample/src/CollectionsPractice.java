/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */


import java.util.*;

public class CollectionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listFoods = new ArrayList<String>();
		
		//declare and initzialize an array list of type float
		ArrayList<Float> numList = new ArrayList<Float>();
		
		Collections.addAll(numList, 10.5f, 20.8f, 30.10f, 40.20f, 50.60f);
		
		for (Float e: numList) {
			
			int temp = (numList.indexOf(e)) + 1;
			
			System.out.println("Cost " + temp + " : " + e);
			
		}
		
	}

}
