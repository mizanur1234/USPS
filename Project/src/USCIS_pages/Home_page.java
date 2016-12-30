package USCIS_pages;

import org.openqa.selenium.By;

public class Home_page extends Base_page {
	
	By Header=By.className("header-content");
	
	
	String website="http://www.uscis.com/";
	public Home_page initializeURL()
	{
		driver.get(website);
		return this;
	}
	
	
}
