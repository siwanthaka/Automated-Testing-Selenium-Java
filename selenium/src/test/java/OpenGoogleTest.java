import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    @Test
    public void googleTest(){
            WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com/");
            Thread.sleep(3000);

            driver.get("https://twitter.com/login");
            Thread.sleep(3000);

            WebElement username = driver.findElement(By.name("text"));
            username.sendKeys("@Siwanthaka18900");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@role='button' and @type='button']//span[text()='Next']")).click();
            Thread.sleep(3000);

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("1234$#@!KKXx");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@role='button' and @type='button']//span[text()='Log in']")).click();
            Thread.sleep(5000);

            driver.get("https://x.com/DailyGTRTM/status/1936368831330390036");
            Thread.sleep(3000);

            driver.findElement(By.cssSelector("button[data-testid='retweet']")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@role='menuitem']//span[text()='Repost']")).click();
            Thread.sleep(3000);

            driver.get("https://x.com/home");
            Thread.sleep(3000);

            driver.get("https://x.com/Siwanthaka18900");
            Thread.sleep(3000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 700);");
            Thread.sleep(2000);










        } catch (Exception e) {
            e.printStackTrace();
        }


        }
    }

