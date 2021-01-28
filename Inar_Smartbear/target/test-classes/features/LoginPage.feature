@login_Page
Feature: Login Page
  As use, I want to login to the

  Background:
    Given User is on the login page

  Scenario:1 User logs in with correct username and password

    When User enters username "Tester"
    And User enters password as "test"
    And User clicks on the Login button
    Then User arrives at "Web Orders" page "true"

  Scenario:2 User tries to login with incorrect username and  password

    When User enters username "Test"
    And User enters password as "tester"
    And User clicks on the Login button
    Then User arrives at "Web Orders" page "false"

  Scenario:3 User tries to login by only entering username

    When User enters username "Tester"
    And User enters password as ""
    And User clicks on the Login button
    Then "Invalid Login or Password." text appears on the page

  Scenario:4 User tries to login by only entering password

    When User enters username ""
    And User enters password as "tester"
    And User clicks on the Login button
    Then "Invalid Login or Password." text appears on the page

  Scenario:5 User tries to login without entering anything in the input fields

    When User enters username ""
    And User enters password as ""
    And User clicks on the Login button
    Then "Invalid Login or Password." text appears on the page


