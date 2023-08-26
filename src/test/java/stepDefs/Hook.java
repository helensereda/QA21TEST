package stepDefs;

import baseEntities.BaseTest_hw;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Step;

public class Hook extends BaseTest_hw {
    private BaseTest_hw baseTest;

    public Hook(BaseTest_hw baseTest) {
        this.baseTest = baseTest;
    }

    @Before(value = "@gui", order = 10001)
    @Step("Browser initialization")
    public void initGuiScenario(Scenario scenario) {
        baseTest.driver = new BrowserFactory().getDriver();
    }

    @Before(value = "@gui and @api")
    @Step("Api initialization")
    public void initApiScenario(Scenario scenario) {
        System.out.println("Init connection to the server");
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Attach screenshot");
        }
        baseTest.driver.quit();
    }
}