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
public class TestCarLogic2 {
	CarLogic carLog = new CarLogic();
	Car car = new Car("Flex");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCarJunkCar() {
		car.setYearMade(2019);
		assertFalse(carLog.isJunkCar(car));
	}
	
	@Test
	public void testCarIsJunkCar() {
		car.setYearMade(2009);
		assertTrue(carLog.isJunkCar(car));
	}

}
