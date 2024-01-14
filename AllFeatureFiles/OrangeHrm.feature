Feature: Test the Orange HRM application

  Scenario: validate the Login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: validate Home Page functionality
    When user is on home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario: validate PIM Page Functionality
    When user is on PIM page and validate url
    And user click on Add Employee and enter firstname and lastname and click on save button
