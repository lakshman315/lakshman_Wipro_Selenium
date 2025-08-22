package step_definition;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

	public class Ebay_MultiSearch {

	    WebDriver driver;
	    Ebay_cucumberpageclass ebay;

	    @Given("the user is on the eBay homepage")
	    public void the_user_is_on_the_e_bay_homepage() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://www.ebay.com/");
	    }

	    @When("the user searches for {string},{string},{string}")
	    public void the_user_searches_for(String string, String string2, String string3)  throws InterruptedException {
	        ebay = new Ebay_cucumberpageclass(driver);
	        ebay.multipleSearches();
	    }

	    @Then("the search results should be displayed for each item")
	    public void the_search_results_should_be_displayed_for_each_item() {
	        System.out.println("Multiple searches completed.");
	        driver.quit();
	    }
	}

	

	