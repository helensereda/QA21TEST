package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckOutPage;
import pages.YourCartPage;

import static baseEntities.BaseTest.driver;

public class YourCartSteps extends BaseTest  {
    private BaseTest baseTest;
    private YourCartPage yourCartPage;

    public YourCartSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @When("user click checkout button")
    public void clickCheckoutButton() {
        yourCartPage.getCheckoutButtonInput().click();
    }

    @Then("checkout page is displayed")
    public void isCheckOutPageDisplayed() {
        Assert.assertTrue(new CheckOutPage(driver).isPageOpened());
    }
}
