package org.example.pageclasses;

import org.example.testbaseclass.NesWebBasedClass;
import org.example.utilclasses.CommonWaits;
import org.example.utilclasses.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


    public class HomePage extends NesWebBasedClass {
        @FindBy(name = "name")
        WebElement yourNameTextBox;

        @FindBy(name="email")
        WebElement emailAddressTextBox;

        @FindBy(name="phone")
        WebElement phoneNumberTextBox;

        @FindBy(name="course_interest")
        WebElement courseTextBox;

        @FindBy(className = "w-full")
        WebElement getStartedButton;

        @FindBy(className = "go3958317564")
        WebElement successMsg;

        @FindBy(className = "px-8")
        WebElement exploreProgram;

        @FindBy(className = "text-transparent")
        WebElement getSuccessMsg2;

        @FindBy(className = "bg-white/10")
        WebElement contactUsButton;

        @FindBy(className = "text-5xl")
        WebElement getSuccessMsg3;

        @FindBy(className = "px-6")
        WebElement signInButton;

        @FindBy(className = "text-gray-600")
        WebElement signInSuccess;

        public HomePage(){
            PageFactory.initElements(driver,this);
        }

        public void setLogin(String name, String email_id, String phone_number){
            WebElementUtil.sendKeyToElement(yourNameTextBox,name);
            WebElementUtil.sendKeyToElement(emailAddressTextBox,email_id);
            WebElementUtil.sendKeyToElement(phoneNumberTextBox,phone_number);

        }
        public void setCourseTextBox(){
            Select select = new Select( courseTextBox);
            select.selectByValue("Data Analytics");

        }
        public void clickButton(){
            CommonWaits.waitUntilElementToBeClickable(getStartedButton);
        }

        public boolean setSuccessMsg(){
            WebElementUtil.getElementDisplayed(successMsg);
            return true;
        }

        public void setExploreProgram(){
            CommonWaits.waitUntilElementToBeClickable(exploreProgram);
        }

        public boolean setGetSuccessMsg2(){
            WebElementUtil.getElementDisplayed(getSuccessMsg2);
            return true;
        }

        public void setContactUsButton(){
            CommonWaits.waitUntilElementToBeClickable(contactUsButton);
        }

        public boolean setGetSuccessMsg3(){
            WebElementUtil.getElementDisplayed(getSuccessMsg3);
            return true;
        }

        public void setSignInButton(){
            CommonWaits.waitUntilElementToBeClickable(signInButton);
        }

        public boolean setSignInSuccess(){
            WebElementUtil.getElementDisplayed(signInSuccess);
            return true;
        }

    }

