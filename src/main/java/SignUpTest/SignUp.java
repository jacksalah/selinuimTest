package SignUpTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    public SignUp() {
    }

    public WebDriver function() {
        System.setProperty("webdriver.chrome.driver","B:/mozakra/third year/semester2/swe2/assigments/tools/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("http://localhost/library-master/student_form.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("sandra");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Erian");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("sandra");
        driver.findElement(By.name("gender")).sendKeys("female");
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("maadi");
        driver.findElement(By.name("roll")).clear();
        driver.findElement(By.name("roll")).sendKeys("ds");
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("maadi");
        driver.findElement(By.name("roll")).clear();
        driver.findElement(By.name("roll")).sendKeys("ds");
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys("mafhedradi");

        driver.findElement(By.name("type")).sendKeys("student");
        driver.findElement(By.name("roll")).sendKeys("ds");
        driver.findElement(By.name("contact")).clear();
        driver.findElement(By.name("contact")).sendKeys("mafhedradi");

        driver.findElement(By.name("type")).sendKeys("student");
        driver.findElement(By.name("year_level")).sendKeys("First Year");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1234");

        driver.findElement(By.name("submit")).click();
        driver.get("http://localhost/library-master/member/");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("sandra");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("1234");

        driver.findElement(By.name("submit")).click();


        return driver;


    }
}
