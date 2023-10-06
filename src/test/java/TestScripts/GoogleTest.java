package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("113");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://google.com/");
		driver.navigate().to("https://google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		String strTitle = driver.getTitle();
		System.out.println("Page Title:...."+strTitle);
		driver.navigate().back();
		System.out.println("URL..."+driver.getCurrentUrl());
		System.out.println("Page Title after back():..."+driver.getTitle());
		driver.navigate().forward();
		
	}

}
