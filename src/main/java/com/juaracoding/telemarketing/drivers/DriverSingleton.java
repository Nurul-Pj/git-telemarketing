package com.juaracoding.telemarketing.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.drivers.strategies.DriverStrategy;
import com.juaracoding.telemarketing.drivers.strategies.DriverStrategyImplementer;
import com.juaracoding.telemarketing.utils.Constants;

public class DriverSingleton {

	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		instantiate(driver);
		
	}
		
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public static DriverSingleton getInstance(String driver) {
		if (instance == null) {
			instance = new DriverSingleton(driver);
		}
		
		return instance;
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	public static void closeObjectInstance() {
		instance = null;
		driver.quit();
	}

}
