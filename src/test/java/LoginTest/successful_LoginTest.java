package LoginTest;


import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class successful_LoginTest extends TestCase {
    public void testMain(){
        successful_Login login= new successful_Login();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/dashboard.php",driver.getCurrentUrl());
        driver.close();



    }

}
