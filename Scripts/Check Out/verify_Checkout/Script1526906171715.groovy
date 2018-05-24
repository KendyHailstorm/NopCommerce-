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

WebUI.callTestCase(findTestCase('Login/verify_Login'), [('Varable_Url') : 'http://demo.nopcommerce.com', ('Variable_Username') : 'kkoech@gmail.com'
        , ('Variable_Password') : 'password', ('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Verify ChekOut/link_Shopping Cart'))

WebUI.click(findTestObject('Verify ChekOut/option_GiftWrapping'))

WebUI.click(findTestObject('Verify ChekOut/drop down_Select Country'))

WebUI.setText(findTestObject('Verify ChekOut/input_Postal Zip code'), variable_Zip_Code)

WebUI.click(findTestObject('Verify ChekOut/radio button_Terms Of Dervice'))

WebUI.click(findTestObject('Verify ChekOut/button_Checkout'))

WebUI.click(findTestObject('Verify ChekOut/Billing Address/drop down_Country'))

WebUI.delay(2)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input_Billing Address1'), variable_Address1)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input_Billing Address2'), variable_Address2)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input_Billing City'), variable_Billing_City)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input-ZipCode'), variable_Postal_Code)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input_PhoneNo'), variable_PhoneNO)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input_FaxNo'), variable_Fax_No)

WebUI.click(findTestObject('Verify ChekOut/Billing Address/button_Continue'))

WebUI.click(findTestObject('Verify ChekOut/Billing Address/radio button_Shipping Method'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/button_ContinueShippingMethod'))

WebUI.click(findTestObject('Verify ChekOut/Billing Address/Payment Method/Radio-Payment Method'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/button_ContinuePaymentMethod'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/drop down_Credit Card'))

WebUI.setText(findTestObject('Verify ChekOut/Payment Information/Input-Card Holder Name'), variable_Card_Holder_Name)

WebUI.setText(findTestObject('Verify ChekOut/Payment Information/Input-Card Number'), variable_Card_NO)

WebUI.click(findTestObject('Verify ChekOut/Payment Information/drop down_Expiration Month Of The Card'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/drop down_Expiration Month'))

WebUI.setText(findTestObject('Verify ChekOut/Payment Information/Input-Card Code'), variable_Card_Code)

WebUI.click(findTestObject('Verify ChekOut/Payment Information/button_Continue'))

