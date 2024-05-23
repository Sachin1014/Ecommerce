package seleniumjava;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

    @Test
    public void start() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.get("https://qa.admin.frp.live/");
        // driver.findElement(By.xpath("//button[@id='details-button']")).click();
        // driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing");
        ;
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='createTxt']")).click();
        driver.findElement(By.xpath("//a[@id='link-to-download']")).click();

    }

}
