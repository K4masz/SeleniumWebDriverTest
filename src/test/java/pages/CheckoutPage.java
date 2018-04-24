package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BasePage {
    String newPaymentAddressRadioXPath = "//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input";

    String firstNamePaymentTextFieldId = "input-payment-firstname";
    String lastNamePaymentTextFieldId = "input-payment-lastname";
    String companyPaymentTextFieldId = "input-payment-company";
    String address1PaymentTextFieldId = "input-payment-address-1";
    String address2PaymentTextFieldId = "input-payment-address-2";
    String cityPaymentTextFieldId = "input-payment-city";
    String postalCodePaymentTextFieldId = "input-payment-postcode";
    String countryPaymentDropdownId = "input-payment-country";
    String zonePaymentDropdownId = "input-payment-zone";
    String continuePaymentAddressId = "button-payment-address";

    String newDeliveryAddressRadioXPath = "//*[@id=\"collapse-shipping-address\"]/div/form/div[3]/label/input";

    String firstNameShippingTextFieldId = "input-shipping-firstname";
    String lastNameShippingTextFieldId = "input-shipping-lastname";
    String companyShippingTextFieldId = "input-shipping-company";
    String address1ShippingTextFieldId = "input-shipping-address-1";
    String address2ShippingTextFieldId = "input-shipping-address-2";
    String cityShippingTextFieldId = "input-shipping-city";
    String postalCodeShippingTextFieldId = "input-shipping-postcode";
    String countryShippingDropdownId = "input-shipping-country";
    String zoneShippingDropdownId = "input-shipping-zone";
    String continueShippingAddressId = "button-shipping-address";

    String continueShippingMethodId = "button-shipping-method";

    String continuePaymentMethodXPath = "//*[@id=\"button-payment-method\"]";
    String termsAndConditionsCheckboxXPath = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]";

    String confirmOrderButtonId = "button-confirm";

    public CheckoutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void existingBillingDetails() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(continuePaymentAddressId)));
        click(By.id(continuePaymentAddressId));

    }

    public void newBillingAddress(String firstName, String lastName, String companyName, String address1, String address2, String city, String postCode, String countryDropdown, String zoneDropdown) {
        click(By.id(newPaymentAddressRadioXPath));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(firstNamePaymentTextFieldId)));
        writeText(By.id(firstNamePaymentTextFieldId), firstName);
        writeText(By.id(lastNamePaymentTextFieldId), lastName);
        writeText(By.id(companyPaymentTextFieldId), companyName);
        writeText(By.id(address1PaymentTextFieldId), address1);
        writeText(By.id(address2PaymentTextFieldId), address2);
        writeText(By.id(cityPaymentTextFieldId), city);
        writeText(By.id(postalCodePaymentTextFieldId), postCode);
        writeText(By.id(countryPaymentDropdownId), countryDropdown);
        writeText(By.id(zonePaymentDropdownId), zoneDropdown);
        click(By.id(continuePaymentAddressId));
    }

    public void existingDeliveryDetails() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(continueShippingAddressId)));
        click(By.id(continueShippingAddressId));
    }

    public void newShippingAddress(String firstName, String lastName, String companyName, String address1, String address2, String city, String postCode, String countryDropdown, String zoneDropdown) {
        click(By.xpath(newDeliveryAddressRadioXPath));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(firstNameShippingTextFieldId)));
        writeText(By.id(firstNameShippingTextFieldId), firstName);
        writeText(By.id(lastNameShippingTextFieldId), lastName);
        writeText(By.id(companyShippingTextFieldId), companyName);
        writeText(By.id(address1ShippingTextFieldId), address1);
        writeText(By.id(address2ShippingTextFieldId), address2);
        writeText(By.id(cityShippingTextFieldId), city);
        writeText(By.id(postalCodeShippingTextFieldId), postCode);
        writeText(By.id(countryShippingDropdownId), countryDropdown);
        writeText(By.id(zoneShippingDropdownId), zoneDropdown);
        click(By.id(continueShippingAddressId));
    }

    public void chooseDeliveryMethod() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(continueShippingMethodId)));
        click(By.id(continueShippingMethodId));
    }

    public void choosePaymentMethod() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(termsAndConditionsCheckboxXPath)));
        click(By.xpath(termsAndConditionsCheckboxXPath));
        click(By.xpath(continuePaymentMethodXPath));
    }

    public void confirmOrder() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(confirmOrderButtonId)));
        click(By.id(confirmOrderButtonId));
    }

}
