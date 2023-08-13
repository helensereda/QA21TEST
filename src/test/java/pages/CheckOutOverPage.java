package pages;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckOutOverPage extends BasePage_hw {
    private final static String pagePath = "/checkout-step-two.html";

    // Блок описания локаторов для элементов
   private final By checkOutOverNewLocator= By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By finishButtonLocator = By.id("finish");

    //блок инициализации
    public CheckOutOverPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return checkOutOverNewLocator;
    }
    //Блок атомарных методов

    public WebElement getCheckOutOverNew() {
        return driver.findElement(checkOutOverNewLocator);
    }

    public WebElement getFinishButton() {
        return driver.findElement(finishButtonLocator);
    }
    // Блок комплексных методов

}
