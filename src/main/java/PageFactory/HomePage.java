package PageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Browser;

public class HomePage {
	
	public HomePage() {

		if (Browser.driver != null) {
		PageFactory.initElements(Browser.driver, this);
		} else {
			try {
				throw new Exception("Driver doesn't initiated");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FindBy(linkText = "Log In")
	private WebElement zencartLogin;

	@FindBy(linkText = "Software")
	private WebElement softwareLink;

	// Go to Login Page
	public void selectLoginPage() {
		zencartLogin.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectSoftware() {
		softwareLink.click();
	}

}
