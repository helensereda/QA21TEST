package tests;



import baseEntities.BaseTest_hw;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
public class EndToEndTest_hw extends BaseTest_hw {

    @Test
    public void successTest()  {
                loginStep.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened();
                addCartStep.successAddCart().isPageOpened();
                checkCartStep.successCheckCart().isPageOpened();
                addInfoStep.successInfo(ReadProperties.firstname(), ReadProperties.lastname(), ReadProperties.code()).isPageOpened();
                Assert.assertTrue(finishStep.successFinish().isPageOpened());
    }
}



