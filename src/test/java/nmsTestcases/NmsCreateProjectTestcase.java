package nmsTestcases;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nmsHelpers.NmsDataProvider;
import nmsHelpers.NmsDriver;
import nmsHelpers.NmsExtentReport;
import nmsModules.NmsCreateProjectModule;


@Listeners(nmsHelpers.NmsListeners.class)

public class NmsCreateProjectTestcase extends NmsDriver {
	
	ExtentReports extent;
    ExtentTest test;
    NmsCreateProjectModule CreateProject = new NmsCreateProjectModule();
	
	
    @DataProvider(name = "ExcelData")
    public Object[][] excelData() throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\nms_automation.xlsx";
//        System.out.println(filePath);
        String sheetName = "CreateProject";
        
        return NmsDataProvider.getExcelData(filePath, sheetName);
    }
    
    @Test(dataProvider = "ExcelData")
    public void createProject(String testId, String Description, String projname,String client,String abb,String sDate,String eDate,String eHrs,String tLead,String tAssignees,String des,String status,String billProject,String result) throws InterruptedException {
//    	System.out.println("auth block");
    	System.err.println("Inside testcase-1");
    	NmsExtentReport.getTest().info("TC_ID: "+CreateProject.convertTcID(testId));
     	NmsExtentReport.getTest().info("Test Description: "+Description);
    	
    	System.err.println("Inside testcase-2");
	    new NmsCreateProjectModule()
	    .clickAdmin()
	    .clickProjManagement()
	    .clickCreateProj()
	    .Pname(projname)
	    .Client(client);
    
    }
}
