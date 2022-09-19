package LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Viswajit\\OneDrive\\Desktop\\Selenium sllyabus\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://devweb.yodda.org/");
		driver.findElement(By.id("mat-input-0")).sendKeys("Rohan");
		driver.findElement(By.id("mat-input-1")).sendKeys("Test");
		driver.findElement(By.id("mat-input-3")).sendKeys("7777777788");
		driver.findElement(By.id("mat-input-4")).sendKeys("test@gmail.com");
		Svgfgrgtrg
	
	}

}
