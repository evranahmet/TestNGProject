package clarusway.tests.smoke_test;

import clarusway.utilities.ExtentReportUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    public void positiveLoginTest() throws InterruptedException {

        ExtentReportUtils.createTestReport("Negative Test", "Wrong email");

        ExtentReportUtils.info("User goes tyo homepage");
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        ExtentReportUtils.pass("User is on the homepage");

        driver.findElement(By.id("email")).sendKeys("xyz@hotmail.com");
        ExtentReportUtils.passAndCaptureScreenshot("User entered email");

        driver.findElement(By.id("password")).sendKeys("Clarusway.123");
        ExtentReportUtils.passAndCaptureScreenshot("User entered password");

        driver.findElement(By.id("submit")).click();
        ExtentReportUtils.pass("User clicked on submit");

        Thread.sleep(200);
        WebElement errorMessage = driver.findElement(By.id("error"));
        assert errorMessage.isDisplayed();
        ExtentReportUtils.passAndCaptureScreenshot("User gets error message");

        ExtentReportUtils.flush();

    }
}
