package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

    String emailTextFieldName = "email";
    String passwordTextFieldName = "password";
    String loginButtonXPath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
    String registerButtonXPath = "//*[@id=\"content\"]/div/div[1]/div/a";

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void loginToTestStore(String email, String password) {
        writeText(By.name(emailTextFieldName), email);
        writeText(By.name(passwordTextFieldName), password);
        click(By.xpath(loginButtonXPath));
    }

    public void goToRegister() {
        click(By.xpath(registerButtonXPath));
    }

    public void verifyLoginEmail(String expectedText) {
        Assert.assertEquals(readText(By.xpath(loginButtonXPath)), expectedText);
    }

    public void verifyLoginPassword(String expectedText) {
        Assert.assertEquals(readText(By.xpath(passwordTextFieldName)), expectedText);
    }
}
