import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFormyAutocompleteTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocompleteField = driver.findElement(By.id("autocomplete"));
        autocompleteField.sendKeys("1555 Park Blvd");
        autocompleteField.click();



        Thread.sleep(2000);

        driver.quit();
    }
}
