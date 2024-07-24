
import com.stratagen_backend.utils.ElementUtils;
package com.stratagen_backend.stepdefinitions;

import com.stratagen_backend.driverfactory.DriverFactory;
import com.stratagen_backend.pages.CreateCustomerNPTPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateCustomerNPT extends DriverFactory {
    CreateCustomerNPTPage createCustomerNPTPage = new CreateCustomerNPTPage(driver);

    @Given("the user is on the Login Page")
    public void the_user_is_on_the_Login_Page() {
        createCustomerNPTPage.navigateToLoginPage();
    }

    @When("the user enters a valid email and password")
    public void the_user_enters_a_valid_email_and_password() {
        createCustomerNPTPage.enterEmailAndPassword();
    }

    @And("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        createCustomerNPTPage.clickElementLoginButton();
    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        Assert.assertTrue(createCustomerNPTPage.isUserLoggedIn());
    }

    @And("the user clicks on the Jobs module")
    public void the_user_clicks_on_the_Jobs_module() {
        createCustomerNPTPage.clickElementJobsModule();
    }

    @When("the user clicks on the table button under jobs")
    public void the_user_clicks_on_the_table_button_under_jobs() {
        createCustomerNPTPage.clickElementTableButton();
    }

    @And("the user enters {string} in the job search box")
    public void the_user_enters_in_the_job_search_box(String jobNumber) {
        createCustomerNPTPage.enterJobNumber(jobNumber);
    }

    @And("the user clicks on the Set as Current Job button")
    public void the_user_clicks_on_the_Set_as_Current_Job_button() {
        createCustomerNPTPage.clickElementSetAsCurrentJobButton();
    }

    @And("the user clicks on the Set as Current Well link")
    public void the_user_clicks_on_the_Set_as_Current_Well_link() {
        createCustomerNPTPage.clickElementSetAsCurrentWellLink();
    }

    @And("the user clicks on the Set as Current Stage link")
    public void the_user_clicks_on_the_Set_as_Current_Stage_link() {
        createCustomerNPTPage.clickElementSetAsCurrentStageLink();
    }

    @Then("the user should see the job details")
    public void the_user_should_see_the_job_details() {
        Assert.assertTrue(createCustomerNPTPage.isJobDetailsDisplayed());
    }

    @When("the user clicks on the Activity log View Detail link")
    public void the_user_clicks_on_the_Activity_log_View_Detail_link() {
        createCustomerNPTPage.clickElementActivityLogViewDetailLink();
    }

    @And("the user clicks on Set Date")
    public void the_user_clicks_on_Set_Date() {
        createCustomerNPTPage.clickElementSetDate();
    }

    @And("the user clicks on the Calendar icon")
    public void the_user_clicks_on_the_Calendar_icon() {
        createCustomerNPTPage.clickElementCalendarIcon();
    }

    @And("the user selects the date from the calendar field")
    public void the_user_selects_the_date_from_the_calendar_field() {
        createCustomerNPTPage.selectDateFromCalendar();
    }

    @And("the user clicks on Save")
    public void the_user_clicks_on_Save() {
        createCustomerNPTPage.clickElementSave();
    }

    @And("the user clicks on Create New Activity Log Entry button")
    public void the_user_clicks_on_Create_New_Activity_Log_Entry_button() {
        createCustomerNPTPage.clickElementCreateNewActivityLogEntryButton();
    }

    @And("the user enters {string} into the End time input field")
    public void the_user_enters_into_the_End_time_input_field(String endTime) {
        createCustomerNPTPage.enterEndTime(endTime);
    }

    @And("the user clicks on the Time on new day checkbox")
    public void the_user_clicks_on_the_Time_on_new_day_checkbox() {
        createCustomerNPTPage.clickElementTimeOnNewDayCheckbox();
    }

//     @And("the user selects the Well value")
//     public void the_user_selects_the_Well_value() {
//         createCustomerNPTPage.selectWellValue();
//     }

//     @And("the user selects the Stage value")
//     public void the_user_selects_the_Stage_value() {
//         createCustomerNPTPage.selectStageValue();
//     }

//     @And("the user selects the OPS activity as Schedule time in activity log")
//     public void the_user_selects_the_OPS_activity_as_Schedule_time_in_activity_log() {
//         createCustomerNPTPage.selectOPSActivityAsScheduleTime();
//     }

//     @And("the user selects the Pump Time present in schedule time")
//     public void the_user_selects_the_Pump_Time_present_in_schedule_time() {
//         createCustomerNPTPage.selectPumpTime();
//     }

//     @And("the user clicks on the Save Activity Log Entry")
//     public void the_user_clicks_on_the_Save_Activity_Log_Entry() {
//         createCustomerNPTPage.clickElementSaveActivityLogEntry();
//     }

//     @And("the user clicks on the three dot action option")
//     public void the_user_clicks_on_the_three_dot_action_option() {
//         createCustomerNPTPage.clickElementThreeDotActionOption();
//     }

//     @And("the user clicks on the complete option")
//     public void the_user_clicks_on_the_complete_option() {
//         createCustomerNPTPage.clickElementCompleteOption();
//     }

//     @Then("the activity log entry should be marked as complete")
//     public void the_activity_log_entry_should_be_marked_as_complete() {
//         Assert.assertTrue(createCustomerNPTPage.isActivityLogEntryMarkedAsComplete());
//     }

//     @When("the user clicks on the Add day button")
//     public void the_user_clicks_on_the_Add_day_button() {
//         createCustomerNPTPage.clickElementAddDayButton();
//     }

//     @And("the user clicks on Create new activity log button")
//     public void the_user_clicks_on_Create_new_activity_log_button() {
//         createCustomerNPTPage.clickElementCreateNewActivityLogButton();
//     }

//     @And("the user enters {string} into the End time2 input field")
//     public void the_user_enters_into_the_End_time2_input_field(String endTime2) {
//         createCustomerNPTPage.enterEndTime2(endTime2);
//     }

//     @And("the user selects the customer NPT option")
//     public void the_user_selects_the_customer_NPT_option() {
//         createCustomerNPTPage.selectCustomerNPTOption();
//     }

//     @Then("the new activity log entry should be created")
//     public void the_new_activity_log_entry_should_be_created() {
//         Assert.assertTrue(createCustomerNPTPage.isNewActivityLogEntryCreated());
//     }

//     @And("the user enters {string} in the job search box for invalid operations")
//     public void the_user_enters_in_the_job_search_box_for_invalid_operations(String invalidJobNumber) {
//         createCustomerNPTPage.enterInvalidJobNumber(invalidJobNumber);
//     }

//     @Then("the user should see an error message {string}")
//     public void the_user_should_see_an_error_message(String errorMessage) {
//         Assert.assertEquals(errorMessage, createCustomerNPTPage.getErrorMessage());
//     }

//     @And("the user enters {string} into the End time input field for invalid operations")
//     public void the_user_enters_into_the_End_time_input_field_for_invalid_operations(String invalidEndTime) {
//         createCustomerNPTPage.enterInvalidEndTime(invalidEndTime);
//     }

    // Missing methods added below

//     @And("the user selects the Well value")
//     public void the_user_selects_the_Well_value() {
//         createCustomerNPTPage.selectWellValue();
//     }

//     @And("the user selects the Stage value")
//     public void the_user_selects_the_Stage_value() {
//         createCustomerNPTPage.selectStageValue();
//     }

//     @And("the user selects the OPS activity as Schedule time in activity log")
//     public void the_user_selects_the_OPS_activity_as_Schedule_time_in_activity_log() {
//         createCustomerNPTPage.selectOPSActivityAsScheduleTime();
//     }

//     @And("the user selects the Pump Time present in schedule time")
//     public void the_user_selects_the_Pump_Time_present_in_schedule_time() {
//         createCustomerNPTPage.selectPumpTime();
//     }

//     @And("the user clicks on the Save Activity Log Entry")
//     public void the_user_clicks_on_the_Save_Activity_Log_Entry() {
//         createCustomerNPTPage.clickElementSaveActivityLogEntry();
//     }

//     @And("the user clicks on the three dot action option")
//     public void the_user_clicks_on_the_three_dot_action_option() {
//         createCustomerNPTPage.clickElementThreeDotActionOption();
//     }

//     @And("the user clicks on the complete option")
//     public void the_user_clicks_on_the_complete_option() {
//         createCustomerNPTPage.clickElementCompleteOption();
//     }

//     @Then("the activity log entry should be marked as complete")
//     public void the_activity_log_entry_should_be_marked_as_complete() {
//         Assert.assertTrue(createCustomerNPTPage.isActivityLogEntryMarkedAsComplete());
//     }

//     @When("the user clicks on the Add day button")
//     public void the_user_clicks_on_the_Add_day_button() {
//         createCustomerNPTPage.clickElementAddDayButton();
//     }

//     @And("the user clicks on Create new activity log button")
//     public void the_user_clicks_on_Create_new_activity_log_button() {
//         createCustomerNPTPage.clickElementCreateNewActivityLogButton();
//     }

//     @And("the user enters {string} into the End time2 input field")
//     public void the_user_enters_into_the_End_time2_input_field(String endTime2) {
//         createCustomerNPTPage.enterEndTime2(endTime2);
//     }

//     @And("the user selects the customer NPT option")
//     public void the_user_selects_the_customer_NPT_option() {
//         createCustomerNPTPage.selectCustomerNPTOption();
//     }

//     @Then("the new activity log entry should be created")
//     public void the_new_activity_log_entry_should_be_created() {
//         Assert.assertTrue(createCustomerNPTPage.isNewActivityLogEntryCreated());
//     }

//     @And("the user enters {string} in the job search box for invalid operations")
//     public void the_user_enters_in_the_job_search_box_for_invalid_operations(String invalidJobNumber) {
//         createCustomerNPTPage.enterInvalidJobNumber(invalidJobNumber);
//     }

//     @Then("the user should see an error message {string}")
//     public void the_user_should_see_an_error_message(String errorMessage) {
//         Assert.assertEquals(errorMessage, createCustomerNPTPage.getErrorMessage());
//     }

//     @And("the user enters {string} into the End time input field for invalid operations")
//     public void the_user_enters_into_the_End_time_input_field_for_invalid_operations(String invalidEndTime) {
//         createCustomerNPTPage.enterInvalidEndTime(invalidEndTime);
//     }
}
