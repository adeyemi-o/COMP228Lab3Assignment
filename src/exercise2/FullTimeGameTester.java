package exercise2;


/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex2
 * Date: 18th Oct 2021
 */

//Class for jobType - FullTimeGameTester - a child class of GameTester
public class FullTimeGameTester extends GameTester{

	//FullTimeGameTester Constructor
	public FullTimeGameTester(String name, boolean jobType)
	{
		super(name, jobType);
	}
	
	//Salary Method implementation
	@Override 
	public double salary()
	{
		return 3000;
	}
}
