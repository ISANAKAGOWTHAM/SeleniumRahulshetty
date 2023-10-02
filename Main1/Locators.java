package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("gowtham@123");
        driver.findElement(By.className("signInBtn")).click();
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       driver.findElement(By.linkText("Forgot your password?")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gowtham");
       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("gowthamicon63@gmail.com");
       driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("8333824656");
       driver.findElement(By.className("reset-pwd-btn")).click();
      System.out.println( driver.findElement(By.className("infoMsg")).getText());
     // driver.findElement(By.className("go-to-login-btn")).click();
     driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
     driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Gowtham");
     driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
     Thread.sleep(2000);
     driver.findElement(By.id("chkboxOne")).click();
     driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
       driver.findElement(By.className("logout-btn")).isDisplayed();
       //driver.close();
    }
}