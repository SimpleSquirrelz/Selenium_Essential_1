import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFormyKeypressTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Button pressed");

        WebElement submitButton = driver.findElement(By.id("button"));
        submitButton.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
