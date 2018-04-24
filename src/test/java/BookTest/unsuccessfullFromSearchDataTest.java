package BookTest;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class unsuccessfullFromSearchDataTest extends TestCase {
    public void testMain(){
        unsuccessfullFromSearchData login= new unsuccessfullFromSearchData();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/return_search.php",driver.getCurrentUrl());
        driver.close();



    }
}
