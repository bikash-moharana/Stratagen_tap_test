
@feature_ActivityLog24Hours
Feature: ActivityLog24Hours

Background: User is logged into the application and navigated to the Jobs module
    Given the user has opened the application
    And the user has entered a valid Email and password
    And the user has clicked on the login button
    And the user has clicked on the Jobs module

@valid-activity-log-actions
Scenario Outline: Valid Activity Log Actions
    When the user clicks on the table button under the jobs
    And the user clicks on the Set as Current Job button of the job
    Then the job should be set as the current job
    When the user clicks on the Set as Current Well link for the well
    Then the well should be set as the current well
    When the user clicks on the Set as Current Stage link for stages
    Then the stage should be set as the current stage
    When the user clicks on the Activity log View Detail link for log details
    Then the activity log details should be displayed
    When the user clicks on the Set Date action
    And the user enters the date "<date>" from the calendar field
    And the user clicks on the Save button
    Then the date should be saved
    When the user clicks on the Create New Activity Log Entry button
    And the user enters the "<end_time>" into the End time input field
    And the user clicks on the Time on new day checkbox
    And the user selects the "<well_value>" from the well dropdown
    And the user selects the "<stage_value>" from the stage input field
    And the user selects OPS activity as Schedule time in activity log
    And the user selects the Pump Time from schedule time
    And the user clicks on the Save Activity Log Entry button
    Then the new activity log entry should be saved

Examples:
    | date       | end_time | well_value | stage_value |
    | 2023-10-01 | 04:00    | Well1      | Stage1      |
    | 2023-10-02 | 00:00    | Well2      | Stage2      |

@invalid-activity-log-actions
Scenario Outline: Invalid Activity Log Actions
    When the user clicks on the Set Date action
    And the user enters an invalid date "<invalid_date>" from the calendar field
    And the user clicks on the Save button
    Then an error message should be displayed
    When the user clicks on the Create New Activity Log Entry button
    And the user enters an invalid "<end_time>" into the End time input field
    And the user clicks on the Save Activity Log Entry button
    Then an error message should be displayed

Examples:
    | invalid_date | end_time |
    | 2023-13-01   | 25:00    |
    | 2023-02-30   | 99:99    |
