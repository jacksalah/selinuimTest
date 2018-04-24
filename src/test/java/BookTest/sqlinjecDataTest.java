package BookTest;

import LoginTest.WrongPasswordTest;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class sqlinjecDataTest extends TestCase {

    public void testMain(){
        sqlinjecData login= new sqlinjecData();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/return_search_form",driver.getCurrentUrl());
        driver.close();



    }
}
