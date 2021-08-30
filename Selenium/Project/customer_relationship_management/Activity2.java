package customer_relationship_management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void getURLTest() {
        //Finding header on the webpage
        WebElement header = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a"));
        String url= header.getAttribute("href");
        
        //Print the URL of the header
        System.out.println("URL of header: " +url);             
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}