package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.Utility;

public class ProductPage extends Utility {

    By computerName = By.cssSelector("h1[itemprop='name']");
    By processorSelector = RelativeLocator.with(By.tagName("select")).above(By.xpath("//label[normalize-space()='RAM']"));
    By selectRAM = RelativeLocator.with(By.tagName("select")).below(By.xpath("//label[normalize-space()='RAM']"));
    By hddradioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[contains(text(),'400 GB')]"));
    By osRadioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[contains(text(),'Windows 10')]"));
    By totalCommander = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[contains(text(),'Total Commander')]"));
    By productPrice = By.xpath("//div[@class='product-price']/span");
    By addToCart = By.xpath("//div[@class='add-to-cart-panel']/input[2]");
    By shoppingCartMessage = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@title='Close']");
    By goToCart = By.xpath("//span[normalize-space()='Shopping cart']");
    By productQty = RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//label[normalize-space()='Qty:']"));



    public String getProductName() {
        return getTextFromElement(computerName);
    }


    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }


    public void selectProcessorType(String option) {
        selectByVisibleTextFromDropDown(processorSelector, option);
    }

    //method to select ram
    public void selectRAMType(String option) {
        selectByVisibleTextFromDropDown(selectRAM, option);
    }

    //method to click on hdd radio
    public void clickOnHDDRadioButton() {
        clickOnElement(hddradioButton);
    }

   // method to click on radio button
    public void clickOnOsRadioButton() {
        clickOnElement(osRadioButton);
    }

    // method to Click Commander Checkbox

    public void clickOnCommanderCheckBox() {
        clickOnElement(totalCommander);
    }

    //method  to Click on Add To Cart Button

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    //method to  Click Close Button

    public void clickOnCloseShoppingCartMessage() {
        clickOnElement(closeButton);
    }

    //method to MouseHover and Click on "Shopping cart" and click on the "Go to cart" button.

    public void mouseHoverAndClickOnShoppingCart() {
        mouseHoverToElementAndClick(goToCart);
    }

   //method to get the Shopping Cart Message

    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    //method to change the product qty

    public void updateProductQty(String qty) {
        sendTextToElement(productQty, qty);
    }


}