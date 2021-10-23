package exercise3;
import java.util.*;


/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex3
 * Date: 20th Oct 2021
 */

public class ProcessMortgage {
	
	public static void main(String[] args) {
		
		 Mortgage mortgages[] = new Mortgage[3];

        

        double interestRate;

        int mortgageNumber;

        String customerName;

        double mortgageAmount;

        int term;

        String mortgageType;

        Scanner scan = new Scanner(System.in);

       
        System.out.println(" CITYTORONTO BANK MORTGAGE SYSTEM");
        System.out.println(" -------------------------------- ");
        System.out.print(" Enter current interest rate : ");
        

        interestRate =scan.nextDouble();

        scan.nextLine();

       

        for(int i=0;i<mortgages.length;i++)

        {

       	 System.out.println();   
       	 System.out.print(" Mortgage Type (Personal or Business) : ");

               mortgageType = scan.nextLine();

               while(!mortgageType.equalsIgnoreCase("Personal") && !mortgageType.equalsIgnoreCase("Business"))

               {

                      System.out.print(" Invalid Mortgage type. Mortgage Type (Personal or Business) : ");

                      mortgageType = scan.nextLine();

               }

              

               System.out.print(" Mortgage Number : ");

               mortgageNumber = scan.nextInt();

               scan.nextLine();

               System.out.print(" Customer Name : ");

               customerName = scan.nextLine();

               System.out.print(" Mortgage Amount : ");

               mortgageAmount = scan.nextDouble();

               System.out.print(" Term (1, 3 or 5) : ");

               term = scan.nextInt();

               scan.nextLine();

              

               if(mortgageType.equalsIgnoreCase("Personal"))

                      mortgages[i] = new PersonalMortgage(mortgageNumber,customerName,mortgageAmount,interestRate,term);

               else

                      mortgages[i] = new BusinessMortgage(mortgageNumber,customerName,mortgageAmount,interestRate,term);
               
               System.out.println();

        }

       

        System.out.println(" Details of Mortgages : ");
        System.out.println(" -------------------- ");

        for(int i=0;i<mortgages.length;i++)

        {

               mortgages[i].getMortgageInfo();

               System.out.println();

        }

        scan.close();
	}

}
