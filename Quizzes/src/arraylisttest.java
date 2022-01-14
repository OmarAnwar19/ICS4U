import java.util.ArrayList;
import java.util.Collections;

public class arraylisttest {

	public static void qnrightnine() {

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(9);
		array.add(10);
		array.remove(1);
		array.set(0, 3);
		int num = array.get(1);
		System.out.println(num);

	}

	public static void qten() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Michael");
		names.add("Lebron");
		names.add("Serena");
		names.add("Shaq");
		String firstName = names.remove(0);
		String secondName = names.set(0, "Venus");
		names.add(2, firstName);
		System.out.println("Names: " + secondName + " and " + names.get(1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		list.add("cat");
		list.add(5);
		list.add(6.6f);
		
		int intTotal = ((int) list.get(1)) + 5;
		float fltTotal = (int) list.get(1) + (float) list.get(2);
		
		System.out.println(fltTotal);
	}

}
