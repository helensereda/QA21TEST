package pages;
import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductsPage extends BasePage_hw {
private final static String pagePath = "/inventory.html";

        //https://www.saucedemo.com/inventory.html
    // блок описания локаторов для элементов
    private final By headerTitleLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By addToCartButtonLocator= By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By shoppingCartLocator = By.id("shopping_cart_container");

    //блок инициализации
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator;
    }
    //Блок атомарных методов
    public WebElement getHeaderTitleInput() {
        return driver.findElement(headerTitleLocator);
    }

    public WebElement getAddToCardInput() {
        return driver.findElement(addToCartButtonLocator);
    }

    public WebElement getShoppingCartInput() {
        return driver.findElement(shoppingCartLocator);
    }

    // Блок комплексных методов

    public ProductsPage addToCart() {
        getAddToCardInput().click();
        return new ProductsPage(driver);
    }

    public YourCartPage openCart() {
        getShoppingCartInput().click();
        return new YourCartPage(driver);

    }
}
