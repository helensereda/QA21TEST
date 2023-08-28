package stepDefs;

import baseEntities.BaseTest_hw;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductsPage;
import pages.YourCartPage;

import static baseEntities.BaseTest_hw.driver;

public class ProductsSteps {
    private BaseTest_hw baseTest;
    private ProductsPage productsPage;

    public ProductsSteps(BaseTest_hw baseTest) {
        this.baseTest = baseTest;
    }
    @When("user click add to cart")
    public void clickAddToCartButton() {
        productsPage.getAddToCardInput().click();
    }
    @When("user click shopping cart button")
    public void clickShoppingCartButton() {
        productsPage.getShoppingCartInput().click();
    }
    @Then("your cart page is displayed")
    public void isYourCartPageDisplayed() {
        Assert.assertTrue(new YourCartPage(driver).isPageOpened());
    }
}


