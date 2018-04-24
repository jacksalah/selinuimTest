package SignUpTest;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class scriptsignupTest extends TestCase {
    public void testMain() {
        scriptincection login = new scriptincection();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/success.php", driver.getCurrentUrl());
        driver.close();


    }
    }
