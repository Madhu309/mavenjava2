package mod2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.base1;

public class Test_activity extends base1
{
	public void login() throws IOException 
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
	@Test
	public void NameInLeftSide() throws IOException
	{
		login();
		WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div/div[1]/div/h5"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		System.out.println("position from left side is:"+x);
		int y=loc.getY();
		System.out.println("position from left side is:"+y);

		if(x<=450&& y<=200)
		{
			System.out.println("Name is in lefthand side of the screen");
		}
		else {
			System.out.println("Name is not in lefthand side of the screen");
		}
	}
	
}