package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

public class ElectronicsPage extends Utility {



    // Locators for the Electronics page
    By cameraLink = By.linkText("Cameras");
    By cellPhoneLink = By.linkText("Cell phones");
    By mp3PlayersLink = By.linkText("MP3 Players");



    // Method to click on Cameras link
    public void clickOnCameras() {
        clickOnElement(cameraLink);
    }

    // Method to click on Cell phones link
    public void clickOnCellPhones() {
        clickOnElement(cellPhoneLink);
    }

    // Method to click on MP3 Players link
    public void clickOnMP3Players() {
        clickOnElement(mp3PlayersLink);
    }
}
