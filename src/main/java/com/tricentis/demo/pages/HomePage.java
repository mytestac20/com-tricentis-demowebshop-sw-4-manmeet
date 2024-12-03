package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class HomePage extends Utility {
    By welcomeMessage=By.xpath("//h2[normalize-space()='Welcome to our store']");


    public String getWelcomeMessage(){
        return getTextFromElement(welcomeMessage);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }


}