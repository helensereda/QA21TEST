package pages;

import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage_hw extends BasePage_hw {

    // блок описания локаторов для элементов
    private final By usernameInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    //блок инициализации
    public LoginPage_hw(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return loginButtonLocator;
    }

    //Блок атомарных методов

    public WebElement getUsernameInput() {
        return driver.findElement(usernameInputLocator);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInputLocator);
    }
    public WebElement getloginButton() {
        return driver.findElement(loginButtonLocator);
    }

    // Блок комплексных методов
    public ProductsPage login_hw(String username, String password) {
        getUsernameInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getloginButton().click();
        return new ProductsPage(driver);
    }
}
