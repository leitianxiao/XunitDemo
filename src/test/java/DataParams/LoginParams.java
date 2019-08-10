package DataParams;

import org.testng.annotations.DataProvider;

public class LoginParams {
    /**
     * 提供用户登陆测试数据
     * @return
     */

    @DataProvider
    public Object[][] getUsers(){
        return new Object[][]{
                {"zhangsan","123456","欢迎zhangsan"},
                {"","","用户名或密码不能为空"},
                {"admin","","用户名或密码不能为空"},
                {"admin","12345","欢迎管理员"}
        };
    }
}
