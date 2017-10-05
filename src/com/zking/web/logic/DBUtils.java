package com.zking.web.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	public static final String USERNAME = "test";
	public static final String PWD="123";
	//SQLServer���ݿ�ķ��ʵ�ַ
	public static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=test;";
	//SQLServerJDBC����������
	public static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";

	//���óɾ�̬�����
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//��ȡ���ݿ�����
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USERNAME, PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}
	
	//�ر����ݿ�����
	public static  void close(Connection con,Statement st, ResultSet rs)
	{
		//6.�ر����ݿ�����  ��ѭ�ȿ����ԭ��
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(st!=null)
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(con!=null)
			try {
				con.close();
				con=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		
	}
	
	public static void main(String[] args) {
	}
}
