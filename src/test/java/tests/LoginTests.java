package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void checkPasswordToggle() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isPasswordMasked(), "Password should be masked initially");
        login.togglePasswordVisibility();
        Assert.assertFalse(login.isPasswordMasked(), "Password should be visible after toggle");
    }

    @Test(priority = 2)
    public void checkLoginButtonDisabled() {
        LoginPage login = new LoginPage(driver);
   
    }

    @Test(priority = 3)
    public void checkInvalidLoginShowsError() {
        LoginPage login = new LoginPage(driver);
        login.enterInvalidCredentials();
        Assert.assertTrue(driver.getPageSource().contains("Invalid") || 
                          driver.getPageSource().contains("error"),
                          "Error message should be shown on invalid login");
    }
}
