import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    WebDriver driver;

    @BeforeSuite
    public void setup(){
         driver = new ChromeDriver();
    }

//    @Test(groups = "abcd")
//    public void abcd(){
//        System.out.println("abcd");
//    }
//
//
//
//    @Test(groups = "efgh")
//    public void efgh(){
//        System.out.println("efgh");
//    }
//
//    @Test(groups = "efgh")
//    public void teleperformanceh(){
//        System.out.println("biscuit");
//    }


    @Test
    public void xyz(){
        SoftAssert softassert = new SoftAssert();
        String expectedTitle = "Google1";
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
//        softassert.assertEquals(actualTitle,expectedTitle);

        driver.findElement(By.xpath("aasdas")).isDisplayed();
        softassert.assertAll();
    }

    @AfterSuite
    public void Teardown(){
        driver.quit();
    }


}
