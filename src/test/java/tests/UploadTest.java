package tests;
import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.UploadPage;
import services.WaitService;

import java.io.File;
import java.util.List;
public class UploadTest extends BaseTest {
    @Test
    public void uploadFileTest()  {
        WaitService waitService = new WaitService(driver);
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.openPageByUrl();

        String pathToFile = "C:/Users/elena.sereda/IdeaProjects/QA21TEST/src/test/resources/picture.webp";
//        String pathToFile = UploadTest.class.getClassLoader().getResource("picture.webp").getPath(); не получилось
//        File file = new File ("src/test/resources/picture.webp");
//        System.out.println(pathToFile);

        uploadPage.getButtonUpload().sendKeys(pathToFile);
        uploadPage.getButtonSubmit().click();
        Assert.assertEquals("picture.webp",uploadPage.getLabelUploaded().getText());

    }
}