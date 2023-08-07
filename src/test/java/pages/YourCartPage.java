package pages;

import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage_hw {
    private final static String pagePath = "cart.html";
    //     блок описания локаторов для элементов
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement headerCartTitle;
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    //блок инициализации
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    }

    // Блок комплексных методов
    public void checkCart() {
        checkoutButton.click();
    }

}

