package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


//import com.sun.jna.platform.FileUtils;
import org.apache.commons.io.FileUtils;

public class Browser {

	public static WebDriver driver;
	public static void startBrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {

			// create firefox instance
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {

			// set path to chromedriver.exe You may need to download it from
			// http://code.google.com/p/selenium/wiki/ChromeDriver
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		else if (browser.equalsIgnoreCase("ie")) {
			// set path to IEdriver.exe You may need to download it from
			// 32 bits
			// http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip
			// 64 bits
			// http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			// create chrome instance
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else {

			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}

	}

	public static String getUrlFromProperty() {

		String file = "config.properties";
		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty("URL");
	}

	// Go to URL
	public static void goTo(String url) {

		driver.get(url);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void takesnapshot(WebDriver driver, String fileName) {
		// convert web driver object to TakesScreenShot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenShotAs method to create image file

		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move Image file to new destination

		File destFile = new File("./ScreenShots/" + fileName + ".png");

		// Copy file at destination

		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
