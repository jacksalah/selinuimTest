package LoginTest;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class emptyUsernameTest extends TestCase {
    public void testMain(){
        emptyUsername login= new emptyUsername();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/",driver.getCurrentUrl());
        driver.close();



    }
}
