package com.InarSmartbear.pages;

import com.InarSmartbear.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    private WebElement errorMessage;


    public void login() {
        String usernameValue = ConfigurationReader.getProperty("username");
        String passwordValue = ConfigurationReader.getProperty("password");
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(String usernameValue, String passwordValue) {
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void userNameLogin(String usernameValue) {

        userName.sendKeys(usernameValue);
    }
    public void passWordLogin(String passwordValue) {

        password.sendKeys(passwordValue);
    }

    public void clickLoginButton() {

        loginButton.click();
    }

    public String getTitle() {

       return driver.getTitle();
    }

    public String getErrorMessage() {

        return errorMessage.getText();
    }


}
