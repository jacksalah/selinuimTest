package SignUpTest;

import LoginTest.WrongPassword;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class unsuccefulsignupTest extends TestCase {
    public void testMain(){
        unsuccefulsignup login= new unsuccefulsignup();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/success.php",driver.getCurrentUrl());
        driver.close();



    }

}
