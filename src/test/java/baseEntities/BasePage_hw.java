package baseEntities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage_hw {
    public BasePage_hw() {

    }

    public void openPageByUrl(String pagePath) {
        open(pagePath);
    }

    protected abstract By getPageIdentifier();

    public void isPageOpened() {
        $(getPageIdentifier()).shouldBe(visible);
    }
}
