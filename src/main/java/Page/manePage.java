package Page;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class manePage extends LoadableComponent<manePage> {
	
WebDriver driver;
public manePage(WebDriver x) {
	driver=x;
}

@Override
protected void load() {
	// TODO Auto-generated method stub
	driver.navigate().to("https://www.express.com/mens-clothing");
	Footer f = new Footer(driver);
}

@Override
protected void isLoaded() throws Error {
	// TODO Auto-generated method stub
	//Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/mens-clothing"));
	Footer f = new Footer(driver);
	
}
}
