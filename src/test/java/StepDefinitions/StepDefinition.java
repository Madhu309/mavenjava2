package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import PageObject.LandingPage;
import Resources.base1;

@RunWith(Cucumber.class)
public class StepDefinition extends base1{

    @Given("^Initialize the browser with the chrome$")
    public void initialize_the_browser_with_the_chrome() throws Throwable {
    	driver=initializeDriver();   
    }
    
    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }
    
    @When("^User enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
    	LandingPage l=new LandingPage(driver); 
		
		
		l.Username().sendKeys(username);
		l.password().sendKeys(password);
 
    }

    @And("^click on login button$")
    public void click_on_login_button() throws Throwable {
    	LandingPage l=new LandingPage(driver);
		l.login().click(); 
	
		//String abc = driver.getCurrentUrl();
		//if (abc == "https://qtrecognition.testqtwiz.com/testuserlogin.php")
		//{
		//driver.switchTo().alert().accept();
        //driver.switchTo().defaultContent();
        //}	
    }
    @Then("^close the session$")
    public void close_the_session() throws Throwable {
    	driver.quit();
    }
}