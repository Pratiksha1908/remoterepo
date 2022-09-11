package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import PomPkg.AllCategories;
import PomPkg.Buy;
import PomPkg.LogoScreenshot;
import PomPkg.SearchProduct;
import Util.Utility;

public class BaseClass {

	public WebDriver driver;
	public SearchProduct search;
	public AllCategories category;
	public LogoScreenshot logo;
	public Buy buy;
	public Utility util;

	public void LaunchBrowser(String browser) throws Exception {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", util.properties("ChromePath"));
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", util.properties("FirefoxPath"));
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(util.properties("Ebay_URL"));

	}

	@BeforeClass()
	@Parameters("crossbrowser")
	public void Open_EbayBrowser(String crossbrowser) throws Exception {
		util = new Utility();
		LaunchBrowser(crossbrowser);
		search = new SearchProduct(driver);
		category = new AllCategories(driver);
		logo = new LogoScreenshot(driver);
		buy = new Buy(driver);
		
		
	}

}
