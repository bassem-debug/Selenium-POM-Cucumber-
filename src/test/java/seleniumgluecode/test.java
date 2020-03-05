package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.functionalTestParent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import org.junit.Assert;

public class test extends  functionalTestParent {
    private LoginPage objLogin;
    private HomePage objHomePage;
 
    @Given("^user is on loginpage$")
    public void user_is_on_loginpage() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4");
    } 
    @Then("^user get page title verified$")
    public void user_get_page_title_verified() throws Throwable {
        objLogin = new LoginPage(driver);

        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        System.out.println("it worked") ;
    }
        
    
    
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
        objLogin = new LoginPage(driver);

        objLogin.loginToGuru99("mgr123", "mgr!23");
 
    }
    
    
    
    
        
    
    @Then("^Check the username in homepage$")
    public void Check_the_username_in_homepage() throws Throwable {
    	
    	objHomePage = new HomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mg123"));

        driver.quit();  
    }      
}