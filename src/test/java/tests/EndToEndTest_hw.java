package tests;



import baseEntities.BaseTest_hw;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutCompletePage;
import pages.LoginPage_hw;
import utils.configuration.ReadProperties;
public class EndToEndTest_hw extends BaseTest_hw {


    @Test
    public void successTest()  {
        new LoginPage_hw(driver)


                .login_hw(ReadProperties.username(),ReadProperties.password())
                .addToCart()
                .openCart()
                .checkout()
                .getInfo(ReadProperties.firstname(), ReadProperties.lastname(), ReadProperties.code())
                .checkOutInfo()
                .finishCheckout();
                Assert.assertTrue(new CheckOutCompletePage(driver).isPageOpened());
    }
}



