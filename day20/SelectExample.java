package sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Actions act = new Actions(driver);
		WebElement sel_dropdown = driver.findElement(By.id("oldSelectMenu"));
		act.click(sel_dropdown).perform();
		Thread.sleep(1000);
		WebElement blue = driver.findElement(By.cssSelector("#oldSelectMenu option[value='1']"));
		blue.click();
		
		
			String [] colors = {"Red","Blue","Green"};
			WebElement color = driver.findElement(By.id("react-select-4-input"));
			for(String c : colors)
			{
				color.sendKeys(c);
				color.sendKeys(Keys.ENTER);
			}
			driver.close();
		

	}

}


