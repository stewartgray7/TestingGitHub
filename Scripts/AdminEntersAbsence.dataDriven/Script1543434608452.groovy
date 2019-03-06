import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

int evt = 30; // element Visible Time seconds (max wait time)
int plt = 30; // page Load Time seconds (max wait time)

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Oracle PeopleSoft Sign-in/input_User ID_userid'), 
    userid)

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Oracle PeopleSoft Sign-in/input_Password_pwd'), 
    password)

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Oracle PeopleSoft Sign-in/input_Select a Language_Submit'))

WebUI.maximizeWindow()

WebUI.waitForPageLoad(plt)

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_My Homepage/a_Sign Out_PT_NAVBAR'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_My Homepage/div_Navigator_grouplet_PTNBPTN'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_My Homepage/a_Global Payroll  Absence Mgmt'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_My Homepage/a_Payee Data'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_My Homepage/a_Maintain Absences'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_My Homepage/a_Absence Event'))

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Empl ID_EMPLMT_SRCH_GBL_'), 
    emplID)

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Empl Record_EMPLMT_SRCH_'), 
    emplIDRecordNum)

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Case Sensitive_ICSearch'))

try{
	
	WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/a_firstRecordReturned'))
}

catch(Exception e){
	
}

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/a_Approved_GP_ABS_EVENTnew00'))

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Sick_GP_PIN_NM_VW_PIN_NM'), 
    absenceTake)

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Sick_GP_ABS_EVENT_BGN_DT'), 
    beginDate)

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Sick_GP_ABS_EVENT_END_DT'), 
    endDate)

//WebUI.selectOptionByValue(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/select_NormalVoid'), 
//    'V', true)
WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/select_NormalVoid'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/select_NormalVoid'), 
    processAction, false)

WebUI.setText(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Approved_GP_ABS_EVENT_OR'), 
    originalBeginDate)

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/input_Entering Updating and Vo'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/a_Actions List Popup_pthdr2Act'))

WebUI.click(findTestObject('Object Repository/AdminEntersAbsence/Page_Absence Event/span_Sign out'))

WebUI.closeBrowser()

