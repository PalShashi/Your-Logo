Feature: Add product to basket
  As a user
  I would like to add a product to basket
  So that i can purchase the desired product


  Scenario: to select product category
    Given user is on user home page
    When user clicked on any category link tab
    Then user should landed on selected category page


  Scenario: to select the subcategory of the product

    Given user is on product category page
    When user click on the the subcategory icon
    Then user should landed on the selected subcategory page


  Scenario: User is able to add a product to cart from category page

    Given user is on product category page
    When user hover over the product
    And user click on the add to basket button
    Then product should be added to the cart


  Scenario: user is able to add a product to cart from subcategory link

    Given user is on product subcategory page
    When user hover over the product
    And user click on the add to basket button
    Then product should be added to the cart


  Scenario: user is able to see product detail

    Given user is on product subcategory page
    When user click on the product
    Then user should landed on the product detail info page


  Scenario: user is able to see product detail by clicking on more tab on it

    Given user is on product subcategory page
    When user hover over the product
    And click on the more button
    Then user should landed on the product detail info page


  Scenario: user is able to see quick view of the product

    Given user is on product subcategory page
    When user hover over the product
    And click on the quick view tab
    Then user should able to see quick view of the product


  Scenario: user is able to select the size, colour and add to cart from product detail page

    Given user is on product detail page
    When user select the size
    And user choose the colour
    And user choose the quantity
    And click on add to cart button
    Then product should be added to the cart







