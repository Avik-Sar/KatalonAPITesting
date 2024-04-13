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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://phptravels.com/demo/')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo Now - Phptravels/input_Instant demo request form_first_name'), 
    'Vikram')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo Now - Phptravels/input_First Name_last_name'), 
    'Kumar')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo Now - Phptravels/input_Last Name_business_name'), 
    'ADB Chemicals Pvt. Ltd.')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo Now - Phptravels/input_Business Name_email'), 'Vikram.Kumar@yahoo.com')

WebUI.setText(findTestObject('Object Repository/Page_Book Your Free Demo Now - Phptravels/input__number'), '13')

WebUI.takeScreenshotAsCheckpoint('mno')

