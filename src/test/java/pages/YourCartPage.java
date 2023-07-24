package pages;

import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage extends BasePage_hw {
    private final static String pagePath = "cart.html";
//     блок описания локаторов для элементов

    private final By headerCartTitleLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By checkoutButtonLocator = By.id("checkout");
    //блок инициализации
    public YourCartPage(WebDriver driver)
    {
        super(driver);
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return headerCartTitleLocator;
    }

//    Блок атомарных методов
    public WebElement getHeaderCartTitleInput() {
        return driver.findElement(headerCartTitleLocator);
    }

    public WebElement getCheckoutButtonInput() {
        return driver.findElement(checkoutButtonLocator);
    }

    // Блок комплексных методов
    public void checkCart() {
        getCheckoutButtonInput().click();
    }

}

