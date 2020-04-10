Feature: create an account

  As a user

  I Would like to create account
  So that I can do shopping

  Background:
    Given user is on login page
    And user click on signin link
    And user go to create an account component
    When user enter his valid emailid
      | sram@yahoo.com |
    And user click on create on login button

  @Test(order=2)
  Scenario: new user registration with all mandatory fields
    Given user is on login page
    And user go to create an account component
    When user enter his valid emailid
      | sha12@yahoo.com |
    And user click on create an account button
    Then user should navigate to create an account form
    When user select the title
    And user enters first name and last name
      | firstName | lastName |
      | sash      | pal      |
    And user create an password minimum of five character
      | testing123 |
    And user select his date of birth from dropdown menu
    And user click on newsletter checkbox
    And user enter address and city and postcode
      | Address | city    | Postcode |
      | road    | NewYork | 11005    |
    And user select state and country
    And user enter phone number and alias refrence
      | 02742693265 | Ram sing 22 old Road |
    And user click on register button
    Then user should be register


  Scenario: new user registration without mandatory fields

    Given user is on registration info page
    When user enter date of birth
    And user enter "22 york street" in address line two
    And user enter "office account" additional information
    And user click on register button
    Then user should get an error message


  Scenario Outline: new user registeration with already existed emailid

    Given user is on login page
    When user enter already registered "<emailid>"
    And user click on create an account button
    Then user should get an invalid email error message

    Examples:
      | emailid          |
      | shashi@yahoo.com |



