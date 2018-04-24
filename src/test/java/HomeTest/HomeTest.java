package HomeTest;

import BookTest.New_Old_Books;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class HomeTest{

    @Test
    public void function() {
        Home H= new Home();
        WebDriver driver = H.function();
        assertEquals("http://localhost/library-master/member/dashboard.php",driver.getCurrentUrl());
        driver.close();

    }
}