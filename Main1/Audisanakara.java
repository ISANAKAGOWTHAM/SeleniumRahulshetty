package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Audisanakara {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.audisankara.ac.in/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement home=driver.findElement(By.id("nav-menu"));
        System.out.println(home.findElements(By.tagName("a")).size());
        WebElement slides=driver.findElement(By.id("carousel-example-generic"));
        System.out.println(slides.findElements(By.tagName("a")).size());
        driver.switchTo().alert().dismiss();

        WebElement recu=driver.findElement(By.xpath("(//div[@class='row'])[3]"));
        System.out.println(recu.findElements(By.tagName("a")).size());
        WebElement plans=driver.findElement(By.xpath("(//div[@class='row'])[12]"));
        System.out.println(plans.findElements(By.tagName("a")).size());
        WebElement sy=driver.findElement(By.xpath("(//div[@class='row'])[13]"));
        System.out.println(sy.findElements(By.tagName("a")).size());

    }
}