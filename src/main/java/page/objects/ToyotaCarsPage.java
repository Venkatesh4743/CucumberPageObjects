package page.objects;

import pages.base.BasePage;

public class ToyotaCarsPage extends BasePage{

	
	public String getCarTitle() {
		
		return getText("carTitle_XPATH");
		
	}
}
