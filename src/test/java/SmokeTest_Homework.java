import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

import static java.lang.Thread.sleep;

public class SmokeTest_Homework {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @Test
    public void calculatorElectricTest() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement widthInput = driver.findElement(By.id("el_f_width"));
        WebElement lenght = driver.findElement(By.id("el_f_lenght"));
        WebElement lostInput = driver.findElement(By.id("el_f_losses"));
        WebElement calcButton = driver.findElement(By.name("button"));

        widthInput.sendKeys("12");
        lenght.sendKeys("20");

        WebElement selectWebElement = driver.findElement(By.id ("room_type"));
        Select SelectRoom = new Select(selectWebElement);
        SelectRoom.selectByIndex(1);
        Thread.sleep(2000);


        WebElement selectWebElement1 = driver.findElement(By.id ("heating_type"));
        Select SelectHeating = new Select(selectWebElement1);
        SelectHeating.selectByValue("2");
        Thread.sleep(2000);

        lostInput.sendKeys("0");


        calcButton.click();


        WebElement result = driver.findElement(By.id ("floor_cable_power"));
        WebElement result1 = driver.findElement(By.id ("spec_floor_cable_power"));


        Assert.assertTrue(driver.findElement(By.id("floor_cable_power")).getAttribute("value").equals("28800"), "Верное значение");
        Assert.assertTrue(driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value").equals("120"), "Верное значение");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}