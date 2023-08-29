package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Then;
import pages.CheckOutCompletePage;

public class CheckOutCompleteSteps {
    private BaseTest baseTest;
    private CheckOutCompletePage checkOutCompletePage;

    public CheckOutCompleteSteps(BaseTest baseTest) {
        this.baseTest = baseTest;
    }
    @Then("user click back home button")
    public void getHome() {
        checkOutCompletePage. getFinishButton().click();
    }
}
