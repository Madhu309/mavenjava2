package Integration;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.Recent_cont;
import Resources.base1;

public class Rec_contacts extends base1 {
	@Test(dataProvider="logindata")
	public void sk(String username,String password) throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.Username().sendKeys(username);
		l.password().sendKeys(password);
		l.login().click();
		Thread.sleep(1000);
		Recent_cont rc=new Recent_cont(l.driver);
		rc.RCKudosSearch().click();
		rc.kudostype("Exceptional Work");
		Thread.sleep(1000);
		rc.Comments().sendKeys("Good Work");
		rc.SendButton().click();
	}
		@DataProvider
		 public Object[][] logindata()
		{
			Object[][] data=new Object[1][2];
		
			 
			data[0][0]="madhu.niloor@qualitestgroup.com";
			data[0][1]="P@ssw0rd";
			return data;
		}		


}
