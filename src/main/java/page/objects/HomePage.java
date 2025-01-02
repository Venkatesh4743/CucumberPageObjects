package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import pages.base.BasePage;

public class HomePage extends BasePage {
	
	public void mouseOverNewCars() {
		
		mouseOver("newCarMenu_XPATH");
	}

	public void clickNewCars()  {
		
		click("findNewCars_XPATH");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void searchCars() {
		
	}
	
	public void gotoMaps() {
		
	}
	
}
