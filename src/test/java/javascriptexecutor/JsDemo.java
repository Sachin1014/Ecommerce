package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsDemo 
{

    public static void flash(WebElement element, WebDriver driver)
    {
        
        String bgcolor = element.getCssValue("backgroundColor");
        for(int i = 0; i < 500; i++) 
        {
            changeColor("#000000", element, driver);
            changeColor(bgcolor, element,driver); 
        }
    }

    public static void changeColor(String color, WebElement element, WebDriver driver ) 
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        try 
        {
            Thread.sleep(20);
        } catch(InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

    public static void drawborder(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].style.border='3px solid red'", element);

    }

}
