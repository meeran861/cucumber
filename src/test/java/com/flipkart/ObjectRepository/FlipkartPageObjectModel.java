package com.flipkart.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.BaseClass.BaseClass;

public class FlipkartPageObjectModel extends BaseClass{
	public FlipkartPageObjectModel() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUser_search() {
		return user_search;
	}

	public WebElement getUser_choose() {
		return user_choose;
	}

	public WebElement getUser_buy() {
		return user_buy;
	}

	public WebElement getUser_searc() {
		return user_searc;
	}

	public WebElement getUser_Choos() {
		return user_Choos;
	}

	public WebElement getUser_addcart() {
		return user_addcart;
	}

	public WebElement getUser_item() {
		return user_item;
	}

	public WebElement getUser_title() {
		return user_title;
	}

	public WebElement getUser_cart() {
		return user_cart;
	}

	public WebElement getUser_validate() {
		return user_validate;
	}
	@FindBy (xpath = "//input[@placeholder='Search for Products, Brands and More']")
	private WebElement user_search;
	
	@FindBy (xpath = "//div[text()='Apple iPhone 15 Pro (Black Titanium, 128 GB)']")
	private WebElement user_choose;
	
	@FindBy (xpath = "//button[text()='Buy Now']")
	private WebElement user_buy;
	
	@FindBy (xpath = "//input[@placeholder='Search for Products, Brands and More']")
	private WebElement user_searc;
	
	@FindBy (xpath = "(//div[@class='KzDlHZ'])[last()]")
	private WebElement user_Choos;
	
	@FindBy (xpath = "//button[text()='Add to cart']")
	private WebElement user_addcart;
	
	@FindBy (xpath = "//span[text()='Add Item']")
	private WebElement user_item;
	
	@FindBy (xpath = "//img[@title='Flipkart']")
	private WebElement user_title;
	
	@FindBy (xpath = "//span[@role='button']")
	private WebElement user_cart;
	
	@FindBy (xpath = "//a[text()='Cart']")
	private WebElement user_validate;
	
}
