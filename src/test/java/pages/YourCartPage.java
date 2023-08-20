package pages;

import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class YourCartPage extends BasePage_hw {
    private final static String pagePath = "cart.html";
//     блок описания локаторов для элементов

    private final By headerCartTitleLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By checkoutButtonLocator = By.id("checkout");
    //блок инициализации
    public YourCartPage()
    {
        super();
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return headerCartTitleLocator;
    }

//    Блок атомарных методов
    public SelenideElement getHeaderCartTitleInput() {
        return $(headerCartTitleLocator);
    }

    public SelenideElement getCheckoutButtonInput() {
        return $(checkoutButtonLocator);
    }

    // Блок комплексных методов
    public void checkCart() {
        getCheckoutButtonInput().click();
    }

}

