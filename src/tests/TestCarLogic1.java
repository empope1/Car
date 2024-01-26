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
public class TestCarLogic1 {
	CarLogic carLog = new CarLogic();
	Car car = new Car("Durango");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateTotalPaid() {
		car.setMonthlyPayment(150);
		double payment = carLog.calculateTotalPaid(car);
		assertEquals(5400,payment,0.0);
	}

}
