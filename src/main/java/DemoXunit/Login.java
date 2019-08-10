package DemoXunit;

public class Login {
    public static boolean isLogin = false;
    public String userLogin(String name,String pwd){
        if(name == null || name.equals("") || pwd ==null || pwd.equals("")){
            System.out.println("用户名或密码为空");
            isLogin = false;
            return "用户名或密码不能为空";

        }else if (name == "admin" || name.equals("admin")){
            System.out.println("管理员");
            isLogin = true;
            return "欢迎管理员";

        }else{
            System.out.println("正常用户");
            isLogin = true;
            return "欢迎"+name;
        }
    }
    //开发自测
    public static void main(String[] args){
        Login login = new Login();
        login.userLogin("","");
    }
}