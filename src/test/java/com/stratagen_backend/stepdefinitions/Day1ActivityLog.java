
import com.stratagen_backend.utils.ElementUtils;
package com.stratagen_backend.stepdefinitions;

import com.stratagen_backend.driverfactory.DriverFactory;
import com.stratagen_backend.pages.Day1ActivityLogPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Day1ActivityLog extends DriverFactory {
    Day1ActivityLogPage day1ActivityLogPage = new Day1ActivityLogPage(driver);

//     @Given("the user is on the Login Page")
//     public void the_user_is_on_the_Login_Page() {
//         driver = DriverFactory.getDriver();
//         day1ActivityLogPage.navigateToLoginPage();
//     }

    @When("the user enters {string} into the email input field")
    public void the_user_enters_email_into_the_email_input_field(String email) {
        day1ActivityLogPage.enterEmail(email);
    }

    @And("the user enters {string} into the password input field")
    public void the_user_enters_password_into_the_password_input_field(String password) {
        day1ActivityLogPage.enterPassword(password);
    }

//     @And("the user clicks on the login button")
//     public void the_user_clicks_on_the_login_button() {
//         day1ActivityLogPage.clickElementLoginButton();
//     }

    @Then("the user should be directed to the Dashboard Page")
    public void the_user_should_be_directed_to_the_Dashboard_Page() {
        Assert.assertTrue(day1ActivityLogPage.isDashboardPageDisplayed());
    }

    @When("the user clicks on the Jobs option")
    public void the_user_clicks_on_the_Jobs_option() {
        day1ActivityLogPage.clickElementJobsOption();
    }

    @Then("the Jobs listing should appear")
    public void the_Jobs_listing_should_appear() {
        Assert.assertTrue(day1ActivityLogPage.isJobsListingDisplayed());
    }

    @When("the user clicks on the table button")
    public void the_user_clicks_on_the_table_button() {
        day1ActivityLogPage.clickElementTableButton();
    }

    @And("the user enters {string} into the search box")
    public void the_user_enters_job_number_into_the_search_box(String jobNumber) {
        day1ActivityLogPage.enterJobNumberInSearchBox(jobNumber);
    }

    @Then("the job with job number {string} should be displayed")
    public void the_job_with_job_number_should_be_displayed(String jobNumber) {
        Assert.assertTrue(day1ActivityLogPage.isJobDisplayed(jobNumber));
    }

    @When("the user clicks on the Set as Current Job link")
    public void the_user_clicks_on_the_Set_as_Current_Job_link() {
        day1ActivityLogPage.clickElementSetAsCurrentJobLink();
    }

//     @Then("the job should be set as the current job")
//     public void the_job_should_be_set_as_the_current_job() {
//         Assert.assertTrue(day1ActivityLogPage.isCurrentJobSet());
//     }

//     @When("the user clicks on the Set as Current Well link")
//     public void the_user_clicks_on_the_Set_as_Current_Well_link() {
//         day1ActivityLogPage.clickElementSetAsCurrentWellLink();
//     }

    @Then("the well should be set as the current well")
    public void the_well_should_be_set_as_the_current_well() {
        Assert.assertTrue(day1ActivityLogPage.isCurrentWellSet());
    }

//     @When("the user clicks on the Set as Current Stage link")
//     public void the_user_clicks_on_the_Set_as_Current_Stage_link() {
//         day1ActivityLogPage.clickElementSetAsCurrentStageLink();
//     }

    @Then("the stage should be set as the current stage")
    public void the_stage_should_be_set_as_the_current_stage() {
        Assert.assertTrue(day1ActivityLogPage.isCurrentStageSet());
    }

//     @When("the user clicks on the Activity log View Detail link")
//     public void the_user_clicks_on_the_Activity_log_View_Detail_link() {
//         day1ActivityLogPage.clickElementActivityLogViewDetailLink();
//     }

    @Then("the Activity log details should be displayed")
    public void the_Activity_log_details_should_be_displayed() {
        Assert.assertTrue(day1ActivityLogPage.isActivityLogDetailsDisplayed());
    }

    @When("the user clicks on the Set Date link")
    public void the_user_clicks_on_the_Set_Date_link() {
        day1ActivityLogPage.clickElementSetDateLink();
    }

    @And("the user enters {string} into the calendar date input field")
    public void the_user_enters_date_into_the_calendar_date_input_field(String date) {
        day1ActivityLogPage.enterDate(date);
    }

//     @And("the user clicks on the Save button")
//     public void the_user_clicks_on_the_Save_button() {
//         day1ActivityLogPage.clickElementSaveButton();
//     }

//     @Then("the date should be saved")
//     public void the_date_should_be_saved() {
//         Assert.assertTrue(day1ActivityLogPage.isDateSaved());
//     }

//     @When("the user clicks on the Create New Activity Log Entry button")
//     public void the_user_clicks_on_the_Create_New_Activity_Log_Entry_button() {
//         day1ActivityLogPage.clickElementCreateNewActivityLogEntryButton();
//     }

    @And("the user enters {string} into the End Time input field")
    public void the_user_enters_end_time_into_the_End_Time_input_field(String endTime) {
        day1ActivityLogPage.enterEndTime(endTime);
    }

    @And("the user selects {string} from the Well dropdown")
    public void the_user_selects_well_name_from_the_Well_dropdown(String wellName) {
        day1ActivityLogPage.selectWellFromDropdown(wellName);
    }

    @And("the user selects {string} from the Stage dropdown")
    public void the_user_selects_stage_name_from_the_Stage_dropdown(String stageName) {
        day1ActivityLogPage.selectStageFromDropdown(stageName);
    }

    @And("the user selects Schedule time from the OPS activity dropdown")
    public void the_user_selects_Schedule_time_from_the_OPS_activity_dropdown() {
        day1ActivityLogPage.selectOpsActivity("Schedule time");
    }

    @And("the user selects Pump Time from the Pump Time dropdown")
    public void the_user_selects_Pump_Time_from_the_Pump_Time_dropdown() {
        day1ActivityLogPage.selectPumpTime("Pump Time");
    }

    @And("the user enters {string} into the comment input field")
    public void the_user_enters_comment_into_the_comment_input_field(String comment) {
        day1ActivityLogPage.enterComment(comment);
    }

//     @And("the user clicks on the Save Activity Log Entry button")
//     public void the_user_clicks_on_the_Save_Activity_Log_Entry_button() {
//         day1ActivityLogPage.clickElementSaveActivityLogEntryButton();
//     }

//     @Then("the new activity log entry should be saved")
//     public void the_new_activity_log_entry_should_be_saved() {
//         Assert.assertTrue(day1ActivityLogPage.isActivityLogEntrySaved());
//     }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        Assert.assertTrue(day1ActivityLogPage.isErrorMessageDisplayed());
    }
}
