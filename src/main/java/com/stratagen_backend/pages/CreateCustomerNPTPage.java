
package com.stratagen_backend.pages;

import com.stratagen_backend.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerNPTPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public CreateCustomerNPTPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "jobsModule")
    private WebElement jobsModule;

    @FindBy(id = "tableButton")
    private WebElement tableButton;

    @FindBy(id = "jobSearchBox")
    private WebElement jobSearchBox;

    @FindBy(id = "setAsCurrentJobButton")
    private WebElement setAsCurrentJobButton;

    @FindBy(id = "setAsCurrentWellLink")
    private WebElement setAsCurrentWellLink;

    @FindBy(id = "setAsCurrentStageLink")
    private WebElement setAsCurrentStageLink;

    @FindBy(id = "jobDetails")
    private WebElement jobDetails;

    @FindBy(id = "activityLogViewDetailLink")
    private WebElement activityLogViewDetailLink;

    @FindBy(id = "setDate")
    private WebElement setDate;

    @FindBy(id = "calendarIcon")
    private WebElement calendarIcon;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "createNewActivityLogEntryButton")
    private WebElement createNewActivityLogEntryButton;

    @FindBy(id = "endTimeInput")
    private WebElement endTimeInput;

    @FindBy(id = "timeOnNewDayCheckbox")
    private WebElement timeOnNewDayCheckbox;

    @FindBy(id = "newActivityLogEntry")
    private WebElement newActivityLogEntry;

    @FindBy(id = "createNewActivityLogButton")
    private WebElement createNewActivityLogButton;

    @FindBy(id = "endTimeField2")
    private WebElement endTimeField2;

    @FindBy(id = "saveActivityLogEntryButton")
    private WebElement saveActivityLogEntryButton;

    @FindBy(id = "activityLogEntryComplete")
    private WebElement activityLogEntryComplete;

    @FindBy(id = "addDayButton")
    private WebElement addDayButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "invalidJobNumberField")
    private WebElement invalidJobNumberField;

    @FindBy(id = "customerNPTDropdown")
    private WebElement customerNPTDropdown;

    @FindBy(id = "invalidEndTimeField")
    private WebElement invalidEndTimeField;

    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;

    @FindBy(id = "threeDotActionOption")
    private WebElement threeDotActionOption;

    @FindBy(id = "stageDropdown")
    private WebElement stageDropdown;

    @FindBy(id = "pumpTimeDropdown")
    private WebElement pumpTimeDropdown;

    @FindBy(id = "opsActivityDropdown")
    private WebElement opsActivityDropdown;

    @FindBy(id = "completeOptionButton")
    private WebElement completeOptionButton;

    public void navigateToLoginPage() {
        driver.get("https://ops-preprod.fracpro.ai/");
    }

    public void enterEmailAndPassword() {
        try {
            elementUtils.clearAndSendKeys(emailField, "validEmail@example.com");
            elementUtils.clearAndSendKeys(passwordField, "validPassword");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUserLoggedIn() {
        try {
            return elementUtils.isElementDisplayed(jobsModule);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementJobsModule() {
        try {
            elementUtils.clickElement(jobsModule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementTableButton() {
        try {
            elementUtils.clickElement(tableButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobNumber(String jobNumber) {
        try {
            elementUtils.clearAndSendKeys(jobSearchBox, jobNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSetAsCurrentJobButton() {
        try {
            elementUtils.clickElement(setAsCurrentJobButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSetAsCurrentWellLink() {
        try {
            elementUtils.clickElement(setAsCurrentWellLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSetAsCurrentStageLink() {
        try {
            elementUtils.clickElement(setAsCurrentStageLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobDetailsDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobDetails);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementActivityLogViewDetailLink() {
        try {
            elementUtils.clickElement(activityLogViewDetailLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSetDate() {
        try {
            elementUtils.clickElement(setDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementCalendarIcon() {
        try {
            elementUtils.clickElement(calendarIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDateFromCalendar() {
        // Implement the logic to select a date from the calendar
    }

    public void clickElementSave() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementCreateNewActivityLogEntryButton() {
        try {
            elementUtils.clickElement(createNewActivityLogEntryButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEndTime(String endTime) {
        try {
            elementUtils.clearAndSendKeys(endTimeInput, endTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementTimeOnNewDayCheckbox() {
        try {
            elementUtils.clickElement(timeOnNewDayCheckbox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isNewActivityLogEntryCreated() {
        try {
            return elementUtils.isElementDisplayed(newActivityLogEntry);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementCreateNewActivityLogButton() {
        try {
            elementUtils.clickElement(createNewActivityLogButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEndTime2(String endTime) {
        try {
            elementUtils.clearAndSendKeys(endTimeField2, endTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSaveActivityLogEntry() {
        try {
            elementUtils.clickElement(saveActivityLogEntryButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isActivityLogEntryMarkedAsComplete() {
        try {
            return elementUtils.isElementDisplayed(activityLogEntryComplete);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementAddDayButton() {
        try {
            elementUtils.clickElement(addDayButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void enterInvalidJobNumber(String jobNumber) {
        try {
            elementUtils.clearAndSendKeys(invalidJobNumberField, jobNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCustomerNPTOption(String option) {
        try {
            elementUtils.selectOptionInDropdown(customerNPTDropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterInvalidEndTime(String endTime) {
        try {
            elementUtils.clearAndSendKeys(invalidEndTimeField, endTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWellValue(String wellValue) {
        try {
            elementUtils.selectOptionInDropdown(wellDropdown, wellValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementThreeDotActionOption() {
        try {
            elementUtils.clickElement(threeDotActionOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStageValue(String stageValue) {
        try {
            elementUtils.selectOptionInDropdown(stageDropdown, stageValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectPumpTime(String pumpTime) {
        try {
            elementUtils.selectOptionInDropdown(pumpTimeDropdown, pumpTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOPSActivityAsScheduleTime(String scheduleTime) {
        try {
            elementUtils.selectOptionInDropdown(opsActivityDropdown, scheduleTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementCompleteOption() {
        try {
            elementUtils.clickElement(completeOptionButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
