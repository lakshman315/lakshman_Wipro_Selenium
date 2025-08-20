package sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	 public static void main(String[] args) 
	 {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/buttons");

	        Actions actions = new Actions(driver);

	        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
	        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
	        WebElement singleClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));

	        actions.doubleClick(doubleClickBtn).perform();
	        String doubleClickMsg = driver.findElement(By.id("doubleClickMessage")).getText();
	        System.out.println("Double Click Message: " + doubleClickMsg);

	        actions.contextClick(rightClickBtn).perform();
	        String rightClickMsg = driver.findElement(By.id("rightClickMessage")).getText();
	        System.out.println("Right Click Message: " + rightClickMsg);

	        singleClickBtn.click();
	        String singleClickMsg = driver.findElement(By.id("dynamicClickMessage")).getText();
	        System.out.println("Single Click Message: " + singleClickMsg);

	        driver.quit();
	    }
	}



