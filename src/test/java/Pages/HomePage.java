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
}
