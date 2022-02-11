package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Themes {
	public Themes(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@text='hint text']")
	public WebElement HintText;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='Checkbox 1']")
	public WebElement Checkbox1;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='Checkbox 2']")
	public WebElement Checkbox2;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='RadioButton 1']")
	public WebElement RadioButton1;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='RadioButton 2']")
	public WebElement RadioButton2;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='Star']")
	public WebElement Star;
	
	@AndroidFindBy(id="io.appium.android.apis:id/toggle1")
	public WebElement toggle1;
	
	@AndroidFindBy(id="io.appium.android.apis:id/toggle2")
	public WebElement toggle2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Mercury']")
	public WebElement Mercury;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Earth']")
	public WebElement Earth;
	
	
}
