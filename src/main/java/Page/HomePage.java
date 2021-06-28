package Page;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utility.SeleniumHelper;
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver x) {
		driver =x;
	
	}
	public manePage ClickmaneMenu() throws IOException {
		//click by index
		SeleniumHelper.Click(driver.findElements(dataRepo.ObjectRepo.allMenues), 1);
		// click by text
		//SeleniumHelper.Click(driver.findElements(By.xpath("xpath")), "Women");	

		return new manePage(driver);
			}
	
	
	
public WomenPage ClickwomenMenu() throws IOException {
//click by index
SeleniumHelper.Click(driver.findElements(dataRepo.ObjectRepo.allMenues), 0);
// click by text
//SeleniumHelper.Click(driver.findElements(By.xpath("xpath")), "Women");	

return new WomenPage(driver);
	}
	
}
