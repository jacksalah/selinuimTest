package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Teacher {
    public Login_Teacher() {
    }

    public WebDriver function() {
        System.setProperty("webdriver.chrome.driver","B:/mozakra/third year/semester2/swe2/assigments/tools/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("http://localhost/library-master/member/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("root");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1234");

        driver.findElement(By.name("submit")).click();
        return driver;




    }
}
