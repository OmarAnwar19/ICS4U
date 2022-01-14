//import scanner
import java.util.Scanner;

public class AnwarStudentTestClassArrayOfObjects {
	
    public static void main(String[] args)
    {
        //declare an array of type Student class
        Student[] StudentList;
        
        //declare a variable to store the number of student they want to enter
        //to set the array to that many elements
        short shrNumStudent = 0;
        
        //declare variables to store the users name, and age
        String strName;
        byte bytAge = 0;
        
        //declare boolean variable to loop try and catch block
        boolean bolTryCatch = false;
        
        //loop to prompt for correct value if runtime error occurs
        do
        {
            try
            {
                //prompt the user for the number of student they wish to enter
                System.out.println("How many students would you like to enter?");
                
                //populate the variable
                shrNumStudent = new Scanner(System.in).nextShort();
                
                //set bolTryCatch to false to not loop
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //prompt error message
                System.out.println("Error.  Please enter as a whole number");
                
                //update boTryCatch to true to loop for correct value
                bolTryCatch = true;
            }
        }while(bolTryCatch);
        
        //initialize our array to the specified elements
        StudentList = new Student[shrNumStudent];
        
        //loop through array, and get info from the user to initialize instances of the class
        for(int i = 0; i<shrNumStudent; i++)
        {
            //prompt for student name
            System.out.println("Please enter student " +(i+1) + "'s name");
            
            //populate variable
            strName = new Scanner(System.in).nextLine();
            
            //loop incase an error is thrown
            do
            {
                try
                {
                    //prompt for age
                    System.out.println("Please enter student " + (i+1) + "'s age");
                    
                    //populating age variable
                    bytAge = new Scanner(System.in).nextByte();
                    
                    //set bolTryCatch to false to break loop
                    bolTryCatch = false;
                    
                }
                catch(Exception e)
                {
                    //state error
                    System.out.println("Error.  Please enter age as a whole number");
                    
                    //set bolTryCatch to true to loop for correct input
                    bolTryCatch = true;
                }
            }while(bolTryCatch);
            
            //create an instance of the student class stored in the array by using the constructor
            StudentList[i] = new Student(strName, bytAge);
            
        }
        
        //output my array using a for each loop
        for(Student s: StudentList)
        {
            //output using the toString method in the Student class
            System.out.println(s);
        }
        
        
    }
}