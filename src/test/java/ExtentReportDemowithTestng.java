import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

public class ExtentReportDemowithTestng {

    @BeforeSuite
    public void setup() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
        ExtentReports extent = new ExtentReports();

        extent.attachReporter(htmlReporter);
    }

    @Test
    public void test1() {


    }


    @AfterSuite
    public void tearDown() {


    }


}
