package tealium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Demo extends BaseClass
 {

	@Test 
	public void startpage() throws InterruptedException {
		header();
		women();
		order();
		cart();
		checkoutbtn();
	}

	public void header() throws InterruptedException {
		WebElement women = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='header-nav']/nav/ol/li[1]/a")));
		actions.moveToElement(women).perform();
		Thread.sleep(2000);
		WebElement newarrival = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='header-nav']/nav/ol/li[1]/ul/li[2]")));
		actions.moveToElement(newarrival).click().perform();

	}

	public void women() throws InterruptedException {
		WebElement size = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//dl[@id='narrow-by-list']/dd[6]/ol/li[1]/a/span[1]")));
		js.executeScript("arguments[0].scrollIntoView(true);", size);
		size.click();
		Thread.sleep(2000);
		WebElement color = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-info']/ul/li[2]/a/span")));
		js.executeScript("arguments[0].scrollIntoView(true);", color);
		color.click();
		WebElement details = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-info']/div[2]/a")));
		details.click();

	}

	public void order() throws InterruptedException {
		WebElement moreviews = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='more-views']/ul/li[2]/a")));
		js.executeScript("arguments[0].scrollIntoView(true);", moreviews);
		Thread.sleep(2000);
		moreviews.click();
		Thread.sleep(1000);
		WebElement scrollup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='header-nav']/nav/ol/li[1]/a")));
		js.executeScript("arguments[0].scrollIntoView(true);", scrollup);
		WebElement color = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-options']/dl/dd[1]/div/ul/li[1]/a/span[1]")));
		color.click();
		WebElement size = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='swatch79']/span")));
		size.click();
		WebElement cart = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-options-bottom']/div/div[2]/button")));
		cart.click();
	}

	public void cart() throws InterruptedException {
		WebElement edit = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='first last odd']/td[4]/ul/li[1]/a")));
		edit.click();
		Thread.sleep(2000);
		WebElement qty = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-options-bottom']/div[2]/div[1]/input")));
		Thread.sleep(1000);
		actions.moveToElement(qty).click().perform();
		qty.clear();
		Thread.sleep(2000);
		qty.click();
		qty.sendKeys("1");
		WebElement update = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='product-options-bottom']/div[2]/div[2]/button")));
		update.click();
		Thread.sleep(3000);
		Select country = new Select(driver.findElement(By.xpath("//Select[@id='country']")));
		country.selectByIndex(101);
		WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='region']")));
		state.clear();
		state.sendKeys("Punjab");
		WebElement zip = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='postcode']")));
		zip.clear();
		zip.sendKeys("160404");
		WebElement estimate = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='shipping-zip-form']/div/button")));
		estimate.click();
		WebElement flatrate = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='s_method_flatrate_flatrate']")));
		flatrate.click();
		WebElement updtotal = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='co-shipping-method-form']/div/button")));
		updtotal.click();
	}

	public void checkoutbtn() throws InterruptedException {
		try {
			WebElement Checkout = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cart-totals-wrapper']/div/ul/li")));
			js.executeScript("arguments[0].scrollIntoView(true);", Checkout);
			Thread.sleep(2000);
			actions.moveToElement(Checkout).click().perform();
		} catch (Exception e) {
			
			WebElement Checkout = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class='cart-totals-wrapper']/div/ul/li/button")));
			js.executeScript("arguments[0].scrollIntoView(true);", Checkout);
			Thread.sleep(2000);
			actions.moveToElement(Checkout).click().perform();
		}

	}

}
