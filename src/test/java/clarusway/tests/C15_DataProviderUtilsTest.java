package clarusway.tests;

import clarusway.utilities.DataProviderUtils;
import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class C15_DataProviderUtilsTest extends TestBase {

    @Test(dataProvider = "usernamePassword", dataProviderClass = DataProviderUtils.class)
    void parameterizedTest(String username, String password) {

//Go to https://testpages.eviltester.com/styled/basic-html-form-test.html
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

//Enter username
        driver.findElement(By.name("username")).sendKeys(username);

//Enter password
        driver.findElement(By.name("password")).sendKeys(password);

//Click submit
        driver.findElement(By.xpath("//input[@value='submit']")).click();

//Verify username
        String usernameText = driver.findElement(By.id("_valueusername")).getText();
        assertEquals(username, usernameText);

    }

}
