package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/oleksandrdanylchuk/Documents/selenium dependencies/drivers/geckodriver");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.etsy.com/search?q=wooden%20spoon");

	}

}
