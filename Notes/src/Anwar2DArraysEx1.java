/**
 * Description: This program hard codes a 2D Array, and then outputs it
 *
 * @author (Omar Anwar)
 * @version (10/7/2021) 
 */

public class Anwar2DArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring and hard coding a 3x3 array
		byte[][] grid = {
				
				{1 ,2 ,3 ,4},
				{5 ,6 ,7 ,8},
				{9 ,10 ,11 ,12}
				
		};	
					
		// for loop
		for(int i = 0;i<grid.length;i++) {
				
				//tabbing
				for (int j = 0; j < grid[0].length; j++) {
					
					System.out.print(grid[i][j] + "\t");
					
				}
				
				//drop the next row to a new line
				System.out.println();
			}
		
	}

}
