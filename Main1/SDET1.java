package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SDET1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("name")).sendKeys("Gowtham");
        driver.findElement(By.xpath("//input[@placeholder='Enter your mobile phone']")).sendKeys("8333824656");
        driver.findElement(By.cssSelector("input[placeholder='Enter email']")).sendKeys("gowthamicon63@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowthamicon63@");
        driver.findElement(By.id("address")).sendKeys("Ram nagar, Gate center, Podalakur, Nellore distict,andhra pradesh,Pincode:524345");
        driver.findElement(By.name("optionsRadios")).click();
        driver.findElement(By.id("monday")).click();
        WebElement staticDropdown= driver.findElement(By.className("custom-select"));
        Select dropdown= new Select(staticDropdown);
        dropdown.selectByVisibleText("Italy");
        System.out.println( dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.xpath("//label[@for='1year']")).click();
        driver.findElement(By.xpath("//label[@for='selenium']")).click();
       // driver.findElement(By.id("inputGroupFile02")).click();
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}
