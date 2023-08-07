package pages;

import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends BasePage_hw {
    private final static String pagePath = "/checkout-complete.html";

    // Блок описания локаторов для элементов
    @FindBy(id = "checkout_complete_container")
    public WebElement checkOutComplete;
    @FindBy(id = "back-to-products")
    public WebElement finishButton;

    //блок инициализации
    public CheckOutCompletePage (WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return By.xpath("checkout_complete_container");
    }
    // Блок комплексных методов
    public void getHome() {
      checkOutComplete.click();
    }
}
