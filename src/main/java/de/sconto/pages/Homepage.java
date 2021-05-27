package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Homepage {

    public static String baseURL = PropertiesLoader.loadProperty("url");

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    private static By acceptBanner = By.cssSelector(".consentForm__title");
    private static By loginIcon = By.cssSelector(".headerElement--login");
    private static By carouselImage = By.cssSelector(".carouselImage");

    public void acceptCookies() {
        $(acceptBtn).click();
        $(acceptBanner).shouldNot(Condition.exist);
    }

    public SelenideElement carousel() {
        return $(carouselImage);
    }

    public LoginPage clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }
}
