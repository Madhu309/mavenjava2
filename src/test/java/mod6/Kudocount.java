package mod6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import PageObject.LandingPage;
import Resources.base1;
import mod3.Sendkudos;

public class Kudocount extends base1 {
	public void basepagenavigation() throws IOException 
	{
		
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
			log1.info("successfully opened the app");
			
			LandingPage l=new LandingPage(driver); 
		    l.Username().sendKeys("madhu.niloor@qualitestgroup.com");
			l.password().sendKeys("P@ssw0rd");
			l.login().click();
		    log1.info("successfully entered username and password");
	}
	public int sendkudo() throws IOException 
	{
	basepagenavigation();
	ActivityPage a=new ActivityPage(driver);
	int val=Integer.parseInt(a.kudocount1().getText().split(" ")[0]);
	return val;
	
	}
	public void sendkudo1()
	{
		ActivityPage a=new ActivityPage(driver);
		a.Sendkudos().click();
		a.NameEmail().sendKeys("Madhu Niloor  (madhu.niloor@qualitestgroup.com)");
		a.kudotype1().click();
		a.kudostype("Quality Hero");
		a.comments().sendKeys("Good");
		a.send().click();
	}
	public int cnt() 
	{
		ActivityPage a=new ActivityPage(driver);
		int vals=Integer.parseInt(a.kudocount1().getText().split(" ")[0]);
		return vals;
	}
	@Test
	public void testcase() throws InterruptedException, IOException
	{
		int after=sendkudo();
		sendkudo1();
		Thread.sleep(1000);
		int cmt=cnt();
		if(after>cmt)
		{
			System.out.println("hii");
			
		}
		else
		{
			System.out.println("count is increased");
		}
	}
}