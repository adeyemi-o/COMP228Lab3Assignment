package exercise3;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex3
 * Date: 20th Oct 2021
 */

public class BusinessMortgage extends Mortgage {
	
	public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term)

    {

           super(mortgageNumber,customerName,mortgageAmount,(interestRate+1),term);

    }

   

}
