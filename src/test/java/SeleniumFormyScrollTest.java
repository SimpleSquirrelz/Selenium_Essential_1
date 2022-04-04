import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumFormyScrollTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        Actions actions = new Actions(driver);

        WebElement nameField = driver.findElement(By.id("name"));
        actions.moveToElement(nameField);
        nameField.sendKeys("Name");

        WebElement dateField = driver.findElement(By.id("date"));
        dateField.sendKeys("09282001");

        Thread.sleep(2000);

        driver.quit();
    }
}
