
package com.stratagen_backend.pages;

import com.stratagen_backend.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateStratagenNPTPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public CreateStratagenNPTPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "jobModuleElement")
    private WebElement jobModuleElement;

    @FindBy(id = "actionOnTableButtonElement")
    private WebElement actionOnTableButtonElement;

    @FindBy(id = "jobSearchBoxElement")
    private WebElement jobSearchBoxElement;

    @FindBy(id = "setAsCurrentJobButton")
    private WebElement setAsCurrentJobButton;

    @FindBy(id = "setAsCurrentWellLink")
    private WebElement setAsCurrentWellLink;

    @FindBy(id = "setAsCurrentStageLink")
    private WebElement setAsCurrentStageLink;

    @FindBy(id = "activityLogViewDetailLink")
    private WebElement activityLogViewDetailLink;

    @FindBy(id = "setDateElement")
    private WebElement setDateElement;

    @FindBy(id = "calendarDateInputField")
    private WebElement calendarDateInputField;

    @FindBy(id = "wellField")
    private WebElement wellField;

    @FindBy(id = "stageField")
    private WebElement stageField;

    @FindBy(id = "opsActivityScheduleTime")
    private WebElement opsActivityScheduleTime;

    @FindBy(id = "stratagenNPTField")
    private WebElement stratagenNPTField;

    @FindBy(id = "saveActivityLogEntryElement")
    private WebElement saveActivityLogEntryElement;

    @FindBy(id = "activityLogPage")
    private WebElement activityLogPage;

    @FindBy(id = "dateSaveErrorMessage")
    private WebElement dateSaveErrorMessage;

    @FindBy(id = "activityLogEntrySaveErrorMessage")
    private WebElement activityLogEntrySaveErrorMessage;

    @FindBy(id = "createNewActivityLogEntryButton")
    private WebElement createNewActivityLogEntryButton;

    @FindBy(id = "endTimeField")
    private WebElement endTimeField;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    public void navigateToJobsListingPage() {
        driver.get("https://ops-preprod.fracpro.ai/");
    }

    public void clickElementJobModuleElement() {
        try {
            elementUtils.clickElement(jobModuleElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementActionOnTableButtonElement() {
        try {
            elementUtils.clickElement(actionOnTableButtonElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobNumberInSearchBox(String jobNumber) {
        try {
            elementUtils.clearAndSendKeys(jobSearchBoxElement, jobNumber);
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

    public void clickElementActivityLogViewDetailLink() {
        try {
            elementUtils.clickElement(activityLogViewDetailLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnActivityLogPage() {
        try {
            return elementUtils.isElementDisplayed(activityLogPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementSetDateElement() {
        try {
            elementUtils.clickElement(setDateElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDateFromCalendar(String date) {
        try {
            elementUtils.clearAndSendKeys(calendarDateInputField, date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWellField(String wellValue) {
        try {
            elementUtils.selectOptionInDropdown(wellField, wellValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStageField(String stageValue) {
        try {
            elementUtils.selectOptionInDropdown(stageField, stageValue);
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

    public void selectNPTInStratagenNPTField() {
        try {
            elementUtils.clickElement(stratagenNPTField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSaveActivityLogEntryElement() {
        try {
            elementUtils.clickElement(saveActivityLogEntryElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isActivityLogEntrySavedSuccessfully() {
        try {
            return elementUtils.isElementDisplayed(activityLogPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDateSavedSuccessfully() {
        try {
            return elementUtils.isElementDisplayed(activityLogPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDateSaveErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dateSaveErrorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isActivityLogEntrySaveErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(activityLogEntrySaveErrorMessage);
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
            elementUtils.clearAndSendKeys(endTimeField, endTime);
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
}
