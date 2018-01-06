package stepDefinition;



import java.util.List;

import org.testng.Assert;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import Setup.TestBase;

public class NewUserCreation {
	//TestBase testBaseObject = new TestBase();
	TestBase tbase;
	HomePage homePageObject;
	LoginPage loginPageObject;


	@Given("^user is on Home Page \"([^\"]*)\"$")
    public void user_is_on_home_page(String browser) throws Throwable {
		tbase = new TestBase();
		browser = "chrome";
		tbase.setUp(browser);
    }
	
	@When("^User navigate to Login Page$")
	public void user_navigate_to_login_page() throws Throwable {
		homePageObject = new HomePage();
		homePageObject.selectLoginPage();
	}

	@And("^user enters new user details$")
    public void user_enters_new_user_details(DataTable table) throws Throwable {
		loginPageObject = new LoginPage();
		List<List<String>> data = table.raw();
		loginPageObject.createNewUser(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), data.get(0).get(3),data.get(0).get(4), data.get(0).get(5), data.get(0).get(6), data.get(0).get(7), data.get(0).get(8), data.get(0).get(9), data.get(0).get(10), data.get(0).get(11), data.get(0).get(12));
		loginPageObject.submitInfo();
	}

	@Then("^New User is created successfully$")
	public void new_user_is_created() throws Throwable {
		Assert.assertEquals(loginPageObject.accountCreationConfirmationMessage(), "Your Account Has Been Created!", "Account created successfully");
	}

}
