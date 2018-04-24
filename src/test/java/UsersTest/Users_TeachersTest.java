package UsersTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Users_TeachersTest {

    @Test
    public void function() {
        Users_Teachers teacher= new Users_Teachers();
        WebDriver driver = teacher.function();
        assertEquals("http://localhost/library-master/member/teacher.php",driver.getCurrentUrl());
        driver.close();
    }
}