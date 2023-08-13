package tests;

import baseEntities.BaseTest_hw;
import helper.DataHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.AddInfoStep;
import utils.configuration.ReadProperties;
@Slf4j
public class EndToEndTest_hw extends BaseTest_hw {

    Logger logger = LogManager.getLogger(EndToEndTest_hw.class);
    @Test
    public void successTest()  {
        loginStep.successLogin(DataHelper.getStandartUser()).isPageOpened();
        addCartStep.addToCard().isPageOpened();
        addCartStep.openCart().isPageOpened();
        checkCartStep.checkOut().isPageOpened();
        addInfoStep.getInfo(DataHelper.getCommonProject()).isPageOpened();
        addInfoStep.continueCheckout().isPageOpened();
        Assert.assertTrue(finishStep.successFinish().isPageOpened());
    }
}



