package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Checkbox {
	WebDriver driver;
	@Given("use must be on url {string}")
	public void use_must_be_on_url(String string) throws Throwable {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\vedan\\Desktop\\Roician\\Eclips\\HR\\geckodriver.exe");
		    driver=new FirefoxDriver();
		    driver.get(string);
		    Thread.sleep(4000);
		    
	}
	

	@When("user click on product")
	public void user_click_on_product() {
		 driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();

	}

	@Then("product url must be same as expected")
	public void product_url_must_be_same_as_expected() {
	String expectedUrl = "https://demoblaze.com/prod.html?idp_=1";
    String actualUrl = driver.getCurrentUrl();
    
    Assert.assertEquals(expectedUrl, actualUrl);
	}



}
