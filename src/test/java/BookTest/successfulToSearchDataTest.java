package BookTest;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class successfulToSearchDataTest extends TestCase {
    public void testMain(){
        successfulToSearchData login= new successfulToSearchData();
        WebDriver driver = login.function();
        assertEquals("http://localhost/library-master/member/date_search.php",driver.getCurrentUrl());
        driver.close();



    }
}
