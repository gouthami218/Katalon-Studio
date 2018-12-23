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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/input_Password_email'), 'gouthami218@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/input_Password_pass'), 'eqsu0MYtjvBymkfRSWak5Q==')

WebUI.click(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/input_Password_u_0_2'))

WebUI.click(findTestObject('Object Repository/Page_(4) Facebook/div_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_(4) Facebook/span_Log Out'))

