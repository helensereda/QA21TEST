package stepDefs;

import baseEntities.BaseTest_hw;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckOutPage;
import pages.ProductsPage;
import pages.YourCartPage;

import static baseEntities.BaseTest_hw.driver;

public class YourCartSteps {
    private BaseTest_hw baseTest;
    private YourCartPage yourCartPage;

    public YourCartSteps(BaseTest_hw baseTest) {
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
