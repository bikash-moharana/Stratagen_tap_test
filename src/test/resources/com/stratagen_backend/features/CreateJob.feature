
@feature_create_job
Feature: CreateJob

Background: User is on the Job Listing Page
    Given the user is on the Job Listing Page

@navigate_to_create_job
Scenario Outline: Navigate to Create Job Page
    When the user clicks on the jobs sidebar
    And the user clicks on Table
    And the user clicks on Create New Job button
    Then the Add/Edit Frac Job page should be open

Examples:
    | dummy |
    | data  |

@create_job_with_mandatory_data
Scenario Outline: Create Job with Mandatory Data
    Given the user is on the Add/Edit Frac Job page
    When the user enters "<JobNumber>" into Job Number input field
    And the user clicks on District dropdown
    And the user selects a district option
    And the user clicks on Fleet dropdown
    And the user selects a fleet option
    And the user clicks on Service company dropdown
    And the user selects a service company option
    And the user clicks on Pad dropdown
    And the user selects a pad option
    And the user clicks on Location dropdown
    And the user selects a location option
    And the user clicks and selects a value into Target stages per day dropdown
    And the user enters "<TargetPumpTimePerDay>" into Target Pump Time Per Day input field
    And the user clicks on Save Job button
    Then the job should be saved with the provided details

Examples:
    | JobNumber | TargetPumpTimePerDay |
    | 100       | 5                    |

@create_job_with_invalid_data
Scenario Outline: Create Job with Invalid Data
    Given the user is on the Add/Edit Frac Job page
    When the user enters "<JobNumber>" into Job Number input field
    And the user clicks on District dropdown
    And the user selects a district option
    And the user clicks on Fleet dropdown
    And the user selects a fleet option
    And the user clicks on Service company dropdown
    And the user selects a service company option
    And the user clicks on Pad dropdown
    And the user selects a pad option
    And the user clicks on Location dropdown
    And the user selects a location option
    And the user clicks and selects a value into Target stages per day dropdown
    And the user enters "<TargetPumpTimePerDay>" into Target Pump Time Per Day input field
    And the user clicks on Save Job button
    Then an error message should be displayed

Examples:
    | JobNumber | TargetPumpTimePerDay |
    |           | 5                    |
    | 100       | abc                  |
