package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {
    String checkoutButton = "//*[@id=\"content\"]/div[3]/div[2]/a";

    public CartPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void goToCheckout() {
        click(By.xpath(checkoutButton));
    }
}
