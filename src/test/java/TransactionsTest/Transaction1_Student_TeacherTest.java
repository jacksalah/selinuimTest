package TransactionsTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Transaction1_Student_TeacherTest {

    @Test
    public void function() {
        Transaction1_Student_Teacher book= new Transaction1_Student_Teacher();
        WebDriver driver = book.function();
        assertEquals("http://localhost/library-master/member/return.php",driver.getCurrentUrl());
        driver.close();

    }
}