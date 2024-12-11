


package nmsTestcases;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nmsHelpers.NmsDataProvider;
import nmsHelpers.NmsDriver;
import nmsHelpers.NmsExtentReport;
import nmsModules.NmsLoginModule;

@Listeners(nmsHelpers.NmsListeners.class)
public class NmsLoginTestcase extends NmsDriver{
	
	int i=0;
    ExtentReports extent;
    ExtentTest test;
    NmsLoginModule login = new NmsLoginModule();
	
	@BeforeSuite
	public void loader() {
		load();
	}
	
	@BeforeClass 
	public void setUp() {
		NmsExtentReport.setupExtentReport();
	}
	

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
	
    @DataProvider(name = "ExcelData")
    public Object[][] excelData() throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\nms_automation.xlsx";
//        System.out.println(filePath);
        String sheetName = "Login";
        
        return NmsDataProvider.getExcelData(filePath, sheetName);
    }
    
    @Test(dataProvider = "ExcelData")
    public void authentication(String testId, String Description, String email, String password, String status, String orgId) throws TimeoutException {
//    	System.out.println("auth block");
    	NmsExtentReport.getTest().info("TC_ID: "+login.convertTcID(testId));
    	NmsExtentReport.getTest().info("Test Description: "+Description);
    	if(i==0) {
    		new NmsLoginModule().fieldOrgId(orgId).buttonContinue();
    		i++;
    	}
    	new NmsLoginModule()
    	.fieldEmail(email)
    	.fieldPassword(password)
    	.buttonLogin(status);
    }

}





