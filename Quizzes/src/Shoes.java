import java.util.Scanner;

public class Shoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strType, strColour;

		ShoesClass[] ShoeList = new ShoesClass[5];

		for (int i = 0; i < ShoeList.length; i++) {

			System.out.println("Please enter shoe type: ");

			strType = new Scanner(System.in).nextLine();

			System.out.println("Please enter shoe colour: ");

			strColour = new Scanner(System.in).nextLine();

			ShoeList[i] = new ShoesClass(strType, strColour);
			
		}

		ShoeList[2].setShoeColour("blue");
		
		System.out.println("colour" + ShoeList[1].getShoeType());
		
		for (ShoesClass e: ShoeList) {
			
			System.out.println(e);
			
		}
		
		
		
	}

}
