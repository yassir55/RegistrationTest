package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.RegistrationPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	WebDriver driver = null;
	RegistrationPage_PF register;

	@Given("The user is on the registration page")
	public void the_user_is_on_the_registration_page() {
		System.out.println("===============I am inside RegisterSteps class ========= ");

		// declaration and instantiation of objects/variables
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		String url = "file:///home/user/SelenuimProjects/Bootstrap%203%20registration%20form%20example%20-%20Bootsnipp.com.html";

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//driver.manage().window().maximize();

		driver.get(url);
	}



	@When("^user enters (.*)$")
	public void user_enters_fullname(String fullname) throws InterruptedException {
		System.out.println("======================111111======================================== ");
		register = new RegistrationPage_PF(driver);
		register.enterFullname(fullname);

		Thread.sleep(4000);
	}

	@And("^user enters  (.*)$")
	public void user_enters_email(String email) throws InterruptedException {
		System.out.println("======================222222======================================== ");
		register = new RegistrationPage_PF(driver);
		register.enterEmail(email);

		Thread.sleep(4000);
	}

	@And("user enters password ")
	public void user_enters_password(String password) throws InterruptedException {
		register = new RegistrationPage_PF(driver);
		register.enterPassword(password);

		Thread.sleep(2000);
	}

	@And("user enters date_of_bithday")
	public void user_enters_date_of_bithday() {
		System.out.println("============================================================== empty for now");

	}

	@And("user cboose the country")
	public void user_cboose_the_country(String country) throws InterruptedException {
		register = new RegistrationPage_PF(driver);
		register.SelectCountry(country);

		Thread.sleep(2000);
	}

	@And("user select the gender")
	public void user_select_the_gender(String gender) {
		register = new RegistrationPage_PF(driver);
		register.ChooseGender(gender);
	}

	@And("user check meal preference calorie ")
	public void user_check_meal_preference_calorie() {
		register = new RegistrationPage_PF(driver);
		register.checkTerms();
	}

	@And("user check meal preference salt ")
	public void user_check_meal_preference_salt(boolean b) {
		register = new RegistrationPage_PF(driver);
		register.checkCalorie(b);
	}

	@And("user check I accept terms")
	public void user_check_i_accept_terms(boolean b1) {
		register = new RegistrationPage_PF(driver);
		register.checkSalt(b1);
	}

	@And("user click on Register")
	public void user_click_on_register() {
		register = new RegistrationPage_PF(driver);
		register.register();
	}

	@Then("a succes message should display")
	public void a_succes_message_should_display() {
		System.out.println("============================================================== empty for now");
	}
}
