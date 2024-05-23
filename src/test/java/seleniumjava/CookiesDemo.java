package seleniumjava;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo 
{

    static WebDriver driver = new ChromeDriver();

    @Test
    public static void main(String[] args) 
    {
       WebDriverManager.chromedriver().setup(); 
       driver.get("https://www.amazon.in/");

       getCookies();
    }

    public static void getCookies()
    {

        Set <Cookie> cookies = driver.manage().getCookies();  //get all cookies from the browser
        System.out.println("Size of the cookie:" +cookies.size());

        // for(Cookie cookie:cookies)  //read all and print all cookies
        // {
        //     System.out.println(cookie.getName()+" : "+cookie.getValue());
        // }
        
        // System.out.println(driver.manage().getCookieNamed( "session-id-time"));

        Cookie cobj = new Cookie("Mycookie", "123456");
        driver.manage().addCookie(cobj);

        cookies = driver.manage().getCookies();


        System.out.println("Size of cookies"+ cookies.size());

        for(Cookie cookie:cookies)  //read all and print all cookies
        {
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }

    }


}
