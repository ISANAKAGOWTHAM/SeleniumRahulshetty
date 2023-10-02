package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogIn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/Login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("Username")).sendKeys("Gowtham icon");
        driver.findElement(By.xpath("//input[@data-val-required='Please enter password']")).sendKeys("Gowthamicon63@");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        driver.findElement(By.id("Name")).sendKeys("Gowtham");
        driver.findElement(By.name("Company")).sendKeys("Tech Mahindra");
        driver.findElement(By.id("Address")).sendKeys("Ram Nagar");
        driver.findElement(By.name("City")).sendKeys("Podalakur");
        driver.findElement(By.id("Phone")).sendKeys("8333824656");
        driver.findElement(By.name("Email")).sendKeys("gowthamicon63@gmail.com");
        driver.findElement(By.xpath("//input[@value='Create']")).click();
        driver.findElement(By.id("searching")).sendKeys("Gowtham");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()='Log out']")).click();

    }
}