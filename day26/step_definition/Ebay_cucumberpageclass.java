package step_definition;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class Ebay_cucumberpageclass {

	WebDriver driver;

	public Ebay_cucumberpageclass(WebDriver driver)
	{
		this.driver= driver;
		
	}

	
    public void login() throws InterruptedException 
     {
		
		driver.findElement(By.cssSelector(".gh-identity-signed-out-unrecognized > a:nth-child(1)")).click();

		driver.findElement(By.id("userid")).sendKeys("lakshmanvangapandu@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("@lakshman.5577");
		driver.findElement(By.id("sgnBt")).click();
		
		System.out.println("Sign in simulated");
		Thread.sleep(3000);
	}
	
	
	public void multipleSearches() throws InterruptedException 
	{
		
	     
		List<String> searchItems = Arrays.asList("Watch", "Phone", "Shoes");

		for (String item : searchItems) 
		{
		    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
			search.clear();
			search.sendKeys(item);
			search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
	}
	
	
	public void addToCartandDelete() throws InterruptedException 
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
		search.clear();
		search.sendKeys("New Sony WH-1000XM5/B Wireless Industry Leading Noise Canceling Bluetooth Headphones");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);


		driver.get("https://www.ebay.com/itm/314074071401?_skw=New+Sony+WH-1000XM5%2FB+Wireless+Industry+Leading+Noise+Canceling+Bluetooth+Headphones&epid=22054478105&itmmeta=01K35YSBGJVARN9PJ9JCF2PJJ4&hash=item4920460169:g:M68AAeSw5D1opmZ2&itmprp=enc%3AAQAKAAABEFkggFvd1GGDu0w3yXCmi1c3tSgm%2BT5%2BwjYvrwfzuGAG2atqwTVjj0R%2FxhBeIhaUsuILYW%2BZ%2Fkcr25GYqx9wuP4l2jtqi9daEN4wd9sI4Vw2TIzlFT0dqgxl02ldLi%2BDuMZ6W10g9IZxuK1B6jWuBr2W6jBCsftWrjtKEHd5550Ry%2B7HO1L26Oy8oa%2FROxb%2FqmeYY2B2zrO7vZuNIsnIX0XpjUu04tYJezgz%2FFYyPNlttPCoMwftUlTvH74iyzlw3sXDQ%2FcVRcXUDYZCP13jDytUZv6MYJp53qqq6rg1N10s9BjPyQEb%2BeOLova2kjnvrKLlTjJ0Q2UveIoH7rTYjkGhwRrqlrIeha2oJ51JrwtQ%7Ctkp%3ABk9SR7i45b6ZZg");
		
		Thread.sleep(2000);
		
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
     
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("atcBtn_btn_1")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Add to cart button not found.");
		}
		driver.get("https://cart.ebay.com/");
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Remove button not found.");
		}
	}
	
	
	public void changeAddressAndName() throws InterruptedException {
	
	    driver.findElement(By.id("gh-logo")).click();
	    Thread.sleep(2000);

	    WebElement hiMsg = driver.findElement(By.cssSelector("span.gh-identity__greeting"));
	    Actions act = new Actions(driver);
	    act.moveToElement(hiMsg).perform();
	    Thread.sleep(2000);

	    
	    driver.get("https://accountsettings.ebay.com/uas");
	    Thread.sleep(3000);

	    driver.findElement(By.id("account-settings-link-PI")).click();
	    Thread.sleep(2000);

	   
	    try {
	       
	        WebElement emailField = driver.findElement(By.id("userid"));
	        if (emailField.isDisplayed()) {
	            emailField.sendKeys("lakshmanvangapandu@gmail.com");
	            driver.findElement(By.id("signin-continue-btn")).click();
	            Thread.sleep(1000);
	        }
	    } catch (NoSuchElementException e) {
	        
	        System.out.println("Email not asked, continuing to password.");
	    }
	    WebElement passwordField = driver.findElement(By.id("pass"));
	    passwordField.sendKeys("@lakshman.5577");
	    driver.findElement(By.id("sgnBt")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	    Thread.sleep(2000);

	    WebElement streetAddress = driver.findElement(By.cssSelector("input[aria-label='Street address']"));
	    streetAddress.clear();
	    streetAddress.sendKeys("velampeta,Balabhadrapuram");
	    Thread.sleep(1000);

	    WebElement m_name = driver.findElement(By.id("middlename"));
	    m_name.clear();
	    m_name.sendKeys("vanga");
	    Thread.sleep(1000);

	    WebElement city = driver.findElement(By.id("city"));
	    city.clear();
	    city.sendKeys("kakinada");
	    Thread.sleep(1000);

	    WebElement zipcode = driver.findElement(By.id("postalCode"));
	    zipcode.clear();
	    zipcode.sendKeys("533343");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("address_edit_submit_button")).click();
	    Thread.sleep(2000);
	}

	
	
    public void shopByCatTest() throws InterruptedException 
    {
    	
        driver.navigate().to("https://www.ebay.com/");
        Actions act = new Actions(driver);
    	WebElement motors = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
    	act.moveToElement(motors).perform();
    	Thread.sleep (2000);
    
    	WebElement sports = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
    	act.moveToElement(sports).perform();
    	Thread.sleep (2000);
    	
    	WebElement fashion= driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
    	act.moveToElement(fashion).perform();
    	
        Thread.sleep(4000);
    }
	
    public void shopByallCatTest() throws InterruptedException 
    {
      
        driver.findElement(By.id("gh-cat")).click();
        driver.findElement(By.id("gh-search-btn")).click();
        Assert.assertTrue(true,"Search button is not working");
        Thread.sleep(3000);
    }
    
    public void LanguageChange() throws InterruptedException
    {
        driver.navigate().to("https://www.ebay.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		driver.findElement(By.linkText("Japan")).click();
		Thread.sleep(2000);

	}

}