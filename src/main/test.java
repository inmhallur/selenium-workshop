import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

    protected WebDriver driver;
    @Test
    public void implicitWaitExcercise()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // launch Chrome and redirect it to the URL
       	driver.get("https://demoqa.com/dynamic-properties");

        //This element will appear after 5 secs
	driver.findElement(By.id("visibleAfter")).click();

        //close browser
        driver.close();
    }
}
