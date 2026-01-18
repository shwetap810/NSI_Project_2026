package org.example.pageclasses;

import org.example.testbaseclass.NesWebBasedClass;
import org.example.utilclasses.CommonWaits;
import org.example.utilclasses.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends NesWebBasedClass {
    @FindBy(className = "text-sm")
    WebElement signUpText;

    @FindBy(name="email")
    WebElement emailTextBox;

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    public void setSignUpText(){
        CommonWaits.waitUntilElementToBeClickable(signUpText);
    }
    public void setEmailTextBox(String email_id){
        WebElementUtil.sendKeyToElement(emailTextBox,email_id);


    }

}
