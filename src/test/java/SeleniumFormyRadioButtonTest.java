import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFormyRadioButtonTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(1000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(1000);

        WebElement radioButton3 = driver.findElement(By.xpath("//div[3]/input"));
        radioButton3.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
