package com.co.ejemplo.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.globalsqa.com/angularJs-protractor/Multiform/#/form/profilehttps://www.globalsqa.com/angularJs-protractor/Multiform/#/form/profile")
public class RegisterPage extends PageObject {

   By TXT_NAME = By.xpath("//input[@name = 'name']");
   By TXT_EMAIL = By.xpath("//input[@name = 'email']");
   By BTN_NEXT = By.xpath("//a[@class = 'btn btn-block btn-info']");

   By RB_XBOX = By.xpath("//div[@class = 'form-group ng-scope']/div[1]");
   By RB_PS4 = By.xpath("//div[@class = 'form-group ng-scope']/div[2]");

   By TEXT_VERIFY = By.xpath("//h3[text() = 'Thanks For Your Money!']");

    public By getTXT_NAME() {
        return TXT_NAME;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public By getBTN_NEXT() {
        return BTN_NEXT;
    }

    public By getRB_XBOX() {
        return RB_XBOX;
    }

    public By getRB_PS4() {
        return RB_PS4;
    }

    public By getTEXT_VERIFY() {
        return TEXT_VERIFY;
    }
}
