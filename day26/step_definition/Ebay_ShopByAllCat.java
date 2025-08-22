package step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Ebay_ShopByAllCat {

    WebDriver driver;
    Ebay_cucumberpageclass ebay;

    @Given("the user is on eBay homepage to shop by all categories")
    public void user_on_homepage_for_all_categories() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
    }

    @When("the user selects all categories and performs search")
    public void user_selects_all_categories_and_searches() throws InterruptedException {
        ebay = new Ebay_cucumberpageclass(driver);
        ebay.shopByallCatTest();
    }

    @Then("search results from all categories should appear")
    public void search_results_from_all_categories() {
        System.out.println("Search across all categories successful.");
        driver.quit();
    }
}