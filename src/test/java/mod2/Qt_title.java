package mod2;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Resources.base1;

public class Qt_title extends base1 
	{
		@Test
		public void Qttitle() throws IOException { 
		driver=initializeDriver();
	    driver.get(prop.getProperty("url"));
	    AssertJUnit.assertEquals(driver.getTitle(),"QTRecognition");
	    System.out.println("tested");
	    driver.close();
	}
	}

