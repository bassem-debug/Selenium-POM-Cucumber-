package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Base.BaseModel;

public class HomePage extends BaseModel {



    @FindBy(xpath="//table//tr[@class='heading3']")
    @CacheLookup
    WebElement homePageUserName;    

    public HomePage(WebDriver driver){

        super(driver) ;

    }

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return    homePageUserName.getText();

        }

}