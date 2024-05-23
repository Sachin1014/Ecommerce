package javascriptexecutor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutorConcept {

    static WebDriver driver;
    
    
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.freecrm.com/");
        login();
        
    }
    
    public static void login() throws InterruptedException {
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test@123");
        WebElement loginButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
        //JsDemo.flash(loginButton, driver);
        JsDemo.drawborder(loginButton, driver);
    }
    
    
}

