package genericUtility;

public interface IPathConstant {
	String PROPERTY_FILE_PATH = "./src/test/resources/testData/vtigerPropertyData.properties";
	String EXCEL_FILE_PATH = "E:\\eclipse-workspace_lastPtoject\\vTiger\\src\\test\\resources\\testData\\vtigerData.xlsx";
	
	String SCREENSHOT_FILE_PATH = "./src/test/resources/screenshots/";
	
	String LEADS_SHEET_NAME = "Leads";
	String ORGANIZATION_SHEET_NAME = "Orgnazation";
	String CAMPAIGN_SHEET_NAME = "Campaign";
	String OPPORTUNITIES_SHEET_NAME = "Opprtunities";


	int IMPLICIT_WAIT = 20;
	int EXPLICIT_WAIT = 20;
	
	String JAVASCRIPT_COMMAND_FOR_CLICK = "arguments[0].click()";
	
	String DATA_BASE_URL = "jdbc:mysql://localhost:3306/vtiger2";
	String DATA_BASE_USERNAME = "root";
	String DATA_BASE_PASSWORD = "root";

	


}
