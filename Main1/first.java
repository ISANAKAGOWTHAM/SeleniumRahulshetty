package Main;



import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Gowtham");
        driver.get("https://rahulshettyacademy.com/locatorspractice");
       System.out.println( driver.getTitle());
       // driver.close();
    }
}
