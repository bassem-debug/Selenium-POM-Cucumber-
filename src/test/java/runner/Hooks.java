package runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.cucumber.listener.Reporter;

import Base.functionalTestParent;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends functionalTestParent {
	 
	 
	 @Before
	 public void beforeScenario(Scenario scenario) {
	     Reporter.assignAuthor("FreedomOfdev Y.Bassem");
	 }
	 
	 @After(order = 1)
	 public void afterScenario(Scenario scenario) {
		 if (scenario.isFailed()) {
			 File scrFile  = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);

			 try {
			 FileUtils.copyFile(scrFile, new File("C:/venvError.png"));
			 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 }
			 }
		    }
		
	 
	 @After(order = 0)
	 public void AfterSteps() {
driver.close();	 }
	 
	}