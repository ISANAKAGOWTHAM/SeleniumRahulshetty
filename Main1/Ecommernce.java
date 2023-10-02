package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ecommernce {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\II00786883\\Documents\\Project files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        int j = 0;
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++)
        {
            String[] name = products.get(i).getText().split("-");
            String formatedname = name[0].trim();

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formatedname))
            {
                j++;

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length)
                {
                    break;
                }

            }
        }



            driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        driver.findElement(By.className("promoBtn")).click();
            //driver.findElement(By.linkText("//button[text()='Place Order']")).click();

            driver.findElement(By.xpath("//button[text()='Place Order']")).click();
            driver.findElement(By.xpath("//select[@style='width: 200px;']")).click();
            driver.findElement(By.xpath("//option[@value='India']")).click();
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();
            driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        }

    }


