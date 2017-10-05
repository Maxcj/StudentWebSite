package mydb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mydb.dao.StuDAO;
import mydb.entity.Student;

public class Test2 {
	static   StuDAO stuDao = new StuDAO();

	
	public static void init()
	{
	   Student s1=new Student("Tom", "1991-01-24", "男", "游戏,运动", "1233333333", "湖南"); 	
	   Student s2=new Student("张三", "1995-11-14", "男", "运动,阅读", "1321656666", "广东"); 	
	   Student s3=new Student("李四", "1994-03-12", "男", "游戏,运动", "12342335788", "四川"); 	
	   Student s4=new Student("如花", "1995-02-13", "女", "逛街,阅读", "12336687348", "陕西"); 	
	   Student s5=new Student("似玉", "1993-10-21", "女", "阅读,上网", "136123456", "湖北"); 	
	   List<Student> stuList = new ArrayList<Student>();
	   stuList.add(s1);
	   stuList.add(s2);
	   stuList.add(s3);
	   stuList.add(s4);
	   stuList.add(s5);
	   for(Student stu:stuList)
	   {
		   stuDao.insertStu(stu);
	   }
	
	}
	
	
    public static void main(String[] args) {
		//init();
		System.out.println("请输入想要删除的学生ID");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		stuDao.deleteStu(id);
	}
}
