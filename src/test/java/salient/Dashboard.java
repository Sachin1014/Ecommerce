package salient;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dashboard extends NewDashboard {

	@Test

	public void dashboardabc() throws InterruptedException {
		WebElement insertchart = driver
				.findElement(By.xpath("//*[@id=\"row-ebea541c-a602-42de-b4ca-53b9a6b6d2ff\"]/div[1]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(insertchart).perform();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.cssSelector(
				"div[id='row-ebea541c-a602-42de-b4ca-53b9a6b6d2ff'] div:nth-child(1) div:nth-child(1) button:nth-child(1) i:nth-child(1)"));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(click).click().perform();

	}

}
