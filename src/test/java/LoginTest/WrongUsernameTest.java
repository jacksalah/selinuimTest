package LoginTest;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class WrongUsernameTest extends TestCase {
    public void testMain(){
        WrongUsername login= new WrongUsername();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/dashboard.php",driver.getCurrentUrl());
        driver.close();



    }

}
