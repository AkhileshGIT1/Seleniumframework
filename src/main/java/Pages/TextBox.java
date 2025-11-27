package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TextBox {
	
	 WebDriver driver;
	 
	 public By Textbox = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
	 public By FullName = By.xpath("//input[@id='userName']");
	 public By Email = By.xpath("//input[@id='userEmail']");
	 public By CurrentAddress = By.xpath("//textarea[@id='currentAddress']");
	 public By PermanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	 public By SubmitButton = By.xpath("//textarea[@id='permanentAddress']");
	 public By formPreview = By.xpath("//*[@id=\"output\"]/div");
	 
	 
	public TextBox(WebDriver driver) {
		this.driver = driver;
	}
	
	public void InputTextBoxDetails() {
		driver.findElement(Textbox).click();
		driver.findElement(FullName).sendKeys("AkhileshRam");
		driver.findElement(Email).sendKeys("Ram@shyam.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");
        
		driver.findElement(CurrentAddress).sendKeys("Indore Mp 52001");
		driver.findElement(PermanentAddress).sendKeys("not applicable");
		System.out.println("before submit button click");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(SubmitButton).click();
		System.out.println("after submit button click");
		driver.findElement(formPreview).isDisplayed();
		String formtext =driver.findElement(formPreview).getText();
		System.out.println(formtext + ":gettextvalue");
		System.out.println("Completed text box form");
		
	}

}
