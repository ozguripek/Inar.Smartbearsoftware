package com.InarSmartbear.step_definitions;


import com.InarSmartbear.pages.LoginPage;
import com.InarSmartbear.utilities.ConfigurationReader;
import com.InarSmartbear.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        System.out.println("Open :: " + URL);
    }

    @Given("user logs in")
    public void user_logs_in() {
        loginPage.login();
    }

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        loginPage.navigateTo(string);
        System.out.println("Navigate to :: " + string);
    }
}
