package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://www.training-support.net");
        WebElement element= wDriver.findElement(By.xpath("//*[@id='about-link']"));   //Error while copying relative xpath
        System.out.println("Using xpath: " + element.getText());
        Thread.sleep(1000);
        wDriver.close();
    }
}
