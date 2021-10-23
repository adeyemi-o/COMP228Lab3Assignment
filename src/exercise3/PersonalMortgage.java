package exercise3;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex3
 * Date: 20th Oct 2021
 */

public class PersonalMortgage extends Mortgage {
	
	public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term)

    {

           super(mortgageNumber,customerName,mortgageAmount,(interestRate+2),term);

    }

}

