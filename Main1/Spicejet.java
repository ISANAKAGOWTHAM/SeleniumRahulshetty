package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Spicejet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
      List<WebElement > options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


        for(WebElement   option:options){
              if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        System.out.println(driver.findElement(By.cssSelector("a[value='BLR']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
        System.out.println(driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).getText());
        //driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();


        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("hrefIncAdt")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for(int i=1;i<5;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        //Thread.sleep(2000);
        driver.findElement(By.id("btnclosepaxoption")).click();
       WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select dropdown= new Select(staticDropdown);
         dropdown.selectByIndex(3);
         System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();



    }
}