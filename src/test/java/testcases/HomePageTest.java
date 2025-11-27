package testcases;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;

public class HomePageTest extends BaseClass {
	
	@Test
	public void verifyHomePage() {
		
		HomePage hm = new HomePage(driver);
		hm.verifyToolQA();
		
		
		
	
		
		
	}
	
	
}
