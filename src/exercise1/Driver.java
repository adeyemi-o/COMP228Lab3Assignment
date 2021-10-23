package exercise1;

import java.util.*;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex1
 * Date: 18th Oct 2021
 */

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insurance Account Opening");
		System.out.println("-------------------------");
		
	//	List<Insurance> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String answer = "";
		boolean KeepGoing = true;
		while(KeepGoing) {
			Insurance ins = null;
			System.out.print("Should we open Insurance package for you? Yes or No: ");
			answer = scan.nextLine();
			
			if(answer.equalsIgnoreCase("No"))
				break;
			System.out.print("Which type of Insurance package? health or life: ");
			String instype = scan.nextLine();
			System.out.print("Enter the monthly cost:");
			double cost = scan.nextDouble();
			scan.nextLine();
			
			if (instype.equalsIgnoreCase("health")) {
				ins = new Health();
				ins.setMonthlyCost(cost);
				ins.displayInfo();
				System.out.println("Thank you for signing up");
			}
			
			
			
			else if(instype.equalsIgnoreCase("life")) {
				ins = new Life();
				ins.setMonthlyCost(cost);
				ins.displayInfo();
				
			System.out.println("Thank you for signing up");
			
			
			}
			System.out.print("do you want to continue? Yes or No: ");
			answer = scan.nextLine();
			if(answer.equalsIgnoreCase("No"))
				break;
			
			/*KeepGoing = false;
			break;*/
		}
		scan.close();

	}

}
