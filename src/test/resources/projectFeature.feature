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
    And Check price Value of the Product
  Scenario Outline: Buying products - using Examples
    When Hover on the product number <ProductNumber>
    And Click <ProductNumber> Add to Cart button
    Then Check the Name of the Product
    Examples:
      | ProductNumber |
      |             0 |
      |             1 |
      |             2 |
  Scenario Outline: Contact us form validation
    When Enter the Contact Us Site
    Then Check <formElement> Validation Element
    # TODO: Select choose and file attach
    Examples:
      | formElement    |
      | subjectHeading |
      | emailAddress   |
      | orderReference |
      | attachFile     |