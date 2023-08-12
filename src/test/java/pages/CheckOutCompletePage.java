package pages;

import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckOutCompletePage extends BasePage_hw{
    private final static String pagePath = "/checkout-complete.html";

    // Блок описания локаторов для элементов
    private final By checkOutCompleteLocator = By.id("checkout_complete_container");
    private final By finishButtonLocator = By.id("back-to-products");

    //блок инициализации
    public CheckOutCompletePage (WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }
    //Блок атомарных методов

    public WebElement getCheakOutComplete() {
        return driver.findElement(checkOutCompleteLocator);
    }

    public WebElement getFinishButton() {
        return driver.findElement(finishButtonLocator);
    }
    // Блок комплексных методов

}
