import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFormySwitchToActiveWindowTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement tabButton = driver.findElement(By.id("new-tab-button"));
        tabButton.click();

        String originalHandle = driver.getWindowHandle();

        for(String newHandle : driver.getWindowHandles())
            driver.switchTo().window(newHandle);

        Thread.sleep(2000);

        driver.switchTo().window(originalHandle);

        Thread.sleep(2000);

        driver.quit();
    }
}
