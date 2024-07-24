
package com.stratagen_backend.pages;

import com.stratagen_backend.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityLog24HoursPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public ActivityLog24HoursPage(WebDriver driver) {
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

    @FindBy(id = "setAsCurrentJobButton")
    private WebElement setAsCurrentJobButton;

    @FindBy(id = "setDateAction")
    private WebElement setDateAction;

    @FindBy(id = "calendarField")
    private WebElement calendarField;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "createNewActivityLogEntryButton")
    private WebElement createNewActivityLogEntryButton;

    @FindBy(id = "endTimeInputField")
    private WebElement endTimeInputField;

    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;

    @FindBy(id = "stageInputField")
    private WebElement stageInputField;

    @FindBy(id = "opsActivityScheduleTime")
    private WebElement opsActivityScheduleTime;

    @FindBy(id = "pumpTimeScheduleTime")
    private WebElement pumpTimeScheduleTime;

    @FindBy(id = "saveActivityLogEntryButton")
    private WebElement saveActivityLogEntryButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "currentStage")
    private WebElement currentStage;

    @FindBy(id = "activityLogViewDetailLink")
    private WebElement activityLogViewDetailLink;

    @FindBy(id = "setAsCurrentStageLink")
    private WebElement setAsCurrentStageLink;

    @FindBy(id = "currentWell")
    private WebElement currentWell;

    @FindBy(id = "timeOnNewDayCheckbox")
    private WebElement timeOnNewDayCheckbox;

    @FindBy(id = "setAsCurrentWellLink")
    private WebElement setAsCurrentWellLink;

    @FindBy(id = "activityLogDetails")
    private WebElement activityLogDetails;

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

    public void clickElementSetAsCurrentJobButton() {
        try {
            elementUtils.clickElement(setAsCurrentJobButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCurrentJobSet() {
        try {
            return elementUtils.isElementDisplayed(setAsCurrentJobButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementSetDateAction() {
        try {
            elementUtils.clickElement(setDateAction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDate(String date) {
        try {
            elementUtils.clearAndSendKeys(calendarField, date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDateSaved() {
        try {
            return elementUtils.isElementDisplayed(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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
            elementUtils.clearAndSendKeys(endTimeInputField, endTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWellDropdown(String wellValue) {
        try {
            elementUtils.selectOptionInDropdown(wellDropdown, wellValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStageInputField(String stageValue) {
        try {
            elementUtils.selectOptionInDropdown(stageInputField, stageValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOPSActivityAsScheduleTime() {
        try {
            elementUtils.clickElement(opsActivityScheduleTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectPumpTimeFromScheduleTime() {
        try {
            elementUtils.clickElement(pumpTimeScheduleTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSaveActivityLogEntryButton() {
        try {
            elementUtils.clickElement(saveActivityLogEntryButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isNewActivityLogEntrySaved() {
        try {
            return elementUtils.isElementDisplayed(saveActivityLogEntryButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterInvalidDate(String invalidDate) {
        try {
            elementUtils.clearAndSendKeys(calendarField, invalidDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterInvalidEndTime(String invalidEndTime) {
        try {
            elementUtils.clearAndSendKeys(endTimeInputField, invalidEndTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCurrentStageSet() {
        try {
            return elementUtils.isElementDisplayed(currentStage);
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

    public void clickElementSetAsCurrentStageLink() {
        try {
            elementUtils.clickElement(setAsCurrentStageLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCurrentWellSet() {
        try {
            return elementUtils.isElementDisplayed(currentWell);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementTimeOnNewDayCheckbox() {
        try {
            elementUtils.clickElement(timeOnNewDayCheckbox);
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

    public boolean isActivityLogDetailsDisplayed() {
        try {
            return elementUtils.isElementDisplayed(activityLogDetails);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
