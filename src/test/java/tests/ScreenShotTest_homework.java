package tests;

import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenShotTest_homework extends BaseTest {

    @Test
    @Story("AQA21-1100")
    @TmsLink("TestCase-17")
    @Description("Test with alert")
    @Severity(SeverityLevel.NORMAL)
    public void infoAlertTest() {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[. = 'Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
    }
}