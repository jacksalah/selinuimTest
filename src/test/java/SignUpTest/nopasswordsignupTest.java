package SignUpTest;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class nopasswordsignupTest extends TestCase {
    public void testMain(){
        nopasswordsignup login= new nopasswordsignup();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master",driver.getCurrentUrl());
        driver.close();



    }

}
