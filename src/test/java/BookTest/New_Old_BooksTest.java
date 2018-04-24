package BookTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class New_Old_BooksTest {
    @Test
    public void function() {
        New_Old_Books book= new New_Old_Books();
        WebDriver driver = book.function();
        assertEquals("http://localhost/library-master/member/new_books.php",driver.getCurrentUrl());
        driver.close();

    }
}