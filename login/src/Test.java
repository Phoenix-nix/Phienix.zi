public class Test {
    private static String userName = "admin";
    private static String password = "123456";
    public static void main(String[] args) {
        login("admin", "123456");
    }
    public static void login(String userName, String password) {
        if (!Test.userName.equals(userName)) {
            // TODO 处理用户名错误
        }
        if (!Test.password.equals(password)) {
            // TODO 处理密码错误
        }
        System.out.println("登陆成功");
    }
}
