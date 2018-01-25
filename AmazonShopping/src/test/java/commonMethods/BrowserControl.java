package commonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserControl extends WebConnector{
	
	@Before
	public void openBrowser() throws Exception{
		
		//Read the Properties file with all the source data.
		FileInputStream fsp=new FileInputStream("../Amazonshopping/src/test/java/resources/source.properties");
		prop.load(fsp);
		
		//Test only for two browser types.
		
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../bbc/src/test/java/resources/chromedriver.exe");
			driver=new ChromeDriver();
					
			
		}else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../bbc/src/test/java/resources/geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		
		
	}
	
	@After
	public void closeBrowser() throws Exception{
		driver.close();
	}

}
