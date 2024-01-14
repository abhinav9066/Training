import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo {

    WebDriver driver;
    @BeforeSuite
    public void setup(){
        driver= new ChromeDriver();
    }


         @DataProvider
         public Object[][] dataSet(){
             return new Object[][]
                     {
                             {"Student", "Password"},
                             {"yhhhhhh", "jjjjjjj"},
                             {"student", "Password123"}
                     };
         }

         @Test(dataProvider = "dataSet")
         public void test(String username,String password){
             driver.get("https://practicetestautomation.com/practice-test-login/");
             driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
             driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
             driver.findElement(By.xpath("//button[text()='Submit']")).click();
         }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}
