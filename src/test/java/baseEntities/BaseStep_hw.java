package baseEntities; //

import org.openqa.selenium.WebDriver;
import pages.*;
public class BaseStep_hw {

    protected LoginPage_hw loginPage;
    protected ProductsPage productsPage;
    protected YourCartPage yourCartPage;
    protected CheckOutPage checkOutPage;
    protected CheckOutOverPage checkOutOverPage;
    protected CheckOutCompletePage checkOutCompletePage;

    public BaseStep_hw() {

        loginPage = new LoginPage_hw();
        productsPage = new ProductsPage();
        yourCartPage = new YourCartPage();
         checkOutPage = new CheckOutPage();
        checkOutOverPage = new CheckOutOverPage();
        checkOutCompletePage = new CheckOutCompletePage();

    }
}