package LoginTest;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class WrongUsernameAndPasswordTest extends TestCase {
    public void testMain(){
        WrongUsernameAndPassword login= new WrongUsernameAndPassword();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/dashboard.php",driver.getCurrentUrl());
        driver.close();



    }

}
