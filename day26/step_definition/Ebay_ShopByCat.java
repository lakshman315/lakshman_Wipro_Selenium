package step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Ebay_ShopByCat {

    WebDriver driver;
    Ebay_cucumberpageclass ebay;

    @Given("the user is on the eBay homepage to explore categories")
    public void user_on_homepage_to_explore_categories() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
    }

    @When("the user hovers over different categories")
    public void user_hovers_over_categories() throws InterruptedException {
        ebay = new Ebay_cucumberpageclass(driver);
        ebay.shopByCatTest();
    }

    @Then("the subcategories should be displayed")
    public void subcategories_should_be_displayed() {
        System.out.println("Subcategories revealed.");
        driver.quit();
    }
}