package io.testable.serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class OpenLoginTest {
    
    @Managed
    WebDriver driver;

    @Steps
    OpenLoginSteps openSteps;

    @Test
    public void openHomePage() {
        openSteps.opens_home_page();
    }
}
