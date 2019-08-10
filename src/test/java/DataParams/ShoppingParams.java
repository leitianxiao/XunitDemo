package DataParams;

import org.testng.annotations.DataProvider;

public class ShoppingParams {
    /**
     * 提供获取商品价格的数据
     * @return
     */
    @DataProvider
    public Object[][] getProPrice(){
        return new Object[][]{
                {"","",1,-2},
                {"admin","",2,-2},
                {"","",0,-2},
                {"zhangsan","12345",1,200},
                {"admin","12345",2,120},
                {"lisi","123",3,80},
                {"lisi","123",0,-1}

        };
    }

}
