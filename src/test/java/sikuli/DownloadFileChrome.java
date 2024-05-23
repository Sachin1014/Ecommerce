package sikuli;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFileChrome {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver.get("https://demo.automationtesting.in/FileDownload.html");

        text();
        pdf();

    }

    public static void text() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='createTxt']")).click();
        driver.findElement(By.xpath("//a[@id='link-to-download']")).click();

        if (fileExist("C://Users/Admin/Downloads")) {
            System.out.println("File Exist");
        } else {
            System.out.println("File not exist");
        }
    }

    public static void pdf() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("Testing");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='createPdf']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();

        if (fileExist("C://Users/Admin/Downloads")) {
            System.out.println("File Exist");
        } else {
            System.out.println("File not exist");
        }

    }

    static boolean fileExist(String Path) {
        File f = new File(Path);
        if (f.exists()) {
            return true;
        } else {
            return false;

        }
    }
}
