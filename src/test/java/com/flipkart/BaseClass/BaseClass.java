package com.flipkart.BaseClass;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass {
	public static Actions ac;
	public static Select s;
	public static WebDriver driver;

	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
	    EdgeOptions options = new EdgeOptions();
	    options.addArguments("disable-notifications");
	    options.addArguments("disable-popups");
	    options.addArguments("start-maximized");
	    driver = new EdgeDriver(options);		
	}

	public void inputKeys(WebElement ele, String value) {
        ele.sendKeys(value);		
	}

	public void button(WebElement ele) {
           ele.click();		
	}

	public boolean displayed(WebElement ele) {
		boolean display=ele.isDisplayed();
		return display;
	}

	public boolean selected(WebElement ele) {
		boolean selected=ele.isSelected();
		return selected;
	}

	public boolean enabled(WebElement ele) {
		boolean enabled=ele.isEnabled();
		return enabled;
	}

	public void moveForward() {
       driver.navigate().forward();		
	}

	public void moveBackward() {
	  driver.navigate().back();		

	}

	public String returnText(WebElement ele) {
		String text=ele.getText();
		return text;
	}

	public String returnAttribute(WebElement ele, String attribute) {
		String attribute2=ele.getAttribute(attribute);
		return attribute2;
	}

	public String returnCssValue(WebElement ele, String cssName) {
		String cssvalue=ele.getCssValue(cssName);
		return cssvalue;
	}

	public void valueSelect(WebElement ele, String value) {
           s =new Select(ele);
          s.selectByValue(value);      
	}

	public void indexSelect(WebElement ele, int i) {
         s =new Select(ele);
        s.deselectByIndex(i);
	}

	public List<WebElement> returnOptions(WebElement ele) {
		 s =new Select(ele);
        List<WebElement> options=s.getOptions();
        return options;
	}

	public void parentWindow() {
		String parentWindow=driver.getWindowHandle();
		driver.switchTo().window(parentWindow);	
	}

	public void childWindow() {
		String parentWindows=driver.getWindowHandle();
		Set<String> childwindow=driver.getWindowHandles();
		for(String x:childwindow) {
			if(!parentWindows.equals(x)) {
				driver.switchTo().window(x);
			}
		}	
	}

	public void inputkeys(Alert a, String value) {
		Alert al=driver.switchTo().alert();
	 	if(value.equals("ok")) {
	 		al.accept();
	 	}else {
	 		al.dismiss();
	 	}}

	public void screenshot(String imageName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg =new File("C:\\Users\\srika\\eclipse-workspace\\cucumber\\target\\"+imageName+".png");
		try {
			FileUtils.copyFile(src, trg);
			} catch (IOException e) {
			e.printStackTrace();
			}
	}

	public void browserClose() {
         	driver.close();	
	}

	public String pageUrl() {
		String text = driver.getCurrentUrl();
		return text;
       		
	}

	public String pageTitle() {
		String text = driver.getTitle();
		return text;
		
	}

	public void dragDrop(WebElement src, WebElement tar) {
		ac=new Actions(driver);
		ac.dragAndDrop(src, tar).perform();

		
	}

	public void moveTo(WebElement ele) {
	    ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		
	}

	public void actionClick(WebElement ele, String value) {
		 ac=new Actions(driver);
		switch(value)
		{
		case "double":
		ac.doubleClick(ele).perform();;
		case "rightclick":
		ac.contextClick(ele).perform();;
		}}

	public void enterFrame(String value, int i, String frame) {
		switch((value).toLowerCase())
		{
		case "name":
		driver.switchTo().frame(frame);
		break;
		case "i":
		driver.switchTo().frame(i);
		break;
		}
}
	public void exitFrame(String value) {
		if(value.equals("parent")) {
			driver.switchTo().parentFrame();
		}
		else if(value.equals("default")){
			driver.switchTo().defaultContent();
}}
	public WebDriverWait waits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}

	@Override
	public void appLaunch(String url) {
		driver.get(url);
		
	
	}

	public void inputKeys(WebElement ele, String value, Keys enter) {
		ele.sendKeys(value,enter);
		
	}}
