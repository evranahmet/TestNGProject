package clarusway.homeWork;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class homeWork26 extends TestBase {
//Create 5 users by using Data Provider on https://thinking-tester-contact-list.herokuapp.com/addUser

    @Test(dataProvider = "usernamePassword")
    void dataProviderTest(String firtsname, String lastname ,String birthdate ,String email,String phone ,String street1 ,String city ,String country) {

        System.out.println("username = " + firtsname);
        System.out.println("password = " + lastname);
        System.out.println("birthdate = " + birthdate);
        System.out.println("email = " + email);
        System.out.println("phone = " + phone);
        System.out.println("street1 = " + street1);
        System.out.println("city = " + city);
        System.out.println("country = " + country);
    }
    @DataProvider
    public String[][] usernamePassword() {

        String[][] arr = {
                {"john_doe", "John.123"},
                {"mary_star", "Mary.123"},
                {"mehmet_kan", "Mehmet.123"}
        };

        return arr;
    }

    @Test
    void homeWork26() throws InterruptedException {

        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        driver.findElement(By.id("firstName")).sendKeys("aaa");
        driver.findElement(By.id("lastName")).sendKeys("bbb");
        driver.findElement(By.id("email")).sendKeys("gfd6rdf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1234567");
        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='add-contact']")).click();


        driver.findElement(By.id("firstName")).sendKeys();
        driver.findElement(By.id("lastName")).sendKeys("Evran");
        driver.findElement(By.id("birthdate")).sendKeys("1985/03/24");
        driver.findElement(By.id("email")).sendKeys("ahmt.evrn.64@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("0123456789");
        driver.findElement(By.id("street1")).sendKeys("Kemalöz Mahallesi");
        driver.findElement(By.id("city")).sendKeys("Uşak");
        driver.findElement(By.id("country")).sendKeys("Türkiye");
        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();

    }

}