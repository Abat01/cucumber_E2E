@TC01_Api
Feature: Room Creation
  Scenario: TC01_Post_Room
    Given user sends post request for room data
    Then user get the room data and assert