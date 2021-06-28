package mse_webdrivermanager.autoManageExecutables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeUsingWDM {

	public static void main(String[] args) {
		// It will download compatible chrome executable for you
		WebDriverManager.chromedriver().setup();
		System.out.println("Browser executable path is set as :- "+System.getProperty("webdriver.chrome.driver"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title is "+driver.getTitle());
		driver.quit();		
	}
}
