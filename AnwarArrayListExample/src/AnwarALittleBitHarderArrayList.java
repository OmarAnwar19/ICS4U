/**
 * Description: PROGRAM DESCRIPTION HERE 
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER) 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AnwarALittleBitHarderArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intMax = 0, intMin = 1000, intTotal = 0, intAverage = 0;
		
		ArrayList<Integer> listIntegers = new ArrayList<Integer>();
				
		for (int i = 0; i < 10; i++) {
			
			listIntegers.add((int) (Math.random()*999 + 1));
			
		}
		
		for (int i = 0; i < listIntegers.size(); i++) {
			
			if (listIntegers.get(i) > intMax) {
				
				intMax = listIntegers.get(i);
				
			}
			
			if (listIntegers.get(i) < intMin) {
				
				intMin = listIntegers.get(i);
				
			}
		
			intTotal += listIntegers.get(i);
			
		}
		
		intAverage = (intTotal / listIntegers.size());
		
		for (int e: listIntegers) {
			
			System.out.print(e + ", ");
			
		}
		
		System.out.println("\n\nMax: " + intMax);
		System.out.println("Min: " + intMin);
		System.out.println("Average: " + intAverage);

		
	}

}
