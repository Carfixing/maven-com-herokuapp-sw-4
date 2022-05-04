package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.HomeLoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomeLoginPage homeLoginPage = new HomeLoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
       homeLoginPage.enterUserName("tomsmith");
       homeLoginPage.enterPassword("SuperSecretPassword!");
       homeLoginPage.clickOnLoginButton();
        String expectedMessage = "Secure Area";
        String actualMessage = homeLoginPage.getVerifyText();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
   @Test
    public void verifyTheUsernameErrorMessage(){
        homeLoginPage.enterUserName("tomsmith1");
        homeLoginPage.enterPassword("SuperSecretPassword!");
        homeLoginPage.clickOnLoginButton();
       String expectedMessage = "Your username is invalid!\n×";
       String actualMessage = homeLoginPage.getUsernameInvalidMessage();
       Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        homeLoginPage.enterUserName("tomsmith");
        homeLoginPage.enterPassword("SuperSecretPassword");
        homeLoginPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!\n×";
        String actualMessage = homeLoginPage.getPasswordInvalidMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");


    }
}
