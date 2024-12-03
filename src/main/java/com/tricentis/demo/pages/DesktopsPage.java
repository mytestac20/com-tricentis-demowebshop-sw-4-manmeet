package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {


    // Locators for the Desktops page
    By sortByDropdown = By.id("products-orderby");
    By productList = By.cssSelector(".product-item");
    By addToCart=By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]");


    // Method to select a sorting option from the dropdown
    public void setSortByOption(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByDropdown, sortByOption);
    }

    /**
     * This method will get list of product name
     */
    public List<String> getListOfProductNames(){
        List<WebElement> productNames = findElements(productList);
        List<String> names = new ArrayList<>();
        for (WebElement element:productNames){
            names.add(element.getText());
        }

        return names;
    }

    /**
     * This method will click on Add To Cart Button
     */
    public void clickOnAddToCard(){
        clickOnElement(addToCart);
    }

}
