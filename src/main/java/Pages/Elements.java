package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Elements {
	
	
	 WebDriver driver;

	    public By TextBox = By.xpath("//span[normalize-space()='Text Box']");
	    public By CheckBox = By.xpath("//span[normalize-space()='Check Box']");
	   

	    public Elements(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void verifyTextBox() {
	    	driver.findElement(TextBox).isDisplayed();
	    }
	    public void ClickTextBox() {
	    	driver.findElement(TextBox).click();
	    }
	    public void verifyCheckBox() {
	    	driver.findElement(CheckBox).isDisplayed();
	    }
	    

}
