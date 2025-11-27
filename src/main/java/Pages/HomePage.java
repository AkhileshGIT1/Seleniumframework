package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public By ToolQALogo = By.xpath("//img[@src='/images/Toolsqa.jpg']");
    public By Elements = By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']");
    public By Forms = By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']");
    public By Alerts =By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']");
   

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyToolQA() {
    	driver.findElement(ToolQALogo).isDisplayed();
        System.out.println(driver.getTitle());
    }
    
    public void ClickElements() {
    	driver.findElement(Elements).click();
    }
    
    public void ClickForms() {
    	driver.findElement(Forms).clear();
    }
    public void ClickAlerts() {
    	driver.findElement(Alerts).click();
    }
}
