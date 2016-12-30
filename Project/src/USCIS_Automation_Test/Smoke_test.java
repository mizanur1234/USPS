package USCIS_Automation_Test;

import org.junit.Test;

import USCIS_pages.Base_page;
import USCIS_pages.Home_page;

public class Smoke_test extends Base_page {
	
	private Home_page Home= new Home_page();
	
	
	
	
	@Test
	public void tests()
	{
		Home.initializeURL();
		Home.Header_page();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
