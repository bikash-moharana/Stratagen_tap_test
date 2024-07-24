
@feature_Day1ActivityLog
Feature: Day1ActivityLog

Background: User is on the Login Page
    Given the user is on the Login Page

@valid-actions
Scenario Outline: Valid Actions for Day1 Activity Log
    When the user enters "<email>" into the email input field
    And the user enters "<password>" into the password input field
    And the user clicks on the login button
    Then the user should be directed to the Dashboard Page
    When the user clicks on the Jobs option
    Then the Jobs listing should appear
    When the user clicks on the table button
    And the user enters "<job_number>" into the search box
    Then the job with job number "<job_number>" should be displayed
    When the user clicks on the Set as Current Job link
    Then the job should be set as the current job
    When the user clicks on the Set as Current Well link
    Then the well should be set as the current well
    When the user clicks on the Set as Current Stage link
    Then the stage should be set as the current stage
    When the user clicks on the Activity log View Detail link
    Then the Activity log details should be displayed
    When the user clicks on the Set Date link
    And the user enters "<date>" into the calendar date input field
    And the user clicks on the Save button
    Then the date should be saved
    When the user clicks on the Create New Activity Log Entry button
    And the user enters "<end_time>" into the End Time input field
    And the user selects "<well_name>" from the Well dropdown
    And the user selects "<stage_name>" from the Stage dropdown
    And the user selects "Schedule time" from the OPS activity dropdown
    And the user selects "Pump Time" from the Pump Time dropdown
    And the user enters "<comment>" into the comment input field
    And the user clicks on the Save Activity Log Entry button
    Then the new activity log entry should be saved

Examples:
| email             | password | job_number | date       | end_time | well_name | stage_name | comment                  |
| user@example.com  | password | 12345      | 2024/18/07 | 00:30    | Well 0001 | 1          | This is the to day report |

@invalid-actions
Scenario Outline: Invalid Actions for Day1 Activity Log
    When the user enters "<email>" into the email input field
    And the user enters "<password>" into the password input field
    And the user clicks on the login button
    Then the user should see an error message

Examples:
| email             | password |
| invalid@example.com | wrongpassword |
