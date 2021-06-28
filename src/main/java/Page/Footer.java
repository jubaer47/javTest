package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Footer {
	WebDriver driver;
	public Footer (WebDriver driver ) {
		this.driver = driver;
	PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "Vlaue") WebElement contactus;
	@FindBy(xpath = "vlaue") List<WebElement>allLink;
	

	
public void clickContactus() {
	contactus.click();
	
}
}
