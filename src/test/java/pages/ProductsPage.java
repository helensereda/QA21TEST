package pages;
import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage extends BasePage_hw {
private final static String pagePath = "/inventory.html";

    // блок описания локаторов для элементов
    private final By headerTitleLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By addToCartButtonLocator= By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By shoppingCartLocator = By.id("shopping_cart_container");

    //блок инициализации
    public ProductsPage() {
        super();
    }

    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator;
    }
    //Блок атомарных методов
    public SelenideElement getHeaderTitleInput() {
        return $(headerTitleLocator);
    }

    public SelenideElement getAddToCardInput() {
        return $(addToCartButtonLocator);
    }

    public SelenideElement getShoppingCartInput() {
        return $(shoppingCartLocator);
    }

    // Блок комплексных методов
    public void addToCart() {
        getAddToCardInput().click();
        getShoppingCartInput().click();
    }

}