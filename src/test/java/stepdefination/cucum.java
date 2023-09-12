package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class cucum {
	WebDriver driver;
	
	@Given("user must be on homepage {string}")
	public void user_must_be_on_homepage(String string) {
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\vedan\\Desktop\\Roician\\Eclips\\HR\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.get(string);
	    
	}

	@When("user click on signup button")
	public void user_click_on_signup_button() {
		driver.findElement(By.id("signin2")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("Signup dialog box should open")
	public void signup_dialog_box_should_open() {
		boolean actual=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
		//Assert.assertEquals(true, actual);
	
	}
	
	@Then("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password)throws InterruptedException {
	    driver.findElement(By.id("sign-username")).sendKeys(username);
	    driver.findElement(By.id("sign-password")).sendKeys(password);
	}
}
