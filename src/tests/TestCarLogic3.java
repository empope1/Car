package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.CarLogic;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Jan 25, 2024
 */
public class TestCarLogic3 {
	CarLogic carLog = new CarLogic();
	Car car = new Car("Equinox");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateYearlyMileage() {
		car.setMileage(45000);
		car.setYearsOwned(9);
		double mileage = carLog.calculateYearlyMileage(car);
		assertEquals(5000,mileage,0.0);
	}

}
