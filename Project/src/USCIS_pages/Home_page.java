package USCIS_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_page extends Base_page {
	
	By Header=By.className("header-content");
	By Subtext_Logo=By.cssSelector(".logo-sub-text");
	
	String website="http://www.uscis.com/";
	public Home_page initializeURL()
	{
		driver.get(website);
		String title=driver.getTitle();
		System.out.println("The page Title is : "+title);
		return this;
	}
	 
	public Home_page Header_page()
	{
		WebElement PageHeader=driver.findElement(Header);
		WebElement subtext=PageHeader.findElement(Subtext_Logo);
		String PageName=subtext.getText();
		System.out.println("This is the text of the element=> "+PageName);
		return this;
		
	}
	
	
	
	
}
