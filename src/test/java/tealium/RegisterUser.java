package tealium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterUser extends BaseClass {
	
	public void main() throws InterruptedException {
		register();
	}

	public void register() throws InterruptedException {
		WebElement account = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='account-cart-wrapper']/a/span[2]")));
		account.click();
		WebElement register = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='header-account']/div/ul/li[5]")));
		register.click();
		WebElement firstname = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='firstname']")));
		firstname.sendKeys("QA");
		WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='lastname']")));
		lastname.sendKeys("Test");
		WebElement email = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email_address']")));
		email.sendKeys("qatest1@gmail.com");
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		password.sendKeys("qatest@1");
		WebElement confirmpass = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='confirmation']")));
		confirmpass.sendKeys("qatest@1");
		Thread.sleep(5000);

		// WebElement regbutton =
		// driver.findElement(By.xpath("//*[@id='form-validate']/div[2]/button/span/span"));
		// Thread.sleep(2000);
		// actions.moveToElement(regbutton);
		// actions.click(regbutton).perform();
		WebElement regbutton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form-validate']/div[2]/button")));
		js.executeScript("arguments[0].scrollIntoView(true);", regbutton);
		Thread.sleep(2000);
		regbutton.click();

	}
}
