package nz.co.assurity.calculator;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
     plugin={"pretty", "html:target/cucumber", "json:build/cucumber-reports/cucumber-report.json"}
     )

public class RunCalculatorTests {
}
