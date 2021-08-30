package customer_relationship_management;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
public class Activity4 {
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
    public void verifyLoginTest(){
        WebElement buttonElement = driver.findElement(By.id("bigbutton"));
        buttonElement.click();
    }
  
    @Test(dependsOnMethods = {"verifyLoginTest"})
    public void verfiyHomepageTest(){
        String expectedUrl = "https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
        try{
            Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
            System.out.println("Navigated to homepage");
        }
        catch(Throwable pageNavigationError){
            System.out.println("Didn't navigate to homepage");
        }
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}