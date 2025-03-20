package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

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
}
