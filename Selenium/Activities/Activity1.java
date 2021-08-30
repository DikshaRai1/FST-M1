package automation_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1{
    public static void main(String[] args) throws InterruptedException {
        WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://www.training-support.net"); 
        Thread.sleep(1000);
        wDriver.close();
    }
}