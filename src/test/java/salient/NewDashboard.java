package salient;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;

public class NewDashboard extends BaseClass {
	@Test

	public void testabc() throws InterruptedException {
		table1();
		opportunities();
		processes();
		tasks();
		pipelinesummary();
		impact();
		table();
		dropdown();
		impactvs();
		opportunitytable();
		dragdrop();
	}

	public void table1() throws InterruptedException

	{
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id='Dashboard-sidebar']/a/i"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='kt_header_menu']/div[2]/ul/li[3]/ul/li[4]/a"));
		actions.moveToElement(subMenu);
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(3000);
		WebElement insertchart = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div/div/div"));
		actions.moveToElement(insertchart).perform();
		Thread.sleep(2000);
		WebElement step = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[1]/div[1]/button/i"));
		actions.moveToElement(step).click().perform();
		Thread.sleep(2000);
		WebElement pipeline = driver.findElement(By.xpath("//div[@class='row mt-6 mb-6 ']/div/button"));
		actions.moveToElement(pipeline).click().perform();
	}

	public void opportunities() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[2]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[2]/div/button/i"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		WebElement opportunity = driver.findElement(By.xpath("//div[@class='row mt-6 mb-6']/div[1]/button[2]"));
		actions.moveToElement(opportunity).click().perform();
	}

	public void processes() throws InterruptedException

	{
		WebElement mainMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[3]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[3]/div/button/i"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		WebElement opportunity = driver.findElement(By.xpath("//div[@class='row mt-6 mb-6 ']/div[1]/button[3]"));
		actions.moveToElement(opportunity).click().perform();
	}

	public void tasks() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[4]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]/div[4]/div/button/i"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		WebElement opportunity = driver.findElement(By.xpath("//div[@class='row mt-6 mb-6']/div[1]/button[4]"));
		actions.moveToElement(opportunity).click().perform();
	}

	public void pipelinesummary() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[2]/div[1]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[2]/div[1]/div/button/i"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		WebElement opportunity = driver
				.findElement(By.xpath("//div[@class='row mt-6 mb-6']/div[2]/div[1]/div[1]/button[1]"));
		actions.moveToElement(opportunity).click().perform();
	}

	public void impact() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[2]/div[2]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[2]/div[2]/div/button/i"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		WebElement opportunity = driver
				.findElement(By.xpath("//div[@class='row mt-6 mb-6']/div[2]/div[1]/div[1]/button[3]"));
		actions.moveToElement(opportunity).click().perform();
	}

	public void table() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[3]/div[1]/div[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-3000)", "");
		WebElement subMenu = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[3]/div[1]/div[1]/button"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,-3000)", "");
		WebElement opportunity = driver.findElement(By.xpath("//div[@class='row mt-6 mb-6 ']/div[3]/button[1]/i"));
		actions.moveToElement(opportunity).click().perform();

	}

	public void dropdown() throws InterruptedException {

		WebElement mainMenu = driver
				.findElement(By.xpath("//div[2][@class='row draggable-container row-new custom-col-row']/div[1]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(
				By.xpath("//div[2][@class='row draggable-container row-new custom-col-row']/div[1]/div/div[1]/div[2]"));
		actions.moveToElement(subMenu).perform();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath(
				"//div[2][@class='row draggable-container row-new custom-col-row']/div[1]/div/div[1]/div[2]/div"));
		actions.moveToElement(drop).click().perform();
		Thread.sleep(2000);
		WebElement dropup = driver.findElement(By.xpath("//div[@class='dropdown show']/div/ul/div/li[4]"));
		actions.moveToElement(dropup).click().perform();
		Thread.sleep(2000);
		WebElement icon = driver.findElement(By.xpath("//button[@id='editTitleChart']/i"));
		actions.moveToElement(icon).click().perform();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//*[@id=\"txtpipelineSummaryTitle\"]"));
		actions.moveToElement(text).click().perform();
		text.clear();
		text.sendKeys("Pipeline");
		Thread.sleep(2000);
		WebElement textadd = driver.findElement(By.xpath("//*[@id='savepipelineSummary']"));
		textadd.click();
		Thread.sleep(2000);
		WebElement ok = driver.findElement(By.xpath("//*[@id='kt_body']/div[22]/div/div[3]/button[1]"));
		ok.click();

	}

	public void impactvs() throws InterruptedException

	{
		WebElement mainMenu = driver
				.findElement(By.xpath("//div[2][@class='row draggable-container row-new custom-col-row']/div[2]/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(
				By.xpath("//div[2][@class='row draggable-container row-new custom-col-row']/div[2]/div/div[1]/div[2]"));
		actions.moveToElement(subMenu).perform();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath(
				"//div[2][@class='row draggable-container row-new custom-col-row']/div[2]/div/div[1]/div[2]/div"));
		actions.moveToElement(drop).click().perform();
		Thread.sleep(2000);
		WebElement dropup = driver.findElement(By.xpath("//div[@class='dropdown-menu show']/ul/div/li[2]"));
		actions.moveToElement(dropup).click().perform();
		Thread.sleep(2000);
		WebElement icon = driver.findElement(By.xpath("//div[@title='Impact vs. Complexity']/div[1]/div[2]/button/i"));
		actions.moveToElement(icon).click().perform();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//div[@id='modalEditTitle']/div/div/div[2]/div/input[3]"));
		actions.moveToElement(text).click().perform();
		text.clear();
		text.sendKeys("Chart");
		Thread.sleep(2000);
		WebElement textadd = driver.findElement(By.xpath("//div[@id='modalEditTitle']/div/div/div[3]/button/i"));
		textadd.click();
		Thread.sleep(2000);
		WebElement ok = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[22]/div/div[3]/button[1]"));
		ok.click();
		Thread.sleep(2000);
	}

	public void opportunitytable() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[@title='Opportunity Table']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		WebElement mainMenu = driver
				.findElement(By.xpath("//div[@title='Opportunity Table']/div[1]/div[2]/div/button"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).click().perform();
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.xpath("//div[@class='dropdown-menu show']/ul/div/li[2]/a/span[2]"));
		actions.moveToElement(subMenu).click().perform();
		Thread.sleep(2000);
		/*
		 * WebElement drop =
		 * driver.findElement(By.xpath("//div[@id='tblPipeline_filter']/label/input"));
		 * actions.moveToElement(drop).click().perform();
		 * drop.clear();
		 * drop.sendKeys("AP Process");
		 * Thread.sleep(2000);
		 */
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.xpath("//div[@title='Opportunity Table']"));
		jd.executeScript("arguments[0].scrollIntoView(true);", element2);
		Thread.sleep(2000);

	}

	public void dragdrop() throws InterruptedException {

		Actions actions = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//*[@id=\'tblPipeline\']/thead/tr/th[2]"));
		actions.moveToElement(hover).perform();
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath(
				"//h3[contains(text(),'Opportunity Table')]//following::button[@data-original-title='Move Entire Row']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='divMainDashboard']/div[1]"));
		actions.clickAndHold(drag).dragAndDrop(drag, drop).build().perform();

	}

}
