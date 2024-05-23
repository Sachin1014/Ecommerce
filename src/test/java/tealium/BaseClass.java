package tealium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 WebDriver driver = new ChromeDriver();
	 WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@BeforeTest

	public void testChrome() throws InterruptedException {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.ecommerce.tealiumdemo.com/");
		
		Assert.assertEquals(driver.getTitle(), "Tealium Ecommerce Demo");

		// testFirefox();
		account();

		}

		
		public void testFirefox() throws InterruptedException {
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.ecommerce.tealiumdemo.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Tealium Ecommerce Demo"); 
		}

	
	public void account() throws InterruptedException
	{
		WebElement acc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='account-cart-wrapper']/a/span[2]")));
		acc.click();
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Log In']")));
		login.click();
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		username.click();
		username.sendKeys("qatest1@gmail.com");
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
		password.click();
		password.sendKeys("qatest@1");
		WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='send2']")));
		loginbtn.click();
		Thread.sleep(3000);
		
	}
	
@AfterTest
	public void browserclose()
	{
		driver.quit();
	}
}
