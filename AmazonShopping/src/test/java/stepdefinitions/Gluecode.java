package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import commonMethods.WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gluecode extends WebConnector{
	
	@Given("^I am on Amazons home page\\.$")
	public void i_am_on_Amazons_home_page() throws Exception {
		
		driver.get(base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	}

	@When("^I  enter the item name on the Search box$")
	public void i_enter_the_item_name_on_the_Search_box() throws Exception {
		
		driver.findElement(By.xpath(prop.getProperty("Searchbox"))).sendKeys(prop.getProperty("Itemname"));
		   
	}

	@When("^click on Search$")
	public void click_on_Search() throws Exception {
		
		driver.findElement(By.xpath(prop.getProperty("Searchicon"))).click();
	   
	}


	@Then("^I should be able to select the item from the list of items displayed$")
	public void i_should_be_able_to_select_the_item_from_the_list_of_items_displayed() throws Exception {
		
		Title=driver.findElement(By.xpath(prop.getProperty("Itemselect"))).getText();
		driver.findElement(By.xpath(prop.getProperty("Itemselect"))).click();
		
	}

	@Then("^add the item to the shopping basket$")
	public void add_the_item_to_the_shopping_basket() throws Exception {
		
		// Adding to the basket
		driver.findElement(By.xpath(prop.getProperty("Addtocart"))).click();
		
		// Checking if the item is added to the basket
	  	driver.findElement(By.xpath(prop.getProperty("Basket"))).click();
		Actual=driver.findElement(By.xpath(prop.getProperty("IteminBasket"))).getText();
				
	}
	
	@Then("^check if the item is added the basket\\.$")
	public void check_if_the_item_is_added_the_basket() throws Exception {
		
		// Title contains the name of the item selected and Actual contains the name of the item in the basket
		Assert.assertEquals(Title,Actual);
		
	}

}
