package tealium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoPage extends BaseClass {

@Test 

	public void payment() throws InterruptedException {
		cartcheckout();
		rate();
	

	}

	

	public void cartcheckout() throws InterruptedException {
		WebElement cart = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='header-minicart']")));
		actions.moveToElement(cart).click().perform();
		WebElement checkout = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button checkout-button']")));
		checkout.click();
        Thread.sleep(3000);
		WebElement company = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='billing:company']")));
		company.sendKeys("ABC");
		WebElement address = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='billing:street1']")));
		address.sendKeys("#57,XYZ Road");
		WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='billing:city']")));
		city.sendKeys("Chandigarh");
		Select country = new Select(driver.findElement(By.xpath("//select[@class='validate-select']")));
		country.selectByIndex(101);
		WebElement zip = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='billing:postcode']")));
		zip.sendKeys("145214");
		WebElement telephone = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='billing:telephone']")));
		telephone.sendKeys("8541256352");
		WebElement continuebtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"billing-buttons-container\"]/button")));
		continuebtn.click();

	}

	public void rate() {
		WebElement shipping = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id=\"shipping-method-buttons-container\"]/button")));
		shipping.click();
		WebElement continuebtn = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='shipping-method-buttons-container']/button/span/span")));
		continuebtn.click();
		WebElement cod = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='payment-buttons-container']/button/span/span")));
		cod.click();
		WebElement placeorder = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='review-buttons-container']/button/span/span")));
		placeorder.click();
		WebElement print = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='top']/body/div[2]/div/div[2]/div/div/p[3]/a")));
		print.click();

	}

	

}
