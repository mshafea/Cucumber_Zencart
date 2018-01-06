package PageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Browser;

public class LoginPage {

	public LoginPage() {

		PageFactory.initElements(Browser.driver, this);
	}

	@FindBy(id = "login-email-address")
	private WebElement loginEmailAddress;

	@FindBy(id = "login-password")
	private WebElement loginPassword;

	@FindBy(css = "input[value='Sign In']")
	private WebElement signInButton;

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "firstname")
	private WebElement firstName;

	@FindBy(id = "lastname")
	private WebElement lastName;

	@FindBy(id = "street-address")
	private WebElement streetAddress;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "postcode")
	private WebElement postCode;

	@FindBy(id = "country")
	private WebElement country;

	@FindBy(id = "telephone")
	private WebElement telephone;

	@FindBy(id = "dob")
	private WebElement dateOfBirth;

	@FindBy(id = "email-address")
	private WebElement emailAddress;

	@FindBy(id = "password-new")
	private WebElement password;

	@FindBy(id = "password-confirm")
	WebElement passwordConfirm;

	@FindBy(css = "input[value='Submit the Information']")
	private WebElement submitButton;

	@FindBy(css = "h1#createAcctSuccessHeading")
	private WebElement accountCreationConfirmation;

	public void createNewUser(String gender, String fname, String lname, String address, String ci, String s,
			String pCode, String c, String tele, String birhtDate, String email, String pass, String passConfirm) {

		if (gender.equalsIgnoreCase("male")) {
			maleRadioButton.click();
		} else if (gender.equalsIgnoreCase("female")) {
			femaleRadioButton.click();
		}

		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		streetAddress.sendKeys(address);
		city.sendKeys(ci);
		state.sendKeys(s);
		postCode.sendKeys(pCode);
		Select drpCountry = new Select(country);
		drpCountry.selectByVisibleText(c);
		telephone.sendKeys(tele);
		dateOfBirth.sendKeys(birhtDate);
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		passwordConfirm.sendKeys(passConfirm);
	}

	public void submitInfo() {
		submitButton.click();
	}

	public String accountCreationConfirmationMessage() {
		String message = accountCreationConfirmation.getText();
		return message;
	}

	public void userlogin(String emailAddress, String password) {
		loginEmailAddress.sendKeys(emailAddress);
		loginPassword.sendKeys(password);
		signInButton.click();
	}

}
