import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream
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

// userid: 'KEVIN.YANG'
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Oracle PeopleSoft Sign-in/input_User ID_userid'), 
    userid)

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Oracle PeopleSoft Sign-in/input_Password_pwd'), 
    password)

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Oracle PeopleSoft Sign-in/input_Select a Language_Submit'))

WebUI.maximizeWindow()

WebUI.waitForPageLoad(plt)

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Sign Out_PT_NAVBAR'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/div_Navigator_grouplet_PTNBPTN'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Global Payroll  Absence Mgmt'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Payee Data'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Create Overrides'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Supporting Elements'))

// emplID: '049764079'
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Empl ID_EMPLMT_SRCH_GBL_'), 
    emplID)

// search for emplID
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Case Sensitive_ICSearch'))

// click on '+' button to add a record
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/img'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_FT Support Vacation Carryove'))

// elementType: 'VR0'
WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/select_ BracketDateDurationFor'), 
   elementType, false)

// elementName: 'SN VAC SU CARY'
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Numeric Value_GP_PIN_NM_'), 
   elementName)

// try and focu somewhere to get PS to update screen with input fields after setting element from previous selection
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/select_ BracketDateDurationFor'))

// beginDate: '09/01/2018'
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr'), 
   beginDate)

//WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_1'), 
//    '09/01/2018')

// endDate: '09/01/2018'
//
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_2'), 
   endDate)

/*
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_4'), 
    '3.')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_5'), 
    '3.5')
*/

// numericValue 3.5
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_6'), 
    numericValue)

// save the record
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Seneca Sick Support Bal'))

// navigate to Payee Sections
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Sign out_pthdr2navbar'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/div_Navigator_grouplet_PTNBPTN'))

try 
{
   if (!WebUI.verifyElementVisible('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Main Menu'))
   {
	   WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/div_Navigator_grouplet_PTNBPTN'))
   }
} 
catch (Exception e) 
{
   WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/div_Navigator_grouplet_PTNBPTN'))
   //e.printStackTrace()
}

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Main Menu'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Global Payroll  Absence Mgmt'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Payee Data'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Create Overrides'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Payee Sections'))

// click on '+' for a new record
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/a_Last_ICField7new00'))

// effDate: '09/01/2018'
//
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Last_GP_PYE_SECTION1_EFF'), 
    payeeEffDate)

// status: Inactive
//WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/select_ActiveInactive'), 
//    'I', true)

// status: 'A', Active
//
WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/select_ActiveInactive'), 
   payeeStatus, false)

// sequenceNumber: clear the field
// 
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Recalculate_GP_PYE_SECT_'), 
   '')

// sequenceNumber: '10'
// 
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Recalculate_GP_PYE_SECT_'), 
   payeeSequenceNumber)

// elementType: 'VR0' - variable
//
WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/select_ Absence EntitlementAbs'), 
   payeeElementType, false)

/*
 * clicking image to bring up lookup box of dropdown selections
 * 
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/img_Recalculate_GP_PIN_NM_VW_P'))

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Element Name_GP_PIN_VR0_'), 
    'SN VAC')

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Description_ICSearch'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/a_SN VAC SU CARY'))
*/

// input the elementName: 'SN VAC SU CARY'
//
WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Recalculate_GP_PIN_NM_VW'), 
   payeeElementName)

// save the record
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_FT Support Vacation Carr'))

// close the session and close the browser
//
WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/a_Actions List Popup_pthdr2Act'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/span_Sign out'))

WebUI.closeBrowser()

