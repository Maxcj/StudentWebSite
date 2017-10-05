package com.zking.web.logic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zking.web.logic.DBUtils;
import com.zking.web.logic.entity.Student;



//����stuinfo���DAO��
public class StuDAO {
      //CRUD����
	  //��Create
	  public int insertStu(Student stu)
	  {
		    Connection con = DBUtils.getConnection();
		    PreparedStatement pst=null;
		    String sql="insert into stuinfo (stuname,stubirthday,"
		    		+ "stusex,stuintr,stumobile,stuarea)"
		    		+ " values(?,?,?,?,?,?)";
		    int result=0;
		    try {
				pst = con.prepareStatement(sql);
				pst.setString(1, stu.getStuName());
				pst.setString(2, stu.getStuBirthday());
				pst.setString(3, stu.getStuSex());
				pst.setString(4, stu.getStuIntr());
				pst.setString(5, stu.getStuMobile());
				pst.setString(6, stu.getStuArea());
				//���ص�����Ӱ��ļ�¼����
				result = pst.executeUpdate();
				System.out.println("result="+result);
				return result;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				DBUtils.close(con, pst, null);
			}
		    return 0;
	  }
	  //��Read;  �鵥����¼
	  public  Student findStuById(int stuid)
	  {
		    Student stu=null;
		    Connection con = DBUtils.getConnection();
		    PreparedStatement pst=null;
		    ResultSet rs=null;
		    String sql="select * from stuinfo where stuid=?";
		    int result=0;
		    try {
				pst = con.prepareStatement(sql);
				pst.setInt(1, stuid);
				//���ص�����Ӱ��ļ�¼����
				rs = pst.executeQuery();
				if(rs.next())
				{
					stu = new Student();
					stu.setStuId(rs.getInt(1));
					stu.setStuName(rs.getString(2));
					stu.setStuBirthday(rs.getString(3));
					stu.setStuSex(rs.getString(4));
					stu.setStuIntr(rs.getString(5));
					stu.setStuMobile(rs.getString(6));
					stu.setStuArea(rs.getString(7));
				}
				return stu;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				DBUtils.close(con, pst, null);
			}
		    return null;
	  }
	  
	  public List<Student>  findAllStudent()
	  {
            List<Student> list = new ArrayList<Student>();
		    Connection con = DBUtils.getConnection();
		    PreparedStatement pst=null;
		    ResultSet rs=null;
		    String sql="select * from stuinfo ";
		    int result=0;
		    try {
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Student stu = new Student();
					stu = new Student();
					stu.setStuId(rs.getInt(1));
					stu.setStuName(rs.getString(2));
					stu.setStuBirthday(rs.getString(3));
					stu.setStuSex(rs.getString(4));
					stu.setStuIntr(rs.getString(5));
					stu.setStuMobile(rs.getString(6));
					stu.setStuArea(rs.getString(7));
					list.add(stu);
				}
				return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				DBUtils.close(con, pst, null);
			}
		    return null;
	  }
	  //��Update  ����ѧ��
	  public  int  updateStu(Student stu)
	  {
		    Connection con = DBUtils.getConnection();
		    PreparedStatement pst=null;
		    String sql="update stuinfo set stuname=?,stubirthday=?,"
		    		+ "stusex=?,stuintr=?,stumobile=?,stuarea=? where stuid=?";
		    int result=0;
		    try {
				pst = con.prepareStatement(sql);
				pst.setString(1, stu.getStuName());
				pst.setString(2, stu.getStuBirthday());
				pst.setString(3, stu.getStuSex());
				pst.setString(4, stu.getStuIntr());
				pst.setString(5, stu.getStuMobile());
				pst.setString(6, stu.getStuArea());
				pst.setInt(7, stu.getStuId());
				//���ص�����Ӱ��ļ�¼����
				result = pst.executeUpdate();
				System.out.println("result="+result);
				return result;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				DBUtils.close(con, pst, null);
			}
		    return 0;

		  
	  }
	  
	  //ɾDelete
	  public int deleteStu(int stuid)
	  {
		    Connection con = DBUtils.getConnection();
		    PreparedStatement pst=null;
		    String sql="delete from stuinfo where stuid=?";
		    int result=0;
		    try {
				pst = con.prepareStatement(sql);
				pst.setInt(1, stuid);
				//���ص�����Ӱ��ļ�¼����
				result = pst.executeUpdate();
				return result;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				DBUtils.close(con, pst, null);
			}
		    return 0;
	  }
	
	
}
