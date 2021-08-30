package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wDriver = new FirefoxDriver();
        wDriver.get("https://training-support.net/selenium/simple-form");       // Opening the browser 
        System.out.println(wDriver.getTitle());                                 // Printing the titlte of the webpage
        
        WebElement element= wDriver.findElement(By.id("firstName"));
        element.sendKeys("Diksha");

        element= wDriver.findElement(By.id("lastName"));
        element.sendKeys("Rai");

        element= wDriver.findElement(By.id("email"));
        element.sendKeys("diksharai045@gmail.com");

        element= wDriver.findElement(By.id("number"));
        element.sendKeys("8109231512");

        element= wDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));
        element.sendKeys("Hello!");
        
        element=wDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input"));
        element.click();
        Thread.sleep(2000);
        wDriver.close();
    }
}
