import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConfirmationPage;
import pages.FormPage;

import java.time.Duration;

public class SeleniumFormyFormTest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","P:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

//        driver.findElement(By.id("first-name")).sendKeys("first-name");
//        driver.findElement(By.id("last-name")).sendKeys("last-name");
//        driver.findElement(By.id("job-title")).sendKeys("job-title");
//        driver.findElement(By.id("radio-button-1")).click();
//        driver.findElement(By.id("checkbox-1")).click();
//        driver.findElement(By.cssSelector("option[value='1']")).click();
//        driver.findElement(By.id("datepicker")).sendKeys("01/01/2021");
//        driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
//        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
//        String alertText = alert.getText();
//        assertEquals(alertText,"The form was successfully submitted!");

        Thread.sleep(3000);
        driver.quit();
    }
}
