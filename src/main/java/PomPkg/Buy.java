package PomPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buy {
@FindBy(xpath="//a[text()='Buy']")
private WebElement Buy;

@FindBy(xpath="//button[@id='gh-shop-a']")
private WebElement shopby_category;

@FindBy(xpath="//a[@href='#books-movies-and-music']")
private WebElement Books_movies_music;

 public Buy(WebDriver driver)
 { 
	 
	 PageFactory.initElements(driver, this);
 }

 public void buy_Module()
 { 
	 Buy.click(); 
 }
 
 public void shop_category()
 { 
	 shopby_category.click(); 
 }
 
 public void BMM()
 { 
	 Books_movies_music.click(); 
 }
}
