package stepDefs;

import baseEntities.BaseTest_hw;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckOutOverPage;
import pages.CheckOutPage;
import pages.YourCartPage;

import static baseEntities.BaseTest_hw.driver;
public class CheckOutSteps {

    private BaseTest_hw baseTest;
    private CheckOutPage checkOutPage;

    public CheckOutSteps(BaseTest_hw baseTest) {
        this.baseTest = baseTest;
    }


    @When("user enter firstname {} lastname {} and zipcode {}")
    public void enterUserInfo(String firstname, String lastname, String zipcode) {
        checkOutPage.setFirstName(firstname);
        checkOutPage.setLastName("Lastname");
        checkOutPage.setCode("code");
    }
    @When("user click continue checkout")
    public void continueCheckout() {
        checkOutPage.getCheckButtonInput().click();
    }
    @Then("checkoutover page is displayed")
    public void isCheckOutOverPageDisplayed() {
        Assert.assertTrue(new CheckOutOverPage(driver).isPageOpened());
    }

}
