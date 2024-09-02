package Naptol;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Electronicacessories {

	WebDriver driver;
	
	TakesScreenshot ts;
	
	Utils.Screenshot ss = new Utils.Screenshot();
	
	public Electronicacessories(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(id = "cate_head")
	private WebElement shoppingCategorybutton; 

	
	@FindBy(id ="cshow8")
	private WebElement consumerelectronicbutton;
	
	@FindBy(linkText = "Electronics Accessories")
	private WebElement Electronicsaccessories;
	
	@FindBy(id = "iscod")
	private WebElement Cashondeliverybutton;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement setbutton;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement clickbranded;
	
	@FindBy(id = "priceFilterBox5")
	private WebElement clickprice;
	
	@FindBy(linkText = "Wireless Earpods with Charging Inbuilt Powerbank M10 with Fr")
	private WebElement Earpods;
	
	@FindBy(id = "cart-panel-button-0")
	private WebElement addtocart;
	
	@FindBy(className = "red_button2")
	private WebElement checkout;
	
	@FindBy(css = "[alt=\"Online Shopping in India\"]")
	private WebElement backhomepage;

	public WebElement getShoppingCategorybutton() {
		return shoppingCategorybutton;
	}

	public WebElement getConsumerelectronicbutton() {
		return consumerelectronicbutton;
	}

	public WebElement getElectronicsaccessories() {
		return Electronicsaccessories;
	}

	public WebElement getCashondeliverybutton() {
		return Cashondeliverybutton;
	}

	public WebElement getSetbutton() {
		return setbutton;
	}
	
	public WebElement getClickbranded() {
		return clickbranded;
	}

	public WebElement getClickprice() {
		return clickprice;
	}

	public WebElement getEarpods() {
		return Earpods;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getBackhomepage() {
		return backhomepage;
	}
	
	public void electronicacessories1() throws InterruptedException, IOException {
		
		// Method to interact with the Electronics Accessories section
		ss.capture(driver, 0);
		shoppingCategorybutton.click();
		consumerelectronicbutton.click();
		Electronicsaccessories.click();
		Cashondeliverybutton.click();
		setbutton.click();
		Thread.sleep(2000);
		clickbranded.click();
		Thread.sleep(2000);
		clickprice.click();
		Thread.sleep(2000);
		Earpods.click();
		String parentid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		String expectedtitle = "Buy Wireless Earpods with Charging Inbuilt Powerbank M10 with Free Golden Watch (TWS13) Online at Best Price in India on Naaptol.com";
		for (String id : allids) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals(expectedtitle)) {
				break;
			}
		}
        addtocart.click();
        checkout.click();
        backhomepage.click();
        
        
        
	}
}