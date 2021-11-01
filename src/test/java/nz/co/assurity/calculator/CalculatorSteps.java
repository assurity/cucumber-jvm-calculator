package nz.co.assurity.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	private Calculator calculator = new Calculator();
	private int result;

	@When("^I calculate (\\d+) \\+ (\\d+)$")
	public void i_calculate(int operand1, int operand2) {
	    result = calculator.add(operand1, operand2);
	}

	@Then("^the answer is (\\d+)$")
	public void the_answer_is(int expected) {
		assertThat(result, equalTo(expected));
	}
}
