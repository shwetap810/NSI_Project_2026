package testclasses;
import org.example.pageclasses.HomePage;
import org.example.testbaseclass.NesWebBasedClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends NesWebBasedClass {

    HomePage homePage;
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();    }

    public HomePageTest(){
        super();
    }


    @Test(description="verify login with valid credentials")
    public void verifyLoginWithValidCredentials(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setLogin(propertie.getProperty("name"), propertie.getProperty("email_id"), propertie.getProperty("phone_number") );
        homePage.setCourseTextBox();
        homePage.clickButton();
        softAssert.assertTrue(homePage.setSuccessMsg(),"Thank you! We'll contact you soon.");
        softAssert.assertAll();
    }

    @Test(description = "verify Explore program button")
    public void verifyExploreProgramButton(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setExploreProgram();
        softAssert.assertTrue(homePage.setGetSuccessMsg2(),"Master In-Demand Skills.");
        softAssert.assertAll();
    }

   @Test(description = "verify contact us button")
   public void verifyContactUsButton(){
        SoftAssert softAssert = new SoftAssert();
        homePage.setContactUsButton();
        softAssert.assertTrue(homePage.setGetSuccessMsg3(), "Get In Touch");
        softAssert.assertAll();

   }

   @Test(description="Verify sign in button")
   public void verifySignInButton(){
        SoftAssert softAssert= new SoftAssert();
        homePage.setSignInButton();
        softAssert.assertTrue(homePage.setSignInSuccess(),"Welcome back! Sign in to continue");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}




