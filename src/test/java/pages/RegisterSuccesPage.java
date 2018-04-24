package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterSuccesPage extends BasePage {
    String continueButtonXPath = "//*[@id=\"content\"]/div/div/a";

    public RegisterSuccesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void continueToMyAccount() {
        click(By.xpath(continueButtonXPath));
    }
}
