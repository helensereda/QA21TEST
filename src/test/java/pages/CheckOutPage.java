package pages;
import baseEntities.BasePage_hw;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutPage extends BasePage_hw {
    private final static String pagePath = "/checkout-step-one.html";

    // Блок описания локаторов для элементов
   private final By headerLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By codeInputLocator = By.id("postal-code");
    private final By checkButtonLocator = By.id("continue");
    //блок инициализации
    public CheckOutPage() {
        super();
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return headerLocator;
    }
    //Блок атомарных методов
    public SelenideElement getFirstNameInput() {
        return $(firstNameInputLocator);
    }

    public SelenideElement getLastNameInput() {
        return $(lastNameInputLocator);
    }

    public SelenideElement getCodeInput() {
        return $(codeInputLocator);
    }

    public SelenideElement getCheckButtonInput() {
        return $(checkButtonLocator);
    }

    public void setFirstName(String value) {
        getFirstNameInput().sendKeys(value);
    }
    public void setLastName(String value) {
        getLastNameInput().sendKeys(value);
    }
    public void setCode(String value) {
        getCodeInput().sendKeys(value);
    }

    // Блок комплексных методов

    public void getInfo(String firstname, String lastname, String code ) {
        setFirstName("Firstname");
        setLastName("Lastname");
        setCode("code");
        getCheckButtonInput().click();
    }

}
