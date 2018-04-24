package PrintTest;

import LoginTest.WrongPassword;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class successfulPrintTest extends TestCase {
    public void testMain(){
        successfulPrint login= new successfulPrint();
        WebDriver driver = login.function();
        assertEquals("chrome://print/3/0/print.pdf",driver.getPageSource());
        driver.close();



    }

}
