package mod3;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import Resources.base1;


public class Sendkudos extends base1{

	@Test(dataProvider="getValidData11")
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
		ArrayList<String> ku=new ArrayList<String>();
		ku.add("Exceptional Work");
		ku.add("Excellent Team Work");
		ku.add("Innovative Thinker");
		ku.add("Good Client Relations");
		ku.add("Quality Hero");
        ku.add("Quick Learner");
        ku.add("Hard Worker");
        ku.add("Team player");
        Iterator<String> it=ku.iterator();
        while(it.hasNext())
        {
        	a.kudostype(it.next().toString());
        	Thread.sleep(1000);
        }
        a.takeScreenshot();
        Thread.sleep(1000);
        
		a.comments().sendKeys("AWESOME");
		a.send().click();
		log1.info("successfully kudos sent");
		p.driver.close();
	
	}
	@DataProvider
	public Object[][] getValidData11(){
		Object[][] data1=new Object[1][2];
		data1[0][0]="madhu.niloor@qualitestgroup.com";
		data1[0][1]="p@ssw0rd";
		return data1;
		
	}

}