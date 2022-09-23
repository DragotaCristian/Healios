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

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/span_User Management'))

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/a_Roles'))

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/button_New Role'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/h2_Create new Role'), 'Create new Role')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/h2_Role Information'), 'Role Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/label_Role Name'), 'Role Name')

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/svg_Role Type_vs__open-indicator'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/Role_Client'), 'Client')

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/Role_Client'))

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/svg_Authorisation Level_vs__open-indicator'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Healios Platform/AuthType - Study'), 'Study')

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/AuthType - Study'))

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/div_Role Name'))

WebUI.setText(findTestObject('Object Repository/Page_Healios Platform/input_Role Name___BVID__1238'), ' ')

WebUI.setText(findTestObject('Page_Healios Platform/textarea_Description_textarea'), 'test description')

WebUI.click(findTestObject('Object Repository/Page_Healios Platform/button_Next'))

WebUI.verifyElementPresent(findTestObject('Page_Healios Platform/ErrorToast'), 0)

WebUI.closeBrowser()

