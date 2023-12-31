package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions a= new Actions(driver);
        a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

    }
}
