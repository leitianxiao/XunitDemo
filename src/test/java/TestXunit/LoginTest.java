package TestXunit;

import DataParams.LoginParams;
import io.qameta.allure.*;
import org.testng.*;
import DemoXunit.Login;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoginTest {
    @Description("购物系统用户登录单元测试")
    @Issue("123")
    @Link("https://github.com/allure-framework/allure2/")
    @Test(dataProvider = "getUsers",dataProviderClass = LoginParams.class,description = "用户登录测试")
    @Step("步骤1")
    @Severity(SeverityLevel.NORMAL)
    public void testUserLogin(String name,String pwd,String expect){
        Login login = new Login();
        String actual = login.userLogin(name,pwd);
        try {
            Allure.addAttachment("demo pic","image/jpeg",new FileInputStream("/Users/leitianxiao/Downloads/02.jpeg"),".jpeg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(actual, expect);
    }
}
