package baseEntities; //

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep_hw {
    protected WebDriver driver;
    protected LoginPage_hw loginPage;
    protected ProductsPage productsPage;
    protected YourCartPage yourCartPage;
    protected CheckOutPage checkOutPage;
    protected CheckOutOverPage checkOutOverPage;
    protected CheckOutCompletePage checkOutCompletePage;

    public BaseStep_hw(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage_hw(driver);
        productsPage = new ProductsPage(driver);
        yourCartPage = new YourCartPage(driver);
         checkOutPage = new CheckOutPage(driver);
        checkOutOverPage = new CheckOutOverPage(driver);
        checkOutCompletePage = new CheckOutCompletePage(driver);

    }
}