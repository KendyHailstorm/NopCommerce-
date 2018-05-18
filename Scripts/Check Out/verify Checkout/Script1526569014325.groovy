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

WebUI.callTestCase(findTestCase('Login/verify Login'), [('Varable_Url') : 'http://demo.nopcommerce.com', ('Variable_Username') : 'kkoech@gmail.com'
        , ('Variable_Password') : 'password', ('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Verify ChekOut/Link-Shopping Cart'))

WebUI.click(findTestObject('Verify ChekOut/Option-GiftWrapping'))

WebUI.click(findTestObject('Verify ChekOut/Drop Down Country'))

WebUI.setText(findTestObject('Verify ChekOut/Input-Postal Zip code'), variable_Zip_Code)

WebUI.click(findTestObject('Verify ChekOut/Radio-Terms Of Dervice'))

WebUI.click(findTestObject('Verify ChekOut/Button-Checkout'))

WebUI.click(findTestObject('Verify ChekOut/Billing Address/dropdown-Country'))

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/Input-Billing Address1'), variable_Address1)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input-Billing Address2'), variable_Address2)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/Input-Billing City'), variable_Billing_City)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/input-ZipCode'), variable_Postal_Code)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/Input-PhoneNo'), variable_PhoneNO)

WebUI.setText(findTestObject('Verify ChekOut/Billing Address/Input-FaxNo'), variable_Fax_No)

WebUI.click(findTestObject('Verify ChekOut/Billing Address/Button-Continue'))

WebUI.click(findTestObject('Verify ChekOut/Billing Address/Radio-Shipping Method'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/Button-ContinueShippingMethod'))

WebUI.click(findTestObject('Verify ChekOut/Billing Address/Payment Method/Radio-Payment Method'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/Button-ContinuePaymentMethod'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/DropDown-Credit Card'))

WebUI.setText(findTestObject('Verify ChekOut/Payment Information/Input-Card Holder Name'), variable_Card_Holder_Name)

WebUI.setText(findTestObject('Verify ChekOut/Payment Information/Input-Card Number'), variable_Card_NO)

WebUI.click(findTestObject('Verify ChekOut/Payment Information/Drop down-Expiration Month Of The Card'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/Drop Down-Expiration Month'))

WebUI.setText(findTestObject('Verify ChekOut/Payment Information/Input-Card Code'), variable_Card_Code)

WebUI.click(findTestObject('Verify ChekOut/Payment Information/Button Continue'))

WebUI.click(findTestObject('Verify ChekOut/Payment Information/Confirmation/Button-Confirm All'))

