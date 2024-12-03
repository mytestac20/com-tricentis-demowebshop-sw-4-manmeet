package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.TopMenuPage;
import com.tricentis.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest  extends TestBase {
    TopMenuPage menuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        menuPage.selectMenu("Books");
    }
}
