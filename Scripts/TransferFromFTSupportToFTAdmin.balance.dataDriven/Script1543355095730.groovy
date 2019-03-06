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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Oracle PeopleSoft Sign-in/input_User ID_userid'), 
    userid)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Oracle PeopleSoft Sign-in/input_Password_pwd'), 
    password)

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Oracle PeopleSoft Sign-in/input_Select a Language_Submit'))

WebUI.maximizeWindow()

// menu bar navigation to Adjust Balances - Absences search
//
WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_My Homepage/a_Sign Out_PT_NAVBAR'))

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_My Homepage/div_Navigator_grouplet_PTNBPTN'))

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_My Homepage/a_Global Payroll  Absence Mgmt'))

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_My Homepage/a_Payee Data'))

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_My Homepage/a_Adjust Balances'))

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_My Homepage/a_Absences'))

// enter emplID and info to search
// 
WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Empl ID_GP_PI_MNL_AE_VW_'), 
    emplID)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Pay Group_GP_PI_MNL_AE_V'), 
    payGroup)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Calendar ID_GP_PI_MNL_AE'), 
    calendarID)


// find emplID - form to update
//
WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Case Sensitive_ICSearch'))


// fill-in fields
//
WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Comments_GP_PIN_NM_VW_PI'), 
   elementName)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI'), 
    balanceAdjust)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_1'), 
    beginDate)

/*
WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_2'), 
    '08/02/2018')

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_3'), 
    '08/02/2018')

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_4'), 
    '08/0/2018')

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_5'), 
    '08/02/2018')
*/

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_6'), 
    endDate)

WebUI.setText(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_GP_PI_7'), 
    comment)

// save the record
//
WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/input_Vacation - Support_ICSav'))

// logout and close the browser
//
WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/a_Actions List Popup_pthdr2Act'))

WebUI.click(findTestObject('Object Repository/TransferFromFTSupportToFTAdmin.balance/Page_Absences/span_Sign out'))

WebUI.closeBrowser()

