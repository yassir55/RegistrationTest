package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage_PF {

    @FindBy(id = "firstName")
    WebElement txt_fullname;

    @FindBy(id = "email")
    WebElement txt_email;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "country")
    Select drpCountry;

    @FindBy(id = "femaleRadio")
    WebElement femaleRadio;

    @FindBy(id = "maleRadio")
    WebElement maleRadio;

    @FindBy(id = "uncknownRadio")
    WebElement uncknownRadio;

    @FindBy(id = "calorieCheckbox")
    WebElement calorieCheckbox;

    @FindBy(id = "saltCheckbox")
    WebElement saltCheckbox;

    @FindBy(id = "terms")
    WebElement termsCheckbox;

    @FindBy(id = "reg")
    WebElement btn_register;

    WebDriver driver;

    // when this constructor call all Webelement will be initialist
    public RegistrationPage_PF(WebDriver driver) {
        this.driver = driver;
        // PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void enterFullname(String fullname) {
        txt_fullname.sendKeys(fullname);
    }

    public void enterEmail(String email) {
        txt_email.sendKeys(email);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void SelectCountry(String country) {
        drpCountry.selectByVisibleText(country);
    }

    public void ChooseGender(String gender) {
        if (gender == "female")
            femaleRadio.click();
        else if (gender == "male")
            maleRadio.click();
        else if (gender == "uncknown")
            uncknownRadio.click();
    }

    public void checkCalorie(boolean b) {
        if (b == true)
            calorieCheckbox.click();
    }

    public void checkSalt(boolean b) {
        if (b == true)
            saltCheckbox.click();
    }

    public void checkTerms() {
        termsCheckbox.click();
    }

    public void register() {
        btn_register.click();
    }

}
