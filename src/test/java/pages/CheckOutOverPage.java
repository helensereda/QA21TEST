package pages;
import baseEntities.BasePage_hw;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutOverPage extends BasePage_hw {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов
   private final By checkOutOverNewLocator= By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By finishButtonLocator = By.id("finish");

    //блок инициализации
    public CheckOutOverPage() {
        super();
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return checkOutOverNewLocator;
    }
    //Блок атомарных методов

    public SelenideElement getCheckOutOverNew() {
        return $(checkOutOverNewLocator);
    }

    public SelenideElement getFinishButton() {
        return $(finishButtonLocator);
    }
    // Блок комплексных методов

    public void getPayment() {
        getFinishButton().click();
    }
}
