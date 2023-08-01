package tests;

import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

public class ScreenShotTest_homework extends BaseTest {

    @Test
    @Story("AQA21-1100")
    @TmsLink("TestCase-1")
    @Description("Test with screenshot, failed")
    @Severity(SeverityLevel.CRITICAL)
    public void infoAlertTest() {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[. = 'Click']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
    }
    @Test
    @Story("AQA21-1100")
    @TmsLink("TestCase-2")
    @Description("Test with alert")
    @Severity(SeverityLevel.NORMAL)
    public void confirmAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[. = 'Click for JS Confirm']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.dismiss();
        Thread.sleep(3000);
    }

    @Test
    @Story("AQA21-1100")
    @TmsLink("TestCase-3")
    @Description("Test with alert1")
    @Severity(SeverityLevel.NORMAL)
    public void promptAlertTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WaitService waitService = new WaitService(driver);
        driver.findElement(By.xpath("//button[. = 'Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS prompt");
        alert.sendKeys("Everything is OK!");
        alert.accept();
        Thread.sleep(5000);
    }

}