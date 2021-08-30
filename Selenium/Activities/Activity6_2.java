package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver wDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(wDriver, 10);

        wDriver.get("https://training-support.net/selenium/ajax");

        wDriver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
                
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
              
        String ajaxText = wDriver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);
                
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
                
        String lateText = wDriver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
        
        wDriver.close();
    }
}