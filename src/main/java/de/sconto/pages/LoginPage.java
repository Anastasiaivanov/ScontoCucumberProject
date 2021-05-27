package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    private static By emailInput = By.id("loginEmail");
    private static By passwordInput = By.id("loginPassword");
    private static By loginBtn = By.id("login-submit");
    private static By loginHeader = By.cssSelector(".existingAccount__headline");

    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(passwordInput).setValue(validPassword);
    }

    public void clickLoginBtn() {
        $(loginBtn).click();
    }

    public SelenideElement loginPageHeader() {
        return $(loginHeader);
    }
}
