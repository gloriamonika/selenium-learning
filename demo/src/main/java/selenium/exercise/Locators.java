package selenium.exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static String getPassword(WebDriver driver){
       String passwordTxt = driver.findElement(By.cssSelector("form p")).getText();
       //get the password
       String[] passwordPart = passwordTxt.split("'");
       return passwordPart[1];
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        
        //find by id, can find by other things (e.g., xpath, class, etc)
        driver.findElement(By.id("inputUsername")).sendKeys("gloria"); 
        //type gloria inside the id inputUsername

        //find by name
        driver.findElement(By.name("inputPassword")).sendKeys("12345");
        driver.findElement(By.className("submit")).click();

        //find by css class
        //constructing css class selector: tagname.classname -> if ID, change (.) to (#)
        //e.g.: <p class="error">this is an error</p> -> the css class selector will be p.error
        //e.g.: <p id=info">this is an info</p> -> the css id selector will be p#info

        //generic css class selector: tagname[attribute='value'] -> if there's no id or class, can be helpful for more generic classes such as classes generated by bootstrap
        //e.g.: <input type="text" placeholder="search" value=""/> -> css selector will be input[placeholder="search"], OR input[type="text"]. but due to Selenium's behaviour (reads from top to bottom and then select the first matching element), selector HAS TO be unique. selectorhub (chrome extension) can help determining whether the selector is unique.

        //implicit wait -> requires Duration, is needed to wait for *elements* to appear
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String errorMsg =  driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(errorMsg);

        //link text locator, enables user to click on link by passing the title of the link
        driver.findElement(By.linkText("Forgot your password?")).click();

        //for SPAs can add delay (1s) or something
        Thread.sleep(5000);

        //construct xpath via html properties -> //tagname[@attribute='value']
        //e.g.: <input type="text" placeholder="search" value=""/> -> xpath selector will be //input[@placeholder="search"]
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("gloria@email.com");

        //xpath enables indexing, starts with 1
        //driver.findElement(By.xpath("//input[@text][2]")).clear(); //clear removes all the content inside
        //css selector also enables indexing, use :nth-child(n), starts with 1 -> css selector sees any hidden attribute, xpath ignores the attribute
        //driver.findElement(By.cssSelector("input[type='text'].nth-child(3)")).sendKeys("gloria@email.com");

        //to trace the html tree in case there's no identifier, can use the following xpath format: //parent/child
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("0812345678900");
        
        //this will return the 'element click intercepted' error
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String info = driver.findElement(By.cssSelector("form p")).getText();
        System.out.println(info);

        String password = getPassword(driver);
        System.out.println(password);
        Thread.sleep(1000);
        //or can try finding by combining all the selectors -> not recommended, concise and easy to read (and understand) selectors are recommended instead
        driver.findElement(By.className("go-to-login-btn")).click(); 
        //driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        //or can try finding by regex, all regex rules should apply
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);

        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
        //can also use contains keyword to find any and all elements matching with the passed string (e.g., submit)
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.close();

    }
}