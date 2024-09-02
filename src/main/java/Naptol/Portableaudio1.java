package Naptol;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portableaudio1 {
	
	TakesScreenshot ts;
	Utils.Screenshot ss = new Utils.Screenshot();

	
	WebDriver driver;
	public Portableaudio1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "cate_head")
	private WebElement shopingcategory;
	
	@FindBy(id = "cshow8")
	private WebElement consumerelectronics;
	
	@FindBy(linkText = "Portable Audio")
	private WebElement portableaudio;
	
	@FindBy(linkText = "Portable Speakers")
	private WebElement poratablespeakers;
	
	@FindBy(id = "brandFilterBox35768")
	private WebElement icex;
	
	@FindBy(id = "brandFilterBox38822")
	private WebElement maxyolo;
	
	@FindBy(id = "brandFilterBox38905")
	private WebElement Saregamabutton;
	
	@FindBy(linkText = "Saregama Carvaan")
	private WebElement SaregamaCarvaan;
	
	@FindBy(linkText = "Home")
	private WebElement backhome;
	
	public WebElement getShopingcategory() {
		return shopingcategory;
	}

	public WebElement getConsumerelectronics() {
		return consumerelectronics;
	}

	public WebElement getPortableaudio() {
		return portableaudio;
	}

	public WebElement getPoratablespeakers() {
		return poratablespeakers;
	}

	public WebElement getIcex() {
		return icex;
	}

	public WebElement getMaxyolo() {
		return maxyolo;
	}

	public WebElement getSaregamabutton() {
		return Saregamabutton;
	}

	public WebElement getSaregamaCarvaan() {
		return SaregamaCarvaan;
	}

	public WebElement getBackhome() {
		return backhome;
	}
	
	public void audio() throws InterruptedException, IOException {
		
		ss.capture(driver, 4);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		shopingcategory.click();
		consumerelectronics.click();
		portableaudio.click();
		poratablespeakers.click();
		icex.click();
		
		Thread.sleep(1000);
		maxyolo.click();
		Thread.sleep(1000);
		Saregamabutton.click();
		
		SaregamaCarvaan.click();
		backhome.click();
	}
	
}
