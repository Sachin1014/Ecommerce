package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, FindFailed {
        WebDriverManager.chromedriver().setup();

        // driver.get("https://qa.admin.frp.live/addTracks");
        driver.manage().window().maximize();
        driver.get("https://qa.admin.frp.live/");
        start();
        sikulimethod();
    }

    public static void start() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='m_login']/div/div/div/form/div[1]/input")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //div[@id='m_login']/div/div/div/form/div[2]/input")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@id='m_login_signin_submit']")).click();
        Thread.sleep(2000);
        WebElement tracks = driver.findElement(By.xpath("//div[@id='m_ver_menu']/ul/li[2]/a[4]/span"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(tracks).click().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Select preset = new Select(driver.findElement(By.xpath("//select[@id='presets']")));
        preset.selectByIndex(1);
        Select genre = new Select(driver.findElement(By.xpath("//select[@id='Genre']")));
        genre.selectByIndex(1);
        Thread.sleep(2000);
        WebElement choose = driver.findElement(By.xpath("//div[@class='d-flex']/div[1]/input"));
        Thread.sleep(2000);
        actions.moveToElement(choose).click().perform();
    }

    public static void sikulimethod() throws FindFailed, InterruptedException {
        String imageFilepath = "C:\\Users\\Admin\\";
        String inputFilepath = "C:\\Users\\Admin\\";

        Screen s = new Screen();
        Pattern fileInputTextbox = new Pattern(imageFilepath + "Capture");
        Pattern openButton = new Pattern(imageFilepath + "OpenBox");
        Thread.sleep(5000);
        s.wait(fileInputTextbox, 20);
        s.type(fileInputTextbox, inputFilepath + "Tha Dogg Pound & Snoop Dogg - Smoke Up (Clean)");
        s.click(openButton);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/div/div/div/div[2]/div[4]/button[1]"))
                .click();

    }

}
