package nz.co.assurity.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	private Calculator calculator = new Calculator();
	private int result;

	@When("I calculate {int} + {int}")
	public void i_add(int operand1, int operand2) {
	    result = calculator.add(operand1, operand2);
	}

	@When("I calculate {int} / {int}")
	public void i_calculate(Integer int1, Integer int2) {
		result = calculator.divide(int1, int2);
	}

	@Then("the answer is {int}")
	public void the_answer_is(int expected) {
		assertThat(result, equalTo(expected));
	}
}
