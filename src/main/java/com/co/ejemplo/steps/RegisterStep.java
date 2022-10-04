package com.co.ejemplo.steps;

import com.co.ejemplo.page.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class RegisterStep {

    RegisterPage registerPage;

    @Step
    public void openPage(){
        registerPage.open();
    }

    @Step
    public void datesRegister(String name){
        registerPage.getDriver().findElement(registerPage.getTXT_NAME()).sendKeys(name);
//        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL()).sendKeys(email);
    }

    @Step
    public void datesRegister2(String email){
//        registerPage.getDriver().findElement(registerPage.getTXT_NAME()).sendKeys(name);
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL()).sendKeys(email);
    }


    @Step
    public void clickNext(){
        registerPage.getDriver().findElement(registerPage.getBTN_NEXT()).click();
    }

    @Step
    public void rgButtons(){
        registerPage.getDriver().findElement(registerPage.getRB_XBOX()).click();
//        registerPage.getDriver().findElement(registerPage.getRB_PS4()).click();
    }

    @Step
    public void textVerify(){
        Assert.assertThat(registerPage.getDriver().findElement(registerPage.getTEXT_VERIFY())
                .isDisplayed(), Matchers.is(true));
    }

}
