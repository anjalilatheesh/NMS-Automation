package nmsLocations;

import org.openqa.selenium.By;

public class NmsCreateProjLocaions {
	
	public By Admin = By.xpath("/html/body/app-root/div/ng-component/div[1]/aside/nms-sidebar/aside/div/div/nms-toggle-switcher/div/div[2]");
	public By ProjManagement = By.xpath("//*[text()='Project Management']");
    public By CreateProject=By.xpath("//button[@class='nms-button medium' and text()[normalize-space()='Create Project']]");
    
    public By Pname = By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-clients/div/nms-add-or-edit-project/form/p-dialog/div/div/div[2]/div/div[1]/input");
    
    public By Client = By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-clients/div/nms-add-or-edit-project/form/p-dialog/div/div/div[2]/div/div[2]/p-dropdown/div");
    public By optNintriva= By.xpath("//*[@id='pn_id_55_list']/p-dropdownitem[3]/li");
    public By optTrybond= By.xpath("//*[@id='pn_id_55_list']/p-dropdownitem[4]/li/span");
    
    public By Abbr = By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-clients/div/nms-add-or-edit-project/form/p-dialog/div/div/div[2]/div/div[3]/input");
//    
   
//    public By Sdate = By.xpath("//*[@id=\"fromDate\"]/span/input");
//    public By Edate = By.xpath("//*[@id=\"dateTo\"]/span/input");
//    public By Ehrs = By.xpath("//*[@id=\"integeronly\"]");
//    public By Tlead = By.xpath("//*[@id=\"multi\"]/div/div[2]/div");
//    public By Tassignees = By.xpath("//*[@id=\"multi\"]/div/div[2]/div");
//    public By Des = By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-clients/div/nms-add-or-edit-project/form/p-dialog/div/div/div[2]/div/div[8]/textarea");
//    public By Status = By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-clients/div/nms-add-or-edit-project/form/p-dialog/div/div/div[2]/div/div[9]/p-dropdown/div/span");
//    
    
    
    
    

}
