package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.irctc.co.in/nget/profile/user-registration");
        driver.findElement(By.xpath("//button[@label='Continue']")).click();
        driver.findElement(By.xpath("//p-calendar[@formcontrolname='dob']")).click();
        driver.findElement(By.xpath("//option[@value='6']")).click();


        WebElement dropdown1=driver.findElement(By.cssSelector(".ui-datepicker-year.ng-tns-c58-10.ng-star-inserted"));
        Select Year= new Select(dropdown1);
        Year.selectByVisibleText("2000");
        System.out.println(Year.getFirstSelectedOption().getText());

    }
}