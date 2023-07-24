package pages;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckOutPage extends BasePage_hw {
    private final static String pagePath = "/checkout-step-one.html";

    // Блок описания локаторов для элементов
   private final By headerLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By codeInputLocator = By.id("postal-code");
    private final By checkButtonLocator = By.id("continue");
    //блок инициализации
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return headerLocator;
    }
    //Блок атомарных методов
    public WebElement getFirstNameInput() {
        return driver.findElement(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return driver.findElement(lastNameInputLocator);
    }

    public WebElement getCodeInput() {
        return driver.findElement(codeInputLocator);
    }

    public WebElement getCheckButtonInput() {
        return driver.findElement(checkButtonLocator);
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
