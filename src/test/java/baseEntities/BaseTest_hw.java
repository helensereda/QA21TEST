package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.*;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest_hw {
    protected LoginStep loginStep;
    protected AddCartStep addCartStep;
    protected AddInfoStep addInfoStep;
    protected CheckCartStep checkCartStep;
    protected FinishStep finishStep;

   static Logger logger = Logger.getLogger(BaseTest_hw.class);

    @BeforeMethod
    public void setUp() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        org.apache.log4j.BasicConfigurator.configure();


        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        Configuration.browserSize = "1920x1080";


        loginStep= new LoginStep();
        addCartStep = new AddCartStep();
        checkCartStep = new CheckCartStep ();
        addInfoStep = new AddInfoStep();
        finishStep = new FinishStep();

        open(ReadProperties.getUrl());
        logger.info("Brouser is started");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}


