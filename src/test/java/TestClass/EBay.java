package TestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import BasePackage.BaseClass;
import PomPkg.AllCategories;
import PomPkg.Buy;
import PomPkg.LogoScreenshot;
import PomPkg.SearchProduct;

public class EBay extends BaseClass {

	
	
	@Test()
	public void Search()
	{ 
		search.EnterText_SearchBox("tshirt");
	}
	
	@Test 
	public void Allcategory()
	{
		
		category.PrintAllCategory();
	} 
	
	@Test
	public void screenshot() throws Exception
	{ 
		logo.logo("ebay");
		
	}
	
	@Test (priority=-1)
	public void Buy_Module()
	{ 
		buy.buy_Module();
		buy.shop_category();
		buy.BMM();
	}
	@AfterClass()
	public void CloseBrowser()
	{ 
		driver.close();
	}
}
