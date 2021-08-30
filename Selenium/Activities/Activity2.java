package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://www.training-support.net");
        System.out.println(wDriver.getTitle());

        //Using id
        WebElement element= wDriver.findElement(By.id("about-link"));
        System.out.println("Using id: " + element.getText());

        //Using className
        element= wDriver.findElement(By.className("ui inverted huge green button"));
        System.out.println("Using className: " + element.getText());

        //Using linkText
        element= wDriver.findElement(By.linkText("About us"));
        System.out.println("Using linkText: " + element.getText());

        //Using cssSelector
        element= wDriver.findElement(By.cssSelector("#about-link"));
        System.out.println("Using cssSelector: " + element.getText());
        
        Thread.sleep(3000);
        wDriver.close();
    }
}
