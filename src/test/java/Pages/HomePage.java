package Pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String homepageUrl = "https://www.flightexpert.com";

    // locators
    public By signin = By.xpath("//button[normalize-space()='Sign in']");
    public By profile = By.xpath("//p[text()='Profile']");
    public By flight = By.xpath("//span[@class='tab-options'][normalize-space()='Flight']");
    public By hotel = By.xpath("//span[contains(text(),'Hotel')]");
    public By visa = By.xpath("//span[@class='ms-1 tab-options']");
    public By esim = By.xpath("//button[@data-rr-ui-event-key='esim']");
    // radio buttons
    public By oneWay = By.cssSelector("#oneway");
    public By roundTrip = By.cssSelector("#roundtrip");
    public By multiCity = By.cssSelector("#multicity");

    public By regularFares = By.cssSelector(".bg-clr-light.fw-semi-bold.cursor-pointer.d-flex.align-items-center.px-md-3.px-2.py-2.ms-sm-1.is-radius-5.fare-type");
    public By studentFares = By.cssSelector(".bg-clr-light.fw-semi-bold.cursor-pointer.d-flex.align-items-center.px-md-3.px-2.py-2.ms-sm-1.is-radius-5.fare-type");
    public By seamanFares = By.cssSelector(".bg-clr-light.cursor-pointer.fw-semi-bold.d-flex.align-items-center.px-md-3.px-2.py-2.ms-1.is-radius-5.fare-type");

    // footer section
    // about
    public By about = By.xpath("//h3[normalize-space()='About']");
    public By aboutFlightExpertText = By.xpath("//span[normalize-space()='About Flight Expert']");
    public By aboutFlightExpertLink = By.xpath("//a[@href='/best-price-guarantee']");
    public By bestPriceGuaranteeLink = By.xpath("//span[normalize-space()='Best Price Guarantee']");
    public By bestPriceGuaranteeText = By.xpath("//a[@href='/best-price-guarantee']");
    public By termsAndConditionText = By.xpath("//span[normalize-space()='Terms and Conditions']");
    public By termsAndConditionLink = By.xpath("//a[@href='/terms-and-conditions']");
    public By privacyText = By.xpath("//span[normalize-space()='Privacy Policy']");
    public By privacyLink = By.xpath("//a[@href='/privacy-policy']");
    public By cookiePolicyText = By.xpath("//span[normalize-space()='Cookie Policy']");
    public By cookiePolicyLink = By.xpath("//a[@href='/terms-and-conditions']");
    public By blogText = By.xpath("//span[normalize-space()='Blog']");
    public By blogLink = By.cssSelector("a[href='https://blog.flightexpert.com/?_gl=1*o92alq*_gcl_au*NDU2MDU1MjI2LjE3NDA0NzI5MjUuMjAwMjU4MzgwNS4xNzQyNzQzMjk1LjE3NDI3NDMyOTQ.']");



    //copy right
    public By copyRight = By.xpath("//p[@class='fw-bold text-clr-blue-light text-center']");
}

