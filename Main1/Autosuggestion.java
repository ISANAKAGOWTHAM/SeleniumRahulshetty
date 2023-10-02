package Main;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Autosuggestion {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(3000);
       // driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
       // driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
       //System.out.println( driver.findElement(By.id("autocomplete")).getAttribute("value"));

       List<WebElement> con= driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
       for(WebElement Country:con)
       {
           if(Country.getText().equalsIgnoreCase("India")){
                Country.click();
               break;
           }
       }

      
    }
}