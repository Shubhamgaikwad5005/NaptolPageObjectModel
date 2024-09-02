package Naptol;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portabledevice {
	
	TakesScreenshot ts;
	Utils.Screenshot ss = new Utils.Screenshot();
	WebDriver driver;
	public Portabledevice(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "cate_head")
	private WebElement shopingcategory;
	
	@FindBy(id = "cshow8")
	private WebElement consumerelectronics;
	
	@FindBy(linkText = "Portable Devices")
	private WebElement portabledevice;
	
	@FindBy(id = "iscod")
	private WebElement cashondelivery;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement setbutton;
	
	@FindBy(id = "brandFilterBox38526")
	private WebElement royalhomecategory;
	

	@FindBy(linkText = "Home Water Softener cum Filter - B1G1 (HA3)")
	private WebElement clickonfilter;
	
	@FindBy(id = "cart-panel-button-0")
	private WebElement addtocart;
	
	@FindBy(css = "[class=\"red_button2\"]")
	private WebElement checkout;
	
	

	@FindBy(css = "[alt=\"Online Shopping in India\"]")
	private WebElement backhomepage;
	
	public WebElement getShopingcategory() {
		return shopingcategory;
	}

	public WebElement getConsumerelectronics() {
		return consumerelectronics;
	}

	public WebElement getPortabledevice() {
		return portabledevice;
		
	}
	public WebElement getCashondelivery() {
		return cashondelivery;
	}
	public WebElement getSetbutton() {
		return setbutton;
	}

	public WebElement getRoyalhomecategory() {
		return royalhomecategory;
	}

	public WebElement getClickonfilter() {
		return clickonfilter;
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
	
	public void port() throws InterruptedException, IOException {
		ss.capture(driver, 1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		shopingcategory.click();
		consumerelectronics.click();
		portabledevice.click();
		cashondelivery.click();
		Thread.sleep(2000);
		setbutton.click();
		Thread.sleep(2000);
		royalhomecategory.click();
		clickonfilter.click();
		String parentid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		String expectedtitle = "";
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
