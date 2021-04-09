package mod1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.base1;

public class QT_color extends base1 {
@Test
public void  QT_color() throws IOException {
	

driver=initializeDriver();
driver.get(prop.getProperty("url"));
Set<String> colors=new HashSet<String>();
colors.add("#fdcc16");
colors.add("#2a2559");
colors.add("#939598");
LandingPage ap=new LandingPage(driver);
String gold=Color.fromString(ap.titlecolr().getCssValue("background-color")).asHex();
String grey=Color.fromString(ap.bodycolor().getCssValue("background-color")).asHex();
String navy=Color.fromString(ap.buttoncolor().getCssValue("background-color")).asHex();
System.out.println(gold);
if(colors.contains(gold))
{
	System.out.println("contains goldcolor");
}
else {
	System.out.println("takescreenshot");
	
}
if(colors.contains(grey))
		{
	System.out.println("contains grey color");
	
}
else {
	System.out.println("takesscreenshot");
	
}
if(colors.contains(navy))
{
	System.out.println("containsnavy");
	
}
else {
	System.out.println("takescreenshot");
}
}}
