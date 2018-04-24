package BookTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class overDate {
    public overDate() {
    }

    public WebDriver function() {
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
        driver.get("http://localhost/library-master/member/return_search_form.php");
        //driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("from")).clear();
        driver.findElement(By.name("from")).sendKeys("2019-5-3");
        driver.findElement(By.name("to")).clear();
        driver.findElement(By.name("to")).sendKeys("2019-8-8");

        driver.findElement(By.name("search")).click();
        return driver;
    }
}
