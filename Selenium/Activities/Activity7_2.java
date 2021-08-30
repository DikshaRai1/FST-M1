package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver wDriver = new FirefoxDriver();
        
        wDriver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
        WebElement userName = wDriver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = wDriver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = wDriver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        WebElement email = wDriver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));

        userName.sendKeys("NewUser");
        password.sendKeys("Password");
        confirmPassword.sendKeys("Password");
        email.sendKeys("real_email@xyz.com");
       
        wDriver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        String loginMessage = wDriver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        wDriver.close();

    }
}
