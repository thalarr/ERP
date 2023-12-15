import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web/Login/TC0101'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/span_Data Master_menu-arrow'))

WebUI.click(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/span_Country'))

WebUI.navigateToUrl('https://erp-dev.goorita.com/countries')

WebUI.click(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/button_Create'))

WebUI.setText(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/input_Name_name'), 'Singapore')

WebUI.setText(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/input_Code_code'), 'SIN')

WebUI.click(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/span_Choose currency'))

WebUI.click(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/button_Save changes'))

WebUI.click(findTestObject('Object Repository/Data Master/Country/Create/Page_GooritaERP/button_OK'))

