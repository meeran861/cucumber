package com.flipkartstepdefinition;
import java.util.List;
import org.openqa.selenium.Keys;
import com.flipkart.BaseClass.BaseClass;
import com.flipkart.ObjectRepository.FlipkartPageObjectModel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MobileSearchSteps extends BaseClass{
	public static FlipkartPageObjectModel page = new FlipkartPageObjectModel();
	public static BaseClass base = new BaseClass();
	@Given("user launches flipkart application {string}")
	public void user_launches_flipkart_application(String url) {
	    base.appLaunch(url);
	}
@When("user searching the mobile")
public void user_searching_the_mobile(DataTable dataTable) {
	List<String> datas = dataTable.asList();
	base.button(page.getUser_searc());
	base.inputKeys(page.getUser_searc(), datas.get(0), Keys.ENTER);
	base.button(page.getUser_Choos());
	base.childWindow();
}
@When("user click on add to cart")
public void user_click_on_add_to_cart() throws InterruptedException {
	Thread.sleep(3000);
	base.button(page.getUser_addcart());
	Thread.sleep(3000);
	base.button(page.getUser_item());
	}
@Then("user should go to home page")
public void user_should_go_to_home_page() {
	base.button(page.getUser_title());   
}
@Then("navigate into cart and check order updated")
public void navigate_into_cart_and_check_order_updated() throws InterruptedException {
	base.button(page.getUser_cart());
	Thread.sleep(3000);
    base.moveTo(page.getUser_validate());
}}





//WebElement user_searc = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
//WebElement user_Choos = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[last()]"));
//WebElement user_addcart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
//WebElement user_item = driver.findElement(By.xpath("//span[text()='Add Item']"));
//WebElement user_title = driver.findElement(By.xpath("//img[@title='Flipkart']"));
//WebElement user_cart = driver.findElement(By.xpath("//span[@role='button']"));
//WebElement user_validate = driver.findElement(By.xpath("//a[text()='Cart']"));
