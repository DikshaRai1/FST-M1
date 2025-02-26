package automation_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

    public static void main(String[] args) {
        WebDriver wDriver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(wDriver, 10);
        
        wDriver.get("https://training-support.net/selenium/dynamic-controls");

        WebElement checkbox = wDriver.findElement(By.className("willDisappear"));
        WebElement toggleCheckboxButton = wDriver.findElement(By.id("toggleCheckbox"));
        
        toggleCheckboxButton.click();
             
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
               
        toggleCheckboxButton.click();
                
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
                
        wDriver.close();
    }

}