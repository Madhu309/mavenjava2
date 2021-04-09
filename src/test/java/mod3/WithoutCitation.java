package mod3;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import Resources.base1;

public class WithoutCitation extends base1 {


		@Test(dataProvider="Data")
		public void sendkudos1(String username,String password) throws IOException, Exception
		{
			precond p=new precond();
			p.preCond(username, password);
			ActivityPage a=new ActivityPage(p.driver);
			a.Sendkudos().click();
			Thread.sleep(5000);
			a.NameEmail().sendKeys("Aishwarya Kurkoti");
			Robot R=new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			a.kudostype("Quality Hero");
			//a.comments().sendKeys("Good");
			a.send().click();
			Thread.sleep(1000);
			log1.info("kudos cannot be sent");

		}
		@DataProvider
		public Object[][] Data(){
			Object[][] data1=new Object[1][2];
			data1[0][0]="madhu.niloor@qualitestgroup.com";
			data1[0][1]="p@ssw0rd";
			return data1;
		}
		}


