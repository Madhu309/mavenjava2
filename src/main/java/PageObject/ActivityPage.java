package PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivityPage{

	public WebDriver driver;
	By contact3=By.xpath("//a[@data-toggle='modal']");
	By contact4=By.xpath("//input[@placeholder='* Enter Name or Email Address']");
	By kudo1=By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div");
	By kudo2=By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div");
	By kudo3=By.xpath("//*[@id=\"trophy_list\"]/div[3]/div/div");
	By kudo4=By.xpath("//*[@id=\"trophy_list\"]/div[4]/div/div");
	By kudo5=By.xpath("//*[@id=\"trophy_list\"]/div[5]/div/div");
	By kudo6=By.xpath("//*[@id=\"trophy_list\"]/div[6]/div/div");
	By kudo7=By.xpath("//*[@id=\"trophy_list\"]/div[7]/div/div");
	By kudo8=By.xpath("//*[@id=\"trophy_list\"]/div[8]/div/div");
	By contact6=By.xpath("//textarea[@class='form-control mb-2']");
	By contact7=By.xpath("//button[@class='btn btn-primary']");
	 By kudocount1=By.xpath("//body/div[1]/div[1]/div[2]/div/h5");
	 
	 
	public ActivityPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Sendkudos() {
		return driver.findElement(contact3);
	}
	public WebElement NameEmail() {
		
		return driver.findElement(contact4);
		
	}
public WebElement kudotype1() {
		
		return driver.findElement(kudo1);
		
		
	}
public WebElement kudotype2() {
	return driver.findElement(kudo2);
}
public WebElement kudotype3() {
	return driver.findElement(kudo3);
}
public WebElement kudotype4() {
	return driver.findElement(kudo4);
}
public WebElement kudotype5() {
	return driver.findElement(kudo5);
}
public WebElement kudotype6() {
	return driver.findElement(kudo6);
}
public WebElement kudotype7() {
	return driver.findElement(kudo7);
}
public WebElement kudotype8() {
	return driver.findElement(kudo8);
}

public WebElement comments() {
	
	return driver.findElement(contact6);
	
	
}
public WebElement send() {
	
	return driver.findElement(contact7);
}
public WebElement kudocount1(){
	return driver.findElement(kudocount1);

}

public void kudostype(String kudostype)
{
	WebElement ele=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
	ele.click();
}
public void takeScreenshot() throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\intern 5\\Documents\\screenshot100.png"));
}


}
	