package selenium.exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    //this method is accessed via Basics.java
    public int add(int a, int b){
        return a+b;
    }

    //private methods can only be accessed by other methods in current class (i.e., in the 'Main' class)
    private int subtract(int a, int b){
        return b-a;
    }

    public static int multiply(int a, int b){
        //static gives the class-level access (can be called without declaring new object)
        return a * b;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.subtract(1, 5);

        multiply(10, 10); //as opposed to m.multiply(a, b)
        
        //ChromeDriver driver = new ChromeDriver(); -> less flexible but more detailed and in depth, as it gives access to specific methods available only to Chrome

        //invoke browser manually, results in faster execution and more specific version of the Chrome (maybe needed to support older releases)
        //System.setProperty("webdriver.chrome.drive", "path to chromedriver.exe");
        
        //invoke Firefox via GeckoDriver
        //System.setProperty("webdriver.gecko.driver", "path to geckodriver.exe");

        //invoke Edge via EdgeDriver
        // System.setProperty("webdriver.edge.driver", "path to edgedriver");
        
        //invoke browser via selenium manager
        WebDriver driver = new ChromeDriver(); //-> more generic but gives more flexibility to adapt the code for cross browser compabilities
        // WebDriver driver = new FirefoxDriver();
        driver.get("//tumblr.com");
        driver.getCurrentUrl();
        driver.getPageSource();

        //close the current window, will close the browser if it's the last window available
        // driver.close();

        //closes *the browser*
        driver.quit();

      
        
    }
}