package steps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import screens.LoginScreen;

public class LoginScreenSteps {
    private LoginScreen loginScreen = new LoginScreen();


   @Step
    public void showSigninBtn(){loginScreen.nextBtn.click();loginScreen.nextBtn.click();loginScreen.nextBtn.click();loginScreen.nextBtn.click();}

    @Step
    public void clickSignInBtn(){loginScreen.signinBtn.click();}

    @Step
    public void enterPass(String pass){loginScreen.passField.setValue(pass);}

   @Step
    public void enterLogin(String login){loginScreen.loginField.setValue(login);}

    @Step
    public void clickSubmitBtn() {loginScreen.submitLoginBtn.click();}

    @Step
    public void loginWithoutCode(){loginScreen.enterWithoutCodeBtn.click();}
}
