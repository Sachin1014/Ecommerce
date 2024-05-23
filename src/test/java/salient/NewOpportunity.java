package salient;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewOpportunity extends BaseClass {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test
	public void opportunity() throws InterruptedException {

		pipelines();
		info();
		process();
		discovery();
		simulation();
		scenarios();
		action();
		benefit();
		score();
	}

	// side bar
	public void pipelines() {

		WebElement pipeline = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-filter dropdown-arrow-thrice mr-3 pl-9']")));
		actions.moveToElement(pipeline).perform();
		WebElement createupportunity = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-lightbulb pr-2 dont-open']")));
		actions.moveToElement(createupportunity).click().perform();
		WebElement newopportunity = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='new-opportunity-sub5']/li[1]/a")));
		actions.moveToElement(newopportunity).click().perform();

	}

	// new opportunity
	public void info() throws InterruptedException {
		WebElement name = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='divGettingStartedOpportunity1']/div/input")));
		actions.moveToElement(name).click().perform();
		name.sendKeys("Accounting Services");
		Select pipeline = new Select(driver
				.findElement(By.xpath("//div[@class='col-md-3 card-body text-dark cus-col-spacing']/div/select")));
		pipeline.selectByIndex(1);
		WebElement summary = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='txtFileDescription']")));
		summary.sendKeys("test");
		Select source = new Select(driver.findElement(By.xpath("//*[@id='ddlOpportunitySource']")));
		source.selectByIndex(2);
		WebElement team = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='divGettingStartedOpportunity4']/div[2]/div[2]/div/span/span[1]/span/ul/li/input")));
		team.sendKeys("Accounting");
		team.sendKeys(Keys.ENTER);
		WebElement sponsor = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='divGettingStartedOpportunity4']/div[2]/div[3]/div/input")));
		sponsor.sendKeys("Nick");
		WebElement processowner = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='divGettingStartedOpportunity4']/div[2]/div[4]/div/input")));
		processowner.sendKeys("Khushboo");
		WebElement coresystems = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='divGettingStartedOpportunity4']/div[2]/div[5]/span/span[1]/span/ul/li/input")));
		coresystems.sendKeys("SAP");
		coresystems.sendKeys(Keys.ENTER);
		WebElement alignment = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='divGettingStartedOpportunity4']/div[2]/div[6]/span/span[1]/span/ul/li/input")));
		alignment.sendKeys("RPA");
		alignment.sendKeys(Keys.ENTER);
		WebElement business = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='divGettingStartedOpportunity4']/div[2]/div[7]/span/span[1]/span/ul/li/input")));
		business.sendKeys("Accuracy");
		business.sendKeys(Keys.ENTER);
		WebElement organizational = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='divGettingStartedOpportunity7']/span/span[1]/span/ul/li/input")));
		organizational.sendKeys("Have a skilled sales force");
		organizational.sendKeys(Keys.ENTER);
		// WebElement capabilities =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divGettingStartedOpportunity19\"]/span/span[1]/span/ul/li/input")));
		// capabilities.sendKeys("1 Customer Relationships");
		// capabilities.sendKeys(Keys.ENTER);
		// WebElement save =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='btnSaveOpportunity']/button[1]")));
		// save.click();
		Thread.sleep(2000);

	}

	// Process tab

	public void process() throws InterruptedException {

		WebElement processtab = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")));
		actions.moveToElement(processtab).perform();
		Thread.sleep(2000);
		processtab.click();
		WebElement linkprocess = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='newSimulationModal']/div/a")));
		linkprocess.click();
		WebElement processlink = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tblProjects']/tbody/tr[1]/td[1]/a")));
		actions.moveToElement(processlink).perform();
		Thread.sleep(1000);
		processlink.click();
		Thread.sleep(3000);
		// WebElement cancelbutton =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divMyProcesses\"]/div[2]/button")));
		// cancelbutton.click();
		WebElement savebutton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnSaveOpportunity']/button[1]")));
		savebutton.click();
		Thread.sleep(4000);
		// WebElement discoverytab =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tab-Discovery\"]/span[2]")));
		// discoverytab.click();

	}

	// *[@id="divGettingStartedOpportunities4"]/div[1]/label/span
	// discovery tab
	public void discovery() throws InterruptedException {
		Thread.sleep(2000);
		WebElement discoverytab = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav nav-tabs']/li[3]/a")));
		actions.moveToElement(discoverytab).perform();
		Thread.sleep(2000);
		discoverytab.click();
		Thread.sleep(2000);
		WebElement discover = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='btnDiscoveryTab']")));
		Thread.sleep(2000);
		discover.click();
		Thread.sleep(2000);
		WebElement checkbox = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='divGettingStartedOpportunities4']/div[1]/label/span")));
		actions.moveToElement(checkbox).perform();
		checkbox.click();
		// Thread.sleep(1000);
		WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@id='divGettingStartedOpportunities2']/div[2]/div[1]/label/span")));
		actions.moveToElement(checkbox2).perform();
		checkbox2.click();
		WebElement savechanges = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='text-right mb-4 btn-actions d-flex justify-content-end']/button[1]")));
		savechanges.click();
		WebElement save = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-toolbar']/div[4]/div/button[1]")));
		save.click();
		Thread.sleep(2000);

	}

	// simulation tab
	public void simulation() throws InterruptedException {
		Thread.sleep(2000);
		WebElement simtab = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav nav-tabs']/li[4]/a")));
		actions.moveToElement(simtab).perform();
		simtab.click();
		Thread.sleep(2000);
		WebElement runsimulation = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='runSimulationOption']/div[2]/a")));
		actions.moveToElement(runsimulation).perform();
		Thread.sleep(2000);
		runsimulation.click();
		Thread.sleep(2000);
		WebElement Next = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='divMainTab']/div/div[7]/button[2]")));
		Next.click();

	}

	// simulation steps
	public void scenarios() throws InterruptedException {
		WebElement invoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//table[@class='simulationActivitiesTable simulation__table diagram__table table table-bordered table-hover stepstable no-footer hideImprovementType dataTable']/tbody/tr[1]/td[8]/div/span")));
		invoice.click();
		Thread.sleep(1000);
		// js.executeScript("window.scrollBy(0,-3000)", "");
		WebElement step1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='txtWorkTime1']")));
		// actions.moveToElement(step1).perform();
		// Thread.sleep(2000);
		actions.moveToElement(step1).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		Thread.sleep(1000);
		Select unit = new Select(driver.findElement(By.xpath("//select[@id='ddlWorkTimeUnit']")));
		unit.selectByIndex(1);
		WebElement amount = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtWorkTimeFuture1']")));
		actions.moveToElement(amount).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		Thread.sleep(1000);
		WebElement costamount = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtCost1']")));
		actions.moveToElement(costamount).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		Thread.sleep(1000);
		WebElement futureamount = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtCostFuture1']")));
		actions.moveToElement(futureamount).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		WebElement savebtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='modalEditStep']/div/div/div[3]/div[2]")));
		savebtn.click();
		WebElement saveclick = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class='simulation_wrapper w-100']/div[7]/button[2]")));
		saveclick.click();
		Thread.sleep(1000);
		WebElement saveclick1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class='simulation_wrapper w-100']/div[7]/button[2]")));
		actions.moveToElement(saveclick1).click().perform();
		// saveclick1.click();
		Thread.sleep(1000);
		WebElement saveclick2 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class='simulation_wrapper w-100']/div[7]/button[2]")));
		actions.moveToElement(saveclick2).click().perform();
		WebElement runsim = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class='simulation_wrapper w-100']/div[7]/button[3]")));
		actions.moveToElement(runsim).click().perform();

	}

	// simulation action button
	public void action() throws InterruptedException {
		WebElement actbtn = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='flex-wrap border-0 pb-0']/div[1]/div/div")));
		actbtn.click();
		Thread.sleep(2000);
		WebElement savechange = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='dropdown dropdown-inline mr-2 show']/div/ul/li[5]")));
		savechange.click();
		Thread.sleep(2000);
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='swal2-container swal2-center swal2-backdrop-show']/div/div[3]/button[1]")));
		save.click();
	}

	// benefit tab

	public void benefit() throws InterruptedException {
		WebElement benefittab = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='card card-custom card-sticky']/div[2]/ul/li[5]/a")));
		benefittab.click();
		Thread.sleep(2000);
		WebElement discount = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@id='divOpportunityResults']/div[2]/div[1]/div/div/div[1]/div/span[2]/button[1]")));
		Thread.sleep(3000);
		actions.moveToElement(discount).doubleClick().perform();
		WebElement totalbenefit = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@id='divOpportunityResults']/div[2]/div[1]/div/div/div[2]/div[1]/span[2]/button[1]")));
		Thread.sleep(3000);
		actions.moveToElement(totalbenefit).doubleClick().perform();
		WebElement SoftwareCost = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@id='divOpportunityResults']/div[2]/div[1]/div/div/div[3]/div[1]/span[2]/button[1]")));
		Thread.sleep(3000);
		actions.moveToElement(SoftwareCost).doubleClick().perform();
		WebElement Servicecost = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@id='divOpportunityResults']/div[2]/div[1]/div/div/div[4]/div[1]/span[2]/button[1]")));
		Thread.sleep(3000);
		actions.moveToElement(Servicecost).doubleClick().perform();
		WebElement Projectlength = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@id='divOpportunityResults']/div[2]/div[1]/div/div/div[5]/div[1]/span/button[1]")));
		Thread.sleep(3000);
		actions.moveToElement(Projectlength).doubleClick().perform();
		WebElement savebutton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='btnSaveOpportunity']/button[1]")));
		savebutton.click();

	}

	// score tab

	public void score() {
		WebElement materiality = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='tab-content mt-5']/div[6]/div[2]/div/table/tbody/tr[1]/td[4]/div/span/button[1]")));
		materiality.click();
	}

}
