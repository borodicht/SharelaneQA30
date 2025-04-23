import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ZipCodeTest {

    /*
    1. Открыть брузер Chrome  ++++++
    2. В адресную строку ввести URL https://www.sharelane.com/cgi-bin/register.py и перейти по нему +++++
    3. В поле ZipCode ввести значение 1234
    4. Нажать кнопку Continue

    Expected result: Сообщение об ошибке с текстом Oops, error on page. ZIP code should have 5 digits
     */

    @Test
    public void checkZipCode4Digits() {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String actualErrorMessage = browser.findElement(By.className("error_message")).getText();
        Assert.assertEquals(actualErrorMessage, "Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }

    @Test
    public void checkZipCodeEmpty() {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String actualErrorMessage = browser.findElement(By.className("error_message")).getText();
        Assert.assertEquals(actualErrorMessage, "Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }
}
