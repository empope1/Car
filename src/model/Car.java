package model;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Jan 25, 2024
 */
public class Car {
	private String model;
	private int yearMade;
	private double monthlyPayment;
	private double mileage;
	private int yearsOwned;
	
	//constructors
	public Car(String model) {
		super();
		this.model = model;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public int getYearsOwned() {
		return yearsOwned;
	}

	public void setYearsOwned(int yearsOwned) {
		this.yearsOwned = yearsOwned;
	}
	
	

}
