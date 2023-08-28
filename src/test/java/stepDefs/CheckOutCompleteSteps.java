package stepDefs;

import baseEntities.BaseTest_hw;
import io.cucumber.java.en.Then;
import pages.CheckOutCompletePage;
import pages.CheckOutOverPage;

public class CheckOutCompleteSteps {
    private BaseTest_hw baseTest;
    private CheckOutCompletePage checkOutCompletePage;

    public CheckOutCompleteSteps(BaseTest_hw baseTest) {
        this.baseTest = baseTest;
    }
    @Then("user click back home button")
    public void getHome() {
        checkOutCompletePage. getFinishButton().click();
    }
}
