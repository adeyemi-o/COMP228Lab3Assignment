package exercise1;
import java.text.NumberFormat;
import java.util.*;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex1
 * Date: 18th Oct 2021
 */

public class Life extends Insurance{
	
	//Create a Locale
	Locale usa = new Locale("en", "US");
	//Create currency instance
	Currency dollars = Currency.getInstance(usa);
	//Create a formatter given the Locale
	NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
	
	public Life() {
		super("health");
	}
@Override

public void setInsuranceCost(double cost) {
	super.setMonthlyCost(cost);
}
@Override

public void displayInfo() {

System.out.println("Insurance:\n\ttype: "+this.getinsuranceType()+ "\n\tMonthly Cost: "+ dollarFormat.format(this.getMonthlyCost()));

}
}
