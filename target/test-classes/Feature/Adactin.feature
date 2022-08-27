Feature: This is  loginPage

  Scenario Outline: login scenario
    Given user goes to login page
    When user "<username>" and "<password>" 
    And Clicks login button
    And select the loction
    And select the Hotel
    And select the type of Rooms
    And to select no of Rooms
    And to select in Date 
    And to selcet out Date
    And no of adults Rooms
    And no of childrens Rooms
    And from serching hotels
    And to click the RadioButton
    And to continue
    And first name
    And lastname
    And Billing address
    And card no
    And card type
    And expairy Date
    And cvv no
    And booking
    And my itinerary
    Then user goes to home page

    Examples: 
      | username     |  | password      |  
      | surendhar123 |  | Surendhar@007 |  
