Feature: Home Page Tests
  Background:
    Given User open the home page
  Scenario: Customer want to call to the shop.
    When Phone number Element from Banner
    Then Check if phone number is correct
  Scenario: User want to buy a product
    When Hover on the product
    And Click Add to Cart button
    Then Check the Name of the Product
#    TODO: Make Cucumber Examples
    And Check price Value of the Product
  Scenario Outline: Buying products
    When Hover on the product number <ProductNumber>
    And Click <ProductNumber> Add to Cart button
    Then Check the Name of the Product
    Examples:
      | ProductNumber |
      |             0 |
      |             1 |
      |             2 |