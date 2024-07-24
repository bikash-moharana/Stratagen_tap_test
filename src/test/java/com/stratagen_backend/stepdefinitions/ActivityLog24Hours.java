
import com.stratagen_backend.utils.ElementUtils;
package com.stratagen_backend.stepdefinitions;

import com.stratagen_backend.driverfactory.DriverFactory;
import com.stratagen_backend.pages.ActivityLog24HoursPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityLog24Hours extends DriverFactory {
    ActivityLog24HoursPage activityLog24HoursPage = new ActivityLog24HoursPage(driver);

    @Given("the user has opened the application")
    public void the_user_has_opened_the_application() {
        driver = DriverFactory.getDriver();
    }

    @And("the user has entered a valid Email and password")
    public void the_user_has_entered_a_valid_Email_and_password() {
        activityLog24HoursPage.enterEmailAndPassword();
    }

    @And("the user has clicked on the login button")
    public void the_user_has_clicked_on_the_login_button() {
        activityLog24HoursPage.clickElementLoginButton();
    }

    @And("the user has clicked on the Jobs module")
    public void the_user_has_clicked_on_the_Jobs_module() {
        activityLog24HoursPage.clickElementJobsModule();
    }

    @When("the user clicks on the table button under the jobs")
    public void the_user_clicks_on_the_table_button_under_the_jobs() {
        activityLog24HoursPage.clickElementTableButton();
    }

    @And("the user clicks on the Set as Current Job button of the job")
    public void the_user_clicks_on_the_Set_as_Current_Job_button_of_the_job() {
        activityLog24HoursPage.clickElementSetAsCurrentJobButton();
    }

    @Then("the job should be set as the current job")
    public void the_job_should_be_set_as_the_current_job() {
        Assert.assertTrue(activityLog24HoursPage.isCurrentJobSet());
    }

//     @When("the user clicks on the Set as Current Well link for the well")
//     public void the_user_clicks_on_the_Set_as_Current_Well_link_for_the_well() {
//         activityLog24HoursPage.clickElementSetAsCurrentWellLink();
//     }

//     @Then("the well should be set as the current well")
//     public void the_well_should_be_set_as_the_current_well() {
//         Assert.assertTrue(activityLog24HoursPage.isCurrentWellSet());
//     }

//     @When("the user clicks on the Set as Current Stage link for stages")
//     public void the_user_clicks_on_the_Set_as_Current_Stage_link_for_stages() {
//         activityLog24HoursPage.clickElementSetAsCurrentStageLink();
//     }

//     @Then("the stage should be set as the current stage")
//     public void the_stage_should_be_set_as_the_current_stage() {
//         Assert.assertTrue(activityLog24HoursPage.isCurrentStageSet());
//     }

//     @When("the user clicks on the Activity log View Detail link for log details")
//     public void the_user_clicks_on_the_Activity_log_View_Detail_link_for_log_details() {
//         activityLog24HoursPage.clickElementActivityLogViewDetailLink();
//     }

//     @Then("the activity log details should be displayed")
//     public void the_activity_log_details_should_be_displayed() {
//         Assert.assertTrue(activityLog24HoursPage.isActivityLogDetailsDisplayed());
//     }

    @When("the user clicks on the Set Date action")
    public void the_user_clicks_on_the_Set_Date_action() {
        activityLog24HoursPage.clickElementSetDateAction();
    }

    @And("the user enters the date {string} from the calendar field")
    public void the_user_enters_the_date_from_the_calendar_field(String date) {
        activityLog24HoursPage.enterDate(date);
    }

    @And("the user clicks on the Save button")
    public void the_user_clicks_on_the_Save_button() {
        activityLog24HoursPage.clickElementSaveButton();
    }

    @Then("the date should be saved")
    public void the_date_should_be_saved() {
        Assert.assertTrue(activityLog24HoursPage.isDateSaved());
    }

    @When("the user clicks on the Create New Activity Log Entry button")
    public void the_user_clicks_on_the_Create_New_Activity_Log_Entry_button() {
        activityLog24HoursPage.clickElementCreateNewActivityLogEntryButton();
    }

    @And("the user enters the {string} into the End time input field")
    public void the_user_enters_the_end_time_into_the_End_time_input_field(String endTime) {
        activityLog24HoursPage.enterEndTime(endTime);
    }

//     @And("the user clicks on the Time on new day checkbox")
//     public void the_user_clicks_on_the_Time_on_new_day_checkbox() {
//         activityLog24HoursPage.clickElementTimeOnNewDayCheckbox();
//     }

    @And("the user selects the {string} from the well dropdown")
    public void the_user_selects_the_from_the_well_dropdown(String wellValue) {
        activityLog24HoursPage.selectWellDropdown(wellValue);
    }

    @And("the user selects the {string} from the stage input field")
    public void the_user_selects_the_from_the_stage_input_field(String stageValue) {
        activityLog24HoursPage.selectStageInputField(stageValue);
    }

    @And("the user selects OPS activity as Schedule time in activity log")
    public void the_user_selects_OPS_activity_as_Schedule_time_in_activity_log() {
        activityLog24HoursPage.selectOPSActivityAsScheduleTime();
    }

    @And("the user selects the Pump Time from schedule time")
    public void the_user_selects_the_Pump_Time_from_schedule_time() {
        activityLog24HoursPage.selectPumpTimeFromScheduleTime();
    }

    @And("the user clicks on the Save Activity Log Entry button")
    public void the_user_clicks_on_the_Save_Activity_Log_Entry_button() {
        activityLog24HoursPage.clickElementSaveActivityLogEntryButton();
    }

    @Then("the new activity log entry should be saved")
    public void the_new_activity_log_entry_should_be_saved() {
        Assert.assertTrue(activityLog24HoursPage.isNewActivityLogEntrySaved());
    }

    @And("the user enters an invalid date {string} from the calendar field")
    public void the_user_enters_an_invalid_date_from_the_calendar_field(String invalidDate) {
        activityLog24HoursPage.enterInvalidDate(invalidDate);
    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {
        Assert.assertTrue(activityLog24HoursPage.isErrorMessageDisplayed());
    }

    @And("the user enters an invalid {string} into the End time input field")
    public void the_user_enters_an_invalid_into_the_End_time_input_field(String invalidEndTime) {
        activityLog24HoursPage.enterInvalidEndTime(invalidEndTime);
    }
    
    // Missing methods
//     @When("the user clicks on the Set as Current Well link for the well")
//     public void the_user_clicks_on_the_Set_as_Current_Well_link_for_the_well() {
//         activityLog24HoursPage.clickElementSetAsCurrentWellLink();
//     }

//     @Then("the well should be set as the current well")
//     public void the_well_should_be_set_as_the_current_well() {
//         Assert.assertTrue(activityLog24HoursPage.isCurrentWellSet());
//     }

//     @When("the user clicks on the Set as Current Stage link for stages")
//     public void the_user_clicks_on_the_Set_as_Current_Stage_link_for_stages() {
//         activityLog24HoursPage.clickElementSetAsCurrentStageLink();
//     }

//     @Then("the stage should be set as the current stage")
//     public void the_stage_should_be_set_as_the_current_stage() {
//         Assert.assertTrue(activityLog24HoursPage.isCurrentStageSet());
//     }

//     @When("the user clicks on the Activity log View Detail link for log details")
//     public void the_user_clicks_on_the_Activity_log_View_Detail_link_for_log_details() {
//         activityLog24HoursPage.clickElementActivityLogViewDetailLink();
//     }

//     @Then("the activity log details should be displayed")
//     public void the_activity_log_details_should_be_displayed() {
//         Assert.assertTrue(activityLog24HoursPage.isActivityLogDetailsDisplayed());
//     }
}
