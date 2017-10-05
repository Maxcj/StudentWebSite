package mydb;

import java.util.List;
import java.util.Scanner;

import mydb.dao.UserinfoDAO;
import mydb.entity.Userinfo;

public class Test {
	
	public static void main(String[] args) {
		UserinfoDAO userDao = new UserinfoDAO();
        Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name = scanner.nextLine();
		System.out.println("请输入密码");
		String pwd = scanner.nextLine();
		Userinfo user = userDao.findUserByPwd(name, pwd);
		if(user!=null)
		{
			System.out.println("登录成功，欢迎:"+user.getUsername());
		}else
		{
			System.out.println("用户名密码错");
		}
	}

}
