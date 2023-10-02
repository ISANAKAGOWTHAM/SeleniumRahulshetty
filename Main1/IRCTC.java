package Main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
public class IRCTC {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://autoretail-client-app-ist.apps.stg.azr-cc-pcf.cloud.bns/");


        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[@id='idToken1']")).sendKeys("s0449148");
       // driver.findElement(By.id("idToken1")).sendKeys("s0449148");
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Scotiabank1");
        //driver.findElement(By.id("loginButton_0")).click();

        driver.findElement(By.xpath("//p[text()='Admin']")).click();
        driver.findElement(By.className("dx-texteditor-input")).sendKeys("70001330");
        //driver.findElement(By.id("idToken1")).sendKeys("s0449148");
       // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Scotiabank1");
        //driver.findElement(By.id("loginButton_0")).click();
        driver.findElement(By.className("dx-button-content")).click();


    }
}
