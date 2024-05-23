package seleniumjava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotAPIdemo

{

    static WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    static JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        // WebDriver driver = new ChromeDriver();
        driver.get("https://spreadsheetpage.com/chart/sales/");

        
       start();
    }

    public static void start() throws AWTException, InterruptedException {

        Robot robot = new Robot();

        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        driver.findElement(
                By.xpath("/html/body/main/section/section/article/section[2]/div[1]/div[3]/div[2]/div/p/a[1]")).click();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

}
