
@feature_create_location
Feature: CreateLocation

Background: User is on the HomePage
    Given the user is on the HomePage
    When the user clicks on the Reference Data module
    Then the user should see the Location option
    When the user clicks on the Location option
    Then the Manage Locations page should be open

@valid-create-new-location
Scenario Outline: Create a New Location with Valid Data
    Given the user is on the Manage Locations page
    When the user clicks on the create new location button
    Then the Add/Edit Location page should be displayed
    When the user enters "<Location name>" into the Location Name input field
    And the user clicks on the save location button
    Then the new created location "<Location name>" should display in the manage location page

Examples:
    | Location name |
    | Delhi         |
    | Mumbai        |
    | Bangalore     |

@invalid-create-new-location
Scenario Outline: Create a New Location with Invalid Data
    Given the user is on the Manage Locations page
    When the user clicks on the create new location button
    Then the Add/Edit Location page should be displayed
    When the user enters "<Location name>" into the Location Name input field
    And the user clicks on the save location button
    Then an error message should be displayed

Examples:
    | Location name |
    |               |  # Empty location name
    | @InvalidName  |  # Invalid characters
