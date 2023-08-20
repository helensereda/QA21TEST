package pages;

import baseEntities.BasePage_hw;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutCompletePage extends BasePage_hw{
    private final static String pagePath = "/checkout-complete.html";

    // Блок описания локаторов для элементов
    private final By checkOutCompleteLocator = By.id("checkout_complete_container");
    private final By finishButtonLocator = By.id("back-to-products");

    //блок инициализации
    public CheckOutCompletePage () {
        super();
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }
    //Блок атомарных методов

    public SelenideElement getCheakOutComplete() {
        return $(checkOutCompleteLocator);
    }

    public SelenideElement getFinishButton() {
        return $(finishButtonLocator);
    }
    // Блок комплексных методов

    public void getHome() {
        getFinishButton().click();
    }
}
