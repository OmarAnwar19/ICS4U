//import all of java.util library
import java.io.*;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first part of try and catch, so we can catch any errors
		try {
			
			//declare an onbject of type bank account
			BankAccount aBankAccount;
			
			//declare an object of type BufferedReader
			BufferedReader in;
			
			//declare variables to store the information coming in from the file
			String strName;
			int intAccount;
			float fltBalance;
			
			//initialize the bufferedreader and connect it to the file
			in = new BufferedReader(new FileReader("myAccount.txt"));
			
			//CAN ALSO PUT IT ALL INTO ONE LINE -->
			// BufferedReader in = new BufferedReader(new FileReader("myAccount.txt"));	
			
			//populate the variable with the information from the file
			
			//grabbing the first line from the file
			strName = in.readLine();
			
			//parsing the next line to an integer
			intAccount = Integer.parseInt(in.readLine());
			
			//parsing the next line to a float
			fltBalance = Float.parseFloat(in.readLine());
			
			//use the constructor to populate the instance variables of the BankAccount class
			aBankAccount = new BankAccount(strName, fltBalance, intAccount);
			
			//close the bufferedreader
			in.close();
			
			//output the object (only for the vibes)
			System.out.println(aBankAccount);
			
			//catch an exception if the file is not found
		} catch (FileNotFoundException ex) {
			
			//output error message no file found
			System.out.println("Error. Could not open file.");
			
			/*
			 * Below is a method of the Java's throwable class which prints the throwable
			 * along with the other details like the line number and the class name where
			 * the exception was thrown
			 */
			ex.printStackTrace();
			
			//catch an exception if the end of the file is reached
		} catch (EOFException ex) {
			
			//output error message end of file
			System.out.println("Error. EOF encountered, file may be corrupted.");
			
			/*
			 * Below is a method of the Java's throwable class which prints the throwable
			 * along with the other details like the line number and the class name where
			 * the exception was thrown
			 */
			ex.printStackTrace();
			
			//catch runtime IO exception
		} catch (IOException ex) {
			
			//output error message end of file
			System.out.println("Error. File can not be opened.");
			
			/*
			 * Below is a method of the Java's throwable class which prints the throwable
			 * along with the other details like the line number and the class name where
			 * the exception was thrown
			 */
			ex.printStackTrace();
			
		}
		
		
	}

}
