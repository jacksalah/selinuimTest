package HomeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Home {
    public Home() {
    }

    public WebDriver  function() {
        System.setProperty("webdriver.chrome.driver","B:/mozakra/third year/semester2/swe2/assigments/tools/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("jahidd26");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//ul[@class='nav']//li//a[@href='books.php']")).click();
        driver.findElement(By.cssSelector("div.navbar.navbar-fixed-top.navbar-inverse:nth-child(11) div.navbar-inner div.container div.nav-collapse.collapse ul.nav li:nth-child(1) > a:nth-child(1)")).click();
        return driver;




    }
}
