package com.techjava.springbootcucumberdemo.cucumber.stepdefs;

import com.techjava.springbootcucumberdemo.cucumber.config.CucumberConfig;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.springframework.http.ResponseEntity;


public class CalculationStepdefs extends CucumberConfig {

    private ResponseEntity<String> responseEntity;

    private String result_add = "Addition of 5 + 4 is 9";
    private String result_sub = "Subtraction of 6 - 4 is 2";
    private String result_multi = "Multiple of 2 * 2 is 4";
    private String result_divi = "Divide of 25 / 5 is 5";

    @Given("^Create two numbers for addition$")
    public void createTwoNumbersForAddition() throws Throwable {
        String URI="/calc";
        getCompleteEndPoint(URI);
    }

    @And("^Add Number(\\d+) \"([^\"]*)\" and Number(\\d+) \"([^\"]*)\"$")
    public void addNumberAndNumber(int arg0, String arg1, int arg2, String arg3) throws Throwable {
        String URI = "/calc/add/" + arg1 +"/"+arg3;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
        Assert.assertEquals("5", arg1);
        Assert.assertEquals("4", arg3);
    }

    @Then("^The output of addition is \"([^\"]*)\"$")
    public void theOutputOfAdditionIs(String arg0) throws Throwable {
        Assert.assertEquals(result_add, responseEntity.getBody());
    }

    public String getCompleteEndPoint(String URI){
        System.out.println("Complete URL--->" + (staticURL + port + URI));
        return staticURL + port + URI;
    }

    @Given("^Create two numbers for subtraction$")
    public void createTwoNumbersForSubtraction() throws Throwable {
        String URI="/calc";
        getCompleteEndPoint(URI);
    }

    @And("^Sub NumberA \"([^\"]*)\" and NumberB \"([^\"]*)\"$")
    public void subNumberAAndNumberB(String arg0, String arg1) throws Throwable {
        String URI = "/calc/sub/" + arg0 +"/"+arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
        Assert.assertEquals("6", arg0);
        Assert.assertEquals("4", arg1);
    }

    @Then("^The output of subtract is \"([^\"]*)\"$")
    public void theOutputOfSubtractIs(String arg0) throws Throwable {
        Assert.assertEquals(result_sub, responseEntity.getBody());
    }

    @Given("^Create two numbers for Multiplication$")
    public void createTwoNumbersForMultiplication() throws Throwable {
        String URI="/calc";
        getCompleteEndPoint(URI);
    }

    @And("^Multi NumberA \"([^\"]*)\" and NumberB \"([^\"]*)\"$")
    public void multiNumberAAndNumberB(String arg0, String arg1) throws Throwable {
        String URI = "/calc/multiply/" + arg0 +"/"+arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
        Assert.assertEquals("2", arg0);
        Assert.assertEquals("2", arg1);
    }

    @Then("^The output of multiply is \"([^\"]*)\"$")
    public void theOutputOfMultiplyIs(String arg0) throws Throwable {
        Assert.assertEquals(result_multi, responseEntity.getBody());
    }

    @Given("^Create two numbers for division$")
    public void createTwoNumbersForDivision() throws Throwable {
        String URI="/calc";
        getCompleteEndPoint(URI);
    }

    @And("^Divide NumberA \"([^\"]*)\" and NumberB \"([^\"]*)\"$")
    public void divideNumberAAndNumberB(String arg0, String arg1) throws Throwable {
        String URI = "/calc/divide/" + arg0 +"/"+arg1;
        responseEntity = testRestTemplate.getForEntity(getCompleteEndPoint(URI), String.class);
        Assert.assertEquals("25", arg0);
        Assert.assertEquals("5", arg1);
    }

    @Then("^The output of divison is \"([^\"]*)\"$")
    public void theOutputOfDivisonIs(String arg0) throws Throwable {
        Assert.assertEquals(result_divi, responseEntity.getBody());
    }
}
