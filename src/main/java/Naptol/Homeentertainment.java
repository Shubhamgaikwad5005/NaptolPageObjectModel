package Naptol;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeentertainment {
	
	WebDriver driver;
	
	TakesScreenshot ts;
	
	Utils.Screenshot ss = new Utils.Screenshot();
	
	public Homeentertainment(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "cate_head")
	private WebElement shoppingcategory;
	
	@FindBy(id = "cshow8")
	private WebElement consumerelectronics;
	
	@FindBy(linkText = "Home Entertainment")
	private WebElement homeentertainment;
	
	@FindBy(linkText = "Home Speakers")
	private WebElement homespeaker;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement branded;
	
	@FindBy(css = "[id=\"priceFilterBox4\"]")
	private WebElement selectprices;
	
	@FindBy(linkText = "Colour Changing LED Bulb with Bluetooth Speaker + Free Rotat")
	private WebElement selectSpeaker;
	
	@FindBy(id = "cart-panel-button-0")
	private WebElement addtocart;
	
	@FindBy(css = "[class=\"red_button2\"]")
	private WebElement checkout;
	
	@FindBy(css = "[alt=\"Online Shopping in India\"]")
	private WebElement backhome;

	public WebElement getShoppingcategory() {
		return shoppingcategory;
	}

	public WebElement getConsumerelectronics() {
		return consumerelectronics;
	}

	public WebElement getHomeentertainment() {
		return homeentertainment;
	}

	public WebElement getHomespeaker() {
		return homespeaker;
	}

	public WebElement getBranded() {
		return branded;
	}

	public WebElement getSelectprices() {
		return selectprices;
	}

	public WebElement getSelectSpeaker() {
		return selectSpeaker;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getBackhome() {
		return backhome;
	}
	
	
	public void entertainment() throws InterruptedException, IOException {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		shoppingcategory.click();
		consumerelectronics.click();
		homeentertainment.click();
		homespeaker.click();
		branded.click();
		
		Thread.sleep(2000);
		selectprices.click();
		
		Thread.sleep(2000);
		selectSpeaker.click();
		
		String parentid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		String expectedtitle = "";
		for (String id : allids) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals(expectedtitle)) {
				break;
			}
		}
		ss.capture(driver, 3);
		addtocart.click();
		checkout.click();
		backhome.click();
		
	}
	
}
