package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/oleksandrdanylchuk/Documents/selenium dependencies/drivers/geckodriver");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("http://cybertekschool.com");

		WebDriver driver2 = new ChromeDriver();

		driver2.get("http://amazon.com");

		WebDriver driver3 = new ChromeDriver();

		driver3.get("http://google.com");

	}

}
