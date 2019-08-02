import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.olx.ua");
    }

    public void clickOnLoginButton() {
        driver.findElement(By.id("[id='se_userLogin']")).click();
    }

    public void pause() throws InterruptedException {
        Thread.sleep(4000);
    }

    public void fillUserForm() {
        driver.findElement(By.id("[id='userEmail']")).sendKeys("alexandramarush6@gmail.com");
        driver.findElement(By.id("[id='userPass']")).sendKeys("Lspjxrf1993");
        driver.findElement(By.id("id=['recaptcha-anchor']")).click();
    }

    public void clickOnMyProfile() {
        driver.findElement(By.id("[id=topLoginLink]")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(20.TimeUnit.SECONDS);
        driver.quit();
    }
}
