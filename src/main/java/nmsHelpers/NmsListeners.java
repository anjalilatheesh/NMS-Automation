package nmsHelpers;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NmsListeners implements ITestListener {
	@Override
    public void onStart(ITestContext context) {
        NmsExtentReport.setupExtentReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
//    	String testName = result.getMethod().getMethodName();
//    	System.out.println("Starting test: " + testName); 
//    	System.out.println("Creating ExtentTest for: " + result.getMethod().getMethodName());
        NmsExtentReport.createTest(result.getMethod().getMethodName());
    }
    
    

    @Override
    public void onTestSuccess(ITestResult result) {
        if (NmsExtentReport.getTest() != null) {
            NmsExtentReport.getTest().pass("Test Passed: " + result.getMethod().getMethodName());
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
//    	System.out.println("Handling failure for: " + result.getMethod().getMethodName());
        if (NmsExtentReport.isTestInitialized()) {
            NmsExtentReport.getTest().fail("Test Failed: " + result.getThrowable());

            WebDriver driver = NmsDriver.driver;
            if (driver != null) {
                String screenshotPath = NmsExtentReport.captureScreenshot(driver, result.getMethod().getMethodName());
                
                // Attach the captured screenshot to the report
                if (screenshotPath != null) {
                    NmsExtentReport.attachScreenshotToReport(driver, screenshotPath);
                } else {
                    System.err.println("Screenshot capture failed for method: " + result.getMethod().getMethodName());
                }
            }
        } else {
            System.err.println("ExtentTest is null. Ensure createTest() was called in onTestStart().");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        if (NmsExtentReport.getTest() != null) {
            NmsExtentReport.getTest().skip("Test Skipped: " + result.getMethod().getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        NmsExtentReport.flush();
    }


}
