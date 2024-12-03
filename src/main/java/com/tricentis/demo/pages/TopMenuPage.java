package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuPage extends Utility {

    //Find locators for menu page
    By computerMenu = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    By electronicMenu = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
    By cellPhone=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Cell phones']");



    //   method to click on computer menu

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);

    }

    //   method to mouse hover on electronics menu

    public void mouseHoverOnElectronicsTab() {
        mouseHoverToElement(electronicMenu);

    }
    public void mouseHoverAndClickOnCellPhoneTab(){
        mouseHoverToElementAndClick(cellPhone);

    }

    //  method to select menu in the TopMenu

    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='" + menu + "']"));
    }


}