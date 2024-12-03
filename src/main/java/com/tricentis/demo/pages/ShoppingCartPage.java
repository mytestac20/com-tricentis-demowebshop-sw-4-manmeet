package com.tricentis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

public class ShoppingCartPage extends Utility {


    // Locators for the Shopping Cart page
    By cartProductList = By.cssSelector(".cart-item");
    By checkoutButton = By.cssSelector(".checkout-button");
    By totalPriceLabel = By.linkText("Total");
    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeQty = By.xpath("//td[@class='qty nobr']/input");
    By updateCartButton = By.xpath("//input[@name='updatecart']");
    By termsCheckBox = By.id("termsofservice");
    By registerTab=By.xpath("//input[@value='Register']");
    By qtyShoppingCart = By.xpath("//span[@class='cart-qty']");

    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }

    //method to return qty from shopping cart
    public static Integer getQuantityFromShoppingCart(Integer qtyShoppingCart) {
        return qtyShoppingCart;
    }

    //method to verify qty in shopping cart
    public static boolean verifyQuantityFromShoppingCart(Integer qtyShoppingCart) {
        Integer returnedQty = getQuantityFromShoppingCart(qtyShoppingCart);

        if (returnedQty == 2) {
            System.out.println("quantity in shopping cart is : " + returnedQty);
            return true;
        } else {
            System.out.println("quantiy is not right" + returnedQty);
            return false;
        }


    }
    // Method to click on the Checkout button
    public void clickOnCheckout() {
        clickOnElement(checkoutButton);
    }
    public void clickOnTermsAndConditionsCheckbox() {
        clickOnElement(termsCheckBox);
    }

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }
    // Method to get the total price from the cart
    public String getTotalPrice() {
        return getTextFromElement(totalPriceLabel);
    }

    // Method to check the products in the cart
    public void checkCartProducts() {
        getTextFromElement(cartProductList);
        // Logic to check if the product list in the cart is correct
    }
    public void clickOnUpdateButton() {
        clickOnElement(updateCartButton);
    }
    public void changeProductQty(String qty) {
        sendTextToElement(changeQty, qty);
    }
}
