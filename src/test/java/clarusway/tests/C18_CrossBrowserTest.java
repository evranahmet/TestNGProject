package clarusway.tests;

import clarusway.utilities.ParameterBrowserTestBase;
import org.testng.annotations.Test;

public class C18_CrossBrowserTest extends ParameterBrowserTestBase {

    @Test
    void test01(){
        driver.get("https://google.com");
        assert driver.getTitle().contains("Google");
    }

    @Test
    void test02(){
        driver.get("https://linkedin.com");
        assert driver.getTitle().contains("LinkedIn");
    }

    @Test
    void test03(){
        driver.get("https://clarusway.com");
        assert driver.getTitle().contains("Bootcamp");
    }

}
