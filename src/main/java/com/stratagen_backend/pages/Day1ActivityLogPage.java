
package com.stratagen_backend.pages;

import com.stratagen_backend.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day1ActivityLogPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public Day1ActivityLogPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "emailInputField")
    private WebElement emailInputField;

    @FindBy(id = "passwordInputField")
    private WebElement passwordInputField;

    @FindBy(id = "dashboardPage")
    private WebElement dashboardPage;

    @FindBy(id = "jobsOption")
    private WebElement jobsOption;

    @FindBy(id = "jobsListing")
    private WebElement jobsListing;

    @FindBy(id = "tableButton")
    private WebElement tableButton;

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "setAsCurrentJobLink")
    private WebElement setAsCurrentJobLink;

    @FindBy(id = "currentWell")
    private WebElement currentWell;

    @FindBy(id = "currentStage")
    private WebElement currentStage;

    @FindBy(id = "activityLogDetails")
    private WebElement activityLogDetails;

    @FindBy(id = "setDateLink")
    private WebElement setDateLink;

    @FindBy(id = "calendarDateInputField")
    private WebElement calendarDateInputField;

    @FindBy(id = "endTimeInputField")
    private WebElement endTimeInputField;

    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;

    @FindBy(id = "stageDropdown")
    private WebElement stageDropdown;

    @FindBy(id = "opsActivityDropdown")
    private WebElement opsActivityDropdown;

    @FindBy(id = "pumpTimeDropdown")
    private WebElement pumpTimeDropdown;

    @FindBy(id = "commentInputField")
    private WebElement commentInputField;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "currentJob")
    private WebElement currentJob;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "saveActivityLogEntryButton")
    private WebElement saveActivityLogEntryButton;

    @FindBy(id = "dateField")
    private WebElement dateField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "activityLogViewDetailLink")
    private WebElement activityLogViewDetailLink;

    @FindBy(id = "setAsCurrentStageLink")
    private WebElement setAsCurrentStageLink;

    @FindBy(id = "createNewActivityLogEntryButton")
    private WebElement createNewActivityLogEntryButton;

    @FindBy(id = "setAsCurrentWellLink")
    private WebElement setAsCurrentWellLink;

    @FindBy(id = "activityLogEntry")
    private WebElement activityLogEntry;

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailInputField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordInputField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDashboardPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboardPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementJobsOption() {
        try {
            elementUtils.clickElement(jobsOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobsListingDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobsListing);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementTableButton() {
        try {
            elementUtils.clickElement(tableButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterJobNumberInSearchBox(String jobNumber) {
        try {
            elementUtils.clearAndSendKeys(searchBox, jobNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobDisplayed(String jobNumber) {
        try {
            return elementUtils.getElementText(searchBox).contains(jobNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementSetAsCurrentJobLink() {
        try {
            elementUtils.clickElement(setAsCurrentJobLink);
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

    public boolean isCurrentStageSet() {
        try {
            return elementUtils.isElementDisplayed(currentStage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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

    public void clickElementSetDateLink() {
        try {
            elementUtils.clickElement(setDateLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDate(String date) {
        try {
            elementUtils.clearAndSendKeys(calendarDateInputField, date);
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

    public void selectWellFromDropdown(String wellName) {
        try {
            elementUtils.selectOptionInDropdown(wellDropdown, wellName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStageFromDropdown(String stageName) {
        try {
            elementUtils.selectOptionInDropdown(stageDropdown, stageName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOpsActivity(String opsActivity) {
        try {
            elementUtils.selectOptionInDropdown(opsActivityDropdown, opsActivity);
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

    public void enterComment(String comment) {
        try {
            elementUtils.clearAndSendKeys(commentInputField, comment);
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

    public boolean isCurrentJobSet() {
        try {
            return elementUtils.isElementDisplayed(currentJob);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
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

    public boolean isDateSaved() {
        try {
            return elementUtils.isElementDisplayed(dateField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToLoginPage() {
        try {
            driver.get("https://ops-preprod.fracpro.ai/");
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

    public void clickElementSetAsCurrentStageLink() {
        try {
            elementUtils.clickElement(setAsCurrentStageLink);
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

    public void clickElementSetAsCurrentWellLink() {
        try {
            elementUtils.clickElement(setAsCurrentWellLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isActivityLogEntrySaved() {
        try {
            return elementUtils.isElementDisplayed(activityLogEntry);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
