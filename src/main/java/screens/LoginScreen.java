package screens;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginScreen {
    public SelenideElement nextBtn = $(By.id("ru.alfastrah.app:id/button_next"));
    public SelenideElement signinBtn = $(By.id("ru.alfastrah.app:id/auth"));
    public SelenideElement loginField = $(By.id("ru.alfastrah.app:id/edit_login"));
    public SelenideElement passField = $(By.id("ru.alfastrah.app:id/edit_password"));
    public SelenideElement submitLoginBtn = $(By.id("ru.alfastrah.app:id/button_auth"));
    public SelenideElement enterWithoutCodeBtn = $(By.id("ru.alfastrah.app:id/button_yes"));
}
