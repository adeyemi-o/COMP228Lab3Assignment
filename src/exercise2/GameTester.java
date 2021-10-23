package exercise2;


/*Author: Adeyemi Oyinlola
 * Course: COMP228
 * Assignment: Lab3 Ex2
 * Date: 18th Oct 2021
 */

abstract class GameTester {
	
	//Tester's Name
	@SuppressWarnings("unused")
	private String name;
	
	//Job type - Full-time or Part-time
	@SuppressWarnings("unused")
	private boolean jobType;
	
	// Name & Jobtype Constructor
	public GameTester(String name, boolean jobType)
	{
	this.name = name;
	this.jobType = jobType;
    }
	
	//Abstract method for Salary
	public abstract double salary();
}
