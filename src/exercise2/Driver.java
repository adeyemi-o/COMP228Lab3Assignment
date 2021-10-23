package exercise2;
import java.util.*;
import java.text.NumberFormat;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex2
 * Date: 18th Oct 2021
 */

public class Driver {
	
	//Create a Locale
			static Locale usa = new Locale("en", "US");
			//Create currency instance
			Currency dollars = Currency.getInstance(usa);
			 //Create a formatter given the Locale
			static NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

	public static void main(String[] args) {
		
		String name;
		
		// TODO Auto-generated method stub
		
		// Scanner object
        Scanner input = new Scanner(System.in);
        
        
        //ask user to enter their name
        System.out.print("Enter name: ");        
        name = input.nextLine();
        
        
        // asking user to choose game tester type
        System.out.println("Hello" +" "+ name +", " + "What game tester job type do you want? \n1. Full-time \n2. Part-time ");
        System.out.println();
        System.out.print("Enter your Choice(1 or 2): ");
        
        
        
        int ch = input.nextInt();
        
        // if user selected Full-time game tester
         if(ch == 1)
        {
            
            // creating object of FullTimeGameTester class
            FullTimeGameTester o = new FullTimeGameTester(name, true);
            
            // display the Full-time salary
            System.out.println();
            System.out.println(name + ", " + "\nThe salary of a Full-time Game Tester is: " + dollarFormat.format(o.salary()));
        }
        
        // if user selected Part-time game tester
         else if (ch == 2)
        {
            
            // asking for number of hours in case of part-time tester
            System.out.print("Enter the number of hours part-time game tester worked: ");
            int h = input.nextInt();
            
            // creating object of PartTimeGameTester class
            PartTimeGameTester o = new PartTimeGameTester(name, false, h);
            
            // display the Part-time salary
            System.out.println();
            System.out.println(name + ", " + "\nThe salary of a Part-time Game Tester is: " + dollarFormat.format(o.salary()));
        }


        input.close();

	}

}
