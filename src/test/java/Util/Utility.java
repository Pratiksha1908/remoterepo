package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utility {
	public  Properties p;
	

	public String properties(String key) throws Exception {
		String path = "E:\\Eclipse\\Ebay_project\\Properties\\EbayData.properties";
		FileInputStream file = new FileInputStream(path);
		p = new Properties();
		p.load(file);
		return p.getProperty(key);
		
	}
}
