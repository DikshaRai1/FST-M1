package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://training-support.net/selenium/dynamic-controls"); 
        System.out.println(wDriver.getTitle());
        WebElement textBoxElement = wDriver.findElement(By.id("dynamicText"));
        System.out.println(textBoxElement.isEnabled());
        wDriver.findElement(By.id("toggleInput"));
        System.out.println(textBoxElement.isEnabled());
        Thread.sleep(1000);
        wDriver.close();
    }
}
