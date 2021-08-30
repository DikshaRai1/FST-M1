package customer_relationship_management;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
public class Activity7 {
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
    public void readPopupTest(){
        WebElement salesElement = driver.findElement(By.id("grouptab_0"));
        Actions action = new Actions(driver);
        action.moveToElement(salesElement);
        WebElement leadsElement = driver.findElement(By.id("moduleTab_9_Leads"));
        action.moveToElement(leadsElement).click().build().perform();
        List<WebElement> elements = driver.findElements(By.className("suitepicon suitepicon-action-info"));
        for (WebElement webElement : elements) {
            webElement.click();
            WebElement phoneElement = driver.findElement(By.className("phone"));
            System.out.println(phoneElement.getText());
        }
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
