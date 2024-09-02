package Generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest {
	
	protected WebDriver driver;
	
	@BeforeClass
	
	public void setup() throws IOException {
		driver = new ChromeDriver();
		
		// create a property object for attracting data from config.properties
		Properties properties = new Properties();
		
		// give the path using fileinputstream
		FileInputStream file = new FileInputStream("C:\\Users\\shubh\\Documents\\workspace-spring-tool-suite-4-4.24.0.RELEASE\\POM_CONSTRUCT_WEEK\\src\\test\\resources\\config.properties");
		
		// load file in it  
		properties.load(file);
		 
		// use property and store it in a string url
		String origin = properties.getProperty("url");
		
		// call it using driver
		driver.get(origin);
		
		// add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// add winddow maximize 
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	
	public void teardown() {
		driver.quit();
	}
	
	
}
