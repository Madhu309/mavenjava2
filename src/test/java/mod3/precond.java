package mod3;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.base1;

public class precond extends base1
{
	@Test
public void preCond(String username,String password) throws IOException
{
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
	log1.info("success");
	LandingPage l=new LandingPage(driver);
	l.Username().sendKeys(username);
	l.password().sendKeys(password);
	l.login().click();
	log1.info("entered username and password");
	
	
}
}
