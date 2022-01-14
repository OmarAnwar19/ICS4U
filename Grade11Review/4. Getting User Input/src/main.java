import javax.swing.JOptionPane;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intFavNum, intUserAge, intUserAgeMin, intTArea, intRArea, intRPerim;
		String strName, strTBase, strTHeight, strRWidth, strRBase;

		Scanner scanner1 = new Scanner(System.in);
		
		//favourite number
		System.out.print("Please enter your favourite number: ");
		
		intFavNum = scanner1.nextInt();
		
		System.out.println("You're number " + intFavNum + " ranked epic gamer in the world.");
		
		//age to minutes
		System.out.print("\nPlease enter your age: ");
		
		intUserAge = scanner1.nextInt();
		intUserAgeMin = (intUserAge * 525600);
		
		System.out.println("You are " + intUserAge + " years old, or " + intUserAgeMin + " minutes old.");
						
		//name message
		strName = JOptionPane.showInputDialog(null, "Please enter your name: ", "INPUT", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hello " + strName + "!", "INPUT", JOptionPane.WARNING_MESSAGE);
		
		//triangle area
		strTBase = JOptionPane.showInputDialog(null, "Please enter triangle base: ", "INPUT", JOptionPane.QUESTION_MESSAGE);
		strTHeight = JOptionPane.showInputDialog(null, "Please enter triangle height: ", "INPUT", JOptionPane.QUESTION_MESSAGE);
		intTArea = (((Integer.parseInt(strTBase)) * (Integer.parseInt(strTHeight))) / 2);
		
		JOptionPane.showMessageDialog(null, "Area of triangle with base: " + strTBase + ", and height: " + strTHeight + ", is: " + intTArea, "INPUT", JOptionPane.WARNING_MESSAGE);
		
		//rectangle area and perim.
		strRBase = JOptionPane.showInputDialog(null, "Please enter rectangle base: ", "INPUT", JOptionPane.QUESTION_MESSAGE);
		strRWidth = JOptionPane.showInputDialog(null, "Please enter rectangle height: ", "INPUT", JOptionPane.QUESTION_MESSAGE);
		
		intRArea = ((Integer.parseInt(strRBase)) * (Integer.parseInt(strRWidth)));
		intRPerim = ((Integer.parseInt(strRBase)) * 2) + ((Integer.parseInt(strRWidth)) * 2);

		JOptionPane.showMessageDialog(null, "Area of rectangle with base: " + strRBase + ", and height: " + strRWidth + ", is: " + intRArea, "INPUT", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perimeters of rectangle with base: " + strRBase + ", and height: " + strRWidth + ", is: " + intRPerim, "INPUT", JOptionPane.WARNING_MESSAGE);

		scanner1.close();
		
	}

}

