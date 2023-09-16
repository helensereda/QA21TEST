package tests;

import baseEntities.BaseTest;
import helper.DataHelper;
import models.Project;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                loginStep.successLogin(DataHelper.getAdminUser()).isPageOpened()
        );
    }

    @Test
    public void incorrectEmailLoginTest() {
        User user = new User();
        user.setEmail("asdasd");
        user.setPassword(ReadProperties.password());

        Assert.assertEquals(
                loginStep.negativeLogin(user).getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again."
        );
    }

    @Test
    public void incorrectPswLoginTest() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword("123456");

        Assert.assertEquals(
                loginStep.negativeLogin(user).getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void builderTest() throws InterruptedException {
        Thread.sleep(5000);
        Project project = new Project.Builder()
                .withProjectName("ssdfsd")
                .withProjectType(1)
                .withFlag(true)
                .build();
    }
}