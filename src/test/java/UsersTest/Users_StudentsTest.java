package UsersTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Users_StudentsTest {

    @Test
    public void function() {
        Users_Students user= new Users_Students();
        WebDriver driver = user.function();
        assertEquals("http://localhost/library-master/member/student.php",driver.getCurrentUrl());
        driver.close();
    }
}