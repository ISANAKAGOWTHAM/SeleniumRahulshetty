package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;


public class Autosuggestions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        //driver.findElement(By.partialLinkText("//a[text()='India']")).click();
                ////a[text()='India']
      List<WebElement > options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

      for(WebElement   option:options){
          if(option.getText().equalsIgnoreCase("India"))
          {
              option.click();
              break;
          }
      }

    }
}