package TestXunit;

import DataParams.ShoppingParams;
import DemoXunit.Login;
import DemoXunit.Shopping;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest {
    @Description("查询商品价格测试")
    @Test(dataProvider ="getProPrice",dataProviderClass = ShoppingParams.class)
    public void testGetPrice(String name,String pwd,int proId,int expect){
        //登录
        Login login=new Login();
        login.userLogin(name,pwd);
        //查询商品价格
        Shopping shopping=new Shopping();
        int price=shopping.getPrice(proId);
        Assert.assertEquals(price,expect);
    }
}

//    @Test(dataProvider = "getProPrice",dataProviderClass = ShoppingParams.class)
//    public void testGetPrice(int proId,int expect){
//        Shopping shopping=new Shopping();
//        int price=shopping.getPrice(proId);
//        Assert.assertEquals(price,expect);
//    }