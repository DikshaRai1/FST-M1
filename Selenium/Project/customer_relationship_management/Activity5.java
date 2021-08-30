package customer_relationship_management;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
public class Activity5 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void verifyUsernameTest() {
        WebElement usernameElement = driver.findElement(By.id("user_name"));
        usernameElement.sendKeys("admin");
    }
  
    @Test(dependsOnMethods = {"verifyUsernameTest"})
    public void verifyPasswordTest(){
        WebElement passwordElement = driver.findElement(By.id("username_password"));
        passwordElement.sendKeys("pa$$w0rd");
    }

    @Test(dependsOnMethods = {"verifyPasswordTest"})
    public void getColorTest(){
        WebElement navigatioElement = driver.findElement(By.xpath("/html/body/div[2]/nav/div"));
        String color=navigatioElement.getCssValue("background-color");
        System.out.println(color);
        String hex = Color.fromString(color).asHex();
        System.out.println(hex);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}