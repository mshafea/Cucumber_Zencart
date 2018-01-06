package Setup;




import utility.Browser;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import cucumber.api.java.After;


public class TestBase  {

	public  void setUp(String browser) {
		try {

			String Homeurl = Browser.getUrlFromProperty();
			
			if (browser.equalsIgnoreCase("Firefox")) {

				Browser.startBrowser(browser);
				Browser.goTo(Homeurl);

			} else if (browser.equalsIgnoreCase("Chrome")) {
				Browser.startBrowser(browser);
				Browser.goTo(Homeurl);
				
			} else if (browser.equalsIgnoreCase("IE")) {
				Browser.startBrowser(browser);
				Browser.goTo(Homeurl);
			}
			
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}

	}
	

  @AfterMethod 
  public void failedTestCases(ITestResult result){
	  if (ITestResult.FAILURE==result.getStatus()){
		  Browser.takesnapshot(Browser.driver, result.getName());
	  }
	  
  }
  
  @After
  public void teardown(){
	  //driver.close();
	  //sendmailByGMail("mohshafea@gmail.com", "", "mshafea@integrant.com", "Test Email", "");
	  Browser.driver.quit();
  }
}
