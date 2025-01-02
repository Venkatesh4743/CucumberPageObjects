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
	@And("user clicks on {string} car")
	public void user_clicks_on_car(String carBrand) {
		
	if(carBrand.equals("Toyota")) {
		car.gotoToyota();
	    
}else if(carBrand.equals("Kia")) {
		car.gotoKia();
	
}else if(carBrand.equals("Honda")) {
		car.gotoHonda();
   
}else if(carBrand.equals("BMW"))
		car.gotoBMW();
}
   
	@And("user validates carTitle as {string}")
	public void user_validates_car_title(String carTitle) {
	   
		System.out.println("Car Title is : "+toyota.getCarTitle());
		Assert.assertTrue(toyota.getCarTitle().equals(carTitle));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

	

