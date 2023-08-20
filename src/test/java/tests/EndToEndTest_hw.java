package tests;



import baseEntities.BaseTest_hw;
import helper.DataHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.AddInfoStep;
import utils.configuration.ReadProperties;
public class EndToEndTest_hw extends BaseTest_hw {

    @Test
    public void successTest(){
        loginStep.successLogin(DataHelper.getStandartUser()).isPageOpened();
        addCartStep.addToCard().isPageOpened();
        addCartStep.openCart().isPageOpened();
        checkCartStep.checkOut().isPageOpened();
        addInfoStep.getInfo(DataHelper.getCommonProject()).isPageOpened();
        addInfoStep.continueCheckout().isPageOpened();
        Assert.assertTrue(finishStep.successFinish().isPageOpened());
    }
}


