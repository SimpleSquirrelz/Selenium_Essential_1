import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumFormyWaitsTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        WebElement dropdownMenuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton")));
        dropdownMenuButton.click();



        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
