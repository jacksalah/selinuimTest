package SignUpTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class scriptincection {
    public WebDriver function()  {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","B:/mozakra/third year/semester2/swe2/assigments/tools/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("http://localhost/library-master/teacher_form.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("<script>alert(\"hello\")</script>");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("teacher1");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("teacher1");
        driver.findElement(By.name("gender")).sendKeys("male");
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("teacher");
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys("01677091339");
        driver.findElement(By.name("type")).sendKeys("teacher");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();

        driver.get("http://localhost//library-master//member");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("teacher1");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.cssSelector(".navbar-inner .container .divider-vertical .icon-group")).click();
        driver.findElement(By.cssSelector(".navbar-inner .container .divider-vertical .dropdown-menu .icon-user")).click();

   return driver;
    }
}
