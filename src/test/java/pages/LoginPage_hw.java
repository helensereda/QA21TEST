package pages;

import baseEntities.BasePage_hw;
import baseEntities.BasePage_hw;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage_hw extends BasePage_hw {

    // блок описания локаторов для элементов
    private final By usernameInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    //блок инициализации
    public LoginPage_hw() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return loginButtonLocator;
    }

    //Блок атомарных методов

    public SelenideElement getUsernameInput() {
        return $(usernameInputLocator);
    }

    public SelenideElement getPasswordInput() {
        return $(passwordInputLocator);
    }
    public SelenideElement getloginButton() {
        return $(loginButtonLocator);
    }

    // Блок комплексных методов
    public void successLogin(String username, String password) {
        getUsernameInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getloginButton().click();
    }
}
