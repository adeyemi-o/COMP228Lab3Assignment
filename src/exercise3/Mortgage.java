package exercise3;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex3
 * Date: 20th Oct 2021
 */

abstract class Mortgage implements MortgageConstants {
	
	//Create a Locale - currency
			static Locale usa = new Locale("en", "US");
			//Create currency instance
			Currency dollars = Currency.getInstance(usa);
			//Create a formatter given the Locale
			static NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
	
	private int mortgageNumber;

    private String customerName;

    private double mortgageAmount;

    private double interestRate;

    private int term;

   

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term)

    {

          this.mortgageNumber = mortgageNumber;

          this.customerName = customerName;

          if(mortgageAmount > maxMortgageAmt)

                 this.mortgageAmount = maxMortgageAmt;

          else

                 this.mortgageAmount = mortgageAmount;

          this.interestRate = interestRate;

          if(term != shortTerm && term != mediumTerm && term != longTerm)

                 this.term = shortTerm;

          else

                 this.term = term;

    }

   

    public void getMortgageInfo()

    {

          System.out.println(" Bank Name : "+ bankName);

          System.out.println(" Mortgage Number : "+ mortgageNumber);

          System.out.println(" Customer Name : "+ customerName);

          System.out.println(" Mortgage Amount : "+ dollarFormat.format(mortgageAmount));

          System.out.println(" Interest rate : "+ interestRate+" % " );

          System.out.println(" Term : "+term);

          double amount_owed = mortgageAmount + (mortgageAmount*interestRate*term)/100; 

          System.out.println(" Total amount owed after "+term+" years : "+dollarFormat.format(amount_owed));

    }

}
