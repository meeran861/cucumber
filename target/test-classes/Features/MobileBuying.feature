Feature: Mobile Buying

Background: Launch Application 
  Given user launch flipkart application "https://www.flipkart.com/"
  @smoke
  Scenario: mobile purchase
    When user searching the mobiles
    And user click choosing mobile
    Then user click buy now button
