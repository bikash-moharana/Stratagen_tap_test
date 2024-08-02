
package com.stratagen_backend.pages;

import com.stratagen_backend.utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChemicalStandbyPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public ChemicalStandbyPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "jobsSidebar")
    private WebElement jobsSidebar;

    @FindBy(id = "boardOption")
    private WebElement boardOption;

    @FindBy(id = "showJobButton")
    private WebElement showJobButton;

    @FindBy(id = "chemicalNavigation")
    private WebElement chemicalNavigation;

    @FindBy(id = "viewDetailsLink")
    private WebElement viewDetailsLink;

    @FindBy(id = "deliveryTracking")
    private WebElement deliveryTracking;

    @FindBy(id = "existingChemical")
    private WebElement existingChemical;

    @FindBy(id = "threeDotToggle")
    private WebElement threeDotToggle;

    @FindBy(id = "standByOption")
    private WebElement standByOption;

    @FindBy(id = "yesMoveItOption")
    private WebElement yesMoveItOption;

    @FindBy(id = "addRecordsButtonInTotes")
    private WebElement addRecordsButtonInTotes;

    @FindBy(id = "totalSizeDropdown")
    private WebElement totalSizeDropdown;

    @FindBy(id = "addRecordsButtonInBuckets")
    private WebElement addRecordsButtonInBuckets;

    @FindBy(id = "bucketSizeDropdown")
    private WebElement bucketSizeDropdown;

    @FindBy(id = "fieldId")
    private WebElement fieldElement;

    @FindBy(id = "saveButtonId")
    private WebElement saveButtonElement;

    @FindBy(id = "chemicalOptionId")
    private WebElement chemicalOptionElement;

    @FindBy(id = "chemicalDropdownId")
    private WebElement chemicalDropdownElement;

    public void clearAndSendKeysIntoField(String text, String field) {
        try {
            WebElement element = driver.findElement(By.id(field));
            elementUtils.clearAndSendKeys(element, text);
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

    public void scrollToJobsSidebar() {
        try {
            elementUtils.javaScriptClick(jobsSidebar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dragAndDropBoardOption() {
        try {
            // Implement drag and drop logic here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementShowJobButton() {
        try {
            elementUtils.clickElement(showJobButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToChemical() {
        try {
            elementUtils.clickElement(chemicalNavigation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementViewDetailsLink() {
        try {
            elementUtils.clickElement(viewDetailsLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rightClickDeliveryTracking() {
        try {
            // Implement right-clickElement logic here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToExistingChemical() {
        try {
            elementUtils.clickElement(existingChemical);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doubleClickThreeDotToggle() {
        try {
            // Implement double-clickElement logic here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementStandByOption() {
        try {
            elementUtils.clickElement(standByOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementAndHoldYesMoveItOption() {
        try {
            // Implement clickElement and hold logic here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isChemicalDisplayedUnderDeliveryRecordList() {
        try {
            return elementUtils.isElementDisplayed(existingChemical);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isChemicalDisplayedUnderDeliveriesOnStandBy() {
        try {
            // Implement logic to check if chemical is displayed under Deliveries on Stand-By
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementAddRecordsButtonInTotes() {
        try {
            elementUtils.clickElement(addRecordsButtonInTotes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementTotalSizeDropdown() {
        try {
            elementUtils.clickElement(totalSizeDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectTotalSizeOption(String totalSizeOption) {
        try {
            elementUtils.selectOptionInDropdown(totalSizeDropdown, totalSizeOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isRecordSavedInTotes() {
        try {
            // Implement logic to check if record is saved in Totes on Standby table
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickElementAddRecordsButtonInBuckets() {
        try {
            elementUtils.clickElement(addRecordsButtonInBuckets);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementBucketSizeDropdown() {
        try {
            elementUtils.clickElement(bucketSizeDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectBucketSizeOption(String bucketSizeOption) {
        try {
            elementUtils.selectOptionInDropdown(bucketSizeDropdown, bucketSizeOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isRecordSavedInBuckets() {
        try {
            // Implement logic to check if record is saved in Buckets on Standby table
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterValueIntoField(String value) {
        try {
            elementUtils.clearAndSendKeys(fieldElement, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSaveButton() {
        try {
            elementUtils.clickElement(saveButtonElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectChemicalOption(String option) {
        try {
            elementUtils.selectOptionInDropdown(chemicalOptionElement, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementChemicalDropdown() {
        try {
            elementUtils.clickElement(chemicalDropdownElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
