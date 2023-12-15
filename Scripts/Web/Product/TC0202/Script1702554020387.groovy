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

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/span_Product_menu-arrow'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/span_Product List'))

WebUI.navigateToUrl('https://erp-dev.goorita.com/products')

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/a_Create Product'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/div_Upload Product_imageContainer1'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input__name'), 'Daging Kepiting')

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/span_Select Category'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/li_Meat'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/span_Select Brand'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/li_Rasanesia'))

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/textarea_Description_description'), 
    'Ini adalah deskripsinya untuk produk daging')

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/span_Rasanesia'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_Product Details_checkVariants'))

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/i_Price_iconVariant0'))

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_Price_name_variant'), 'Ikan')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_Price_weight_variant'), '500')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_HS CODE_stock'), '20')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_IDR_price'), '20000')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_HS CODE_hs_code'), '002')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_Barcode_barcode'), '212212')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_SKU_sku'), 'SKU2211')

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/span_Select Unit'))

WebUI.click(findTestObject('Product/With Variant/Page_GooritaERP/li_Box'))

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_Box_quantity_per_unit'), '1')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input__weight'), '1')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input__length'), '30')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_CM_width'), '30')

WebUI.setText(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/input_CM_height'), '30')

WebUI.click(findTestObject('Object Repository/Product/With Variant/Page_GooritaERP/button_Save'))

WebUI.navigateToUrl('https://erp-dev.goorita.com/products')

