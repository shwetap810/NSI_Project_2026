package testclasses;

import org.example.pageclasses.HomePage;
import org.example.pageclasses.SignInPage;
import org.example.testbaseclass.NesWebBasedClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends NesWebBasedClass {
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        signInPage= new SignInPage();
    }
    public SignInTest(){
        super();
    }

    @Test(description = "verify signup text is clickable")
    public void verifySignUpText(){
        homePage.setSignInButton();
        signInPage.setSignUpText();
    }

//    @AfterMethod
//    public void afterMethod(){
//        driver.close();
//    }

}
