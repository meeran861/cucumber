package com.flipkart.BaseClass;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IBaseClass {
	void browserLaunch ();
	void appLaunch(String url);
	void inputKeys (WebElement ele, String value);
	void button (WebElement ele);
	boolean displayed (WebElement ele);
	boolean selected (WebElement ele);
	boolean enabled (WebElement ele);
	void moveForward ();
	void moveBackward (); 
	String returnText (WebElement ele);
	String returnAttribute (WebElement ele, String attribute);
	String returnCssValue (WebElement ele, String cssName);
	void valueSelect (WebElement ele, String value);
	void indexSelect (WebElement ele, int i);
	List<WebElement> returnOptions(WebElement ele);
	void parentWindow();
	void childWindow();
	void inputkeys(Alert a, String value);
	void screenshot(String imageName);
	void browserClose ();
	String pageUrl();
	String pageTitle();
	void dragDrop(WebElement src, WebElement tar );
	void moveTo(WebElement ele);
	void actionClick(WebElement ele, String value);
	void enterFrame(String value, int i, String frame);
	void exitFrame(String value);
	WebDriverWait waits();
	void inputKeys(WebElement ele, String value, Keys enter);
	
}
