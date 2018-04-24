package SignUpTest;

import LoginTest.WrongPassword;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class signupTeacherTest extends TestCase {
    public void testMain(){
        signupTeacher login= new signupTeacher();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/success.php",driver.getCurrentUrl());
        driver.close();



    }
}
