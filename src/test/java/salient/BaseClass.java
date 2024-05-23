package salient;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	 static WebDriver driver = new ChromeDriver();

//     Actions actions = new Actions(driver);
@Before
public void main()throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://dev.mybusinesscompass.com/Login");
		
		cred();
		
	}
	


	public static void cred() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='txtLoginEmail']")).sendKeys("Khushboo@salientprocess.com");
		driver.findElement(By.xpath("//*[@id='txtLoginPassword']")).sendKeys("Sss4321!");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(3000);
		Select objSelect = new Select(driver.findElement(By.xpath("//*[@id=\"ddbAccounts\"]")));
		objSelect.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"btnSelect\"]")).click();
		Thread.sleep(2000);
	}


   /* @After
    public void quit() 
    {
    	driver.quit();
    }*/
}

		
	


	

