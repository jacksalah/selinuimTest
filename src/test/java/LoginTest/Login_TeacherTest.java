package LoginTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Login_TeacherTest {

    @Test
    public void function() {
        Login_Teacher T= new Login_Teacher();
        WebDriver driver = T.function();
        assertEquals("http://localhost/library-master/member/dashboard.php",driver.getCurrentUrl());
        driver.close();

    }
}