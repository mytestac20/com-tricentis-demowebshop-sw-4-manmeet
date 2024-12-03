package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

public class ComputerPage extends Utility {



    // Locators for the Computers page
    By desktop=By.xpath("//img[@title='Show products in category Desktops']");
    By notebooksLink = By.linkText("Notebooks");
    By softwareLink = By.linkText("Software");



    // Method to click on Desktops link
    public void clickOnDesktops() {
        clickOnElement(desktop);
    }

    // Method to click on Notebooks link
    public void clickOnNotebooks() {
        clickOnElement(notebooksLink);
    }

    // Method to click on Software link
    public void clickOnSoftware() {
        clickOnElement(softwareLink);
    }
}