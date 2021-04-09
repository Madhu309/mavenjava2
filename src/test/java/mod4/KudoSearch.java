package mod4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.base1;

public class KudoSearch extends base1
{
	public void clickkudo() throws IOException 
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
	
		public void kudossearch() throws IOException, InterruptedException, AWTException
		{
		
		clickkudo();
		WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span"));
		ele.click();
		Thread.sleep(3000);
		WebElement autoOptions=driver.findElement(By.xpath("//input[@list='globalUsers']"));
		autoOptions.sendKeys("seema Ch");
		Thread.sleep(5000);
		
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyPress(KeyEvent.VK_TAB);
		R.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement d=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		d.click();
		
	}
	
		
	}

