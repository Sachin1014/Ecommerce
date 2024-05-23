package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class LoginTest implements ITestListener {

	    // Implement methods of the ITestListener interface
	    @Override
	    public void onTestStart(ITestResult result) {
	        
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	       
	    }

	 
	

    @Test
    public void loginByEmail()
    {
        System.out.println("Login by email");
        Assert.assertEquals("pavan" , "Pavan");
        
    }

    @Test
    public void loginByFacebook()
    {
        System.out.println("Login by facebook");
        Assert.assertEquals("pavan", "pavan");
    }

}
