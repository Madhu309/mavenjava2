package mod1;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
	import Resources.base1;

	public class Verification_and_login extends base1 {
			@Test(dataProvider="getData")
			public void basepagenavigation(String username,String password) throws IOException{
				driver=initializeDriver();
				driver.get(prop.getProperty("url"));
				log1.info("successfully opened the app");
				
				LandingPage l=new LandingPage(driver); 
				
			
				l.Username().sendKeys(username);
				l.password().sendKeys(password);
				l.login().click();
			    log1.info("successfully entered username and password");
			}
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[5][2];
			data[0][0]="test1";
			data[0][1]="test2";
			 
			data[1][0]="madhu.niloor@qualitestgroup.com";
			data[1][1]="P@ssw0rd";
			
			data[2][0]="madhu.niloor@qualitestgroup.com";
			data[2][1]="";
			
			data[3][0]="";
			data[3][1]="p@ssw0rd";
			
			data[4][0]="MADHU.NILOOR@QUALITESTGROUP.COM";
			data[4][1]="xyz";
			
			
			return data;
		}
		}
	
	
