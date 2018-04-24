package logoutTest;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class logoutTest extends TestCase {
    public void testMain(){
        logout login= new logout();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member",driver.getCurrentUrl());
        driver.close();



    }

}
