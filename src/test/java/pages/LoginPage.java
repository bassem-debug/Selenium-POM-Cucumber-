package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Base.BaseModel;

public class LoginPage extends BaseModel {

   
	@FindBy(name="uid")
    @CacheLookup

    WebElement user99GuruName;

    @FindBy(name="password")

    WebElement password99Guru;    

    @FindBy(className="barone")

    WebElement titleText;

    @FindBy(name="btnLogin")

    WebElement login;
    

    public LoginPage(WebDriver driver){

    	super(driver ) ;
    }

    //Set user name in textbox

    public void setUserName(String strUserName){

      user99GuruName.sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

  password99Guru.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

         login.click();

    }

    //Get the title of Login Page

    public String getLoginTitle(){

     return    titleText.getText();

    }

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();        
    }

}