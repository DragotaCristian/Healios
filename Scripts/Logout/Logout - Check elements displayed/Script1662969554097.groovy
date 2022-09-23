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

WebUI.callTestCase(findTestCase('Login/Login - Valid'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Healios Platform/span_Pasha Madjar'))

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/span_Logout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/div_Logout'), 0)

WebUI.verifyElementText(findTestObject('Page_Healios Platform/div_Logout Are you sure you want to Log out_bfd6cc'), 'Are you sure you want to Log out?')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healios Platform/button_LOGOUT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/button_LOGOUT'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healios Platform/button_STAY LOGGED IN'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Healios Platform/button_STAY LOGGED IN'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Healios Platform/span_'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Healios Platform/span_'), 0)

WebUI.closeBrowser()
