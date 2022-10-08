package com.zenithbank.BasePage;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	
	
//	this is an AnddroidDriver object and is declare protected therefore BasePage can be use in sub-classe
//	protected allows you to use BasePage in sub-classes 	
//	Static was used due to error in TestUtil.java class
 	 protected static AppiumDriver driver; 
	
	
	

	
//	this constructor is accepting AppiumDriver as an object , it takes the driver object and assign it to 
//	Appium Driver driver object
	 
	public BasePage(AppiumDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
//		LaunchMobileUtility.initializeMobileAndroidDriver();

		
		
		
		
		/*---Reference Variables----*/
//		public Properties prop;

////		initialize input 
//		FileInputStream input = null; 
//			
//		try 
//		{
////			Now instantiate by calling the constructor of properties  
//			prop = new Properties();
//				
////			Instantiate 
//			input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	
//			
////			Load file input stream 
//			prop.load(input);		
//		}
//		catch (FileNotFoundException e) 
//		{ 
//			System.out.println("Errors in config.prop block are catch and printed ");
////			e.printStackTrace();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally 
//		{
//			if (input != null) 
//			{
//				try 
//				{
//					input.close();
//				} 
//				catch (Exception e)
//				{
//					e.printStackTrace();
//				}
//			}
//		}

		
	
	}

	
}

