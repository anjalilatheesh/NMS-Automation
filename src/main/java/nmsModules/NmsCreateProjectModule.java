package nmsModules;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import nmsHelpers.NmsDriver;
import nmsLocations.NmsCreateProjLocaions;
 
public class NmsCreateProjectModule extends NmsDriver {
 
	NmsCreateProjLocaions locator = new NmsCreateProjLocaions();
	
	public  NmsCreateProjectModule clickAdmin() throws InterruptedException {
		
		
		// TODO Auto-generated method stub //*[@id="overlay"]/div //*[@class='switcher-container']
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"overlay\"]/div")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='switcher-container']")));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.Admin)).click();
//			wait.until(ExpectedConditions.elementToBeClickable(locator.punchInButton)).click();
 
	          } catch (Exception e) {
	        System.err.println("Failed to click the Admin : " + e.getMessage());
	          }
		System.out.println("Admin");
		return this;
	}

 
	public  NmsCreateProjectModule clickProjManagement() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"overlay\"]/div")));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.ProjManagement)).click();
//			wait.until(ExpectedConditions.elementToBeClickable(locator.punchInButton)).click();
 
	          } catch (Exception e) {
	        System.err.println("Failed to click the ProjManagement : " + e.getMessage());
	          }
		System.out.println("The page is open");
		return this;
		
	    }
	
	public  NmsCreateProjectModule clickCreateProj() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.CreateProject)).click();
//			wait.until(ExpectedConditions.elementToBeClickable(locator.punchInButton)).click();
 
	          } catch (Exception e) {
	        System.err.println("Failed to click the Create Project : " + e.getMessage());
	          }
		System.out.println("The popup is open");
		return this;
		
	    }
	
	public NmsCreateProjectModule Pname(String projname) {	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"pn_id_85_list\"]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator.Pname)).sendKeys(projname);
		return this;	
	}
	
		
     public NmsCreateProjectModule Client(String client) throws InterruptedException {
	 
    	 try {
    		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"pn_id_85_list\"]")));
 	         wait.until(ExpectedConditions.visibilityOfElementLocated(locator.Client)).click(); // Replace with actual locator

 	              // Conditional logic for selecting the dropdown option
 	        
 	              if (client.equals("NINTRIVA")) {
 	                  wait.until(ExpectedConditions.visibilityOfElementLocated(locator.optNintriva)).click(); // Replace with actual XPath
 	              } else if (client.equals("Trybond")) {
 	                  wait.until(ExpectedConditions.visibilityOfElementLocated(locator.optTrybond)).click(); // Replace with actual XPath
 	              } else {
 	                  System.out.println("Client option not recognized: " + client);
 	              }
 	          } catch (Exception e) {
 	              System.out.println("Error selecting client: " + client + " - " + e.getMessage());
 	          }

 	          return this;
 	      }
     
 	        
     public NmsCreateProjectModule Abbr(String abb) {	
 		wait.until(ExpectedConditions.visibilityOfElementLocated(locator.Pname)).sendKeys(abb);
 		return this;	
 	}
     
	  
      
	
	
	
     
	
	
	
	
	
	
	

	public String convertTcID(String testId) {
		// TODO Auto-generated method stub
		return null;
	}
	}
 