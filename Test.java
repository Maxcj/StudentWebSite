package mydb;

import java.util.List;
import java.util.Scanner;

import mydb.dao.UserinfoDAO;
import mydb.entity.Userinfo;

public class Test {
	
	public static void main(String[] args) {
		UserinfoDAO userDao = new UserinfoDAO();
        Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		String name = scanner.nextLine();
		System.out.println("����������");
		String pwd = scanner.nextLine();
		Userinfo user = userDao.findUserByPwd(name, pwd);
		if(user!=null)
		{
			System.out.println("��¼�ɹ�����ӭ:"+user.getUsername());
		}else
		{
			System.out.println("�û��������");
		}
	}

}
