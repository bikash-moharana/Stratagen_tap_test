
@feature_CreateCustomerNPT
Feature: CreateCustomerNPT

Background: User is logged into the application and on the Jobs module
    Given the user is on the Login Page
    When the user enters a valid email and password
    And the user clicks on the login button
    Then the user should be logged in
    And the user clicks on the Jobs module

@valid-operations
Scenario Outline: Valid operations for creating and completing activity logs
    When the user clicks on the table button under jobs
    And the user enters "<job_number>" in the job search box
    And the user clicks on the Set as Current Job button
    And the user clicks on the Set as Current Well link
    And the user clicks on the Set as Current Stage link
    Then the user should see the job details
    When the user clicks on the Activity log View Detail link
    And the user clicks on Set Date
    And the user clicks on the Calendar icon
    And the user selects the date from the calendar field
    And the user clicks on Save
    And the user clicks on Create New Activity Log Entry button
    And the user enters "<end_time>" into the End time input field
    And the user clicks on the Time on new day checkbox
    And the user selects the Well value
    And the user selects the Stage value
    And the user selects the OPS activity as Schedule time in activity log
    And the user selects the Pump Time present in schedule time
    And the user clicks on the Save Activity Log Entry
    And the user clicks on the three dot action option
    And the user clicks on the complete option
    Then the activity log entry should be marked as complete
    When the user clicks on the Add day button
    And the user clicks on Create new activity log button
    And the user enters "<end_time2>" into the End time2 input field
    And the user selects the Well value
    And the user selects the Stage value
    And the user selects the OPS activity as Schedule time in activity log
    And the user selects the customer NPT option
    And the user clicks on the Save Activity Log Entry
    Then the new activity log entry should be created

@invalid-operations
Scenario Outline: Invalid operations for creating activity logs
    When the user clicks on the table button under jobs
    And the user enters "<invalid_job_number>" in the job search box
    And the user clicks on the Set as Current Job button
    Then the user should see an error message "Job not found"
    When the user clicks on Create New Activity Log Entry button
    And the user enters "<invalid_end_time>" into the End time input field
    And the user clicks on the Save Activity Log Entry
    Then the user should see an error message "Invalid end time"

Examples:
    | job_number | end_time | end_time2 | invalid_job_number | invalid_end_time |
    | 12345      | 5:00     | 9:00      | 99999              | 25:00            |
