
/**
 * Description: 
 * 
Create an ArrayList filled with your favourite songs - prompt the user to populate it!

Then check to see if a specific song was added to the list - output a message if it was, or wasn't present!

Allow the user to remove any songs from the list that they don't like!

Then output the final list of songs
 *
 * @author (Omar Anwar)
 * @version (11/15/2021) 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listSongs = new ArrayList<String>();

		String SENTINEL = "0", strUserInput;

		do {

			System.out.print("Please add a song to the playlist (OR TYPE '0' TO EXIT): ");

			strUserInput = new Scanner(System.in).nextLine();

			listSongs.add(strUserInput);

		} while (!(strUserInput.equals("0")));

		listSongs.remove(listSongs.size() - 1);

		System.out.println("\n--------------------------------\nPLAYLIST \n--------------------------------");

		for (String e : listSongs) {

			System.out.println(e);

		}

	}

}
