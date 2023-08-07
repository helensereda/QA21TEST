package pages;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage_hw {
    private final static String pagePath = "/checkout-step-one.html";

    // Блок описания локаторов для элементов
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement header;
    @FindBy(id = "first-name")
    public WebElement firstNameInput;
    @FindBy(id = "last-name")
    public WebElement lastNameInput;

    @FindBy(id = "postal-code")
    public WebElement codeInput;

    @FindBy(id = "continue")
    public WebElement checkButton;

    //блок инициализации
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    }
    // Блок комплексных методов

    public void getInfo(String firstname, String lastname, String code ) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        codeInput.sendKeys(code);
        checkButton.click();
    }
}
