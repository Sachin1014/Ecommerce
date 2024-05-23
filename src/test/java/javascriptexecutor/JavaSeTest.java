package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Example: Click a button to login and generate Alert window using JavaScriptExecutor.

public class JavaSeTest 

{
    
    
    

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

        //flashing
        WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
        JsDemo.flash(joinfree, driver);
        //drwaing border
        JsDemo.drawborder(joinfree, driver);
  
    }

}
