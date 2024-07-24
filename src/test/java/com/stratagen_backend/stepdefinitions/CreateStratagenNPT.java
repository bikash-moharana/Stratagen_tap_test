
import com.stratagen_backend.utils.ElementUtils;
package com.stratagen_backend.stepdefinitions;

import com.stratagen_backend.driverfactory.DriverFactory;
import com.stratagen_backend.pages.CreateStratagenNPTPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateStratagenNPT extends DriverFactory {
    CreateStratagenNPTPage createStratagenNPTPage = new CreateStratagenNPTPage(driver);

    @Given("the user is on the Jobs Listing Page")
    public void the_user_is_on_the_Jobs_Listing_Page() {
        createStratagenNPTPage.navigateToJobsListingPage();
    }

    @When("the user clicks on the job module element")
    public void the_user_clicks_on_the_job_module_element() {
        createStratagenNPTPage.clickElementJobModuleElement();
    }

    @And("the user clicks action on the table button element")
    public void the_user_clicks_action_on_the_table_button_element() {
        createStratagenNPTPage.clickElementActionOnTableButtonElement();
    }

    @And("the user enters {string} in the job search box element")
    public void the_user_enters_in_the_job_search_box_element(String jobNumber) {
        createStratagenNPTPage.enterJobNumberInSearchBox(jobNumber);
    }

    @And("the user clicks on the Set as Current Job button element")
    public void the_user_clicks_on_the_Set_as_Current_Job_button_element() {
        createStratagenNPTPage.clickElementSetAsCurrentJobButton();
    }

    @And("the user clicks on the Set as Current Well link element")
    public void the_user_clicks_on_the_Set_as_Current_Well_link_element() {
        createStratagenNPTPage.clickElementSetAsCurrentWellLink();
    }

    @And("the user clicks on the Set as Current Stage link element")
    public void the_user_clicks_on_the_Set_as_Current_Stage_link_element() {
        createStratagenNPTPage.clickElementSetAsCurrentStageLink();
    }

    @And("the user clicks on the Activity log View Detail link element")
    public void the_user_clicks_on_the_Activity_log_View_Detail_link_element() {
        createStratagenNPTPage.clickElementActivityLogViewDetailLink();
    }

    @Then("the user should be on the Activity Log Page")
    public void the_user_should_be_on_the_Activity_Log_Page() {
        Assert.assertTrue(createStratagenNPTPage.isOnActivityLogPage());
    }

    @When("the user clicks on the Set Date element")
    public void the_user_clicks_on_the_Set_Date_element() {
        createStratagenNPTPage.clickElementSetDateElement();
    }

    @And("the user enters {string} from the calendar date input field element")
    public void the_user_enters_from_the_calendar_date_input_field_element(String date) {
        createStratagenNPTPage.enterDateFromCalendar(date);
    }

//     @And("the user clicks on the Save button")
//     public void the_user_clicks_on_the_Save_button() {
//         createStratagenNPTPage.clickElementSaveButton();
//     }

    @Then("the date should be saved successfully")
    public void the_date_should_be_saved_successfully() {
        Assert.assertTrue(createStratagenNPTPage.isDateSavedSuccessfully());
    }

//     @When("the user clicks on the Create New Activity Log Entry button")
//     public void the_user_clicks_on_the_Create_New_Activity_Log_Entry_button() {
//         createStratagenNPTPage.clickElementCreateNewActivityLogEntryButton();
//     }

//     @And("the user enters {string} into the End time input field")
//     public void the_user_enters_into_the_End_time_input_field(String endTime) {
//         createStratagenNPTPage.enterEndTime(endTime);
//     }

    @And("the user selects {string} in the well field")
    public void the_user_selects_in_the_well_field(String wellValue) {
        createStratagenNPTPage.selectWellField(wellValue);
    }

    @And("the user selects {string} in the stage field")
    public void the_user_selects_in_the_stage_field(String stageValue) {
        createStratagenNPTPage.selectStageField(stageValue);
    }

    @And("the user selects OPS activity as Schedule time in the activity log")
    public void the_user_selects_OPS_activity_as_Schedule_time_in_the_activity_log() {
        createStratagenNPTPage.selectOPSActivityAsScheduleTime();
    }

    @And("the user selects NPT present in Stratagen NPT field")
    public void the_user_selects_NPT_present_in_Stratagen_NPT_field() {
        createStratagenNPTPage.selectNPTInStratagenNPTField();
    }

    @And("the user clicks on the Save Activity Log Entry element")
    public void the_user_clicks_on_the_Save_Activity_Log_Entry_element() {
        createStratagenNPTPage.clickElementSaveActivityLogEntryElement();
    }

    @Then("the new activity log entry should be saved successfully")
    public void the_new_activity_log_entry_should_be_saved_successfully() {
        Assert.assertTrue(createStratagenNPTPage.isActivityLogEntrySavedSuccessfully());
    }

    @Then("the date should not be saved and an error message should be displayed")
    public void the_date_should_not_be_saved_and_an_error_message_should_be_displayed() {
        Assert.assertTrue(createStratagenNPTPage.isDateSaveErrorMessageDisplayed());
    }

    @Then("the new activity log entry should not be saved and an error message should be displayed")
    public void the_new_activity_log_entry_should_not_be_saved_and_an_error_message_should_be_displayed() {
        Assert.assertTrue(createStratagenNPTPage.isActivityLogEntrySaveErrorMessageDisplayed());
    }
}
