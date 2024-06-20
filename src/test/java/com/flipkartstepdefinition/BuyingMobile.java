package com.flipkartstepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.flipkart.BaseClass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyingMobile extends BaseClass{
	public static BaseClass base = new BaseClass();
	@Given("user launch flipkart application {string}")
	public void user_launch_flipkart_application(String url) throws IOException {
		File f = new File("C:\\Users\\srika\\eclipse-workspace\\cucumber\\src\\test\\resources\\utilities.property");
		FileInputStream f1 = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(f1);
		String file = prop.getProperty("file");
		String url1 = prop.getProperty("url");
		System.out.println(file + " and "+url1);
		
		FileOutputStream fo = new FileOutputStream(f);
		prop.setProperty("urlQa", "https://www.flipkart.com/");
		prop.save(fo, "Updated");
		
	    base.appLaunch(url);
	}

	@When("user searching the mobiles")
	public void user_searching_the_mobiles() {
		WebElement user_search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		           base.inputKeys(user_search, "Iphone 15 pro");
	               user_search.sendKeys(Keys.ENTER);
	}

	@When("user click choosing mobile")
	public void user_click_choosing_mobile() {
		WebElement user_choose = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro (White Titanium, 256 GB)']"));
		base.button(user_choose);
		base.childWindow();
	    
	}

	@Then("user click buy now button")
	public void user_click_buy_now_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement user_buy = driver.findElement(By.xpath("//button[text()='Buy Now']"));
	        base.button(user_buy);
	}

}
