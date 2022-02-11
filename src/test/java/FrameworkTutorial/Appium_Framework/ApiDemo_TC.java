package FrameworkTutorial.Appium_Framework;
import java.io.IOException;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Controls;
import pageObjects.Homepage;
import pageObjects.Themes;
import pageObjects.Views;
public class ApiDemo_TC extends base{

	@Test
	public void Apidemo() throws IOException
	{
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities("apiDemo");
		
		Homepage homepage =new Homepage(driver);
		homepage.Views.click();
		
		Views views= new Views(driver);
		views.Controls.click();
		
		Controls con = new Controls(driver);
		con.Theme.click();
		
		Themes theme= new Themes(driver);
		theme.HintText.sendKeys("Light theme");
		
		driver.hideKeyboard();
		
		theme.Checkbox1.click();
		theme.Checkbox2.click();
		theme.RadioButton1.click();
		theme.RadioButton2.click();
		theme.Star.click();
		theme.toggle1.click();
		theme.toggle2.click();
		theme.Mercury.click();
		theme.Earth.click();
		
		driver.closeApp();
	}

}
