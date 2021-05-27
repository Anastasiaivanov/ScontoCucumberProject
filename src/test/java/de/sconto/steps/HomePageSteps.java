package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.Homepage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static de.sconto.pages.Homepage.baseURL;

public class HomePageSteps implements En {

    Homepage homepage;

    public HomePageSteps() {
        Given("I am on the Homepage", () -> {
            homepage = open(baseURL, Homepage.class);
            homepage.acceptCookies();
        });
        Then("I should see Homepage", () -> {
            homepage.carousel().should(Condition.exist);
        });
    }
}
