package SignUpTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emptySignup {
    public emptySignup() {
    }

    public WebDriver function() {
        System.setProperty("webdriver.chrome.driver","B:/mozakra/third year/semester2/swe2/assigments/tools/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("http://localhost/library-master/teacher_form.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(" ");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(" ");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(" ");
        driver.findElement(By.name("gender")).sendKeys(" ");
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(" ");
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys(" ");

        driver.findElement(By.name("type")).sendKeys(" ");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(" ");

        driver.findElement(By.name("submit")).click();



        return driver;


    }
}
