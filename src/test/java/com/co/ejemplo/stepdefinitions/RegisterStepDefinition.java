package com.co.ejemplo.stepdefinitions;

import com.co.ejemplo.models.Data;
import com.co.ejemplo.steps.RegisterStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    RegisterStep registerStep;

    @Given("^that i enter on the website$")
    public void thatIEnterOnTheWebsite() {
        registerStep.openPage();
    }

    @When("^i enter personal data$")
    public void iEnterPersonalData(List<Data> dataList) {

        registerStep.datesRegister(dataList.get(0).getName());
        registerStep.datesRegister2(dataList.get(0).getEmail());
        registerStep.clickNext();
        registerStep.rgButtons();
        registerStep.clickNext();
    }

    @Then("^i should see on the screen Thanks For Your Money$")
    public void iShouldSeeOnTheScreenThanksForYourMoney() {
        registerStep.textVerify();
    }

}
