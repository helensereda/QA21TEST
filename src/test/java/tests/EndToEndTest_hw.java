package tests;



import baseEntities.BaseTest_hw;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
public class EndToEndTest_hw extends BaseTest_hw {
    @Test
    public void successLoginTest() throws InterruptedException {

        Assert.assertTrue(
                loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
                ).isPageOpened());

        Assert.assertTrue(
                addCartStep.successAddCart().isPageOpened());

        Assert.assertTrue(
                checkCartStep.successCheckCart().isPageOpened());

        Assert.assertTrue(
                addInfoStep.successInfo(ReadProperties.firstname(), ReadProperties.lastname(), ReadProperties.code()).isPageOpened());

        Assert.assertTrue(
                finishStep.successFinish().isPageOpened());
    }
}



