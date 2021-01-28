package com.InarSmartbear.step_definitions;


import com.InarSmartbear.pages.LoginPage;
import com.InarSmartbear.pages.WebOrdersPage;
import com.InarSmartbear.utilities.ConfigurationReader;
import com.InarSmartbear.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class WebOrdersStepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebOrdersPage webOrderspage= new WebOrdersPage();

    @Given("^User is on Web Orders page$")
    public void user_is_on_web_orders_page() throws Throwable {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        loginPage.login();
        String currentURL=Driver.getDriver().getCurrentUrl();
        System.out.println("Open :: " + currentURL);

    }

    @When("^User clicks on Check All button$")
    public void user_clicks_on_check_all_button() throws Throwable {
        webOrderspage.clickCheckAllButton();
    }

    @Then("^all the check buttons on the left side of the table is clicked$")
    public void all_the_check_buttons_on_the_left_side_of_the_table_is_clicked() throws Throwable {
        webOrderspage.isSelectedAllCheckBoxes();
    }

    @And("^User clicks on the Uncheck All button$")
    public void user_clicks_on_the_uncheck_all_button() throws Throwable {
        webOrderspage.clickUncheckAllButton();
    }

    @Then("^clicking on the Uncheck button unchecks all the orders$")
    public void clicking_on_the_uncheck_button_unchecks_all_the_orders() throws Throwable {
        webOrderspage.isSelectedAllCheckBoxes();
    }

    @When("^User clicks on the first order check box$")
    public void user_clicks_on_the_first_order_check_box() throws Throwable {
        webOrderspage.clickFirstCheckButton();
    }

    @And("^User clicks on the Delete Selected$")
    public void user_clicks_on_the_delete_selected() throws Throwable {
        webOrderspage.clickDeleteSelectedButton();
    }

    @Then("^the selected order is deleted$")
    public void the_selected_order_is_deleted() throws Throwable {
        webOrderspage.isSelectedRowDeleted(1);
    }

    @Then("It gives a messsage on the page as {string}")
    public void ıt_gives_a_messsage_on_the_page_as(String message) {

        Assert.assertEquals(message,webOrderspage.isTheMessageDisplayed());
    }





}

