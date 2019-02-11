package RandomTEst;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TEster {
    WebDriver driver;
    String url = "https://qamadness.com";

    @BeforeEach
    public void SetupAppium() throws Exception {
        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy s6");
        capabilities.setCapability(MobileCapabilityType.UDID, "02157df271155606");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("appPackage", "ru.alfastrah.app");
        capabilities.setCapability(MobileCapabilityType.APP, "D:/ITFolder/AlfaRC.apk");
        //capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Beta");
        //capabilities.setCapability("appActivity", "io.crash.air.Beta");
        capabilities.setCapability("autoGrantPermissions", "true");
        //capabilities.setCapability("recreateChromeDriverSessions", "true");
        //capabilities.setCapability(MobileCapabilityType.FULL_RESET,"true");
        capabilities.setCapability("autoAcceptAlerts","true");
        //driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        AppiumDriver driver = new AndroidDriver(serverURL, capabilities);
        WebDriverRunner.setWebDriver(driver);
        driver.launchApp();
    }
  /*  @AfterEach
    public void closeDriver(){
        driver.close();
    }*/
        @Test
        public void firstTest() {
            sleep(500);
       // $(byText("Далее")).shouldBe(Condition.visible).click();
            driver.findElement(byText("Далее")).click();

       // open(url);
          // $(byText("Альфа Страхование")).click();
        }
}
