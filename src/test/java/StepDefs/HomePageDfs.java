package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import static Utilities.DriverSetup.getDriver;
import static StepDefs.Hooks.softAssert;
public class HomePageDfs {
    HomePage homePage = new HomePage();

    @Then("User should see the sign in button")
    public void userShouldSeeTheSignInButton() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.signin));
    }

    @And("Home page title should be {string}")
    public void homePageTitleShouldBe(String arg0) {
        softAssert.assertEquals(getDriver().getTitle(), arg0, "Mismatched title");
    }

    @And("Flight button should be displayed")
    public void flightButtonShouldBeDisplayed() throws InterruptedException {
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.flight));
    }

    @And("Flight button should be clickable")
    public void flightButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.flight));
    }

    @And("Hotel button should be displayed")
    public void hotelButtonShouldBeDisplayed() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.hotel));
    }

    @And("Hotel button should be clickable")
    public void hotelButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.hotel));
    }

    @And("Visa button should be displayed")
    public void visaButtonShouldBeDisplayed()throws InterruptedException {
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.visa));
    }

    @And("Visa button should be clickable")
    public void visaButtonShouldBeClickable()throws InterruptedException {
        softAssert.assertTrue(homePage.getEnableStatus(homePage.visa));
    }

    @And("eSim button should be displayed")
    public void esimButtonShouldBeDisplayed()throws InterruptedException {
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.esim));
    }

    @And("eSim button should be clickable")
    public void esimButtonShouldBeClickable()throws InterruptedException {
        softAssert.assertTrue(homePage.getEnableStatus(homePage.esim));
    }

    @And("One way radio button should be displayed")
    public void oneWayRadioButtonShouldBeDisplayed() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.oneWay));
    }

    @And("One way radio button should be selected by default")
    public void oneWayRadioButtonShouldBeSelectedByDefault() throws InterruptedException{
        softAssert.assertTrue(homePage.getSelectedStatus(homePage.oneWay));
    }

    @And("One way radio button should be clickable")
    public void oneWayRadioButtonShouldBeClickable()throws InterruptedException {
        softAssert.assertTrue(homePage.getEnableStatus(homePage.oneWay));
    }

    @And("Round trip radio button should be displayed")
    public void roundTripRadioButtonShouldBeDisplayed() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.roundTrip));
    }

    @And("Round trip radio button should be clickable")
    public void roundTripRadioButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.roundTrip));
    }

    @And("Multi city radio button should be displayed")
    public void multiCityRadioButtonShouldBeDisplayed()throws InterruptedException {
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.multiCity));
    }

    @And("Multi city radio button should be clickable")
    public void multiCityRadioButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.multiCity));
    }

    @Given("User on the home page")
    public void userOnTheHomePage() {
        homePage.loadAWebPage(homePage.homepageUrl);
    }

    @And("Regular fares radio button should be displayed")
    public void regularFaresRadioButtonShouldBeDisplayed() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.regularFares));
    }

    @And("Regular fares radio button should be clickable")
    public void regularFaresRadioButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.regularFares));
    }

    @And("Student fares radio button should be displayed")
    public void studentFaresRadioButtonShouldBeDisplayed() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.studentFares));
    }

    @And("Student fares radio button should be clickable")
    public void studentFaresRadioButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.studentFares));
    }

    @And("Seaman fares radio button should be displayed")
    public void seamanFaresRadioButtonShouldBeDisplayed() throws InterruptedException{
        softAssert.assertTrue(homePage.getDisplayStatus(homePage.seamanFares));
    }

    @And("Seaman fares radio button should be clickable")
    public void seamanFaresRadioButtonShouldBeClickable() throws InterruptedException{
        softAssert.assertTrue(homePage.getEnableStatus(homePage.seamanFares));
    }

    @Then("Hover to the footer section")
    public void hoverToTheFooterSection() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

//        homePage.hoverOnElement(homePage.copyRight);
    }

    @Then("Checking all links under About section")
    public void checkingAllLinksUnderAboutSection() throws InterruptedException {
        homePage.scrollIntoViewPoint(homePage.blogLink);
        softAssert.assertEquals(homePage.getElementText(homePage.about), "About", "About text mismatched");
        // about flight expert
        softAssert.assertEquals(homePage.getElementText(homePage.aboutFlightExpertText),"About Flight Expert", "About Flight Expert text mismatched");
        softAssert.assertTrue(homePage.getEnableStatus(homePage.aboutFlightExpertLink));
        homePage.clickOnElement(homePage.aboutFlightExpertLink);
        softAssert.assertEquals(getDriver().getTitle(), "About Us", "Title mismatched for About Flight Expert");
        softAssert.assertEquals(getDriver().getCurrentUrl(),"https://flightexpert.com/about-us");

        // back to home page and hover to footer section
//        homePage.navigateBack();
////        hoverToTheFooterSection();
//        homePage.scrollIntoViewPoint(homePage.copyRight);
//        // best price guarantee
//        softAssert.assertEquals(homePage.getElementText(homePage.bestPriceGuaranteeText),"Best Price Guarantee");
//        softAssert.assertTrue(homePage.getEnableStatus(homePage.bestPriceGuaranteeLink));
//        homePage.clickOnElement(homePage.bestPriceGuaranteeLink);
//        softAssert.assertEquals(getDriver().getTitle(),"Best Price Guarantee");
//        softAssert.assertEquals(getDriver().getCurrentUrl(),"https://flightexpert.com/best-price-guarantee");
//
//        // back to home page and hover to footer section
//        homePage.navigateBack();
////        hoverToTheFooterSection();

        //
    }

    @And("Checking all links under Help section")
    public void checkingAllLinksUnderHelpSection() {
    }
}
