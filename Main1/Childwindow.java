package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Childwindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise");
        driver.manage().window().maximize();
        driver.findElement(By.className("blinkingText")).click();
       Set<String> windows =driver.getWindowHandles();
      Iterator<String> it= windows.iterator();
      String parentWindow=it.next();
      String childwindow=it.next();
      driver.switchTo().window(childwindow);
      System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
        driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
     String emailid = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys(emailid);
    }
}