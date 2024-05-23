//package tealium;
//
//import org.apache.commons.math3.analysis.function.Exp;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;

//public class LoginPage extends BaseClass 
//{
//	@AfterTest
//	public void main()
//	{
//		account();
//	}
//	public void account()
//	{
//		WebElement acc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='account-cart-wrapper']/a/span[2]")));
//		acc.click();
//		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Log In']")));
//		login.click();
//		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
//		username.click();
//		username.sendKeys("qatest1@gmail.com");
//		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
//		password.click();
//		password.sendKeys("qatest@1");
//		WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='send2']")));
//		loginbtn.click();
//		
//	}
//
//}
