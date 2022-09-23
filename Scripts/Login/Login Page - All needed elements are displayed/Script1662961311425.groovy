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

WebUI.navigateToUrl('https://data.dev.healios.care/login')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/h1_Log in to Healios'), 'Log in to Healios')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/label_Email'), 'Email')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/input_Email_email'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/input_Email_email'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/label_Password'), 'Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/input_Password___BVID__30'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/input_Password___BVID__30'), '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/i_Password_far fa-eye eye-icon'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/a_Forgot password'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Healios Platform/input_Email_email'), 'Pasha.madjar@healios.io')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healios Platform/input_Password___BVID__30'), '2owp8UsT8kUYhon1eM39HA==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/button_Log In'), 0)

WebUI.closeBrowser()

