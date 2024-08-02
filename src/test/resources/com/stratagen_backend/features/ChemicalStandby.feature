
@feature_chemical_standby
Feature: Chemical Standby

Background: User is logged in and on the Chemical Standby Page
    Given the user opens the application
    And the user enters "bikash.moharana@walkingtree.tech" into the "Email Address" input field
    And the user enters "Walkingtree1@" into the "Password" input field
    And the user clicks on the Login Button
    And the user scrolls to Jobs Side bar
    And the user drags the Board Option and drops it in the box
    And the user goes to an existing job and clicks on Show Job button
    And the user navigates to the Chemical
    And the user clicks on View Details link
    And the user right clicks on Delivery tracking
    And the user goes to the existing chemical present under Delivery record list

@move_chemical_to_standby
Scenario Outline: Move existing chemical to Standby
    When the user double clicks on the three-dot toggle dropdown present on the right side of the existing chemical under Delivery record list
    And the user clicks on Stand by Option
    And the user clicks and holds on Yes, move it Option from the pop-up
    Then the selected existing chemical should not be displayed under Delivery Record List
    And the user clicks on Stand by option
    Then the existing chemical should be displayed under Deliveries on Stand-By in Chemicals - Standby page

@add_records_to_standby
Scenario Outline: Add Records in Standby Table
    When the user clicks on Add Records button in Totes on Standby Tables
    And the user clicks on Chemical dropdown
    And the user selects "<chemical_option>" from Chemical dropdown
    And the user clicks on Total size dropdown
    And the user selects "<total_size_option>" from Total size dropdown
    And the user enters "<full_totes>" into "# of Full totes" field
    And the user enters "<total_partials>" into Total partial input field
    And the user clicks on Save button
    Then the record should be saved in Totes on Standby table

    When the user clicks on Add Records button in Buckets on Standby Tables
    And the user clicks on Chemical dropdown
    And the user selects "<chemical_option>" from Chemical dropdown
    And the user clicks on Bucket Size dropdown
    And the user selects "<bucket_size_option>" from Bucket Size dropdown
    And the user enters "<full_buckets>" into "# of Full Buckets" field
    And the user enters "<partial_buckets>" into partial bucket field
    And the user clicks on Save button
    Then the record should be saved in Buckets on Standby table

Examples:
    | chemical_option | total_size_option | full_totes | total_partials | bucket_size_option | full_buckets | partial_buckets |
    | Chemical A      | Size 1            | 100        | 80             | Size 2             | 200          | 150             |
