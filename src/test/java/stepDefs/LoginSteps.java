package stepDefs;

import baseEntities.BaseTest_hw;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage_hw;
import pages.ProductsPage;
import utils.configuration.ReadProperties;

public class LoginSteps extends BaseTest_hw {
    private BaseTest_hw baseTest;
    private LoginPage_hw loginPage;

    public LoginSteps(BaseTest_hw baseTest) {
        this.baseTest = baseTest;
    }

    @Given("start browser")
    public void startBrowser() {

    }

    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @When("user enter username {} and password {}")
    public void setUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage_hw(driver);
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getloginButton().click();
    }

    @Then("products page is displayed")
    public void isProductsPageDisplayed() {
        Assert.assertTrue(new ProductsPage(driver).isPageOpened());
    }
}