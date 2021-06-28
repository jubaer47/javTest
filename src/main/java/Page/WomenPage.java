package Page;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumHelper;
import net.bytebuddy.asm.Advice.This;
// only for Women Page 
// it's page Object Model
public class WomenPage {
	// use it global
	Properties p;
	WebDriver driver;
	//Constructor
public WomenPage(WebDriver x) throws IOException {
		driver =x;
		//for driver
		PageFactory.initElements(driver, this);
				 					//use this property path to use all properties
		p=SeleniumHelper.redprom("/Users/jubaerhosen/eclipse-workspace/MavenReview/data.properties");

}
@FindBy(xpath = "xpath of all womenCatagory")List<WebElement>allWomenCatagory;
	public void verifyWomenPageURL() {
		SeleniumHelper.verifyUrl(driver,p.getProperty("womenUrl"));
		
	}
	
	
	public JeansePage ClickOnJens() {
		SeleniumHelper.Click(allWomenCatagory, "Jeans");
		return new JeansePage();
	}
	 
	
	
	}		
	
	
	
	
