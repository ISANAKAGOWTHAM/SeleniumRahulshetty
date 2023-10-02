package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandle {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.partialLinkText("Multiple Windows")).click();
        driver.findElement(By.partialLinkText("Click Here")).click();
       Set <String> window= driver.getWindowHandles();
        Iterator<String> it=window.iterator();
       String parent= it.next();
        String child =it.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
    }
}
