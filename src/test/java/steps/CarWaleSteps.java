package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.NewCarsPage;
import page.objects.ToyotaCarsPage;
import utils.SeleniumDriver;

public class CarWaleSteps {

	HomePage home= new HomePage();
	NewCarsPage car= new NewCarsPage();
	ToyotaCarsPage toyota= new ToyotaCarsPage();
	
	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
		
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	   
	}
	
	@When("user mouseover to new cars")
	public void user_mouseover_to_new_cars() {
	  
		home.mouseOverNewCars();
	}
	
	@Then("clicks on Findnewcars")
	public void clicks_on_findnewcars() {
	   
		home.clickNewCars();
		
	    
	}
	@And("user clicks on Toyota car")
	public void user_clicks_on_toyota_car() {
		car.gotoToyota();
	    
	}
	@And("user validates carTitle as Toyota cars")
	public void user_validates_car_title_as_toyota_cars() {
	   
		Assert.assertTrue(toyota.getCarTitle().equals("Toyota Cars"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

	

