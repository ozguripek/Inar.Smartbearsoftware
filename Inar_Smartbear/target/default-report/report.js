$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WebOrders.feature");
formatter.feature({
  "name": "Web Orders Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@web_orders"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Web Orders page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_is_on_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "1 In the View all orders page, in the list of all orders section, user clicks Check All button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web_orders"
    }
  ]
});
formatter.step({
  "name": "User clicks on Check All button",
  "keyword": "When "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_check_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all the check buttons on the left side of the table is clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.all_the_check_buttons_on_the_left_side_of_the_table_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Web Orders page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_is_on_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "2 In the View all orders page, in the list of all orders section, user clicks Check All button and Uncheck All",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web_orders"
    }
  ]
});
formatter.step({
  "name": "User clicks on Check All button",
  "keyword": "When "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_check_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Uncheck All button",
  "keyword": "And "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_the_uncheck_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking on the Uncheck button unchecks all the orders",
  "keyword": "Then "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.clicking_on_the_uncheck_button_unchecks_all_the_orders()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Web Orders page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_is_on_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "3 In the View all orders page, in the list of all orders section, user clicks on the first order and deletes selected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web_orders"
    }
  ]
});
formatter.step({
  "name": "User clicks on the first order check box",
  "keyword": "When "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_the_first_order_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Delete Selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_the_delete_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the selected order is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.the_selected_order_is_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Web Orders page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_is_on_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "4 In the View all orders page, in the list of all orders section, user clicks Check All button and Delete Selected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web_orders"
    }
  ]
});
formatter.step({
  "name": "User clicks on Check All button",
  "keyword": "When "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_check_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Delete Selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.user_clicks_on_the_delete_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It gives a messsage on the page as \"List of orders is empty. In order to add new order use this link.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.InarSmartbear.step_definitions.WebOrdersStepDefinitions.ıt_gives_a_messsage_on_the_page_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});