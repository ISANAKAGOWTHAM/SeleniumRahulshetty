package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Train {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.irctc.co.in/nget/profile/user-registration");
       // driver.switchTo().alert().dismiss();
        //Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']")).click();
        driver.findElement(By.id("userName")).sendKeys("bhargavBhargav");
        driver.findElement(By.cssSelector("input#usrPwd")).sendKeys("Bhargav$27");
        driver.findElement(By.xpath("//input[@name='cnfUsrPwd']")).sendKeys("Bhargav$27");
        driver.findElement(By.xpath("(//div[@style='width: 100%;'])[1]")).click();
        driver.findElement(By.xpath("//span[text()='English']")).click();
        driver.findElement(By.xpath("//p-dropdown[@formcontrolname='secque']")).click();
        driver.findElement(By.xpath("//span[text()='Who was your Childhood hero?']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Security Answer']")).sendKeys("Gowtham");
        driver.findElement(By.cssSelector("button[label='Continue']")).click();
        driver.findElement(By.id("firstName")).sendKeys("gowtham");
        driver.findElement(By.name("lastname")).sendKeys("icon");
        driver.findElement(By.xpath("//p-dropdown[@formcontrolname='occupation']")).click();
        driver.findElement(By.xpath("//span[text()='PROFESSIONAL']")).click();
        //input[@placeholder='Date Of Birth']
        driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']")).sendKeys("29-07-1999");
        driver.findElement(By.id("unmarried")).click();
        driver.findElement(By.xpath("//span[text()='Male']")).click();
        driver.findElement(By.name("email")).sendKeys("gowthamicon470@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Mobile']")).sendKeys("9989828546");
        WebElement staticDropdown= driver.findElement(By.cssSelector("select[formcontrolname='nationality']"));
        Select dropdown= new Select(staticDropdown);

        dropdown.selectByVisibleText("India");
        System.out.println( dropdown.getFirstSelectedOption().getText());

        //driver.findElement(By.cssSelector("select[formcontrolname='nationality']")).click();
        driver.findElement(By.xpath("//button[@label='Continue']")).click();
        driver.findElement(By.name("resAddress1")).sendKeys("32/176 Ram Nagar");

        driver.findElement(By.xpath("//input[@placeholder='Pin code']")).sendKeys("524345");
        driver.findElement(By.id("resState")).sendKeys("Andhra pradesh");
        WebElement staticDropdown1= driver.findElement(By.xpath("//select[@formcontrolname='resCity']"));
        Select dropdown1= new Select(staticDropdown1);

        dropdown1.selectByVisibleText("SPSR NELLORE");
        System.out.println( dropdown1.getFirstSelectedOption().getText());
        WebElement staticDropdown2= driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']"));
        Select dropdown2= new Select(staticDropdown2);

        dropdown2.selectByVisibleText("Podalakur S.O");
        System.out.println( dropdown2.getFirstSelectedOption().getText());
        driver.findElement(By.id("resPhone")).sendKeys("9989828546");
        driver.findElement(By.xpath("(//div[@role='radio'])[3]")).click();
        Thread.sleep(13000);
        //driver.findElement(By.id("captcha")).sendKeys("tdHNJr");
        //driver.findElement(By.xpath("(//span[@class='col-xs-1 zeroPadding'])[2]")).click();
       // driver.findElement(By.xpath("//button[@label='Register']")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();





    }
}