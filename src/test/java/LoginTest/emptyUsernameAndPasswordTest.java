package LoginTest;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class emptyUsernameAndPasswordTest extends TestCase {
    public void testMain(){
        emptyUsernameAndPassword login= new emptyUsernameAndPassword();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/",driver.getCurrentUrl());
        driver.close();



    }
}
