package BookTest;

import LoginTest.WrongPasswordTest;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class overDateTest extends TestCase {

    public void testMain(){
        overDate login= new overDate();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/date_search.php",driver.getCurrentUrl());
        driver.close();



    }
}
