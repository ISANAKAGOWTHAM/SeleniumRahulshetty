package Main;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class JavaScpritScrolling {
    public static  void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js=(JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
       List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
       int sum=0;
       for(int i=0;i<values.size();i++)

       {

          sum= sum+ Integer.parseInt(values.get(i).getText());

       }
       System.out.println(sum);
       driver.findElement(By.cssSelector(".totalAmount")).getText();
      int total= Integer.parseInt( driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        System.out.println(total);



    }
}