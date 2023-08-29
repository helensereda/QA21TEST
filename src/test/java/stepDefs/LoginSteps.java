package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.configuration.ReadProperties;

public class LoginSteps extends BaseTest {
    private BaseTest baseTest;
    private LoginPage loginPage;

    public LoginSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Given("start browser")
    public void startBrowser() {

    }
    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
        //driver.get("https://www.saucedemo.com/");
    }
    @When("user enter username {} and password {}")
    public void setUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.getUsernameInput().sendKeys(username);
        loginPage.getPasswordInput().sendKeys(password);

    }
    @When("user clicks login button")
    public void clickLoginButton(){
        loginPage.getloginButton().click();
        }
    @Then("products page is displayed")
    public void isProductsPageDisplayed() {
        Assert.assertTrue(new ProductsPage(driver).isPageOpened());
    }
}