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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/forms')

WebUI.click(findTestObject('Object Repository/Register_Form_Object/SubMenu_Practice_Form'))

WebUI.setText(findTestObject('Object Repository/Register_Form_Object/input_Name_firstName'), 'Fathur')

WebUI.setText(findTestObject('Object Repository/Register_Form_Object/input_Name_lastName'), 'Rahman')

WebUI.setText(findTestObject('Object Repository/Register_Form_Object/input_Email_userEmail'), 'fathur69@gmail.com')

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Gender_Male'))

WebUI.setText(findTestObject('Object Repository/Register_Form_Object/Field Number'), ' ')

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Input_Date_Birth'))

WebUI.selectOptionByValue(findTestObject('Register_Form_Object/Select_Year_1999'), '1999', true)

WebUI.selectOptionByValue(findTestObject('Register_Form_Object/Select_October'), '9', true)

WebUI.click(findTestObject('Register_Form_Object/Select_19'))

WebUI.click(findTestObject('Register_Form_Object/Input_Subjects'))

WebUI.setText(findTestObject('Register_Form_Object/Input_Subjects'), 'Maths')

WebUI.sendKeys(findTestObject('Register_Form_Object/Input_Subjects'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Select_Hobbies_Sports'))

WebUI.uploadFile(findTestObject('Register_Form_Object/Select_picture'), 'C:\\Users\\ASUS\\Downloads\\ss1.png')

WebUI.setText(findTestObject('Object Repository/Register_Form_Object/Input_Current Address'), 'Cililitan, Jakarta Timur')

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Input_State'))

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Select_State'))

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Input_City'))

WebUI.click(findTestObject('Object Repository/Register_Form_Object/Select_City'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Register_Form_Object/button_submit'))

WebUI.verifyElementNotPresent(findTestObject('Register_Form_Object/Succes Thanks Submit'), 2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

