import factory.BrowserFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class BasicLocatorsTest {      //https://www.saucedemo.com/
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicLocatorsTest_1() {
        driver.get(ReadProperties.getUrl());

        // Find webElement by ID
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());

        // Find webElement by Name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // Find webElement by Tag
        driver.findElement(By.id("login-button")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//        // Find webElement by LinkText
//        driver.findElement(By.linkText("Forgot password?")).click();

        driver.findElement(By.tagName("div")).isDisplayed();

        // Find webElement by ClassName
        driver.findElement(By.className("login_logo")).isDisplayed();

//        // Find webElement by PartialLinkText
//        driver.findElement(By.partialLinkText("Accepted")).isDisplayed();
    }

}