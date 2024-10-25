package selenium.exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //ChromeDriver driver = new ChromeDriver(); -> less flexible but more detailed and in depth, as it gives access to specific methods available only to Chrome

        //invoke browser manually, results in faster execution and more specific version of the Chrome (maybe needed to support older releases)
        //System.setProperty("webdriver.chrome.drive", "path to chromedriver.exe");

        //invoke browser via selenium manager
        WebDriver driver = new ChromeDriver(); //-> more generic but gives more flexibility to adapt the code for cross browser compabilities
        driver.get("//tumblr.com");
        driver.close();

      
        
    }
}