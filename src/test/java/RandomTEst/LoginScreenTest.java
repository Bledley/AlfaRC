package RandomTEst;

import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import screens.LoginScreen;
import steps.LoginScreenSteps;
import com.codeborne.selenide.WebDriverRunner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginScreenTest {

    private LoginScreen loginScreen = new LoginScreen();
    private LoginScreenSteps loginScreenSteps = new LoginScreenSteps();
    String login = "test_mobile16@mail.ru";
    String pass = "123456";

    @BeforeEach
    public void setupAppium() throws Exception {
        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy s6");
        capabilities.setCapability(MobileCapabilityType.UDID, "02157df271155606");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        //capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");
        capabilities.setCapability("appPackage", "ru.alfastrah.app");
        capabilities.setCapability(MobileCapabilityType.APP, "D:/ITFolder/AlfaRC.apk");
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("autoAcceptAlerts","true");
        AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
        WebDriverRunner.setWebDriver(driver);



    }
  //@AfterEach
  //  public void closeDriver() {
  //    driver.quit();
 // }
        @Test
        public void validLoginTest() {
        //loginScreen.nextBtn.click();
        loginScreenSteps.showSigninBtn();
        loginScreenSteps.clickSignInBtn();
        loginScreenSteps.enterPass(pass);
        loginScreenSteps.enterLogin(login);
        loginScreenSteps.clickSubmitBtn();
        loginScreenSteps.loginWithoutCode();
           /*$(By.id("ru.alfastrah.app:id/button_next")).shouldBe(Condition.visible).click();
            $(By.id("ru.alfastrah.app:id/button_next")).shouldBe(Condition.visible).click();
            $(By.id("ru.alfastrah.app:id/button_next")).shouldBe(Condition.visible).click();
            $(By.id("ru.alfastrah.app:id/button_next")).shouldBe(Condition.visible).click();
            $(By.id("ru.alfastrah.app:id/button_next")).shouldBe(Condition.visible).click();
            $(By.id("ru.alfastrah.app:id/auth")).shouldBe(Condition.visible).click();
            $(By.id("ru.alfastrah.app:id/edit_password")).setValue("123456");
            $(By.id("ru.alfastrah.app:id/edit_login")).setValue("test_mobile16@mail.ru");
            $(By.id("ru.alfastrah.app:id/button_auth")).click();
            $(By.id("ru.alfastrah.app:id/button_yes")).click();*/
        }
}
