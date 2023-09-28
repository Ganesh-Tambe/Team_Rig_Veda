package com.PageActions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import com.PageLocators.LoginPageLocators;
import com.utilies.HelperClass;

public class LoginPageActions {
	LoginPageLocators objLogin;
   
//	Logger log;
	
	public LoginPageActions() {
//		log =LogManager.getLogger(LoginPageActions.class);
//		log.info("--------str INFO---------");
		this.objLogin=new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objLogin);
	}
	
	
	   
			 //set username
			   public void setuserName(String username)
			    {
				   Actions act = new Actions(HelperClass.getDriver());

				 //Double click on element 
				    act.doubleClick(objLogin.username).perform();
				    objLogin.username.sendKeys(Keys.BACK_SPACE);
				    objLogin.username.sendKeys(username);
			    }
			   
			   //set password in textbox
			   public void setpassword(String password)
			    {
				    Actions act = new Actions(HelperClass.getDriver());
				    
				  //Double click on element 
				    act.doubleClick(objLogin.password).perform() ;
				    objLogin.password.sendKeys(Keys.BACK_SPACE);    
				    objLogin.password.sendKeys(password);
			    }
				
			   
		      //click on login page
				public void clickLogin()
				{
					objLogin.clickSignIn.click();
				}
				
				//click profile
				public void clickProfile()
				{
					objLogin.clickProfile.click();
				}
				
				//click on logout
				public void clickLogout()
				{
					objLogin.clickLogOut.click();
				}
				
				
				
				
				
	

}
