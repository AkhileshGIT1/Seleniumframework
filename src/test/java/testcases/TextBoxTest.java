package testcases;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Pages.TextBox;

public class TextBoxTest extends BaseClass{
	
	
	@Test
	public void StartTextBoxTest() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");
		
		HomePage hp = new HomePage(driver);
		hp.ClickElements();
		
		TextBox tb = new TextBox(driver);
			tb.InputTextBoxDetails();
				
	}
	
	

}
