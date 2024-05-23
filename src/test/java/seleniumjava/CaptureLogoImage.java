package seleniumjava;



import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class CaptureLogoImage {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        
        WebElement ImageLogo = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
       // Screenshot CaptureLogo = new AShot().takeScreenshot(driver, ImageLogo);

        Screenshot CaptureLogo = new AShot().coordsProvider(new 
        WebDriverCoordsProvider()).takeScreenshot(driver, ImageLogo);
        
        ImageIO.write(CaptureLogo.getImage(), "png", new File("C://Users/Admin/Downloads/OrangeHRMlogo.png"));
        File f = new File("C://Users/Admin/Downloads/OrangeHRMlogo.png");
        if (f.exists())
        {
            System.out.println("Image exists");
            
        }
        else
        {
            System.out.println("Image does not exist");
        }


        

    }

    

}


