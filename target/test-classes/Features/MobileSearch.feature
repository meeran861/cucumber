
Feature: Mobile Search Validation

Background: Launch Application 
  Given user launches flipkart application "https://www.flipkart.com/"
  
  Scenario: Validating mobile purchase
    When user searching the mobile
    |Samsung S24|Iphone|Oneplus|Redmi|
    And user click on add to cart
    Then user should go to home page
    And navigate into cart and check order updated
 @sanity   
    Scenario: Validating mobile purchase
    When user searching the mobile
    |Iphone 14|Samsung|Oneplus|Redmi|
    And user click on add to cart
    Then user should go to home page
    And navigate into cart and check order updated
    
    
  