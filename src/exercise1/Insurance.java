package exercise1;

public abstract class Insurance {
	
	/*Author: Adeyemi Oyinlola
	 * Course: COMP228
	 * Assignment: Lab3 Ex1
	 * Date: 18th Oct 2021
	 */

	private String insuranceType;

	private double monthlyCost;

	public Insurance(String insuranceType) {

	this.insuranceType = insuranceType;

	}

	public void setMonthlyCost(double monthlyCost) {

	this.monthlyCost = monthlyCost;

	}

	public String getinsuranceType() {

	return insuranceType;

	}

	public double getMonthlyCost() {

	return monthlyCost;

	}

	public abstract void setInsuranceCost(double cost);

	public abstract void displayInfo();

}
