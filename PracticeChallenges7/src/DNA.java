import java.util.Arrays;

/**
 * Description: Consider a program which can evaluate strings of DNA code. DNA
 * code is a String containing only the letters “C”, “T”, “G” or “A”. Write a
 * public method, compareDna, that takes two DNA Strings as parameters and
 * returns true if they are the same, false otherwise.
 * 
 * Consider a program which can evaluate strings of DNA code. DNA code is a
 * String containing only the letters “C”, “T”, “G” or “A”. Write a method
 * intCountPattern, that will take in a DNA sequence dna of any length as well
 * as a pattern pattern, and return an int intCounting the number of times that
 * pattern appears in the dna String. An example, given the dna: “ACACTGACGT”
 * and the pattern: “ACintCount Pattern(dna, pattern) would return 3.
 *
 * @author (Omar Anwar)
 * @version (DATE/VERSION NUMBER)
 */

public class DNA {

	private static boolean compareDNA(String dna1, String dna2) {

		boolean bolDNAEquals = false;

		if (dna1.equals(dna2)) {

			bolDNAEquals = true;

		} else {

			bolDNAEquals = false;

		}

		return (bolDNAEquals);

	}

	private static int intCountPattern(String dna1, String pattern) {

		int intCount = 0;
		int intIndex = 0;

		String[] splitString = dna1.split("");

		while ((intIndex = dna1.indexOf(pattern, intIndex)) != -1) {

			intCount++;
			intIndex++;

		}

		return (intCount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strDNA1 = "CTGA";
		String strDNA2 = "CTGT";
		String strDNA3 = "ACACACACACACACACACAC";
		String strPattern = "ACAC";

		System.out.println("DNA1, and DNA2 equal?: " + compareDNA(strDNA1, strDNA2));
		System.out.println("Instances of pattern in strDNA3: " + intCountPattern(strDNA3, strPattern));

	}

}
