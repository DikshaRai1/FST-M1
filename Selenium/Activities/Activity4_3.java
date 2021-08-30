package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://www.training-support.net/selenium/target-practice");       // Opening the browser 
        System.out.println(wDriver.getTitle());                                         // Printing the titlte of the webpage

        WebElement element= wDriver.findElement(By.xpath("//h3[@id='firstName']"));
        element.getText();
}
}