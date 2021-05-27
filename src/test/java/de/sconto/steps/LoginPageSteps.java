package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.Homepage;
import de.sconto.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageSteps implements En {

    Homepage homepage;
    LoginPage loginPage;

    public LoginPageSteps() {
        When("I click on the Login icon", () -> {
            homepage = page(Homepage.class);
            loginPage = homepage.clickLoginIcon();
        });
        Then("I see Login page", () -> {
            loginPage.loginPageHeader().should(Condition.exist);
            loginPage.loginPageHeader().shouldHave(text("Anmelden"));
        });
        When("I insert valid user credentials", () -> {
            loginPage.validLoginInput();
        });
        When("I click on Login button", () -> {
            loginPage.clickLoginBtn();
        });
    }
}
