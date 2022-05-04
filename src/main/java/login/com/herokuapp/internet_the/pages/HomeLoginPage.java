package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class HomeLoginPage extends Utility {
    By userNameField = By.id("username");
    By passWordField =  By.id("password");
    By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    By verifyText = By.xpath("//div[@class='example']//h2");
    By usernameInvalidMessage = By.id("flash");
    By passwordInvalidMessage = By.id("flash");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){
      sendTextToElement(passWordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getVerifyText(){
        return getTextFromElement(verifyText);
    }

    public String getUsernameInvalidMessage() {
        return getTextFromElement(usernameInvalidMessage);
    }

    public String getPasswordInvalidMessage() {
        return getTextFromElement(passwordInvalidMessage);
    }
}
