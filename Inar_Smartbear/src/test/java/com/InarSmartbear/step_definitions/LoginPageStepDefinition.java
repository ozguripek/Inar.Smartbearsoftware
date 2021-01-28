package com.InarSmartbear.step_definitions;

import com.InarSmartbear.pages.LoginPage;
import com.InarSmartbear.utilities.ConfigurationReader;
import com.InarSmartbear.utilities.Driver;
import org.junit.Assert;
import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import com.InarSmartbear.pages.LoginPage;
import com.InarSmartbear.utilities.ConfigurationReader;
import com.InarSmartbear.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginPageStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("^User is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        System.out.println("Open :: " + URL);

    }

    @When("^User enters username \"([^\"]*)\"$")
    public void user_enters_username_something(String name) throws Throwable {
        loginPage.userNameLogin(name);
    }

    @And("^User enters password as \"([^\"]*)\"$")
    public void user_enters_password_as_something(String password) throws Throwable {
        loginPage.passWordLogin(password);
    }

    @And("^User clicks on the Login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        loginPage.clickLoginButton();

    }

    @Then("^User arrives at \"([^\"]*)\" page \"([^\"]*)\"$")
    public void user_arrives_at_something_page_something(String pageName, String trueFalse) throws Throwable {
        if(Boolean.parseBoolean(trueFalse)){
            Assert.assertEquals(loginPage.getTitle(),pageName );
            System.out.println("User arrives at \"Web Orders\" page \"true\"\n");
        }
        else{
            Assert.assertNotEquals(loginPage.getTitle(), pageName);
            System.out.println("User arrives at \"Web Orders\" page \"false\"");
        }
    }

    @Then("^\"([^\"]*)\" text appears on the page$")
    public void something_text_appears_on_the_page(String expectedMessage) throws Throwable {
        Assert.assertEquals(loginPage.getErrorMessage(),expectedMessage );
        System.out.println("\"Invalid Login or Password.\"message hat shown.");
    }

}

