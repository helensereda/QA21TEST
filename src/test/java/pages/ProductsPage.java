package pages;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ProductsPage extends BasePage_hw {
private final static String pagePath = "/inventory.html";

        //https://www.saucedemo.com/inventory.html
    // блок описания локаторов для элементов
    @FindBy (xpath = "//div[text() = 'Swag Labs']")
    public WebElement headerTitle;

    @FindBy (id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement addToCartButton;

    @FindBy (id = "shopping_cart_container")
    public WebElement shoppingCart;

    //блок инициализации
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//div[text() = 'Swag Labs']");
    }

    // Блок комплексных методов
    public void addToCart() {
        addToCartButton.click();
        shoppingCart.click();
    }
}