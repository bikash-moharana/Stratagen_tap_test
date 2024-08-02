
import com.stratagen_backend.utils.ElementUtils;
package com.stratagen_backend.stepdefinitions;

import com.stratagen_backend.driverfactory.DriverFactory;
import com.stratagen_backend.pages.ChemicalStandbyPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemicalStandby extends DriverFactory {
    ChemicalStandbyPage chemicalStandbyPage = new ChemicalStandbyPage(driver);

    @Given("the user opens the application")
    public void the_user_opens_the_application() {
        driver = DriverFactory.getDriver();
    }

    @And("the user enters {string} into the {string} input field")
    public void the_user_enters_into_the_input_field(String text, String field) {
        chemicalStandbyPage.clearAndSendKeysIntoField(text, field);
    }

    @And("the user clicks on the Login Button")
    public void the_user_clicks_on_the_Login_Button() {
        chemicalStandbyPage.clickElementLoginButton();
    }

    @And("the user scrolls to Jobs Side bar")
    public void the_user_scrolls_to_Jobs_Side_bar() {
        chemicalStandbyPage.scrollToJobsSidebar();
    }

    @And("the user drags the Board Option and drops it in the box")
    public void the_user_drags_the_Board_Option_and_drops_it_in_the_box() {
        chemicalStandbyPage.dragAndDropBoardOption();
    }

    @And("the user goes to an existing job and clicks on Show Job button")
    public void the_user_goes_to_an_existing_job_and_clicks_on_Show_Job_button() {
        chemicalStandbyPage.clickElementShowJobButton();
    }

    @And("the user navigates to the Chemical")
    public void the_user_navigates_to_the_Chemical() {
        chemicalStandbyPage.navigateToChemical();
    }

    @And("the user clicks on View Details link")
    public void the_user_clicks_on_View_Details_link() {
        chemicalStandbyPage.clickElementViewDetailsLink();
    }

    @And("the user right clicks on Delivery tracking")
    public void the_user_right_clicks_on_Delivery_tracking() {
        chemicalStandbyPage.rightClickDeliveryTracking();
    }

    @And("the user goes to the existing chemical present under Delivery record list")
    public void the_user_goes_to_the_existing_chemical_present_under_Delivery_record_list() {
        chemicalStandbyPage.goToExistingChemical();
    }

    @When("the user double clicks on the three-dot toggle dropdown present on the right side of the existing chemical under Delivery record list")
    public void the_user_double_clicks_on_the_three_dot_toggle_dropdown_present_on_the_right_side_of_the_existing_chemical_under_Delivery_record_list() {
        chemicalStandbyPage.doubleClickThreeDotToggle();
    }

    @And("the user clicks on Stand by Option")
    public void the_user_clicks_on_Stand_by_Option() {
        chemicalStandbyPage.clickElementStandByOption();
    }

    @And("the user clicks and holds on Yes, move it Option from the pop-up")
    public void the_user_clicks_and_holds_on_Yes_move_it_Option_from_the_pop_up() {
        chemicalStandbyPage.clickElementAndHoldYesMoveItOption();
    }

    @Then("the selected existing chemical should not be displayed under Delivery Record List")
    public void the_selected_existing_chemical_should_not_be_displayed_under_Delivery_Record_List() {
        Assert.assertFalse(chemicalStandbyPage.isChemicalDisplayedUnderDeliveryRecordList());
    }

    @And("the user clicks on Stand by option")
    public void the_user_clicks_on_Stand_by_option() {
        chemicalStandbyPage.clickElementStandByOption();
    }

    @Then("the existing chemical should be displayed under Deliveries on Stand-By in Chemicals - Standby page")
    public void the_existing_chemical_should_be_displayed_under_Deliveries_on_Stand_By_in_Chemicals_Standby_page() {
        Assert.assertTrue(chemicalStandbyPage.isChemicalDisplayedUnderDeliveriesOnStandBy());
    }

    @When("the user clicks on Add Records button in Totes on Standby Tables")
    public void the_user_clicks_on_Add_Records_button_in_Totes_on_Standby_Tables() {
        chemicalStandbyPage.clickElementAddRecordsButtonInTotes();
    }

//     @And("the user clicks on Chemical dropdown")
//     public void the_user_clicks_on_Chemical_dropdown() {
//         chemicalStandbyPage.clickElementChemicalDropdown();
//     }

//     @And("the user selects {string} from Chemical dropdown")
//     public void the_user_selects_from_Chemical_dropdown(String chemicalOption) {
//         chemicalStandbyPage.selectChemicalOption(chemicalOption);
//     }

    @And("the user clicks on Total size dropdown")
    public void the_user_clicks_on_Total_size_dropdown() {
        chemicalStandbyPage.clickElementTotalSizeDropdown();
    }

    @And("the user selects {string} from Total size dropdown")
    public void the_user_selects_from_Total_size_dropdown(String totalSizeOption) {
        chemicalStandbyPage.selectTotalSizeOption(totalSizeOption);
    }

//     @And("the user enters {string} into {string} field")
//     public void the_user_enters_into_field(String value, String field) {
//         chemicalStandbyPage.enterValueIntoField(value, field);
//     }

//     @And("the user clicks on Save button")
//     public void the_user_clicks_on_Save_button() {
//         chemicalStandbyPage.clickElementSaveButton();
//     }

    @Then("the record should be saved in Totes on Standby table")
    public void the_record_should_be_saved_in_Totes_on_Standby_table() {
        Assert.assertTrue(chemicalStandbyPage.isRecordSavedInTotes());
    }

    @When("the user clicks on Add Records button in Buckets on Standby Tables")
    public void the_user_clicks_on_Add_Records_button_in_Buckets_on_Standby_Tables() {
        chemicalStandbyPage.clickElementAddRecordsButtonInBuckets();
    }

//     @And("the user clicks on Chemical dropdown")
//     public void the_user_clicks_on_Chemical_dropdown() {
//         chemicalStandbyPage.clickElementChemicalDropdown();
//     }

//     @And("the user selects {string} from Chemical dropdown")
//     public void the_user_selects_from_Chemical_dropdown(String chemicalOption) {
//         chemicalStandbyPage.selectChemicalOption(chemicalOption);
//     }

    @And("the user clicks on Bucket Size dropdown")
    public void the_user_clicks_on_Bucket_Size_dropdown() {
        chemicalStandbyPage.clickElementBucketSizeDropdown();
    }

    @And("the user selects {string} from Bucket Size dropdown")
    public void the_user_selects_from_Bucket_Size_dropdown(String bucketSizeOption) {
        chemicalStandbyPage.selectBucketSizeOption(bucketSizeOption);
    }

//     @And("the user enters {string} into {string} field")
//     public void the_user_enters_into_field(String value, String field) {
//         chemicalStandbyPage.enterValueIntoField(value, field);
//     }

//     @And("the user clicks on Save button")
//     public void the_user_clicks_on_Save_button() {
//         chemicalStandbyPage.clickElementSaveButton();
//     }

    @Then("the record should be saved in Buckets on Standby table")
    public void the_record_should_be_saved_in_Buckets_on_Standby_table() {
        Assert.assertTrue(chemicalStandbyPage.isRecordSavedInBuckets());
    }
}
