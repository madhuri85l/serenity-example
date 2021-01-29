package io.testable.serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class OpenHomeSteps extends ScenarioSteps {

    /**
     *
     */
    private static final long serialVersionUID = -416535903430940705L;
    OpenLoginPage openLoginPage;

    @Step
    public void opens_home_page() {
        openLoginPage.open();
    }
}
