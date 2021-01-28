@web_orders
Feature: Web Orders Page

  Background:
    Given User is on Web Orders page

  Scenario:1 In the View all orders page, in the list of all orders section, user clicks Check All button
    When User clicks on Check All button
    Then all the check buttons on the left side of the table is clicked

  Scenario:2 In the View all orders page, in the list of all orders section, user clicks Check All button and Uncheck All

    When User clicks on Check All button
    And User clicks on the Uncheck All button
    Then clicking on the Uncheck button unchecks all the orders

  Scenario:3 In the View all orders page, in the list of all orders section, user clicks on the first order and deletes selected

    When User clicks on the first order check box
    And User clicks on the Delete Selected
    Then the selected order is deleted

  Scenario:4 In the View all orders page, in the list of all orders section, user clicks Check All button and Delete Selected

    When User clicks on Check All button
    And User clicks on the Delete Selected
    Then It gives a messsage on the page as "List of orders is empty. In order to add new order use this link."