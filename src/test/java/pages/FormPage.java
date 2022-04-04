package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("first-name");
        driver.findElement(By.id("last-name")).sendKeys("last-name");
        driver.findElement(By.id("job-title")).sendKeys("job-title");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("01/01/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
