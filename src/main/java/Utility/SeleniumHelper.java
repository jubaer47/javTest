

	package Utility;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.List;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class SeleniumHelper {

		public static Properties readProp(String path) throws IOException {
			FileInputStream f = new FileInputStream(new File(path));
			Properties prop = new Properties();
			prop.load(f);
			return prop;

		}

		public static void verifyUrl(WebDriver driver, String text) {
			if (driver.getCurrentUrl().contains(text)) {
				System.out.println("i am in right page");
			} else
				System.out.println("wrong page");
		}

		public static void click(WebElement element) {
			element.click();
		}

		public static void click(List<WebElement> elements, String text) {
			for (WebElement element : elements) {
				if (element.getText().equals(text)) {
					element.click();
					break;
				}
			}
		}

		public static void click(List<WebElement> elements, int index) {
			elements.get(index).click();
		}

		public static void click(WebDriver driver, List<WebElement> elements) {
			for (int i = 0; i < elements.size(); i++) {
				elements.get(i).click();
				driver.navigate().back();
			}
		}

		public static void verifyDiscountPrice(WebElement previousEle,WebElement discountEle,float  f) {
			String prePriceText=previousEle.getText();//"$80.00"
			String disPricetext=discountEle.getText();
			//prePriceText.replace("$", "");
			disPricetext.replace("$", "");//"60.00"
			int prePrice=Integer.parseInt(prePriceText.replace("$", ""));
			int disPrice=Integer.parseInt(disPricetext.replace("$", ""));
			if(prePrice*f==disPrice) {
				System.out.println("true");
			}
		}
		public static void clickAgainstCondition(WebDriver driver, List<WebElement> elements) {
			for (int i = 0; i < elements.size(); i++) {
				if (!elements.get(i).getText().equals("SHOP NOW")) {
					elements.get(i).click();
					driver.navigate().back();
				} 
			}

		}

		public static WebElement perfomAnyaction(WebElement element) {
			
			return element;
		}
		public void click() {
			driver.get.click;
		}
	}
	// if  void its not to be retun 
	// if have action not fix retun 
	//if action fix retuntype
	// valu fix no peremiter
	//valu 
	//

