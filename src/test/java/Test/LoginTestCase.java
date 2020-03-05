package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Base.functionalTestParent;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCase extends functionalTestParent {
    

    private LoginPage objLogin;

    private HomePage objHomePage;
    


  
    @Test
    public void test_Home_Page_Appear_Correct(){
    	
    	
    	//user is on loginpage	
    	
    driver.get("http://demo.guru99.com/V4/");
    objLogin = new LoginPage(driver);

    //user get page title verified

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    
    

    //user enters username and Password

    objLogin.loginToGuru99("mgr123", "mgr!23");
    
    
    

    // Check the username in home page

objHomePage = new HomePage(driver);
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mg123"));

    }}