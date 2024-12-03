package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.*;
import com.tricentis.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.tricentis.demo.pages.ShoppingCartPage.getQuantityFromShoppingCart;
import static com.tricentis.demo.pages.ShoppingCartPage.verifyQuantityFromShoppingCart;

public class ElectronicsTest  extends TestBase {

    TopMenuPage menuPage = new TopMenuPage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ProductPage productDescriptionPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkoutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    //ElectronicsPage electronicsPage = new ElectronicsPage();
    /*===============================================================*/
    public void verifyText(String actualText, String expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }

    public void verifyText(List<String> actualText, List<String> expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }
    /*===============================================================*/


    //1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on the “ELECTRONICS” Tab
        menuPage.mouseHoverOnElectronicsTab();

        //1.2 Mouse Hover on the “Cell phones” and click
        menuPage.mouseHoverAndClickOnCellPhoneTab();

        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonePage.getCellPhoneText();
        verifyText(actualText, expectedText, "Cell phones text not displayed");

    }

    //2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        //2.1 Mouse Hover on the “ELECTRONICS” Tab
        menuPage.mouseHoverOnElectronicsTab();

        //2.2 Mouse Hover on the “Cell phones” and click
        menuPage.mouseHoverAndClickOnCellPhoneTab();

        //2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonePage.getCellPhoneText();
        verifyText(actualText, expectedText, "Cell phones text not displayed");

        //2.4 Select View as option ‘List’
        cellPhonePage.selectListOption("List");

        //2.5 Click on the product name “Smartphone” link
        cellPhonePage.clickOnSmartPhoneLink();

        //2.6 Verify the text “Smartphone”
        String actualSmartPhoneText = productDescriptionPage.getProductName();
        String expectedSmartPhoneText = "Smartphone";
        verifyText(actualSmartPhoneText, expectedSmartPhoneText, "The text Smartphone is not displayed");

        //2.7 Verify the price “100.00”
        String actualSmartPhonePrice = productDescriptionPage.getProductPrice();
        String expectedSmartPrice = "100.00";
        verifyText(actualSmartPhonePrice, expectedSmartPrice, "The text Smartphone is not displayed");

        //2.8 Change the quantity to 2
        productDescriptionPage.updateProductQty("2");

        //2.9 Click on the “Add to cart” tab
        productDescriptionPage.clickOnAddToCartButton();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualMessage = productDescriptionPage.getShoppingCartMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        verifyText(actualMessage, expectedMessage, "Product is not added into the shopping cart");

        //2.11 After that close the bar by clicking on the cross button.
        productDescriptionPage.clickOnCloseShoppingCartMessage();

        //2.12 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        productDescriptionPage.mouseHoverAndClickOnShoppingCart();

        //2.13 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingCartPage.getShoppingCartText();
        String expectedShoppingCartMessage = "Shopping cart";
        verifyText(actualShoppingCartMessage, expectedShoppingCartMessage, "The message shopping cart is not displayed");

        //2.14 Verify the quantity is 2

        boolean isVerified = verifyQuantityFromShoppingCart(getQuantityFromShoppingCart(2));
        if (isVerified) {
            System.out.println("The quantity is correct.");
        } else {
            System.out.println("The quantity is incorrect.");
        }
        //2.15 Verify the Total “200.00”
        String actualTotal = shoppingCartPage.getTotalPrice();
        String expectedTotal = "200.00";
        verifyText(actualTotal, expectedTotal, "The Total 200.00 is not displayed");

        //2.16 click on the checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsAndConditionsCheckbox();

        //2.17 Click on the “Checkout” button
        shoppingCartPage.clickOnCheckout();

        //2.18 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeText = checkoutPage.getCheckoutWelcomeText();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        verifyText(actualWelcomeText, expectedWelcomeText, "The text Welcome Please sign In is not displayed");

        //2.19 Click on the “Register” tab
        shoppingCartPage.clickOnRegisterTab();

        //2.20 Verify the text “Register”
        String actualRegisterText = registerPage.getRegisterText();
        String expectedRegisterText = "Register";
        verifyText(actualRegisterText, expectedRegisterText, "The text Register is not displayed");

        //2.21 Select the Male radio button
        registerPage.clickOnMaleRadioButton();

        //2.22 Enter the First name
        registerPage.enterFirstName("Rudraa");

        //2.23 Enter the Last name
        registerPage.enterLastName("Parekh");

        //2.24 Enter the Email
        registerPage.enterEmailAddress("mannmeetji@yahoo.com");

        //2.25 Enter the Password
        registerPage.enterPassword("RudraaParekh");

        //2.26 Enter the Confirm password
        registerPage.enterConfirmPassword("RudraaParekh");

        //2.27 Click on the “Register” button
        registerPage.clickOnRegisterButton();

        //2.28 Verify the message “Your registration completed”

        //2.29 Click on the “Continue” button
        registerPage.clickOnContinueButton();

        //2.30 Verify the text “Shopping card”
        String actualShoppingCart = shoppingCartPage.getShoppingCartText();
        String expectedShoppingCart = "Shopping cart";
        verifyText(actualShoppingCart, expectedShoppingCart, "The message shopping cart is not displayed");

        //2.31 click on the checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsAndConditionsCheckbox();

        //2.32 Click on the “Checkout”
        shoppingCartPage.clickOnCheckout();

        //2.33 Select the Country “United Kingdom” using the select class
        checkoutPage.selectCountryName("United Kingdom");

        //2.34 Enter the city
        checkoutPage.enterCityName("Harrow");

        //2.35 Enter the Address1
        checkoutPage.enterAddress("44");

        //2.36 Enter the Zip/Postal code
        checkoutPage.enterPostcode("HA14zx");

        //2.37 Enter the Phone number
        checkoutPage.enterPhoneNumber("987654321");

        //2.38 Click on the “Continue” button
        checkoutPage.clickOnContinueDetailButton();

        //2.39 Click on the “Continue” button
        checkoutPage.clickOnShippingAddressContinueButton();

        //2.40 Click on the Radio Button “2nd Day Air ($0.00)”
        checkoutPage.clickOnSecondDayAirRadioButton();

        //2.41 Click on the “Continue” button
        checkoutPage.clickOnShippingMethodContinueButton();

        //2.42 Select the Radio Button “Credit Card”
        checkoutPage.selectCreditCardRadioButton();

        //2.43 Click on the “Continue” button
        checkoutPage.clickOnCreditCardContinueButton();

        //2.44 Select the “Visa” From Select credit card dropdown
        checkoutPage.selectMasterCardOption("Visa");

        //2.45 Enter the Cardholder's name
        checkoutPage.enterCardHolderName("Rudy");

        //2.46 Enter the Card number
        checkoutPage.enterCreditCardNumber("5172826057025404");

        //2.47 Select the Expiration date using the select class
        checkoutPage.selectExpireMonth("07");
        checkoutPage.selectExpireYear("2025");

        //2.48 Enter the Card code
        checkoutPage.enterCreditCardCode("557");

        //2.49 Click on the “Continue” button
        checkoutPage.clickOnContinueButtonAfterPaymentDetails();

        //2.50 Verify the “Payment Method” is “Credit Card”
        String actualPaymentMethod = checkoutPage.getPaymentMethodText();
        String expectedPaymentMethod = "Credit Card";
        verifyText(actualPaymentMethod, expectedPaymentMethod, "The Payment Method is not credit card");

        //2.51 Verify the “Shipping Method” is “2nd Day Air”
        String actualShippingMethod = checkoutPage.getShippingMethodText();
        String expectedShippingMethod = "2nd Day Air";
        verifyText(actualShippingMethod, expectedShippingMethod, "The Shipping Method is next day air is not displayed");

        //2.52 Verify the Total is “200.00”
        String actualTotalPrice = checkoutPage.getTotalPrice();
        String expectedTotalPrice = "200.00";
        verifyText(actualTotalPrice, expectedTotalPrice, "The Price is not displayed");

        //2.53 Click on the “Confirm” button
        checkoutPage.clickOnConfirmButton();

        //2.54 Verify the Text “Thank You”
        String actualThankYou = checkoutPage.getThankYouText();
        String expectedThankYou = "Thank you";
        verifyText(actualThankYou, expectedThankYou, "The text thank you is not displayed ");

        //2.55 Verify the message “Your order has been successfully processed!”
        String actualSuccess = checkoutPage.getOrderSuccessfulMessage();
        String expectedSuccess = "Your order has been successfully processed!";
        verifyText(actualSuccess, expectedSuccess, "The successful  message is not displayed ");

        //2.56 Click on the “Continue” button
        checkoutPage.clickOnOrderContinueButton();

        //2.57 Verify the text “Welcome to our store”
        String actualWelcomeMessage = homePage.getWelcomeMessage();
        String expectedWelcomeMessage = "Welcome to our store";
        verifyText(actualWelcomeMessage, expectedWelcomeMessage, "The Welcome message is not displayed ");

        //2.58 Click on the “Logout” link
        myAccountPage.clickOnLogoutButton();

        //2.59 Verify the URL is “https://demowebshop.tricentis.com/”
        String actualURL = homePage.getCurrentUrl();
        String expectedURL = "https://demowebshop.tricentis.com/";
        verifyText(actualURL, expectedURL, "Current Url is not same as expected url.");
    }

}

