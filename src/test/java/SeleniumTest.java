import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Я вам сейчас покажу откуда на беларусь");
        element.submit();
        WebElement bel = driver.findElement(By.xpath("//div[@id='search']//a[position()=1]"));
        bel.click();
        WebElement start = driver.findElement(By.className("ytp-play-button"));
        start.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
