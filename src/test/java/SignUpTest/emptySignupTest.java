package SignUpTest;

import LoginTest.WrongPassword;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class emptySignupTest extends TestCase {
    public void testMain(){
        emptySignup login= new emptySignup();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/success.php",driver.getCurrentUrl());
        driver.close();



    }

}
