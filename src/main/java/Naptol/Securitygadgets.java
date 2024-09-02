package Naptol;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Securitygadgets {

	TakesScreenshot ts;
	Utils.Screenshot ss = new Utils.Screenshot();
	WebDriver driver;
	
	public Securitygadgets(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id = "cate_head")
	private WebElement shoppingCategorybutton; 

	
	@FindBy(id ="cshow8")
	private WebElement consumerelectronicbutton;
	
	@FindBy(linkText = "Security & Gadgets")
	private WebElement Securitygadgetbutton;
	
	@FindBy(linkText = "Security Devices")
	private WebElement securitydevicesbutton;
	
	@FindBy(linkText = "Rechargeable Wi-Fi CCTV Live Camera")
	private WebElement WIFIcamera;
	
	@FindBy(id = "pincodeDeliveryId_0")
	private WebElement pincode;
	
	@FindBy(css = "[onclick=\"javascript:bestOfferOnPincode.getBestOfferOnDelivery(null,'12611318', 'Rechargeable Wi-Fi CCTV Live Camera');\"]")
	private WebElement click;
	
	@FindBy(id = "cart-panel-button-0")
	private WebElement addtocart;
	
	@FindBy(className = "red_button2")
	private WebElement checkout;
	
	@FindBy(css = "[alt=\"Online Shopping in India\"]")
	private WebElement backtohomepage;

	public WebElement getShoppingCategorybutton() {
		return shoppingCategorybutton;
	}

	public WebElement getConsumerelectronicbutton() {
		return consumerelectronicbutton;
	}

	public WebElement getSecuritygadgetbutton() {
		return Securitygadgetbutton;
	}

	public WebElement getSecuritydevicesbutton() {
		return securitydevicesbutton;
	}

	public WebElement getWIFIcamera() {
		return WIFIcamera;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getBacktohomepage() {
		return backtohomepage;
	}
	
	public void security() throws IOException {
		ss.capture(driver, 2);
		shoppingCategorybutton.click();
		consumerelectronicbutton.click();
		Securitygadgetbutton.click();
		securitydevicesbutton.click();
		WIFIcamera.click();
		String parentid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		String expectedtitle = "";
		for (String id : allids) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals(expectedtitle)) {
				break;
			}
		}
		pincode.click();
		click.click();
		addtocart.click();
		checkout.click();
		backtohomepage.click();
		
		
		
		
	}
	
}
