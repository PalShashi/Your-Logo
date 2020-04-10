Feature: login to your logo application

  As a user
  I would like to login
  So that i can do shopping

  Background:
    Given user is on login page

  Scenario Outline: login with valid credentials

    When user enter "<username>" and "<password>"
    And user click on login button
    Then user should login
    And user shold land on Service dashboard page

    Examples:
      | username               | password      |
      | shashi_chef@ayahoo.com | Bombo@ec2a2ap |

  Scenario Outline: user login with invalid email address and valid password


    When user enter invalid "<emailid>" and valid "<password>"
    And user click on login button
    Then email field should get highlighted and an error message will appear

    Examples:
      | emailid        | password      |
      | shas@yahoo.com | Bombo@ec2a2ap |


  Scenario Outline: user login with valid emailid and invalid password


    When user enter valid "<emailid>" and invalid "<password>"
    And user click on login button
    Then password field should get highlighted and get an error message should appear

    Examples:
      | emailid        | password      |
      | shas@yahoo.com | Bombo@ec2a2ap |

  Scenario Outline: user forgot password


    When user enter click on forget password link
    Then user should navigate to forget password page
    When user enter registered "<emailid>"
    And click on reterieve password button
    Then a password reset message will appear on user screen
    And a reset password email has been sent to the user account

    Examples:
      | emailid          |
      | shashi@yahoo.com |