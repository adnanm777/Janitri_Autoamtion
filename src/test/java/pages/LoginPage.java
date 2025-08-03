package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By emailInput = By.xpath("//input[@id='formEmail']");
    By passwordInput = By.xpath("//input[@id='formPassword']");
    By loginBtn = By.xpath("//button[@class=\"login-button\"]");
    By eyeIcon = By.xpath("//img[@alt='Password Not Visible']");
    By errorMsg = By.xpath("//div[contains(@class, 'text-red')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginBtn).isEnabled();
    }

    public boolean isPasswordMasked() {
        return driver.findElement(passwordInput).getAttribute("type").equals("password");
    }

    public void togglePasswordVisibility() {
        driver.findElement(eyeIcon).click();
    }

    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passField.clear();
        passField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void loginWithValidCredentials(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public void enterInvalidCredentials() {
        loginWithValidCredentials("adnan@test.com", "adnan123pass");
    }

    public String getErrorMessage() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg)).getText();
        } catch (Exception e) {
            return "No error message displayed";
        }
    }

    public void clearFields() {
        driver.findElement(emailInput).clear();
        driver.findElement(passwordInput).clear();
    }
}
