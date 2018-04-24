package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegisterPage extends BasePage {

    String yesSubscriptionXPath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input";
    String noSubscriptionXPath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input";
    String continueButtonXPath = "//*[@id=\"content\"]/form/div/div/input[2]";
    String privacyPolicyAgreementCheckboxName = "agree";
    String passwordConfirmationTextFieldName = "confirm";
    String passwordTextFieldName = "password";
    String firstNameTextFieldName = "firstname";
    String lastnameNameTextFieldName = "lastname";
    String emailTextFieldName = "email";
    String telephoneTextFieldName = "telephone";

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void registerToTestStore(String firstName, String lastName, String email, String telephone, String password, String confirmPassword, boolean subscription, boolean privacyPolicyRead) {
        writeText(By.name(firstNameTextFieldName), firstName);
        writeText(By.name(lastnameNameTextFieldName), lastName);
        writeText(By.name(emailTextFieldName), email);
        writeText(By.name(telephoneTextFieldName), telephone);
        writeText(By.name(passwordTextFieldName), password);
        writeText(By.name(passwordConfirmationTextFieldName), confirmPassword);
        click(By.xpath(subscription ? yesSubscriptionXPath : noSubscriptionXPath));
        if (privacyPolicyRead) click(By.name(privacyPolicyAgreementCheckboxName));
        click(By.xpath(continueButtonXPath));
    }


    public void verifyRegisterUserName(String expectedText) {
        Assert.assertEquals(readText(By.name(firstNameTextFieldName)), expectedText);
    }

    public void verifyRegisterPassword(String expectedText) {
        Assert.assertEquals(readText(By.name(passwordTextFieldName)), expectedText);
    }

    public void verifyRegisterConfirmationPassword(String expectedText) {
        Assert.assertEquals(readText(By.name(passwordConfirmationTextFieldName)), readText(By.name(passwordTextFieldName)));
    }

    public void verifyRegisterFirstName(String expectedText) {
        Assert.assertEquals(readText(By.name(firstNameTextFieldName)), expectedText);
    }

    public void verifyRegisterLastName(String expectedText) {
        Assert.assertEquals(readText(By.name(lastnameNameTextFieldName)), expectedText);
    }

    public void verifyRegisterEmail(String expectedText) {
        Assert.assertEquals(readText(By.name(emailTextFieldName)), expectedText);
    }

    public void verifyRegisterTelephone(String expectedText) {
        Assert.assertEquals(readText(By.name(telephoneTextFieldName)), expectedText );
    }

    public void verifyRegisterPrivacyPolicy(boolean expectedValue) {
        Assert.assertEquals(readText(By.name(privacyPolicyAgreementCheckboxName)), expectedValue);
    }
}
