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
	   Student s1=new Student("Tom", "1991-01-24", "��", "��Ϸ,�˶�", "1233333333", "����"); 	
	   Student s2=new Student("����", "1995-11-14", "��", "�˶�,�Ķ�", "1321656666", "�㶫"); 	
	   Student s3=new Student("����", "1994-03-12", "��", "��Ϸ,�˶�", "12342335788", "�Ĵ�"); 	
	   Student s4=new Student("�绨", "1995-02-13", "Ů", "���,�Ķ�", "12336687348", "����"); 	
	   Student s5=new Student("����", "1993-10-21", "Ů", "�Ķ�,����", "136123456", "����"); 	
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
		System.out.println("��������Ҫɾ����ѧ��ID");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		stuDao.deleteStu(id);
	}
}
