import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(URL_NopCommerce)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Registration-Of-User/link_RegisterUser'))

WebUI.click(findTestObject('Registration-Of-User/radio buton_Select Gender', [('gender') : 'M']))

WebUI.setText(findTestObject('Registration-Of-User/input_First Name'), First_Name)

WebUI.setText(findTestObject('Registration-Of-User/input_Last Name'), Last_Name)

WebUI.click(findTestObject('Registration-Of-User/click_input Date Of Birth Day'))

WebUI.click(findTestObject('Registration-Of-User/click_Input Date Of Birth Month'))

WebUI.click(findTestObject('Registration-Of-User/click_Input Date Of Birth Year', [('date') : 'May']))

WebUI.setText(findTestObject('Registration-Of-User/input_Email Address', [('date') : '8']), Email)

WebUI.setText(findTestObject('Registration-Of-User/input_Company Name'), Company_Name)

WebUI.setText(findTestObject('Registration-Of-User/input_Password'), Password)

WebUI.setText(findTestObject('Registration-Of-User/input_Confirm Password'), Confirm_Password)

WebUI.click(findTestObject('Registration-Of-User/button_Register User'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registration-Of-User/button_Continue'))

