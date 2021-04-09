package mod6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.base1;

public class KudosToMe extends base1{
		
		
		public void clickkudo2() throws IOException 
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
			
			clickkudo2();
			WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Kudos to me')]"));
			ele1.click();
			Thread.sleep(3000);

}
}


