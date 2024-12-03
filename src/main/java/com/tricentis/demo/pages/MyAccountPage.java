package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class MyAccountPage extends Utility {

    By logoutButton=By.xpath("//a[normalize-space()='Log out']");

    //method for logout
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
}
