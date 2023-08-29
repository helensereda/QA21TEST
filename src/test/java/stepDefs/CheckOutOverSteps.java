package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CheckOutCompletePage;
import pages.CheckOutOverPage;

import static baseEntities.BaseTest.driver;

public class CheckOutOverSteps {

    private BaseTest baseTest;
    private CheckOutOverPage checkOutOverPage;

    public CheckOutOverSteps(BaseTest baseTest) {
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
