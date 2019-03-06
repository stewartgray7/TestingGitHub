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

WebUI.navigateToUrl('https://hrerp-uatoc.senecacollege.ca/psp/ps/?cmd=login&languageCd=ENG&')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Oracle PeopleSoft Sign-in/input_User ID_userid'), 
    'KEVIN.YANG')

WebUI.setEncryptedText(findTestObject('Object Repository/VacationCarryOver/Page_Oracle PeopleSoft Sign-in/input_Password_pwd'), 
    '8ONjX3ggx5Swhsu1i0x+ew==')

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Oracle PeopleSoft Sign-in/input_Select a Language_Submit'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Sign Out_PT_NAVBAR'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/div_Navigator_grouplet_PTNBPTN'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Global Payroll  Absence Mgmt'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Payee Data'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Create Overrides'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_My Homepage/a_Supporting Elements'))

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Empl ID_EMPLMT_SRCH_GBL_'), 
    '049764079')

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Case Sensitive_ICSearch'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/img'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_FT Support Vacation Carryove'))

WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/select_ BracketDateDurationFor'), 
    'VR0', true)

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Numeric Value_GP_PIN_NM_'), 
    'SN VAC SU CARY')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr'), 
    '09/01/2018')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_1'), 
    '09/01/2018')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_2'), 
    '09/01/2018')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_4'), 
    '3.')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_5'), 
    '3.5')

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_FT Support Vacation Carr_6'), 
    '3.5')

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/input_Seneca Sick Support Bal'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Sign out_pthdr2navbar'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/div_Navigator_grouplet_PTNBPTN'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Main Menu'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Global Payroll  Absence Mgmt'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Payee Data'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Create Overrides'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Supporting Elements/a_Payee Sections'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/a_Last_ICField7new00'))

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Last_GP_PYE_SECTION1_EFF'), 
    '09/01/2018')

WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/select_ActiveInactive'), 
    'I', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/select_ActiveInactive'), 
    'A', true)

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Recalculate_GP_PYE_SECT_'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/select_ Absence EntitlementAbs'), 
    'VR0', true)

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/img_Recalculate_GP_PIN_NM_VW_P'))

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Element Name_GP_PIN_VR0_'), 
    'SN VAC')

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Description_ICSearch'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/a_SN VAC SU CARY'))

WebUI.setText(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_Recalculate_GP_PIN_NM_VW'), 
    'SN VAC SU CARY')

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/input_FT Support Vacation Carr'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/a_Actions List Popup_pthdr2Act'))

WebUI.click(findTestObject('Object Repository/VacationCarryOver/Page_Payee Sections/span_Sign out'))

WebUI.closeBrowser()

