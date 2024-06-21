package com.flipkartstepdefinition;
import org.openqa.selenium.Keys;
import com.flipkart.BaseClass.BaseClass;
import com.flipkart.ObjectRepository.FlipkartPageObjectModel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingMobile extends BaseClass{
	public static BaseClass base = new BaseClass();
	public static FlipkartPageObjectModel page = new FlipkartPageObjectModel();
	@Given("user launch flipkart application {string}")
	public void user_launch_flipkart_application(String url) {
	    base.appLaunch(url);
	}

	@When("user searching the mobiles")
	public void user_searching_the_mobiles() {
    base.inputKeys(page.getUser_search(), "Iphone 15 pro" ,Keys.ENTER);
	}

	@When("user click choosing mobile")
	public void user_click_choosing_mobile() {
        base.button(page.getUser_choose());
		base.childWindow();
	    
	}

	@Then("user click buy now button")
	public void user_click_buy_now_button() throws InterruptedException {
		Thread.sleep(3000);
	 base.button(page.getUser_buy());
	}
}




//WebElement user_search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
//WebElement user_choose = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro (White Titanium, 256 GB)']"));
//WebElement user_buy = driver.findElement(By.xpath("//button[text()='Buy Now']"));