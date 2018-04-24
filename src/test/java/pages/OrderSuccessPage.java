package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderSuccessPage extends BasePage {

    String continueButtonXPath = "//*[@id=\"content\"]/div/div/a";

    public OrderSuccessPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void continueToHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(continueButtonXPath)));
        click(By.xpath(continueButtonXPath));
    }
}
