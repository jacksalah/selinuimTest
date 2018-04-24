package BookTest;

import LoginTest.WrongPasswordTest;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class succussfulSearchBOOKTest extends TestCase {
    public void testMain(){
        succussfulSearchBOOK login= new succussfulSearchBOOK();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/advance_search.php",driver.getCurrentUrl());
        driver.close();



    }
}
