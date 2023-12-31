package Main;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

        driver.findElement(By.id("okayBtn")).click();
       WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown= new Select(staticdropdown);
        dropdown.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
      // List <WebElement> items = driver.findElement(By.className("card-footer"));
        List <WebElement> items = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for(int i=0;i<items.size();i++){
            items.get(i).click();
        }
        driver.findElement(By.partialLinkText("Checkout")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.xpath("//a[text()='India']")).click();
       // driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
    }
}