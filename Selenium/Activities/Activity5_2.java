package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) throws InterruptedException{
    WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://training-support.net/selenium/dynamic-controls"); 
        System.out.println(wDriver.getTitle());
        WebElement checkBoxElement = wDriver.findElement(By.className("willDisappear"));
        System.out.println(checkBoxElement.isSelected());
        checkBoxElement.click();
        System.out.println(checkBoxElement.isSelected());
        Thread.sleep(1000);
        wDriver.close();
}
}
