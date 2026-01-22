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

WebUI.navigateToUrl('https://demoqa.com/forms')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_Name_firstName'), '')

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_Name_lastName'), 'Rahman')

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_Email_userEmail'), 'Fathur213@gmail.com')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_(10 Digits)_userNumber'), '1234432112')

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), 
    '20 Jan 2026')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '1994', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_1'))

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_Subjects_subjectsInput'), 'Maths')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/label_Sports'))

WebUI.uploadFile(findTestObject('Register_Form_Object/Select_picture'), 'C:\\Users\\user\\Documents\\Lightshot\\Screenshot_1.png')

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    ' Jakarta Timur 01234 @!#!@3')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/svg_Select City_css-19bqh2r'))

WebUI.setText(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/input_NCR_react-select-4-input'), 
    'Noida')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_Noida'))

WebUI.takeScreenshotAsCheckpoint('Input Form Berhasil')

WebUI.click(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/button_Submit'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/NTC_Object001/Page_DEMOQA/Page_DEMOQA/div_Thanks for submitting the form'), 
    0)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

