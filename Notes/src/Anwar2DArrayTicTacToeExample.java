/**
 * Description: generate a random array of x's, and o's, and output it 
 *
 * @author (Omar Anwar)
 * @version (10/7/2021) 
 */

public class Anwar2DArrayTicTacToeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring an array of 3x3 of characters
		char[][] chrBoard = new char[3][3];
		
		//looping through the rows
		for (int i = 0; i < chrBoard.length; i++) {
			
			//looping through the columns
			for (int j = 0; j < chrBoard.length; j++) {
				
				//making a random variable, either 1 or 2
				byte intTemp = (byte) ((Math.random() * (2)) + 1);
				
				//if it is = 1, then make chrBoard[i][j] = "X"
				if (intTemp == 1) {
					
					//make the element in the array = "X"
					chrBoard[i][j] = 'X';
					
				//if it is = 2, then make chrBoard[i][j] = "O"
				} else if (intTemp == 2) {
					
					//make the element in the array = "O"
					chrBoard[i][j] = 'O';
					
				}
				
				//print the column
				System.out.print(chrBoard[i][j] + "\t");

			}
			
			//go down a row
			System.out.println();
			
		}
		
	}

}
