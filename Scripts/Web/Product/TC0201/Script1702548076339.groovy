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

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/span_Product_menu-arrow'))

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/span_Product List'))

WebUI.navigateToUrl('https://erp-dev.goorita.com/products')

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/a_Create Product'))

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/div_Upload Product_imageContainer1'))

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__name'), 'Daging Ikan Fresh')

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/span_Select Category'))

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/li_Select Category'))

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/span_Select Brand'))

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/textarea_Description_description'), 'Ini adalah deskripsinya untuk produk daging')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__sku_is'), 'S001')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__weight_is'), '')

WebUI.selectOptionByValue(findTestObject('Object Repository/Product/Create/Page_GooritaERP/select_GramsK.GLML'), 'KG', true)

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__weight_is'), '1')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__hs_code_is'), 'HS001')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__barcode_is'), '123456')

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/span_Select Unit'))

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input_Box_quantity_per_unit'), '1')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input_IDR_price_is'), '45000')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__stock_is'), '50')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__weight'), '1')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input__length'), '30')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input_CM_width'), '30')

WebUI.setText(findTestObject('Object Repository/Product/Create/Page_GooritaERP/input_CM_height'), '30')

WebUI.click(findTestObject('Object Repository/Product/Create/Page_GooritaERP/button_Save'))

WebUI.navigateToUrl('https://erp-dev.goorita.com/products')

