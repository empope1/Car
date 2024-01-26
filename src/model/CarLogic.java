package model;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Jan 25, 2024
 */
public class CarLogic {
	
	//calculate total paid based on 3 year loan
	public double calculateTotalPaid(Car car) {
		double totalPaid = 0;
		totalPaid = car.getMonthlyPayment() * 36;
		return totalPaid;
	}
	
	//calculate mileage for each year owned
	public double calculateYearlyMileage(Car car) {
		double yearlyMileage = 0;
		yearlyMileage = (car.getMileage() / car.getYearsOwned());
		return yearlyMileage;
	}
	
	
	//Calculate if junk based on year of car
	public boolean isJunkCar(Car car) {
		
		if(car.getYearMade() > 2012) {
			return false;
		}else {
			return true;
		}
	}

}
