/**
 * Description: 
You have a record store- create an object called Album that stores title, name of artist, genre, and year of release

Assume that you need to add all your records into this list - populate the arraylist with at least 5 albums

Then output the arraylist

Now... you want to find all albums that are genre: POP... code this... and output how many, and the album title :)

 * @author (Omar Anwar)
 * @version (11/15/2021) 
 */


import java.util.*;

public class main {

	public static void main (String args[]) {
		
		int intPopAlbums = 0;
		
		ArrayList<Album> listAlbums = new ArrayList<Album>();
		
		LinkedHashMap<String, String> hashPopAlbums = new LinkedHashMap<String, String>();
		
		listAlbums.add(new Album("MBDTF", "Kanye West", "RNB", 2012));
		listAlbums.add(new Album("An Evening With Silk Sonic", "Silk Sonic", "POP", 2021));
		listAlbums.add(new Album("LIVE.LOVE.A$AP", "ASAP Rocky", "RAP", 2011));
		listAlbums.add(new Album("Man on the Moon", "Kid Cudi", "ALT HIP HOP", 2009));
		listAlbums.add(new Album("Faces", "Mac Miller", "POP", 2014));
				
		for (Album e: listAlbums) {
			
			if (e.getAlbumGenre().equals("POP")) {
				
				intPopAlbums += 1;
				
				hashPopAlbums.put(e.getAlbumTitle(), ("\tNUMBER: " + intPopAlbums));
				
			}
			
		}
		
		System.out.println("NUMBER OF POP ALBUMS: " + intPopAlbums);
		
		hashPopAlbums.forEach((k, v) -> System.out.println(k + v));
		
	}
	
}
