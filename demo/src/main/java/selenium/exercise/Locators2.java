package selenium.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String name = "gloria";
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys(name); 
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        //useful when we need to navigate to different page. tells the code to wait (aka blocks the execution until wait is done)
        Thread.sleep(2000);

        //or can use explicit wait with WebDriverWait
        // Webdriver wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        String greeting = driver.findElement(By.tagName("h2")).getText();
        String information = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(information, "You are successfully logged in.");
        Assert.assertEquals(greeting, "Hello " + name + ",");
        
    }
    
}
