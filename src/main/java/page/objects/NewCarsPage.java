package page.objects;

import pages.base.BasePage;

public class NewCarsPage extends BasePage {
	
	
	public void gotoKia() {
		
		click("kia_LINK");
	}
	
	public void gotoBMW() {
		
		click("bmw_LINK");

	}
	
	public void gotoToyota() {
		click("toyota_LINK");

		
	}

	public void gotoHonda() {
		
		click("honda_LINK");

	}
}
