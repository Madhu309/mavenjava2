package mod6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.base1;

public class KudosFromME extends base1 {
	
	
		public void clickkudo1() throws IOException 
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
			
			clickkudo1();
			WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Kudos from me')]"));
			ele1.click();
			//WebElement ele2=driver.findElement(By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[1]"));
			
			//Assert.assertEquals(ele2, "Madhu Niloor");
			
			

}
}
