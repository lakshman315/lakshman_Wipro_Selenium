package step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Ebay_LanguageChange {

    WebDriver driver;
    Ebay_cucumberpageclass ebay;

    @Given("the user is on the eBay homepage to change language")
    public void user_on_homepage_to_change_language() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
    }

    @When("the user scrolls down and changes country to Italy")
    public void user_changes_country_to_italy() throws InterruptedException {
        ebay = new Ebay_cucumberpageclass(driver);
        ebay.LanguageChange();
    }

    @Then("the site should switch to Italian version")
    public void site_should_be_in_italian() {
        System.out.println("Language changed to Italian.");
        driver.quit();
    }
}