package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
        driver.manage().window().maximize();
        driver.findElement(By.id("FirstName")).sendKeys("Gowtham");
        driver.findElement(By.xpath("//input[@data-val-required='Please enter surname']")).sendKeys("Isanaka");
        driver.findElement(By.name("E_post")).sendKeys("Podalakur");
        driver.findElement(By.cssSelector("input#Mobile")).sendKeys("8333824656");
        driver.findElement(By.id("Username")).sendKeys("Gowtham icon");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Gowthamicon63@");
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Gowthamicon63@");
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
        System.out.println(driver.findElement(By.xpath("//label[text()='Registration Successful']")).getText());
    }
}