import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportDemo {

    public static void main(String[] args) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
        ExtentReports extent = new ExtentReports();

        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("Google search test","This is a test to validate google search");
        WebDriver driver = new ChromeDriver();
        test.log(Status.INFO,"starting testcase");
        driver.get("https://google.com");
        test.pass("navigated to google ");
        driver.findElement(By.name("q")).sendKeys("automation", Keys.ENTER);
        test.pass("pressed keyboard with an input");
        driver.close();
        driver.quit();
        test.pass("closed the browser");
        test.info("test completed");
        extent.flush();
    }
}
