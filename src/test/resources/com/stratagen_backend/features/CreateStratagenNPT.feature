
@feature_create_stratagen_npt
Feature: Create Stratagen NPT

Background: User is on the Jobs Listing Page
    Given the user is on the Jobs Listing Page

@navigate_to_activity_log
Scenario Outline: Navigate to Activity Log with Valid Inputs
    When the user clicks on the job module element
    And the user clicks action on the table button element
    And the user enters "<job_number>" in the job search box element
    And the user clicks on the Set as Current Job button element
    And the user clicks on the Set as Current Well link element
    And the user clicks on the Set as Current Stage link element
    And the user clicks on the Activity log View Detail link element
    Then the user should be on the Activity Log Page
    When the user clicks on the Set Date element
    And the user enters "<date>" from the calendar date input field element
    And the user clicks on the Save button
    Then the date should be saved successfully
    When the user clicks on the Create New Activity Log Entry button
    And the user enters "<end_time>" into the End time input field
    And the user selects "<well_value>" in the well field
    And the user selects "<stage_value>" in the stage field
    And the user selects OPS activity as Schedule time in the activity log
    And the user selects NPT present in Stratagen NPT field
    And the user clicks on the Save Activity Log Entry element
    Then the new activity log entry should be saved successfully

@navigate_to_activity_log_invalid
Scenario Outline: Navigate to Activity Log with Invalid Inputs
    When the user clicks on the job module element
    And the user clicks action on the table button element
    And the user enters "<job_number>" in the job search box element
    And the user clicks on the Set as Current Job button element
    And the user clicks on the Set as Current Well link element
    And the user clicks on the Set as Current Stage link element
    And the user clicks on the Activity log View Detail link element
    Then the user should be on the Activity Log Page
    When the user clicks on the Set Date element
    And the user enters "<invalid_date>" from the calendar date input field element
    And the user clicks on the Save button
    Then the date should not be saved and an error message should be displayed
    When the user clicks on the Create New Activity Log Entry button
    And the user enters "<invalid_end_time>" into the End time input field
    And the user selects "<invalid_well_value>" in the well field
    And the user selects "<invalid_stage_value>" in the stage field
    And the user selects OPS activity as Schedule time in the activity log
    And the user selects NPT present in Stratagen NPT field
    And the user clicks on the Save Activity Log Entry element
    Then the new activity log entry should not be saved and an error message should be displayed

Examples:
    | job_number | date       | end_time | well_value | stage_value | invalid_date | invalid_end_time | invalid_well_value | invalid_stage_value |
    | 001        | 2023-10-01 | 01:00    | well 0001  | 2           | 2023-13-01   | 25:00            | invalid_well       | invalid_stage       |
