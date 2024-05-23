package abc;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

    @Test
    public void loginByEmail()
    {
        System.out.println("Login by email");
        Assert.assertEquals("pavan" , "pavan");
        
    }

    @Test
    public void loginByFacebook()
    {
        System.out.println("Login by facebook");
        Assert.assertEquals("pavan", "Pavan");
    }

}
