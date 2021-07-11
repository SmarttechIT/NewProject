package com.newpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static WebDriver getLogin() {
//open browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		//implicit wait = HTML loaded
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/house-prices/");
		return driver;
	}
	
	public static void main(String[] args) {

		OpenBrowser.getLogin();
		
	}


}
