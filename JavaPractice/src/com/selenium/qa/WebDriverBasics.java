package com.selenium.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "//D:\\Selenium WebDriver\\Chrome Driver 84_chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //FirefoxDriver is a class which is implementing Webdriver interface
        driver.get("http://www.google.com");
        String title=driver.getTitle();
        System.out.println(title);
        
        //Validation point
        if(title.equals("Google")) {
        	System.out.println("correct title");
        }
        else
        	System.out.println("incorrect title");

	}

}
