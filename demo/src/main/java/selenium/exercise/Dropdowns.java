package selenium.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        WebElement dd = driver.findElement(By.id("ct100_mainContent_DropDownListCurrency"));

        //select tag <select>, this is a static dropdown
        Select dropdown = new Select(dd);

        //select by index
        dropdown.selectByIndex(3);

        //select by visible text:
        dropdown.selectByVisibleText("AED");

        //select by value: selects by the value attribute, e.g.: <option value="USD">USD</option>
        dropdown.selectByValue("USD");

        //can get a first option:
        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.findElement(By.id("divpaxinfo")).click();
        
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        //can add validation to make sure the loop is correct:
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //dynamic dropdown: contents are loaded only after being interacted with
        //when two or more of the same xpath are located (e.g., departure and arrival cities), explicitly tell Selenium to select which xpath (can use indexing)
        //e.g.: driver.findElement(By.xpath("//a[@value='BDG'][2]")) -> selects the 2nd element with the selected xpath value

        

    }
    
}
