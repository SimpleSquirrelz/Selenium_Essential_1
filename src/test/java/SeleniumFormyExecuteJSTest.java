import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFormyExecuteJSTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();",closeButton);


        Thread.sleep(3000);

        driver.quit();
    }
}
