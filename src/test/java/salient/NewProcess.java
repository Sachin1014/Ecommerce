package salient;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewProcess extends BaseClass {

	@Test

	public void CreateProcess() throws InterruptedException {
		process();
		addprocess();
		skills();
		action();
		simulation();
		step2();
		client();
		simulationdetails();
		runsimulation();

	}

	public static void process() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement newprocess = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-sitemap dropdown-arrow-thrice mr-3 pl-9']")));
		actions.moveToElement(newprocess).perform();
		WebElement createprocess = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"kt_header_menu\"]/div[2]/ul/li[4]/ul/li[2]/div/a/span")));
		actions.moveToElement(createprocess).click().perform();
		WebElement template = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"kt_header_menu\"]/div[2]/ul/li[4]/ul/li[2]/ul/li[1]/a")));
		actions.moveToElement(template).click().perform();
		WebElement ac = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lstTemplate\"]/li[1]/a/div/div[2]")));
		actions.moveToElement(ac).perform();
		Thread.sleep(1000);
		ac.click();

	}

	public void addprocess() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions actions = new Actions(driver);
		WebElement processname = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txtSimulationName\"]")));
		actions.moveToElement(processname).perform();
		Thread.sleep(2000);
		WebElement processowner = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@placeholder='Accountable for the process.']")));
		actions.click(processowner).sendKeys("Khushboo" + Keys.ENTER).perform();
		WebElement capabilities = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Capabilities that enables the process.']")));
		actions.click(capabilities).sendKeys("Accept New Offer" + Keys.ENTER).perform();
		WebElement Processdiscription = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='txtSimulationDescription']")));
		actions.click(Processdiscription).sendKeys("test").perform();
		WebElement Systems = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter a system name']")));
		actions.click(Systems).sendKeys("SAP" + Keys.ENTER).perform();
		Thread.sleep(1000);
		Select category = new Select(driver.findElement(By.xpath("//*[@id=\"selectSimulationCategory\"]")));
		category.selectByValue("Supporting");
		WebElement save = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-save mr-3']")));
		actions.click(save).perform();
		Thread.sleep(2000);
	}

	// table[@id="tblGaint"]/tbody/tr[1]/td[3]/select
	public void skills() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		WebElement assessment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='pills-strategic-tab']")));
		assessment.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='tblGaint']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Select skill = new Select(driver.findElement(By.xpath("//table[@id=\"tblGaint\"]/tbody/tr[1]/td[3]/select")));
		skill.selectByIndex(2);
		Select skill2 = new Select(driver.findElement(By.xpath("//table[@id='tblGaint']/tbody/tr[2]/td[3]/select")));
		skill2.selectByIndex(3);
		Select skill3 = new Select(driver.findElement(By.xpath("//table[@id=\"tblGaint\"]/tbody/tr[3]/td[3]/select")));
		skill3.selectByIndex(1);
		Select skill4 = new Select(driver.findElement(By.xpath("//table[@id=\"tblGaint\"]/tbody/tr[4]/td[3]/select")));
		skill4.selectByIndex(4);
		WebElement save = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-save mr-3']")));
		actions.click(save).perform();
		Thread.sleep(2000);

	}

	// a[@id='actionsResultSimulation']
	public void action() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		WebElement save = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='actionsResultSimulation']")));
		save.click();
		// driver.findElement(By.xpath("//a[@id='actionsResultSimulation']")).click();
		WebElement run = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='navi navi-hover py-5']/li[2]")));
		actions.moveToElement(run).click().perform();
		WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='nextStep']")));
		next.click();
	}

	// *[@id="tblSteps_88f53c73-ce7a-4bbe-bb6a-a467f6568591"]/thead/tr/th[4]
	// textarea[@id='txtProjectDescription']
	public void simulation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//textarea[@id='txtProjectDescription']")).sendKeys("Testing");
		WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='step step-1 col d-flex flex-column align-items-center text-center active']/div/div")));
		next.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		WebElement click = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//tr[@id='bpmn-91e033d1-1aa1-4da3-a609-8405451d49b7']")));
		Thread.sleep(2000);
		click.click();
		WebElement step = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='col-6 pr-12']/div[1]/div[2]/div[1]/input")));
		actions.moveToElement(step).click(step).perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		WebElement amount = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='col-6 pr-12']/div[3]/div[2]/div[1]/input")));
		actions.moveToElement(amount).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		WebElement amount2 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='col-6 pl-12']/div[1]/div[2]/div/input")));
		actions.moveToElement(amount2).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		WebElement amount3 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='col-6 pl-12']/div[3]/div[2]/div[1]/input")));
		actions.moveToElement(amount3).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		WebElement save = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modalEditStep\"]/div/div/div[3]/div[2]")));
		save.click();
		WebElement next2 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@class=\"simulation_wrapper w-100\"]/div[7]/button[2]")));
		next2.click();
	}

	// *[@id="modalEditStep"]/div/div/div[3]/div[2]
	public void step2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);
		WebElement step1 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@class='simulation-2__table']/div/div[2]/div/table/tbody/tr[1]/td[5]/div/span")));
		step1.click();
		WebElement workers = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtResourceNumber']")));
		actions.moveToElement(workers).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("5").perform();
		WebElement cost = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtResourceCost']")));
		actions.moveToElement(cost).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("20").perform();
		Thread.sleep(2000);
		Select objSelect = new Select(driver.findElement(By.xpath("//*[@id='ddlResourceCostUnit']")));
		objSelect.selectByIndex(1);
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class=\"modal-body px-xl-22 px-15 py-12\"]/form/div[5]/div[2]")));
		save.click();

	}

	// div[@class="modal-body px-xl-22 px-15 py-12"]/form/div[2]/div[1]/input
	public void client() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);
		WebElement clientedit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@class='simulation__table resources__table table table-bordered table-hover resourcesTable no-footer dataTable']/tbody/tr[2]/td[5]/div/span")));
		clientedit.click();
		WebElement workers = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class=\"modal-body px-xl-22 px-15 py-12\"]/form/div[2]/div[1]/input")));
		actions.moveToElement(workers).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("5").perform();
		WebElement cost = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='modal-body px-xl-22 px-15 py-12']/form/div[2]/div[2]/input")));
		actions.moveToElement(cost).click().perform();
		actions.sendKeys(Keys.BACK_SPACE).sendKeys("10").perform();
		Thread.sleep(1000);
		Select objselect = new Select(driver.findElement(By.xpath("//div[@class='edit-step__input-30']/select")));
		objselect.selectByIndex(1);
		WebElement save = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"modalEditResource\"]/div/div/div[2]/form/div[5]/div[2]")));
		save.click();
		WebElement save2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='nextStep']")));
		save2.click();

	}

	public void simulationdetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);
		WebElement startdate = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(" //a[@class='btn_primary--sm px-4 py-2 tooltips']")));
		startdate.click();
		WebElement instance = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(" //input[@id='simInstanceCount']")));
		actions.moveToElement(instance).click().sendKeys("0").perform();
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nextStep']")));
		save.click();
		// Thread.sleep(1000);
		// WebElement runsimulation =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='nextStep']")));
		// actions.moveToElement(runsimulation).perform();
		// Thread.sleep(1000);
		// actions.moveToElement(runsimulation).click().perform();

	}

	public void runsimulation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);
		// WebElement savesetup =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnSaveSetup']")));
		// actions.moveToElement(savesetup).build();
		WebElement runsimulation1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='simulation_wrapper w-100']/div[7]/button[3]")));
		actions.moveToElement(runsimulation1).perform();
		runsimulation1.click();

	}

}
