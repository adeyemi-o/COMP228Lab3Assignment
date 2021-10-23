package exercise2;

/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex2
 * Date: 18th Oct 2021
 */

//PartTimeGameTester Class - a child class of GameTester
public class PartTimeGameTester extends GameTester{
	
	private int hours;
	
	//PartTimeGameTester Constructor
	public PartTimeGameTester(String name, boolean jobType, int hours)
	{
		super(name, jobType);
		this.hours = hours;
	}
	
	//implement the inherited abstract method salary()
	@Override
	public double salary()
	{
		return this.hours * 20;
	}
}
