package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

import java.io.File;
import java.util.List;

public class ActionTests extends BaseTest {

    @Test
    public void hoverTest() {
        driver.get("http://the-internet.herokuapp.com/hovers");

        WaitService waitService = new WaitService(driver);
        Actions actions = new Actions(driver);

        List<WebElement> targetElements = waitService.waitForAllVisibleElementsLocatedBy(By.className("figure"));

        actions
                .moveToElement(targetElements.get(0), 10, 10)
                .click(waitService.waitForVisibilityLocatedBy(By.cssSelector("[href='/users/1']")))
                .build()
                .perform();

        Assert.assertTrue(waitService.waitForElementInvisible(targetElements.get(0)));
    }

    @Test
    public void uploadFileTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/upload");

        WaitService waitService = new WaitService(driver);

        WebElement fileUploadElement = waitService.waitForExists(By.id("file-upload"));
//       String pathToFile = "C:/Users/elena.sereda/IdeaProjects/QA21TEST/src/test/resources/download.jpeg";
        String pathToFile = ActionTests.class.getClassLoader().getResource("download.jpeg").getPath();
        File file = new File ("src/test/resources/download.jpeg");
        System.out.println(pathToFile);
        fileUploadElement.sendKeys(file.getAbsolutePath());

        waitService.waitForVisibilityLocatedBy(By.id("file-submit")).submit();

        Thread.sleep(5000);
    }
}
