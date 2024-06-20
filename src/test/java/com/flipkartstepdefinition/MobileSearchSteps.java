package com.flipkartstepdefinition;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.flipkart.BaseClass.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MobileSearchSteps extends BaseClass{
	public static BaseClass base = new BaseClass();
	@Given("user launches flipkart application {string}")
	public void user_launches_flipkart_application(String url) {
	    base.appLaunch(url);
	}
@When("user searching the mobile")
public void user_searching_the_mobile(DataTable dataTable) {
	List<String> datas = dataTable.asList();
	WebElement user_search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	base.button(user_search);
	base.inputKeys(user_search, datas.get(0));
	user_search.sendKeys(Keys.ENTER);
	WebElement user_Choose = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[last()]"));
	base.button(user_Choose);
	base.childWindow();
}
@When("user click on add to cart")
public void user_click_on_add_to_cart() throws InterruptedException {
	Thread.sleep(3000);
	WebElement user_addcart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	base.button(user_addcart);
	Thread.sleep(3000);
	WebElement user_item = driver.findElement(By.xpath("//span[text()='Add Item']"));
	base.button(user_item);
	}
@Then("user should go to home page")
public void user_should_go_to_home_page() {
	WebElement user_title = driver.findElement(By.xpath("//img[@title='Flipkart']"));
	base.button(user_title);
    
}

@Then("navigate into cart and check order updated")
public void navigate_into_cart_and_check_order_updated() throws InterruptedException {
	WebElement user_cart = driver.findElement(By.xpath("//span[@role='button']"));
	base.button(user_cart);
	Thread.sleep(3000);
	WebElement user_validate = driver.findElement(By.xpath("//a[text()='Cart']"));
    base.moveTo(user_validate);
}


}
