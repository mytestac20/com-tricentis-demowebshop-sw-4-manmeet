package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterPage  extends Utility {

    By registerText=By.xpath("//h1[normalize-space()='Register']");
    By maleRadioButton=By.xpath("//input[@id='gender-male']");
    By firstName=By.xpath("//input[@id='FirstName']");
    By lastName=By.xpath("//input[@id='LastName']");
    By emailAddress=By.xpath("//input[@id='Email']");
    By password=By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//input[@id='register-button']");
    By registerContinueButton=By.xpath("//input[@value='Continue']");

    //method will get register text

    public String getRegisterText(){
        return getTextFromElement(registerText);
    }

    //method to click on male radio button

    public void clickOnMaleRadioButton(){
        clickOnElement(maleRadioButton);
    }

    //method to click on register button

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    //method to click continue button

    public void clickOnContinueButton(){
        clickOnElement(registerContinueButton);
    }
    //method to enter first name

    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
    }

    //method to enter last name

    public void enterLastName(String lName){
        sendTextToElement(lastName,lName);
    }

    //method to enter first name

    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress,email);
    }

  //method for enter password

    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }

    //method to enter confirm password

    public void enterConfirmPassword(String cPass){
        sendTextToElement(confirmPassword,cPass);
    }


}

