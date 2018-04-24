package BookTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class BookSearchTest {
    @Test
    public void function() throws Exception {
        BookSearch book = new BookSearch();
        WebDriver driver=book.function();
        assertEquals("http://localhost/library-master/member/books.php",driver.getCurrentUrl());
        driver.close();
    }

}