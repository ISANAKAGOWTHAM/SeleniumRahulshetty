package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown= new Select(staticDropdown);
        dropdown.selectByIndex(3);
       System.out.println( dropdown.getFirstSelectedOption().getText());
       dropdown.selectByVisibleText("AED");
        System.out.println( dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println( dropdown.getFirstSelectedOption().getText());

    }
}