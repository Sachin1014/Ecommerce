package seleniumjava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

    public static void main(String[] args) throws InterruptedException, IOException {

        String homepage = "http://www.zlti.com";
        WebDriverManager.chromedriver().setup();
        // initialize driver
        WebDriver driver = new ChromeDriver();
        // maximize windows
        // driver.manage().window().maximize();

        driver.get(homepage);

        Thread.sleep(3000);

        // capture links from a webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // number of links
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            // by using href attributes we can get the URL of required link
            WebElement element = links.get(i);
            String URL = element.getAttribute("href");
            if (URL != null && !URL.isEmpty()) {
                URL link = new URL(URL);

                // create connection using url connection 'link'
                HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                // wait time
                Thread.sleep(2000);
                // establish connection
                httpConn.connect();

                int rescode = httpConn.getResponseCode();

                if (rescode >= 400) {
                    System.out.println(URL + " - " + " is broken link (HTTP " + rescode + ")");
                } else {
                    System.out.println(URL + " - " + " is valid link (HTTP " + rescode + ") ");
                }

            }

        }
    }
}
