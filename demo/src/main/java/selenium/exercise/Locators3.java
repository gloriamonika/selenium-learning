package selenium.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {
    public static void main(String[] args) {

        //absolute vs relative xpath:
        //absolute: /html/head/header
        //relative: the usual (e.g. //button[@text="abc"])
        WebDriver driver = new FirefoxDriver();

        //windows activities/manipulation
        driver.manage().window().maximize(); //preferred over .fullscreen();

        //can navigate to other url, useful when automation accesses different webpage
        driver.get("https://google.com");
        // navigation vs .get -> get waits until all the assets loaded, navigate waits until at least one element is visible then continue. can be managed by waits/sleep
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
        //navigate to previous page
        driver.navigate().back();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");

        //to find sibling element, can use the `/following-sibling::tagname` property: //header/div/button[1]/following-sibling::button -> finds the immediate next button element

        driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
        
        //to traverse down-top (child->parent), can use /parent::tagname property: /header/div/button[1]/parent::div
        String info = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
        System.out.println(info);
        
    }
}
