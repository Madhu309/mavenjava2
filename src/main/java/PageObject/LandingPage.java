package PageObject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import Resources.base1;

	public class LandingPage extends base1{ 

		public WebDriver driver;
		
		
		By contact=By.xpath("//input[@name='username']");
		By contact1=By.xpath("//input[@name='pass']");
		By contact2=By.xpath("//button[@type='submit']");
		By titlecolor=By.xpath("/html/body/div[1]");
		By bodycolor=By.xpath("/html/body/div[2]");
		By buttoncolor=By.xpath("/html/body/div[2]/form/button");
		
		public LandingPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebElement Username() {
			return driver.findElement(contact);
		}
		
		public WebElement password() {
			return driver.findElement(contact1);
			}
		public WebElement login() {
			return driver.findElement(contact2);
		}
		public WebElement titlecolr() {
			return driver.findElement(titlecolor);
		}
		public WebElement bodycolor() {
			return driver.findElement(bodycolor);
		}
		public WebElement buttoncolor() {
			return driver.findElement(buttoncolor);
		}

	}

