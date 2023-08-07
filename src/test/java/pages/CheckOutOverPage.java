package pages;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverPage extends BasePage_hw {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement checkOutOverNew;
    @FindBy(id = "finish")
    public WebElement finishButton;

    //блок инициализации
    public CheckOutOverPage(WebDriver driver) {
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

    public void getPayment() {
        finishButton.click();
    }
}
