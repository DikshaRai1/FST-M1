package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver wDriver = new FirefoxDriver();
                
        wDriver.get("https://training-support.net/selenium/dynamic-attributes");
        
        WebElement userName = wDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input"));
        WebElement password = wDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input"));
    
        userName.sendKeys("admin");
        password.sendKeys("password");

        wDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();
        
        String message = wDriver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
            
        wDriver.close();

    }
}