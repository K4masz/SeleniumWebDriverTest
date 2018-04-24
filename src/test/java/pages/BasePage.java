package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
    public boolean isSelected(By elementLocation){
        return driver.findElement(elementLocation).isSelected();
    }

}