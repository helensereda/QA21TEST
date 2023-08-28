package stepDefs;

import baseEntities.BaseTest_hw;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CheckOutCompletePage;
import pages.CheckOutOverPage;
import pages.CheckOutPage;

import static baseEntities.BaseTest_hw.driver;

public class CheckOutOverSteps {

    private BaseTest_hw baseTest;
    private CheckOutOverPage checkOutOverPage;

    public CheckOutOverSteps(BaseTest_hw baseTest) {
        this.baseTest = baseTest;
    }
    @Then ("user click finish button")
    public void getPayment() {
        checkOutOverPage.getFinishButton().click();
    }
    @Then("checkoutcomplete page is displayed")
    public void isCheckOutCompletePageDisplayed() {
        Assert.assertTrue(new CheckOutCompletePage(driver).isPageOpened());
    }
}
