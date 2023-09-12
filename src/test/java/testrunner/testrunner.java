package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vedan\\Desktop\\Roician\\Eclips\\framework\\src\\test\\java\\feature", glue = {"stepdefination"},
 plugin= {"pretty","html:target\\HTmlreports"},monochrome=true)



public class testrunner {
}
