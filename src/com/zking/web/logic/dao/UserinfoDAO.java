package com.zking.web.logic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zking.web.logic.DBUtils;
import com.zking.web.logic.entity.Userinfo;



//Userinfo���DAO��(Data Access Object ���ݷ�����)
public class UserinfoDAO {

	  public List<Userinfo>    findAllUser()
	  {
		  //List���Կ����ǿɱ䳤�ȵ����飬������ʵ�ַ�ʽArrayList,LinkedList
		  //ArrayList�ĵײ���������ʵ�ֵ�   ���ݵı������������Ч�ʸߣ����ݵĲ����ɾ��Ч�ʽϵ�
		  //LinkedList�ĵײ�ʵ����������ṹ��ÿһ����Ԫ��һ��ָ����һ��Ԫ�ĵ�ַָ��
		  //��������ٶ������������ݺ�ɾ�����ݵ�Ч�ʾͺܸ�
		     List<Userinfo> list = new ArrayList<Userinfo>();
		     Connection con =   DBUtils.getConnection();
		     PreparedStatement pst = null;
		     ResultSet rs = null;
		     String sql = "select * from userinfo";
		     try {
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				while(rs.next())
				{
					Userinfo user = new Userinfo();
					user.setUserid(rs.getInt("userid"));
					user.setUsername( rs.getString("username"));
					user.setPwd(rs.getString("pwd"));
                    list.add(user);	
				}
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }finally{
				 DBUtils.close(con, pst, rs);
			 }
		     return list;
		  
	  }
	  
	  public  Userinfo  findUserByPwd(String username,String pwd)
	  {
		  
		     Userinfo user =null;
		     Connection con =   DBUtils.getConnection();
		     PreparedStatement pst = null;
		     ResultSet rs = null;
		     String sql = "select * from userinfo where username=? and pwd=?";
		     try {
				pst = con.prepareStatement(sql);
				pst.setString(1, username);
				pst.setString(2, pwd);
				rs = pst.executeQuery();
				if(rs.next())
				{
					user = new Userinfo();
					user.setUserid(rs.getInt("userid"));
					user.setUsername( rs.getString("username"));
					user.setPwd(rs.getString("pwd"));
				}
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }finally{
				 DBUtils.close(con, pst, rs);
			 }
		     return user;
	  }
	  
	  public  Userinfo  findUser(String username)
	  {
		  
		     Userinfo user =null;
		     Connection con =   DBUtils.getConnection();
		     PreparedStatement pst = null;
		     ResultSet rs = null;
		     String sql = "select * from userinfo where username=?";
		     try {
				pst = con.prepareStatement(sql);
				pst.setString(1, username);
				rs = pst.executeQuery();
				if(rs.next())
				{
					user = new Userinfo();
					user.setUserid(rs.getInt("userid"));
					user.setUsername( rs.getString("username"));
				}
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }finally{
				 DBUtils.close(con, pst, rs);
			 }
		     return user;
	  }
	  
	  

}
