@Sanity
Feature: Search and verify click on Title
Scenario Outline: Search and verify click on Title
    Given Launch browser and enter url
    When Enter searching "<Search>" criteria
    And Click on channel link
    Then Validate channel name
    Then Close browser
 Examples:
 				| Search|
 				| cucumber architecture|
 				| cucumber architecture|